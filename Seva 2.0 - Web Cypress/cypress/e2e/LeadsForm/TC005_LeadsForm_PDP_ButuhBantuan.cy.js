import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productDetailPage from "../../support/PageObject-SEVA/pageObject-PDP/productDetailPage"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Leads Form PDP - Butuh Bantuan', () => {
  it('Leads Form PDP - Butuh Bantuan', () => {
    urlSeva.visitUrl()
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickNamaMobil()
    productDetailPage.inputNamaLengkapLeadsButuhBantuan('Testing')    
    productDetailPage.inputNomorHpLeadsButuhBantuan('89676848410')
    productDetailPage.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    productDetailPage.clickBtnKirimLeadsButuhBantuan()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(2000)
    productDetailPage.verifyToastLeadsTerkirim()
  })
})