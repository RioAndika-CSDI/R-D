import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('Leads Form PLP - Floating Icon', () => {
  it('Leads Form PLP - Floating Icon', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickBtnFloatingIcon()
    productListingPage.inputNamaLengkapFloatingIcon('Testing')
    productListingPage.inputNomorHpFloatingIcon('89676848410')
    productListingPage.clickCheckBoxFloatingIcon()
    cy.wait(2000)
    productListingPage.clickBtnKirimFloatingIcon()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(3000)
    productListingPage.verifySendLeadsFloatingIcon()
  })
})