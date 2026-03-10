import blogArtikel from "../../support/PageObject-SEVA/pageObject-BlogArtikel/blogArtikel"
import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import instantApproval from "../../support/PageObject-SEVA/pageObject-InstantApptoval/instantApproval"
import kualifikasiKredit from "../../support/PageObject-SEVA/pageObject-KualifikasiKredit/kualifikasiKredit"
import loanCalculator from "../../support/PageObject-SEVA/pageObject-LoanCalculator/loanCalculator"
import productDetailPage from "../../support/PageObject-SEVA/pageObject-PDP/productDetailPage"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import productDetailPageUsedCar from "../../support/PageObject-SEVA/pageObject-PDPUsedCar/productDetailPageUsedCar"
import productListingPageUsedCar from "../../support/PageObject-SEVA/pageObject-PLPUsedCar/productListingPageUsedCar"
import promoDetailPage from "../../support/PageObject-SEVA/pageObject-Promo/promoDetailPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_LeadsForm_WithoutLogin', () => {
  it('TC001_LeadsForm_WithoutLogin', () => {

    cy.clearSession();
  // 1. Homepage Butuh Bantuan
    cy.log('HOMEPAGE✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    cy.wait(3000)
    
  })
})