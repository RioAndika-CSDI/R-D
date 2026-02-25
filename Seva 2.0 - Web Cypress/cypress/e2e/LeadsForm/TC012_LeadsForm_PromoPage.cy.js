import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import promoDetailPage from "../../support/PageObject-SEVA/pageObject-Promo/promoDetailPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
  it('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    urlSeva.visitUrlPromo()
    promoDetailPage.inputNamaLengkapLeads('Testing')
    promoDetailPage.inputNomorHpLeads('89676848410')
    promoDetailPage.inputEmailLeads('testing123@gmail.com')
    promoDetailPage.clickCheckBoxLeads()
    cy.wait(2000)
    promoDetailPage.clickBtnKirimLeads()
    cy.wait(10000)
    promoDetailPage.inputFieldOTP('123456')
    cy.wait(11000)
    promoDetailPage.verifyToastLeadsTerkirim()
  })
})