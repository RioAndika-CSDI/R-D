import'cypress-xpath'

class danaBpkb {
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
    btnAjukanSekarangTopWidget= '[data-id="14108395"]';
    btnAjukanSekarangNavigationMenu= '[data-id="7ffe8166"]';
    btnSelengkapnyaAboutUs= '[data-id="1e7aad02"]';
    btnKonsultasiGoals= '[data-id="4dfbe0ad"]';
    btnHubungiKamiGoals= '[data-id="5718ea5a"]';
    btnAjukanSekarangDocument= '[data-id="33e22b24"]';
    btnAjukanSekarangUSP = '[data-id="1c8e1157"]';
    btnHubungiKamiUSP = '[data-id="e4fa11d"]';
    btnAjukanSekarangCreditSimulation= '[data-id="d566e2f"]';
    btnSelengkapnyaFAQ= '[data-id="6acc819a"]';
    btnFloatingIcon = '[id="okapi-wasb-icon"]';

    

    clickBtnAjukanSekarangTopWidget() {
        cy.get(this.btnAjukanSekarangTopWidget).scrollIntoView();
        cy.get(this.btnAjukanSekarangTopWidget).click();
    }

    clickBtnAjukanSekarangNavigationMenu() {
        cy.get(this.btnAjukanSekarangNavigationMenu).scrollIntoView();
        cy.get(this.btnAjukanSekarangNavigationMenu).click();
    }

    clickBtnSelengkapnyaAboutUs() {
        cy.get(this.btnSelengkapnyaAboutUs).scrollIntoView();
        cy.get(this.btnSelengkapnyaAboutUs).click();
    }

    clickBtnKonsultasiGoals() {
        cy.get(this.btnKonsultasiGoals).scrollIntoView();
        cy.get(this.btnKonsultasiGoals).click();
    }

    clickBtnHubungiKamiGoals() {
        cy.get(this.btnHubungiKamiGoals).scrollIntoView();
        cy.get(this.btnHubungiKamiGoals).click();
    }

    clickBtnAjukanSekarangDocument() {
        cy.get(this.btnAjukanSekarangDocument).scrollIntoView();
        cy.get(this.btnAjukanSekarangDocument).click();
    }

    clickBtnAjukanSekarangUSP() {
        cy.get(this.btnAjukanSekarangUSP).scrollIntoView();
        cy.get(this.btnAjukanSekarangUSP).click();
    }

    clickBtnHubungiKamiUSP() {
        cy.get(this.btnHubungiKamiUSP).scrollIntoView();
        cy.get(this.btnHubungiKamiUSP).click();
    }

    clickBtnAjukanSekarangCreditSimulation() {
        cy.get(this.btnAjukanSekarangCreditSimulation).scrollIntoView();
        cy.get(this.btnAjukanSekarangCreditSimulation).click();
    }

    clickBtnSelengkapnyaFAQ() {
        cy.get(this.btnSelengkapnyaFAQ).scrollIntoView();
        cy.get(this.btnSelengkapnyaFAQ).click();
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

export default new danaBpkb();
