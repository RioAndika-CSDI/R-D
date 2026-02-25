import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import productListingPageUsedCar from "../../support/PageObject-SEVA/pageObject-PLPUsedCar/productListingPageUsedCar"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC010_LeadsForm_PLP_UsedCar', () => {
  it('TC010_LeadsForm_PLP_UsedCar', () => {
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickTabMobilBekas()
    homePage.clickBtnCariMobilBaru()
    productListingPageUsedCar.clickBtnSayaBerminat()
    productListingPageUsedCar.inputNamaLengkapLeads('Testing')
    productListingPageUsedCar.inputNomorHpLeads('89676848410')
    productListingPageUsedCar.clickDropdownPilihKota()
    productListingPageUsedCar.inputDropdownPilihKota('Jakarta Pusat')
    cy.wait(2000)
    productListingPageUsedCar.clickValuePilihKota('Jakarta Pusat')
    productListingPageUsedCar.clickCheckBoxLeads()
    cy.wait(2000)
    productListingPageUsedCar.clickBtnKirimLeads()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(3000)
    productListingPageUsedCar.verifySendLeads()
  })
})