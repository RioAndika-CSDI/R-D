import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import refinancingPage from "../../support/PageObject-SEVA/pageObject-Refinancing/refinancingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Refinancing Page Lead Form_WithLogin', () => {
  it('Refinancing Page Lead Form_WithLogin', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnMasukRegister()
    homePage.inputNomorHpLogin('89676848410')
    homePage.clickBtnSelanjutnya()
    cy.wait(20000)
    homePage.inputFieldOTP('123456')
    cy.wait(10000)
    homePage.clickBtnFasilitasDana()
    refinancingPage.inputNamaLengkapLeadsForm('Testing')
    // refinancingPage.inputNomorHpLeadsForm('89676848410')
    refinancingPage.clickDropdownPilihKotaLeadsForm()
    refinancingPage.inputDropdownPilihKotaLeadsForm('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    cy.wait(2000)
    refinancingPage.clickValuePilihKota('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    refinancingPage.clickCheckBoxLeadsForm()
    refinancingPage.clickOpsiBPKBMobilLeadsForm()
    cy.wait(2000)
    refinancingPage.clickBtnKirimLeadsForm()
    cy.wait(10000)
    refinancingPage.verifyRefinancingPage()

  })
})