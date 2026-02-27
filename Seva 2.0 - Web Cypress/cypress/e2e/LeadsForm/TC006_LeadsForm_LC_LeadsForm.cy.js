import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import loanCalculator from "../../support/PageObject-SEVA/pageObject-LoanCalculator/loanCalculator"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC006_LeadsForm_LC_LeadsForm', () => {
  it('TC006_LeadsForm_LC_LeadsForm', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickBtnHitungKemampuan()
    loanCalculator.inputPendapatanBulanan('100000000')
    loanCalculator.clickDropdownKategoriUmur()
    loanCalculator.clickValueKategoriUmur()
    cy.wait(2000)
    loanCalculator.clickBtnSimulasiKredit()
    cy.wait(3000)
    loanCalculator.clickBtnIconWa()
    loanCalculator.inputNamaLengkapLeadsForm('Testing')    
    loanCalculator.inputNomorHpLeadsForm('89676848410')
    loanCalculator.clickCheckBoxLeadsForm()
    cy.wait(2000)
    loanCalculator.clickBtnKirimLeadsForm()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(2000)
    loanCalculator.verifySendLeadsForm()
  })
})