import'cypress-xpath'

class productListingPageUsedCar {
    btnSayaBerminat = '[data-testid="button-hitung-kemampuan-plp"]';
    namaLengkapLeads = '[data-test-id="field-input-leads-nama-lengkap"]';
    nomorHpLeads = '[data-test-id="field-input-leads-nomor-hp"]';
    checkBoxLeads = "(//*[name()='rect'])[4]";
    btnKirimLeads = '[data-test-id="button-kirim-leads"]';
    dropdownPilihKota = '[data-testid="dropdown-pilih-kota"]';
    valuePilihKota ='[class="inputSelect-module__gaCRbW__dropdownItemText"]';
    namaMobil = '[data-testid="text-brand-model-mobil"]'

    clickBtnSayaBerminat() {
        cy.get(this.btnSayaBerminat).eq(0).click();
    }

    inputNamaLengkapLeads(namaLengkapLeads) {
        cy.get(this.namaLengkapLeads).type(namaLengkapLeads);
    }

    inputNomorHpLeads(nomorHpLeads) {
        cy.get(this.nomorHpLeads).type(nomorHpLeads);
    }

    clickBtnKirimLeads() {
        cy.get(this.btnKirimLeads).click();
    }

    clickCheckBoxLeads() {
        cy.xpath(this.checkBoxLeads).click();
    }

    verifySendLeads() {
        cy.get(this.namaLengkapLeads).should('not.exist')
    }

    clickDropdownPilihKota() {
        cy.get(this.dropdownPilihKota).click();
    }

    inputDropdownPilihKota(dropdownPilihKota) {
        cy.get(this.dropdownPilihKota).type(dropdownPilihKota);
    }

    clickValuePilihKota(valuePilihKota) {
        cy.contains(this.valuePilihKota, valuePilihKota).click();
    }

    clickNamaMobil() {
        cy.get(this.namaMobil).eq(0).click();
    }


}

export default new productListingPageUsedCar();
