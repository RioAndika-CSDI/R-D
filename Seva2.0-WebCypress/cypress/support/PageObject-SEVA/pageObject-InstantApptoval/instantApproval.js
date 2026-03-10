import'cypress-xpath'
import "cypress-real-events/support";

class instantApproval {
    
    btnSelanjutnya = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop ktp-review-module__GmCx2a__buttonDesktop"]'
    checkBox = "(//*[name()='rect'])[2]";
    checkboxKonfirmasiData = "(//*[name()='rect'])[3]"
    perusahaanPembiayaan = "//p[normalize-space()='ACC (Astra Credit Companies)']"
    btnSelanjutnyaPerusahaanPembiayaan = "//button[normalize-space()='Selanjutnya']"
    btnAjukaInstantApproval = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop undefined"]'
    btnRiwayatPengajuan = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop kk-waiting-result-module__qI5QEG__cariMobil"]'

    clickBtnSelanjutnya() {
        cy.get(this.btnSelanjutnya).click();
    }

    clickCheckBox() {
        cy.xpath(this.checkBox).click({ force: true })
    }

    clickCheckBoxKonfirmasiData() {
        cy.xpath(this.checkboxKonfirmasiData).click({ force: true })
    }

    clickPerusahaanPembiayaan() {
        cy.xpath(this.perusahaanPembiayaan).click();
    }

    clickBtnSelanjutnyaPerusahaanPembiayaan() {
        cy.xpath(this.btnSelanjutnyaPerusahaanPembiayaan).click();
    }

    clickBtnAjukaInstantApproval() {
        cy.get(this.btnAjukaInstantApproval).click()
    }

    verifyLeadsIa() {
        cy.get(this.btnRiwayatPengajuan).should('be.visible');
    }

}

export default new instantApproval();
