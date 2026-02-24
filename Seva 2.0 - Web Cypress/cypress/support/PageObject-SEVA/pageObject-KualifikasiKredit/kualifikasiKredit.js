import'cypress-xpath'

class kualifikasiKredit {
    
    dropdownPekerjaan = '[class="inputSelect-module__gaCRbW__inputField inputSelect-module__gaCRbW__inputFieldPDPDesktop"]'
    valuePekerjaan = '[class="inputSelect-module__gaCRbW__dropdownItem inputSelect-module__gaCRbW__active"]'
    btnSelanjutnya = "[normalize-space()='Selanjutnya']"
    checkBoxLeadsForm = "(//*[name()='rect'])[7]";
    btnCekPeluangKredit = '[class="button-module__T5rPxa__primaryDarkBlue button-module__T5rPxa__plpDesktop undefined"]'
    btnKirimOtp = "//button[normalize-space()='Kirim OTP']"
    IconWa = '[data-testid="button-hubungi-agen-seva"]'

    clickDropdownPekerjaan() {
        cy.get(this.dropdownPekerjaan).click();
    }

    clickInputPekerjaan(dropdownPekerjaan) {
        cy.get(this.dropdownPekerjaan).type(dropdownPekerjaan);
    }

    clickValuePekerjaan(valuePekerjaan) {
        cy.contains(this.valuePekerjaan, valuePekerjaan).click({ force: true });
    }

    clickBtnSelanjutnya() {
        cy.xpath(this.btnSelanjutnya).click();
    }

    clickCheckBoxLeadsForm() {
        cy.xpath(this.checkBoxLeadsForm).scrollIntoView()
        cy.xpath(this.checkBoxLeadsForm).click({ force: true })
    }

    clickBtnCekPeluangKredit() {
        cy.get(this.btnCekPeluangKredit).click();
    }

    clickBtnKirimOtp() {
        cy.xpath(this.btnKirimOtp).click();
    }

    verifyLeadsKk() {
        cy.get(this.IconWa).should('be.visible');
    }


}

export default new kualifikasiKredit();
