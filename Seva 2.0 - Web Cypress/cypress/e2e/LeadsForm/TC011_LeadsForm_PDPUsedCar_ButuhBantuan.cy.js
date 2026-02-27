import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productDetailPageUsedCar from "../../support/PageObject-SEVA/pageObject-PDPUsedCar/productDetailPageUsedCar"
import productListingPageUsedCar from "../../support/PageObject-SEVA/pageObject-PLPUsedCar/productListingPageUsedCar"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC011_LeadsForm_PDPUsedCar_ButuhBantuan', () => {
  it('TC011_LeadsForm_PDPUsedCar_ButuhBantuan', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    productListingPageUsedCar
    homePage.clickBtnTerimaCookie()
    homePage.clickTabMobilBekas()
    homePage.clickBtnCariMobilBaru()
    productListingPageUsedCar.clickNamaMobil()
    cy.wait(3000)
    productDetailPageUsedCar.inputNamaLengkapLeadsButuhBantuan('Testing')
    productDetailPageUsedCar.inputNomorHpLeadsButuhBantuan('89676848410')
    productDetailPageUsedCar.clickDropdownPilihKota()
    productDetailPageUsedCar.inputDropdownPilihKota('Jakarta Pusat')
    cy.wait(2000)
    productDetailPageUsedCar.clickValuePilihKota('Jakarta Pusat')
    productDetailPageUsedCar.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    productDetailPageUsedCar.clickBtnKirimLeadsButuhBantuan()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(3000)
    productDetailPageUsedCar.verifyToastLeadsTerkirim()
  })
})