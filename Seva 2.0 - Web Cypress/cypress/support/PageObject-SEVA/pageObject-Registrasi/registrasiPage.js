import'cypress-xpath'

class registrasiPage {
    namaLengkap = '[data-test-id="input-nama-lengkap"]';
    email = '[data-testid="input-email"]';
    tanggalLahir  = "button[name='dob']";
    btnSimpan = "//a[normalize-space()='Simpan']"
    dropdownJenisKelamin = '[class="inputSelect-module__gaCRbW__inputArea"]'
    valueJenisKelamin = '[id="Pria"]'
    btnDaftar = '[data-testid="button-daftar"]'
    btnHapusAkun = '[class="account-profile-module__WNxDGq__deleteAccountLink"]'
    checkbox = "(//*[name()='rect'])[4]"
    checkbox2 = "(//*[name()='rect'])[1]"
    btnLanjutkan = "//button[normalize-space()='Lanjutkan']"
    dropdownPilihAlasan = '[class="inputSelect-module__gaCRbW__inputField"]'
    valuePilihAlasan = '[class="inputSelect-module__gaCRbW__dropdownItemText"]'
    btnSelanjutnya = "//button[normalize-space()='Selanjutnya']"
    btnYaHapusAkunSaya = 'class="textButton-module__UgUQqG__primary deleteAccountModal-module__q0WNaq__ctaConfirm"'
    btnCariMobilBaru = '[data-testid="button-cari-mobil"]';

    inputNamaLengkap(namaLengkap) {
        cy.get(this.namaLengkap).scrollIntoView();
        cy.get(this.namaLengkap).type(namaLengkap);
    }

    inputEmail(email) {
        cy.get(this.email).type(email);
    }

    // inputTanggalLahir(tanggalLahir) {
    //     cy.get(this.tanggalLahir).type(tanggalLahir);
    // }

    clickTanggalLahir() {
        cy.xpath(this.tanggalLahir).click();
    }

    clickBtnSimpan() {
        cy.xpath(this.btnSimpan).click();
    }

    clickDropdownJenisKelamin() {
        cy.get(this.dropdownJenisKelamin).click();
    }

    clickValueJenisKelamin() {
        cy.get(this.valueJenisKelamin).click();
    }

    // inputDropdownPilihKota(dropdownPilihKota) {
    //     cy.get(this.dropdownPilihKota).type(dropdownPilihKota);
    // }

    clickCheckbox() {
        cy.xpath(this.checkbox).click();
    }

    clickCheckbox2() {
        cy.xpath(this.checkbox2).click();
    }

    clickBtnDaftar() {
        cy.get(this.btnDaftar).click();
    }

    clickBtnHapusAkun() {
        cy.get(this.btnHapusAkun).click();
    }

    clickBtnLanjutkan() {
        cy.xpath(this.btnLanjutkan).click();
    }

    clickDropdownPilihAlasan() {
        cy.get(this.dropdownPilihAlasan).click();
    }

    clickBtnSelanjutnya() {
        cy.xpath(this.btnSelanjutnya).click();
    }

    clickBtnYaHapusAkunSaya() {
        cy.get(this.btnYaHapusAkunSaya).click();
    }

    clickValuePilihAlasan(valuePilihAlasan) {
        cy.contains(this.valuePilihAlasan, valuePilihAlasan).click();
    }

    verifySuccessRegistrasi() {
        cy.get(this.btnCariMobilBaru).should('be.visible');
    }


}

export default new registrasiPage();
