import'cypress-xpath'

class productDetailPage {
    btnFloatingIcon = '[data-testid="button-leads-from-icon"]';
    namaLengkapFloatingIcon = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHpFloatingIcon = '[data-test-id="field-input-leads-nomor-hp"]';
    checkBoxFloatingIcon = "(//*[name()='rect'])[12]";
    btnKirimFloatingIcon = '[data-test-id="button-kirim-leads"]';
    namaLengkapLeadsButuhBantuan = '[data-test-id="field-input-nama-lengkap"]';
    nomorHpLeadsButuhBantuan = '[data-test-id="field-input-nomor-hp"]';
    btnKirimLeadsButuhBantuan  = '[data-testid="button-cari-mobil"]';
    toastLeadsTerkirim = '[class="toast-module__qn3SeG__textToast leadsFormSecondary-module__sglaiW__toastAdditionalTextClassnamePDP"]'
    checkBoxLeadsButuhBantuan = "(//*[name()='rect'])[3]";

    clickBtnFloatingIcon() {
        cy.get(this.btnFloatingIcon).eq(0).click();
    }

    inputNamaLengkapFloatingIcon(namaLengkapFloatingIcon) {
        cy.get(this.namaLengkapFloatingIcon).type(namaLengkapFloatingIcon);
    }

    inputNomorHpFloatingIcon(nomorHpFloatingIcon) {
        cy.get(this.nomorHpFloatingIcon).type(nomorHpFloatingIcon);
    }

    clickBtnKirimFloatingIcon() {
        cy.window().then((win) => {
            cy.stub(win, 'open').as('windowOpen')
        })
        cy.get(this.btnKirimFloatingIcon).click();
    }

    clickCheckBoxFloatingIcon() {
        cy.xpath(this.checkBoxFloatingIcon).click();
    }

    verifyToastLeadsTerkirim() {
        // cy.get(this.toastLeadsTerkirim).should('be.visible');
        cy.get(this.namaLengkapLeadsButuhBantuan).should('be.visible');
    }

    verifySendLeadsFloatingIcon() {
        cy.get(this.namaLengkapFloatingIcon).should('not.exist')
    }

    inputNamaLengkapLeadsButuhBantuan(namaLengkapLeadsButuhBantuan) {
        cy.get(this.namaLengkapLeadsButuhBantuan).eq(0).scrollIntoView();
        cy.get(this.namaLengkapLeadsButuhBantuan).eq(0).type(namaLengkapLeadsButuhBantuan);
    }

    inputNomorHpLeadsButuhBantuan(nomorHpLeadsButuhBantuan) {
        cy.get(this.nomorHpLeadsButuhBantuan).eq(0).type(nomorHpLeadsButuhBantuan);
    }

    clickBtnKirimLeadsButuhBantuan() {
        cy.get(this.btnKirimLeadsButuhBantuan).eq(0).click();
    }

    clickCheckBoxLeadsButuhBantuan() {
        cy.xpath(this.checkBoxLeadsButuhBantuan).click({ force: true })
    }


}

export default new productDetailPage();
