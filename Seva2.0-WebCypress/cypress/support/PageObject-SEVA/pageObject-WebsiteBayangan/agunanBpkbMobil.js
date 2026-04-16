import'cypress-xpath'

class agunanBpkbMobil {
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
    btnKontakKamiNavigationMenu= '[data-id="7beab028"]';
    btnButuhBantuanFAQ= '[data-id="3cb1e8b"]';
    btnAjukanSekarangHeroSection = '[data-id="332b7ba0"]';
    btnAjukanSekarangCreditSimulation= '[class="elementskit-pricing-btn custom-trigger-btn ekit-pricing-btn-icon-pos-left"]';
    btnFloatingIcon = '[id="okapi-wasb-icon"]';

    

    clickBtnKontakKamiNavigationMenu() {
        cy.get(this.btnKontakKamiNavigationMenu).click();
    }

    clickBtnAjukanSekarangCreditSimulation() {
        cy.get(this.btnAjukanSekarangCreditSimulation).eq(0).scrollIntoView();
        cy.get(this.btnAjukanSekarangCreditSimulation).eq(0).click();
    }

    clickBtnButuhBantuanFAQ() {
        cy.get(this.btnButuhBantuanFAQ).scrollIntoView();
        cy.get(this.btnButuhBantuanFAQ).click();
    }

    clickBtnAjukanSekarangHeroSection() {
        cy.get(this.btnAjukanSekarangHeroSection).scrollIntoView();
        cy.get(this.btnAjukanSekarangHeroSection).click();
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

export default new agunanBpkbMobil();
