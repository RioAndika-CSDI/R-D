import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
  it('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.inputNamaLengkapLeadsButuhBantuan('Testing')
    homePage.inputNomorHpLeadsButuhBantuan('89676848410')
    homePage.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    homePage.clickBtnKirimLeadsButuhBantuan()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(2000)
    homePage.verifyToastLeadsTerkirim()
  })
})