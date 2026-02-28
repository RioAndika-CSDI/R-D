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
    homePage.inputNamaLengkapLeadsButuhBantuan('Testing')
    homePage.inputNomorHpLeadsButuhBantuan('89676848410')
    homePage.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    homePage.clickBtnKirimLeadsButuhBantuan()
    cy.wait(10000)
    homePage.inputFieldOTP('123456')
    cy.wait(2000)
    homePage.verifyToastLeadsTerkirim()

  //2. PLP Floating Icom
    cy.log('PLP FLOATING ICON✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnCariMobilBaru()
    cy.wait(5000)
    productListingPage.clickBtnFloatingIcon()
    // productListingPage.inputNamaLengkapFloatingIcon('Testing')
    // productListingPage.inputNomorHpFloatingIcon('89676848410')
    productListingPage.clickCheckBoxFloatingIcon()
    cy.wait(2000)
    productListingPage.clickBtnKirimFloatingIcon()
    cy.wait(5000)
    productListingPage.verifySendLeadsFloatingIcon()

  //3. PLP Butuh Bantuan
    cy.log('PLP BUTUH BANTUAN✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnCariMobilBaru()
    cy.wait(5000)
    // productListingPage.inputNamaLengkapLeadsButuhBantuan('Testing')    
    // productListingPage.inputNomorHpLeadsButuhBantuan('89676848410')
    productListingPage.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    productListingPage.clickBtnKirimLeadsButuhBantuan()
    cy.wait(5000)
    productListingPage.verifyToastLeadsTerkirim()


  //4. PDP Floating Icon
    cy.log('PDP FLOATING ICON✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickNamaMobil()
    cy.wait(5000)
    productDetailPage.clickBtnFloatingIcon()
    // productDetailPage.inputNamaLengkapFloatingIcon('Testing')
    // productDetailPage.inputNomorHpFloatingIcon('89676848410')
    productDetailPage.clickCheckBoxFloatingIcon()
    cy.wait(2000)
    productDetailPage.clickBtnKirimFloatingIcon()
    cy.wait(5000)
    productDetailPage.verifySendLeadsFloatingIcon()

  //5. PDP Butuh Bantuan
    cy.log('PDP BUTUH BANTUAN✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickNamaMobil()
    cy.wait(5000)
    // productDetailPage.inputNamaLengkapLeadsButuhBantuan('Testing')    
    // productDetailPage.inputNomorHpLeadsButuhBantuan('89676848410')
    productDetailPage.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    productDetailPage.clickBtnKirimLeadsButuhBantuan()
    cy.wait(5000)
    productDetailPage.verifyToastLeadsTerkirim()

  //6. LC Leads Form
    cy.log('LC LEADS FORM✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnCariMobilBaru()
    productListingPage.clickBtnHitungKemampuan()
    cy.wait(5000)
    loanCalculator.inputPendapatanBulanan('100000000')
    loanCalculator.clickDropdownKategoriUmur()
    loanCalculator.clickValueKategoriUmur()
    cy.wait(2000)
    loanCalculator.clickBtnSimulasiKredit()
    cy.wait(3000)
    loanCalculator.clickBtnIconWa()
    // loanCalculator.inputNamaLengkapLeadsForm('Testing')    
    // loanCalculator.inputNomorHpLeadsForm('89676848410')
    loanCalculator.clickCheckBoxLeadsForm()
    cy.wait(2000)
    loanCalculator.clickBtnKirimLeadsForm()
    cy.wait(5000)
    loanCalculator.verifySendLeadsForm()

  //7. KK Leads Form
    cy.log('KK LEADS FORM✅✅✅')
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
    kualifikasiKredit.verifyLeadsKk()

  //8. KK Leads Form WA
    cy.log('KK LEADS FORM WA✅✅✅')
    kualifikasiKredit.clickIconnWa()
    cy.wait(2000)
    kualifikasiKredit.clickCheckBoxLeadsForm()
    kualifikasiKredit.clickbBtnKirimLeads()
    cy.wait(15000)
    kualifikasiKredit.verifyLeadsKk()

    //9. IA Leads Form
    cy.log('IA LEADS FORM✅✅✅')
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
    cy.wait(5000)
    instantApproval.verifyLeadsIa()

    //10. PLP Used Car
    cy.log('PLP USED CAR✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickTabMobilBekas()
    homePage.clickBtnCariMobilBaru()
    productListingPageUsedCar.clickBtnSayaBerminat()
    productListingPageUsedCar.clickCheckBoxLeads()
    cy.wait(2000)
    productListingPageUsedCar.clickBtnKirimLeads()
    cy.wait(5000)
    productListingPageUsedCar.verifySendLeads()

    //11 PDP Used Car Butuh Bantuan
    cy.log('PDP USED CAR BUTUH BANTUAN✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickTabMobilBekas()
    homePage.clickBtnCariMobilBaru()
    productListingPageUsedCar.clickNamaMobil()
    cy.wait(3000)
    productDetailPageUsedCar.clickCheckBoxLeadsButuhBantuan()
    cy.wait(2000)
    productDetailPageUsedCar.clickBtnKirimLeadsButuhBantuan()
    cy.wait(5000)
    productDetailPageUsedCar.verifyToastLeadsTerkirim()

    //12. Promo Page
    cy.log('PROMO PAGE✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    urlSeva.visitUrlPromo()
    promoDetailPage.inputNamaLengkapLeads('Testing')
    promoDetailPage.inputNomorHpLeads('89676848410')
    promoDetailPage.inputEmailLeads('testing123@gmail.com')
    promoDetailPage.clickCheckBoxLeads()
    cy.wait(2000)
    promoDetailPage.clickBtnKirimLeads()
    cy.wait(20000)
    promoDetailPage.verifyLeadsTerkirim()

    //13. Blog Artikel
    cy.log('BLOG ARTIKEL✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    urlSeva.visitUrlBlog()
    blogArtikel.inputNamaLengkapLeads('Testing')
    blogArtikel.clickIconClose()
    blogArtikel.inputNomorHpLeads('89676848410')
    blogArtikel.clickCheckBoxLeads()
    cy.wait(2000)
    blogArtikel.clickBtnKirimLeads()
    cy.wait(20000)
    blogArtikel.verifyLeadsTerkirim()


  })
})