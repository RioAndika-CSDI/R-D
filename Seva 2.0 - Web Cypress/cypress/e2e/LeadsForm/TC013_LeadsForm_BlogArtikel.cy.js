import blogArtikel from "../../support/PageObject-SEVA/pageObject-BlogArtikel/blogArtikel"
import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import promoDetailPage from "../../support/PageObject-SEVA/pageObject-Promo/promoDetailPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
  it('TC001_LeadsForm_Homepage_ButuhBantuan', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    urlSeva.visitUrlBlog()
    blogArtikel.inputNamaLengkapLeads('Testing')
    blogArtikel.clickIconClose()
    blogArtikel.inputNomorHpLeads('89676848410')
    blogArtikel.clickCheckBoxLeads()
    cy.wait(2000)
    blogArtikel.clickBtnKirimLeads()
    cy.wait(10000)
    promoDetailPage.inputFieldOTP('123456')
    cy.wait(2000)
    blogArtikel.verifyToastLeadsTerkirim()
  })
})