import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productDetailPage from "../../support/PageObject-SEVA/pageObject-PDP/productDetailPage"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC004_LeadsForm_PDP_FlotingIcon', () => {
  it('TC004_LeadsForm_PDP_FlotingIcon', () => {
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