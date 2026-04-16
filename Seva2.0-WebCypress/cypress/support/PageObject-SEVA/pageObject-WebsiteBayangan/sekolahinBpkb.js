import'cypress-xpath'

class sekolahinBpkb {
    namaLengkapLeadsForm = '[id="nameLeads"]';
    nomorHpLeadsForm = '[id="numberLeads"]';
    dropdownPilihKota = '[id="textCityRef"]';
    valuePilihKota ='[class="simplebar-content"]';
    opsiBPKBMobilLeadsForm = '[id="bpkb-mobil-article"]';
    checkBoxLeadsForm = "(//input[@id='consent-content'])[1]";
    btnKirimLeadsForm = '[id="submitLeadsArticle"]';
    namaLengkapPopUpForm = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHpPopUpForm = '[data-test-id="field-input-leads-nomor-hp"]';
    dropdownPilihKotaPopUpForm = '[id="textCityRefV2"]';
    opsiBPKBMobilPopUpForm = '[id="bpkb-mobil-general"]';
    checkBoxPopUpForm = "(//input[@id='consent'])[1]";
    btnKirimPopUpForm = '[id="submitLeads-general"]';
    titleForm= '[id="popup-general-title"]';
    btnAjukanSekarangTopWidget= '[data-id="3c6fb6a5"]';
    // btnKonsultasiGratis= '[data-id="15f674f4"]';
    btnPinjamDanaTopWidget= '[data-id="23aa137"]';
    btnKontakKamiTopWidget= '[data-id="1a0a0cad"]';
    btnGoals= '[data-id="3636d51f"]';
    btnAjukanSekarangUSP = '[data-id="861ce83"]';
    btnAjukanSekarangCreditSimulation= '[data-id="6c75ed62"]';
    btnKonsultasiGratisHeroSection= '[data-id="4cbc4634"]';
    btnFloatingIcon = '[id="okapi-wasb-icon"]';

    

    clickBtnAjukanSekarangTopWidget() {
        cy.get(this.btnAjukanSekarangTopWidget).click();
    }

    clickBtnKonsultasiGratis() {
        cy.get(this.btnKonsultasiGratis).scrollIntoView();
        cy.get(this.btnKonsultasiGratis).click();
    }

    clickBtnPinjamDanaTopWidget() {
        cy.get(this.btnPinjamDanaTopWidget).scrollIntoView();
        cy.get(this.btnPinjamDanaTopWidget).click();
    }

    clickBtnKontakKamiTopWidget() {
        cy.get(this.btnKontakKamiTopWidget).scrollIntoView();
        cy.get(this.btnKontakKamiTopWidget).click();
    }

    clickBtnGoals() {
        cy.get(this.btnGoals).scrollIntoView();
        cy.get(this.btnGoals).click();
    }

    clickBtnAjukanSekarangUSP() {
        cy.get(this.btnAjukanSekarangUSP).scrollIntoView();
        cy.get(this.btnAjukanSekarangUSP).click();
    }

    clickBtnAjukanSekarangCreditSimulation() {
        cy.get(this.btnAjukanSekarangCreditSimulation).scrollIntoView();
        cy.get(this.btnAjukanSekarangCreditSimulation).click();
    }

    clickBtnKonsultasiGratisHeroSection() {
        cy.get(this.btnKonsultasiGratisHeroSection).scrollIntoView();
        cy.get(this.btnKonsultasiGratisHeroSection).click();
    }

    clickBtnFloatingIcon() {
        cy.get(this.btnFloatingIcon).scrollIntoView();
        cy.get(this.btnFloatingIcon).click();
    }

    inputNamaLengkapLeadsForm(namaLengkapLeadsForm) {
        cy.get(this.namaLengkapLeadsForm).scrollIntoView();
        cy.get(this.namaLengkapLeadsForm).type(namaLengkapLeadsForm);
    }

    inputNomorHpLeadsForm(nomorHpLeadsForm) {
        cy.get(this.nomorHpLeadsForm).type(nomorHpLeadsForm);
    }

    clickDropdownPilihKotaLeadsForm() {
        cy.get(this.dropdownPilihKota).eq(0).click();
    }

    inputDropdownPilihKotaLeadsForm(inputKota) {
        cy.get(this.dropdownPilihKota).eq(0).type(inputKota);
    }

    clickOpsiBPKBMobilLeadsForm() {
        cy.get(this.opsiBPKBMobilLeadsForm).eq(0).click();
    }

    clickCheckBoxLeadsForm() {
        cy.xpath(this.checkBoxLeadsForm).click({ force: true })
    }

    clickBtnKirimLeadsForm() {
        cy.get(this.btnKirimLeadsForm).click();
    }

    verifySendLeadsForm() {
        cy.get(this.btnKirimLeadsForm).should('not.be.disabled')
    }

    inputNamaLengkapPopUpForm(namaLengkapPopUpForm) {
        cy.get(this.namaLengkapPopUpForm).type(namaLengkapPopUpForm);
    }

    inputNomorHpPopUpForm(nomorHpPopUpForm) {
        cy.get(this.nomorHpPopUpForm).type(nomorHpPopUpForm);
    }

    clickDropdownPilihKotaPopUpForm() {
        cy.get(this.dropdownPilihKotaPopUpForm).eq(0).click();
    }

    inputDropdownPilihKotaPopUpForm(inputKota) {
        cy.get(this.dropdownPilihKotaPopUpForm).eq(0).type(inputKota);
    }

    clickOpsiBPKBMobilPopUpForm() {
        cy.get(this.opsiBPKBMobilPopUpForm).eq(0).click();
    }

    clickCheckBoxPopUpForm() {
        cy.xpath(this.checkBoxPopUpForm).click({ force: true })
    }

    clickBtnKirimPopUpForm() {
        cy.get(this.btnKirimPopUpForm).click();
    }

    verifySendLeadsPopUpForm() {
        cy.get(this.titleForm).eq(1).should('not.exist')
    }

    clickValuePilihKota(valuePilihKota) {
        cy.contains(this.valuePilihKota, valuePilihKota).click();
    }

}

export default new sekolahinBpkb();
