import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Refinancing Homepage_WithLogin', () => {
  it('Refinancing Homepage_WithLogin', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnMasukRegister()
    homePage.inputNomorHpLogin('89676848410')
    homePage.clickBtnSelanjutnya()
    cy.wait(20000)
    homePage.inputFieldOTP('123456')
    cy.wait(10000)
    homePage.clickTabFasilitasDana()
    homePage.clickBtnAjukanSekarang()
    homePage.inputNamaLengkap('Testing')
    homePage.clickDropdownPilihKota()
    homePage.inputDropdownPilihKota('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    cy.wait(5000)
    homePage.clickValuePilihKota()
    homePage.clickCheckBox()
    homePage.clickOpsiBPKBMobil()
    cy.wait(2000)
    homePage.clickBtnKirim()
    // cy.wait(10000)
    // homePage.verifyRefinancingHomepage()

  })
})