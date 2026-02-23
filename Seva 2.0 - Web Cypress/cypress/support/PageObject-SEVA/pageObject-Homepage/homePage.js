import'cypress-xpath'

class homePage {
    tabFasilitasDana = '[data-testid="navigation-tab-v2-item-Fasilitas Dana"]';
    btnAjukanSekarang = '[data-testid="button-ajukan-sekarang"]';
    namaLengkap = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHp = '[data-test-id="field-input-leads-nomor-hp"]';
    dropdownPilihKota = '[data-testid="dropdown-pilih-kota"]';
    valuePilihKota ='[class="inputSelect-module__gaCRbW__dropdownItemText"]';
    opsiBPKBMobil = '[value="BPKB Mobil"]';
    checkBox = "(//*[name()='rect'])[9]";
    btnKirim = '[data-test-id="button-kirim-leads"]';
    titleWA= "//h3[normalize-space()='SEVA by Astra']";
    btnTerimaCookie = "//button[normalize-space()='Terima']";
    btnFasilitasDana = '[class="navbarDesktop-module__anMNXa__menuItem"]';
    btnMasukRegister = "//button[normalize-space()='Masuk/Register']";
    nomorHpLogin= '[data-testid="input-phone-number"]';
    btnSelanjutnya = '[data-testid="button-lanjutkan"]';
    fieldOTP= '[data-testid="input-otp"]';
    namaLengkapLeadsButuhBantuan = '[data-test-id="nama-lengkap-pdp-leads"]';
    nomorHpLeadsButuhBantuan = '[data-test-id="nomor-telp-pdp-leads"]';
    btnKirimLeadsButuhBantuan  = '[data-test-id="submit-pdp-leads"]';
    toastLeadsTerkirim = '[class="toast-module__qn3SeG__textToast"]'
    checkBoxLeadsButuhBantuan = "(//*[name()='rect'])[4]";
    btnCariMobilBaru = '[data-testid="button-cari-mobil"]';


    clickTabFasilitasDana() {
        cy.get(this.tabFasilitasDana).click();
    }

    clickBtnAjukanSekarang() {
        cy.get(this.btnAjukanSekarang).click();
    }

    inputNamaLengkap(namaLengkap) {
        cy.get(this.namaLengkap).type(namaLengkap);
    }

    inputNomorHp(nomorHp) {
        cy.get(this.nomorHp).type(nomorHp);
    }

    clickDropdownPilihKota() {
        cy.get(this.dropdownPilihKota).click();
    }

    clickValuePilihKota() {
        cy.get(this.valuePilihKota).click();

    }

    inputDropdownPilihKota(dropdownPilihKota) {
        cy.get(this.dropdownPilihKota).type(dropdownPilihKota);
    }

    clickOpsiBPKBMobil() {
        cy.get(this.opsiBPKBMobil).click();
    }

    clickCheckBox() {
        cy.xpath(this.checkBox).click({ force: true })
    }

    clickBtnKirim() {
        cy.get(this.btnKirim).click();
    }

    verifyRefinancingHomepage() {
        cy.get(this.btnAjukanSekarang).should('be.visible');
    }

    clickBtnTerimaCookie() {
        cy.scrollTo(0, 10)
        cy.wait(2000)
        cy.xpath(this.btnTerimaCookie).click();
        cy.wait(2000)
    }

    clickBtnFasilitasDana() {
        cy.get(this.btnFasilitasDana).contains('Fasilitas Dana').click();
    }

    clickBtnMasukRegister() {
        cy.xpath(this.btnMasukRegister).click();
    }

    inputNomorHpLogin(nomorHpLogin) {
        cy.get(this.nomorHpLogin).type(nomorHpLogin);
    }

    clickBtnSelanjutnya() {
        cy.get(this.btnSelanjutnya).click();
    }

    inputFieldOTP(fieldOTP) {
        cy.get(this.fieldOTP).eq(0).type(fieldOTP);
    }

    inputNamaLengkapLeadsButuhBantuan(namaLengkapLeadsButuhBantuan) {
        cy.get(this.namaLengkapLeadsButuhBantuan).scrollIntoView();
        cy.get(this.namaLengkapLeadsButuhBantuan).type(namaLengkapLeadsButuhBantuan);
    }

    inputNomorHpLeadsButuhBantuan(nomorHpLeadsButuhBantuan) {
        cy.get(this.nomorHpLeadsButuhBantuan).type(nomorHpLeadsButuhBantuan);
    }

    clickBtnKirimLeadsButuhBantuan() {
        cy.get(this.btnKirimLeadsButuhBantuan).click();
    }

    clickCheckBoxLeadsButuhBantuan() {
        cy.xpath(this.checkBoxLeadsButuhBantuan).click({ force: true })
    }

    verifyToastLeadsTerkirim() {
        cy.get(this.toastLeadsTerkirim).should('be.visible');
    }

    clickBtnCariMobilBaru() {
        cy.get(this.btnCariMobilBaru).click();
    }

}

export default new homePage();
