import'cypress-xpath'

class pusatGadaiTerdekat {
    btnAjukanSekarangTopWidget= '[data-id="58ceeec2"]';
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
    btnDiSini= '[class="custom-trigger-btn"]';
    btnAjukanSekarangUSP = '[data-id="d1e09dd"]';
    btnAjukanSekarangCreditSimulation= '[id="web_refinancing_simulasi_70_click"]';
    btnAjukanSekarangBenefitSection= '[data-id="c4ce1fe"';
    btnFloatingIcon = '[id="simple-chat-button--button"]';

    

    clickBtnAjukanSekarangTopWidget() {
        cy.get(this.btnAjukanSekarangTopWidget).scrollIntoView();
        cy.get(this.btnAjukanSekarangTopWidget).click();
    }

    clickBtnDiSini() {
        cy.get(this.btnDiSini).eq(0).scrollIntoView();
        cy.get(this.btnDiSini).eq(0).click();
    }

    clickBtnAjukanSekarangUSP() {
        cy.get(this.btnAjukanSekarangUSP).scrollIntoView();
        cy.get(this.btnAjukanSekarangUSP).click();
    }

    clickBtnAjukanSekarangCreditSimulation() {
        cy.get(this.btnAjukanSekarangCreditSimulation).scrollIntoView();
        cy.get(this.btnAjukanSekarangCreditSimulation).click();
    }

    clickBtnAjukanSekarangBenefitSection() {
        cy.get(this.btnAjukanSekarangBenefitSection).scrollIntoView();
        cy.get(this.btnAjukanSekarangBenefitSection).click();
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

    // inputFieldOTP(fieldOTP) {
    //     cy.get(this.fieldOTP).eq(0).type(fieldOTP);
    // }

}

export default new pusatGadaiTerdekat();
