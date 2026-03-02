import'cypress-xpath'

class promoDetailPage {
    namaLengkapLeads = '[id="leads-name"]';
    nomorHpLeads = '[id="leads-phone"]';
    emailLeads = '[id="leads-email"]'
    btnKirimLeads  = '[id="leads-submit"]';
    toastLeadsTerkirim = "//div[@class='toast-text'][normalize-space()='Agen kami akan segera menghubungi kamu dalam 1x24 jam.']"
    checkBoxLeads = '[id="consent-promo"]';
    fieldOTP = '[class="otp-input"]'

    inputNamaLengkapLeads(namaLengkapLeads) {
        cy.get(this.namaLengkapLeads).scrollIntoView();
        cy.get(this.namaLengkapLeads).type(namaLengkapLeads);
    }

    inputNomorHpLeads(nomorHpLeads) {
        cy.get(this.nomorHpLeads).type(nomorHpLeads);
    }

    inputEmailLeads(emailLeads) {
        cy.get(this.emailLeads).type(emailLeads);
    }

    clickBtnKirimLeads() {
        cy.get(this.btnKirimLeads).click();
    }

    clickCheckBoxLeads() {
        cy.get(this.checkBoxLeads).click({ force: true })
    }

    verifyLeadsTerkirim() {
        cy.get(this.btnKirimLeads).should('be.visible');
    }

    inputFieldOTP(fieldOTP) {
        cy.get(this.fieldOTP).eq(0).type(fieldOTP);
    }


}

export default new promoDetailPage();
