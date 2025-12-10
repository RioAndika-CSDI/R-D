import java.net.HttpURLConnection
import java.net.URL
import com.kms.katalon.core.configuration.RunConfiguration
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable


String token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwaG9uZV9udW1iZXIiOiIrNjI4NTM0OTUyNDU1NSIsImRhdGUiOiIyMDI1LTA3LTA1VDAzOjM1OjU2LjE2MVoiLCJpYXQiOjE3NTE2ODY1NTYsImV4cCI6MTc1MTY5MDE1Nn0.917J9i4cB4W3JEq5sxPXrnLNVo2D_uZuazV6sNWw9wg'
if (!token || token.length() < 30) {
	WebUI.comment("Token kosong atau tidak valid. Harap perbarui dari DevTools → Headers.")
	return
} else {
	WebUI.comment("Token digunakan: ${token}")
}

String bodyJson = JsonOutput.toJson([
	phoneNumber: "+6285349524555",
	name: "TESTT",
	source: "WHATSAPP_DIRECT_REFINANCING_TOP_BANNER",
	isTncAccepted: true,
	isLogin: true,
	promoSubscription: false,
	isVerifyOtp: true,
	location: [
		regency: "Administrasi Jakarta Pusat",
		district: "Gambir",
		village: "Gambir",
		postal_code: 10110,
		longitude: 106.8293243,
		latitude: -6.1762629
	],
	temanSevaTrxCode: "SEVAF8RS",
	utmSource: "testing00",
	utmCampaign: "testing00",
	utmContent: null
])

HttpURLConnection conn = (HttpURLConnection) new URL("https://api.seva.id/refinancing/contact").openConnection()
conn.setRequestMethod("POST")
conn.setRequestProperty("Content-Type", "application/json")
conn.setRequestProperty("Authorization", "Bearer ${token}")
conn.setDoOutput(true)
conn.outputStream.withWriter("UTF-8") { it << bodyJson }

// Baca Response
int responseCode = conn.getResponseCode()
String responseText = (responseCode == 200) ? conn.inputStream.getText("UTF-8") : conn.errorStream?.getText("UTF-8")


// Simpan ke file
String baseDir = RunConfiguration.getProjectDir() + "/.vscode/"
File leadsFile = new File(baseDir + "response_leads.json")
File metaFile = new File(baseDir + "response_meta.json")

try {
	def parsed = new JsonSlurper().parseText(responseText)

	if (responseCode == 200) {
		// Simpan message ke response_leads.json
		leadsFile.write(JsonOutput.prettyPrint(JsonOutput.toJson([message: parsed.message])))
		metaFile.write(JsonOutput.prettyPrint(JsonOutput.toJson([status: responseCode])))

		WebUI.comment("Status: 200 OK")
		WebUI.comment("Message: ${parsed.message}")
		WebUI.comment(" Disimpan ke: response_leads.json & response_meta.json")

		if (parsed.message == "Success Submit Contact") {
			WebUI.comment("Validasi berhasil: Success Submit Contact")
		} else {
			WebUI.comment(" Message tidak sesuai: ${parsed.message}")
		}

	} else {
		// Simpan error ke file khusus
		String errorPath = baseDir + "error_response_leads.json"
		new File(errorPath).write(JsonOutput.prettyPrint(responseText))
		WebUI.comment("Request gagal. Status: ${responseCode}")
		WebUI.comment("Response disimpan ke: error_response_leads.json")
		WebUI.comment("Response: ${responseText}")
	}
} catch (Exception e) {
	WebUI.comment("Error parsing response: ${e.message}")
	WebUI.comment("Response (raw): ${responseText}")
}