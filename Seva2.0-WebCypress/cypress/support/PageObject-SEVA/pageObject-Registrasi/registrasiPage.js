import'cypress-xpath'

class registrasiPage {
    namaLengkap = '[data-test-id="input-nama-lengkap"]';
    email = '[data-testid="input-email"]';
    tanggalLahir  = "//button[normalize-space()='DD/MM/YYYY']";
    btnSimpan = "//a[normalize-space()='Simpan']"
    dropdownJenisKelamin = '[class="inputSelect-module__gaCRbW__inputArea"]'
    valueJenisKelamin = '[id="Pria"]'
    btnDaftar = '[data-testid="button-daftar"]'
    btnHapusAkun = "//a[normalize-space()='Hapus Akun']"
    checkbox = "(//*[name()='rect'])[4]"
    checkbox2 = "(//*[name()='rect'])[2]"
    btnLanjutkan = "//button[normalize-space()='Lanjutkan']"
    dropdownPilihAlasan = '[class="inputSelect-module__gaCRbW__inputField"]'
    valuePilihAlasan = "//div[contains(text(),'Alasan lainnya')]"
    btnSelanjutnya = "//button[normalize-space()='Selanjutnya']"
    btnYaHapusAkunSaya = "//button[normalize-space()='Ya, Hapus Akun Saya']"
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
        cy.xpath(this.checkbox2).should('exist').click({ force: true });
    }

    clickBtnDaftar() {
        cy.get(this.btnDaftar).click();
    }

    clickBtnHapusAkun() {
        cy.xpath(this.btnHapusAkun).click();
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
        cy.xpath(this.btnYaHapusAkunSaya).click();
    }

    // clickValuePilihAlasan(valuePilihAlasan) {
    //     cy.contains(this.valuePilihAlasan, valuePilihAlasan).click();
    // }

    clickValuePilihAlasan() {
        cy.xpath(this.valuePilihAlasan).should('be.visible').click({ force: true })
    }

    verifySuccessRegistrasi() {
        cy.get(this.btnCariMobilBaru).should('be.visible');
    }


}

export default new registrasiPage();
