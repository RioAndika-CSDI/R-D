import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import refinancingPage from "../../support/PageObject-SEVA/pageObject-Refinancing/refinancingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Refinancing Page Lead Form - Benefit Section_WithLogin', () => {
  it('Refinancing Page Lead Form - Benefit Section_WithLogin', () => {
    urlSeva.visitUrl()
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnMasukRegister()
    homePage.inputNomorHpLogin('89676848410')
    homePage.clickBtnSelanjutnya()
    cy.wait(20000)
    homePage.inputFieldOTP('123456')
    cy.wait(10000)
    homePage.clickBtnFasilitasDana()
    refinancingPage.clickBtnAjukanSekarangBenefitSection()
    cy.wait(2000)
    refinancingPage.inputNamaLengkap('Testing')
    // refinancingPage.inputNomorHp('89676848410')
    refinancingPage.clickDropdownPilihKota()
    refinancingPage.inputDropdownPilihKota('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    cy.wait(2000)
    refinancingPage.clickValuePilihKota('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    refinancingPage.clickCheckBox()
    refinancingPage.clickOpsiBPKBMobil()
    cy.wait(2000)
    refinancingPage.clickBtnKirim()
    cy.wait(10000)
    refinancingPage.verifyRefinancingPage()

  })
})