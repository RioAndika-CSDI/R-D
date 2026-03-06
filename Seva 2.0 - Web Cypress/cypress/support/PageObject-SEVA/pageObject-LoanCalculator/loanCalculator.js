import'cypress-xpath'

class loanCalculator {
    downPayment = '[data-testid="field-input-dp"]'
    pendapatanBulanan = '[data-test-id="field-input-pendapatan"]'
    dropdownKategoriUmur = '[data-testid="button-kategori-umur"]'
    valueKategoriUmur = '[data-testid="field-pilih-kategori-umur-28-34"]'
    btnSimulasiKredit = '[data-testid="button-hitung-kemampuan-lc"]'
    btnIconWa = '[data-testid="button-hubungi-agen-seva"]';
    namaLengkapLeadsForm = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHpLeadsForm = '[data-test-id="field-input-leads-nomor-hp"]';
    btnKirimLeadsForm  = '[data-test-id="button-kirim-leads"]';
    toastLeadsTerkirim = '[class="toast-module__qn3SeG__textToast leadsFormSecondary-module__sglaiW__toastAdditionalTextClassnamePDP"]'
    checkBoxLeadsForm = "(//*[name()='rect'])[8]";
    btnCekPeluangKredit = '[class="calculationResult-module__diJnZq__continueKkSectionCtaPDP"]'

    inputDownPayment(downPayment) {
        cy.get(this.downPayment).eq(1).scrollIntoView();
        cy.wait(3000)
        cy.get(this.downPayment).eq(1).click();
        cy.get(this.downPayment).eq(1).clear();
        cy.get(this.downPayment).eq(1).type(downPayment);
    }

    inputPendapatanBulanan(pendapatanBulanan) {
        cy.get(this.pendapatanBulanan).eq(1).scrollIntoView();
        cy.get(this.pendapatanBulanan).eq(1).type(pendapatanBulanan);
    }

    clickDropdownKategoriUmur() {
        cy.get(this.dropdownKategoriUmur).eq(1).click();
    }

    clickValueKategoriUmur() {
        cy.get(this.valueKategoriUmur).eq(1).click();
    }

    clickBtnSimulasiKredit() {
        cy.get(this.btnSimulasiKredit).eq(1).click();
    }

    clickBtnIconWa() {
        cy.get(this.btnIconWa).eq(1).click();
    }

    inputNamaLengkapLeadsForm(namaLengkapLeadsForm) {
        cy.get(this.namaLengkapLeadsForm).type(namaLengkapLeadsForm);
    }

    inputNomorHpLeadsForm(nomorHpLeadsForm) {
        cy.get(this.nomorHpLeadsForm).type(nomorHpLeadsForm);
    }

    clickBtnKirimLeadsForm() {
        cy.window().then((win) => {
            cy.stub(win, 'open').as('windowOpen')
        })
        
        cy.get(this.btnKirimLeadsForm).click();
    }

    clickCheckBoxLeadsForm() {
        cy.xpath(this.checkBoxLeadsForm).click({ force: true })
    }

    verifySendLeadsForm() {
        cy.get(this.namaLengkapLeadsForm).should('not.exist')
    }

    clickCekPeluangKredit() {
        cy.get(this.btnCekPeluangKredit).click();
    }


}

export default new loanCalculator();
