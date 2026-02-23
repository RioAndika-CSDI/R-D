import'cypress-xpath'

class refinancingPage {
    btnAjukanSekarang= '[data-testid="button-ajukan-sekarang"]';
    namaLengkap = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHp = '[data-test-id="field-input-leads-nomor-hp"]';
    dropdownPilihKota = '[data-testid="dropdown-pilih-kota"]';
    valuePilihKota ='[class="inputSelect-module__gaCRbW__dropdownItemText"]';
    opsiBPKBMobil = '[name="bpkb_preference_primary"]';
    checkBox = "(//*[name()='rect'])[9]";
    btnKirim = '[data-test-id="button-kirim-leads"]';
    btnLanjutUnggahDokumen = '[class="thankyouRefinancingv2-module__gR4xRW__buttonCTADesktop"]';
    btnDiSini = "//button[normalize-space()='di sini']"
    btnAjukanSekarangCreditSimulation = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__big refinancingSimulation-module__kl5NtW__styledButtonMobile"]';
    btnFloatingIcon = '[data-testid="button-leads-from-icon"]'
    namaLengkapLeadsForm = '[data-test-id="nama-lengkap-pdp-leads"]';
    nomorHpLeadsForm = '[data-test-id="nomor-telp-pdp-leads"]';
    dropdownPilihKotaLeadsForm = '[data-testid="dropdown-pilih-kota"]';
    checkBoxLeadsForm = "(//*[name()='rect'])[4]";
    // valuePilihKota2 ='[class="inputSelect-module__gaCRbW__dropdownItemText"]';
    opsiBPKBMobilLeadsForm = '[name="bpkb_preference_tertiary"]';
    btnKirimLeadsForm = '[data-test-id="submit-pdp-leads"]';

    clickBtnAjukanSekarangTopWidget() {
        cy.get(this.btnAjukanSekarang).eq(0).click();
    }

    clickBtnAjukanSekarangBenefitSection() {
        cy.get(this.btnAjukanSekarang).eq(1).click();
    }

    clickBtnAjukanSekarangCreditSimulation() {
        cy.get(this.btnAjukanSekarangCreditSimulation).eq(0).scrollIntoView();
        cy.get(this.btnAjukanSekarangCreditSimulation).eq(0).click();
    }

    clickBtnDiSini() {
        cy.xpath(this.btnDiSini).click()
    }

    clickBtnFloatingIcon() {
        cy.scrollTo(0, 2000)
        cy.get(this.btnFloatingIcon).click();
    }

    inputNamaLengkap(namaLengkap) {
        cy.get(this.namaLengkap).type(namaLengkap);
    }

    inputNamaLengkapLeadsForm(namaLengkapLeadsForm) {
        cy.get(this.namaLengkapLeadsForm).scrollIntoView();
        cy.get(this.namaLengkapLeadsForm).type(namaLengkapLeadsForm);
    }

    inputNomorHp(nomorHp) {
        cy.get(this.nomorHp).type(nomorHp);
    }

    inputNomorHpLeadsForm(nomorHpLeadsForm) {
        cy.get(this.nomorHpLeadsForm).type(nomorHpLeadsForm);
    }

    clickDropdownPilihKotaLeadsForm() {
        cy.get(this.dropdownPilihKota).eq(0).click();  
    }

    //untuk semuanya
    clickDropdownPilihKota() {
        cy.get(this.dropdownPilihKota).eq(1).click();
    }

    // clickDropdownPilihKotaLeadsForm() {
    //     cy.get(this.dropdownPilihKotaLeadsForm).click();
    // }

    clickValuePilihKota(valuePilihKota) {
        cy.contains(this.valuePilihKota, valuePilihKota).click();
    }

    inputDropdownPilihKotaLeadsForm(dropdownPilihKota) {
        cy.get(this.dropdownPilihKota).eq(0).type(dropdownPilihKota);
    }

    //untuk semuanya
    inputDropdownPilihKota(dropdownPilihKota) {
        cy.get(this.dropdownPilihKota).eq(1).type(dropdownPilihKota);
    }

    // inputDropdownPilihKota3(dropdownPilihKota2) {
    //     cy.get(this.dropdownPilihKota2).eq(1).type(dropdownPilihKota2);
    // }

    clickOpsiBPKBMobil() {
        cy.get(this.opsiBPKBMobil).eq(0).click();
    }

    clickOpsiBPKBMobilLeadsForm() {
        cy.get(this.opsiBPKBMobilLeadsForm).eq(0).click();
    }

    clickCheckBox() {
        cy.xpath(this.checkBox).click({ force: true })
    }

    clickCheckBoxLeadsForm() {
        cy.xpath(this.checkBoxLeadsForm).click({ force: true })
    }

    clickBtnKirim() {
        cy.get(this.btnKirim).click();
    }

    clickBtnKirimLeadsForm() {
        cy.get(this.btnKirimLeadsForm).click();
    }

    verifyRefinancingPage() {
        cy.contains(this.btnLanjutUnggahDokumen, 'Lanjut Unggah Dokumen').should('be.visible');
    }

}

export default new refinancingPage();
