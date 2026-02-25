import'cypress-xpath'

class productDetailPageUsedCar {
    namaLengkapLeadsButuhBantuan = '[data-test-id="field-input-nama-lengkap"]';
    nomorHpLeadsButuhBantuan = '[data-test-id="field-input-nomor-hp"]';
    btnKirimLeadsButuhBantuan  = '[data-testid="button-cari-mobil"]';
    checkBoxLeadsButuhBantuan = "(//*[name()='rect'])[3]";
    dropdownPilihKota = '[data-testid="dropdown-pilih-kota"]';
    valuePilihKota ='[class="inputSelect-module__gaCRbW__dropdownItemText"]';
    toastLeadsTerkirim = '[class="toast-module__qn3SeG__textToast"]'

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

    clickDropdownPilihKota() {
        cy.get(this.dropdownPilihKota).click();
    }

    inputDropdownPilihKota(dropdownPilihKota) {
        cy.get(this.dropdownPilihKota).type(dropdownPilihKota);
    }

    clickValuePilihKota(valuePilihKota) {
        cy.contains(this.valuePilihKota, valuePilihKota).click();
    }

    verifyToastLeadsTerkirim() {
        cy.get(this.toastLeadsTerkirim).should('be.visible');
    }




}

export default new productDetailPageUsedCar();
