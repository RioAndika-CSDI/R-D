import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_Refinancing_Homepage', () => {
  it('TC001_Refinancing_Homepage', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickTabFasilitasDana()
    homePage.clickBtnAjukanSekarang()
    homePage.inputNamaLengkap('Testing')
    homePage.inputNomorHp('89676848410')
    homePage.clickDropdownPilihKota()
    homePage.inputDropdownPilihKota('Administrasi Jakarta Pusat, Tanah Abang, Bendungan Hilir')
    cy.wait(5000)
    homePage.clickValuePilihKota()
    homePage.clickCheckBox()
    homePage.clickOpsiBPKBMobil()
    cy.wait(2000)
    homePage.clickBtnKirim()
    cy.wait(10000)
    homePage.verifyRefinancingHomepage()

  })
})