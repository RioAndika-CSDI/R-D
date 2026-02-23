import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productDetailPage from "../../support/PageObject-SEVA/pageObject-PDP/productDetailPage"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Leads Form PDP - Floating Icon', () => {
  it('Leads Form PDP - Floating Icon', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickNamaMobil()
    productDetailPage.clickBtnFloatingIcon()
    productDetailPage.inputNamaLengkapFloatingIcon('Testing')
    productDetailPage.inputNomorHpFloatingIcon('89676848410')
    productDetailPage.clickCheckBoxFloatingIcon()
    cy.wait(2000)
    productDetailPage.clickBtnKirimFloatingIcon()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(3000)
    productDetailPage.verifySendLeadsFloatingIcon()
  })
})