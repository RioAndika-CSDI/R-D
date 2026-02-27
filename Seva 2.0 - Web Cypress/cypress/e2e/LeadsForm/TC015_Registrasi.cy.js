import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import registrasiPage from "../../support/PageObject-SEVA/pageObject-Registrasi/registrasiPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC015_Registrasi', () => {
  it('TC015_Registrasi', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnMasukRegister()
    homePage.inputNomorHpLogin('88980149920')
    homePage.clickBtnSelanjutnya()
    cy.wait(20000)
    homePage.inputFieldOTP('123456')
    cy.wait(10000)

    cy.get('body').then($body => {
      const isLogin = $body.find(homePage.btnCariMobilBaru).length > 0
      if (isLogin) {
        cy.log('User sudah login → Hapus akun')
        cy.reload()
        urlSeva.visitUrAkunProfile()
        registrasiPage.clickBtnHapusAkun()
        cy.wait(3000)
        registrasiPage.clickCheckbox2()
        registrasiPage.clickBtnLanjutkan()
        cy.wait(3000)
        registrasiPage.clickDropdownPilihAlasan()
        registrasiPage.clickValuePilihAlasan()
        registrasiPage.clickBtnSelanjutnya()
        cy.wait(3000)
        registrasiPage.clickBtnYaHapusAkunSaya()
        cy.wait(6000)
        registrasiPage.verifySuccessRegistrasi()
      }else{
        registrasiPage.inputNamaLengkap('Testing')
        registrasiPage.inputEmail('Testing123@gmail.com')
        registrasiPage.clickTanggalLahir()
        registrasiPage.clickBtnSimpan()
        registrasiPage.clickCheckbox()
        registrasiPage.clickBtnDaftar()
        cy.wait(5000)
        registrasiPage.verifySuccessRegistrasi()
        cy.reload()
        urlSeva.visitUrAkunProfile()
        registrasiPage.clickBtnHapusAkun()
        cy.wait(3000)
        registrasiPage.clickCheckbox2()
        registrasiPage.clickBtnLanjutkan()
        cy.wait(3000)
        registrasiPage.clickDropdownPilihAlasan()
        registrasiPage.clickValuePilihAlasan()
        registrasiPage.clickBtnSelanjutnya()
        cy.wait(3000)
        registrasiPage.clickBtnYaHapusAkunSaya()
        cy.wait(15000)
        registrasiPage.verifySuccessRegistrasi()
      }
    })

  })
})