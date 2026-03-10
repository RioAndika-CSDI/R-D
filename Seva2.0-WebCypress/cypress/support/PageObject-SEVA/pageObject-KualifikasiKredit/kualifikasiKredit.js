import'cypress-xpath'
import "cypress-real-events/support";

class kualifikasiKredit {
    
    dropdownPekerjaan = '[placeholder="Pilih Pekerjaan"]'
    valuePekerjaan = "//div[@class='inputSelect-module__gaCRbW__dropdown inputSelect-module__gaCRbW__dropdownActive']//div[@class='inputSelect-module__gaCRbW__dropdownHeightDefault simplebar-scrollable-y']//div[@class='simplebar-wrapper']//div[@class='simplebar-mask']//div[@class='simplebar-offset']//div[@aria-label='scrollable content']//div[@class='simplebar-content']//button[@id='Karyawan Swasta']//div//div[@class='inputSelect-module__gaCRbW__dropdownItemText'][normalize-space()='Karyawan Swasta']"
    btnSelanjutnya = "//div[@class='kualifikasi-kredit-module__lO-KHW__wrapperButtonDesktop']//button[@class='button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__big undefined'][normalize-space()='Selanjutnya']"
    checkBoxLeadsForm = "(//*[name()='rect'])[7]";
    btnCekPeluangKredit = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop undefined"]'
    btnKirimOtp = "//button[normalize-space()='Kirim OTP']"
    IconWa = '[data-testid="button-hubungi-agen-seva"]'
    nomorHpLogin= '[data-testid="input-phone-number"]'
    fieldOTP = '[data-testid="input-otp"]'
    btnKirim = '[data-test-id="button-kirim-leads"]'
    btnLanjutInstantApproval = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop undefined"]'


    clickDropdownPekerjaan() {
        cy.get(this.dropdownPekerjaan).eq(1).click();
    }

    inputPekerjaan(dropdownPekerjaan) {
        cy.get(this.dropdownPekerjaan).eq(1).type(dropdownPekerjaan);
    }

    // clickValuePekerjaan(valuePekerjaan) {
    //     cy.contains(this.valuePekerjaan, valuePekerjaan).should('be.visible').realClick()
    // }

    clickValuePekerjaan() {
        cy.xpath(this.valuePekerjaan).should('be.visible').realClick()
    }

    clickBtnSelanjutnya() {
        cy.xpath(this.btnSelanjutnya).click();
    }

    clickCheckBoxLeadsForm() {
        cy.xpath(this.checkBoxLeadsForm).scrollIntoView()
        cy.xpath(this.checkBoxLeadsForm).click({ force: true })
    }

    clickBtnCekPeluangKredit() {
        cy.get(this.btnCekPeluangKredit).click();
    }

    inputNomorHpLogin(nomorHpLogin) {
        cy.get(this.nomorHpLogin).type(nomorHpLogin);
    }

    clickBtnKirimOtp() {
        cy.xpath(this.btnKirimOtp).click();
    }

    clickIconnWa() {
        cy.get(this.IconWa).eq(1).click();
    }

    clickbBtnKirimLeads() {
        cy.window().then((win) => {
            cy.stub(win, 'open').as('windowOpen')
        })
        cy.get(this.btnKirim).click();
    }

    verifyLeadsKk() {
        cy.get(this.IconWa).should('be.visible');
    }

    
    inputFieldOTP(fieldOTP) {
        cy.get(this.fieldOTP).eq(0).type(fieldOTP);
    }

    clickBtnLanjutInstantApproval() {
        cy.get(this.btnLanjutInstantApproval).click();
    }


}

export default new kualifikasiKredit();
