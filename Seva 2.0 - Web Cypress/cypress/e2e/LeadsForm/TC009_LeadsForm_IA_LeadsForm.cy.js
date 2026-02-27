import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import instantApproval from "../../support/PageObject-SEVA/pageObject-InstantApptoval/instantApproval"
import kualifikasiKredit from "../../support/PageObject-SEVA/pageObject-KualifikasiKredit/kualifikasiKredit"
import loanCalculator from "../../support/PageObject-SEVA/pageObject-LoanCalculator/loanCalculator"
import productListingPage from "../../support/PageObject-SEVA/pageObject-PLP/productListingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC009_LeadsForm_IA_LeadsForm', () => {
  it('TC009_LeadsForm_IA_LeadsForm', () => {
    cy.clearSession();
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickBtnHitungKemampuan()
    cy.wait(3000)
    loanCalculator.inputPendapatanBulanan('100000000')
    loanCalculator.clickDropdownKategoriUmur()
    loanCalculator.clickValueKategoriUmur()
    cy.wait(2000)
    loanCalculator.clickBtnSimulasiKredit()
    cy.wait(3000)
    loanCalculator.clickCekPeluangKredit()
    cy.wait(3000)
    kualifikasiKredit.clickDropdownPekerjaan()
    // kualifikasiKredit.inputPekerjaan('Karyawan Swasta')
    cy.wait(2000)
    kualifikasiKredit.clickValuePekerjaan()
    kualifikasiKredit.clickBtnSelanjutnya()
    kualifikasiKredit.clickCheckBoxLeadsForm()
    kualifikasiKredit.clickBtnCekPeluangKredit()
    cy.wait(3000)
    kualifikasiKredit.inputNomorHpLogin('89676848410')
    cy.wait(5000)
    kualifikasiKredit.clickBtnKirimOtp()
    cy.wait(15000)
    homePage.inputFieldOTP('123456')
    cy.wait(25000)
    kualifikasiKredit.clickBtnLanjutInstantApproval()
    cy.wait(5000)
    instantApproval.clickCheckBox()
    instantApproval.clickBtnSelanjutnya()
    cy.wait(3000)
    instantApproval.clickPerusahaanPembiayaan()
    instantApproval.clickCheckBox()
    instantApproval.clickBtnSelanjutnyaPerusahaanPembiayaan()
    cy.wait(3000)
    instantApproval.clickCheckBoxKonfirmasiData()
    instantApproval.clickBtnAjukaInstantApproval()
    instantApproval.verifyLeadsIa()


  })
})