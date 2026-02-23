import'cypress-xpath'

class productListingPage {
    btnFloatingIcon = '[data-testid="button-leads-from-icon"]';
    namaLengkapFloatingIcon = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHpFloatingIcon = '[data-test-id="field-input-leads-nomor-hp"]';
    checkBoxFloatingIcon = "(//*[name()='rect'])[8]";
    btnKirimFloatingIcon = '[data-test-id="button-kirim-leads"]';
    namaLengkapLeadsButuhBantuan = '[data-test-id="nama-lengkap-pdp-leads"]';
    nomorHpLeadsButuhBantuan = '[data-test-id="nomor-telp-pdp-leads"]';
    btnKirimLeadsButuhBantuan  = '[data-test-id="submit-pdp-leads"]';
    toastLeadsTerkirim = '[class="toast-module__qn3SeG__textToast"]'
    checkBoxLeadsButuhBantuan = "(//*[name()='rect'])[3]";
    namaMobil = "//div[@class='mobil-baru-module__ws-ZTW__detailCardWrapperDesktop']//h2[@class='cardetailcard-module__6k6Prq__brandModelText'][normalize-space()='Daihatsu All New Ayla']"

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
        cy.get(this.btnKirimFloatingIcon).click();
    }

    clickCheckBoxFloatingIcon() {
        cy.xpath(this.checkBoxFloatingIcon).click();
    }

    verifySendLeadsFloatingIcon() {
        cy.get(this.namaLengkapFloatingIcon).should('not.exist')
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

    clickNamaMobil() {
        cy.xpath(this.namaMobil).click();
    }


}

export default new productListingPage();
