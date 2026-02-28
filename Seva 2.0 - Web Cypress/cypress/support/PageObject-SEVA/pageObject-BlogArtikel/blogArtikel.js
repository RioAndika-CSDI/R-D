import'cypress-xpath'

class blogArtikel {
    namaLengkapLeads = '[id="nameLeads"]';
    nomorHpLeads = '[id="numberLeads"]';
    btnKirimLeads  = '[id="submitLeadsArticle"]';
    toastLeadsTerkirim = "//div[@class='toast-text'][normalize-space()='Agen kami akan segera menghubungi kamu dalam 1x24 jam.']"
    checkBoxLeads = '[id="consent-content"]';
    iconClose = "//button[@aria-label='Close']"
    // fieldOTP = '[class="otp-input"]'

    inputNamaLengkapLeads(namaLengkapLeads) {
        cy.get(this.namaLengkapLeads).scrollIntoView();
        cy.get(this.namaLengkapLeads).click();
        cy.get(this.namaLengkapLeads).type(namaLengkapLeads);
    }

    inputNomorHpLeads(nomorHpLeads) {
        cy.get(this.nomorHpLeads).type(nomorHpLeads);
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

    // verifyLeadsTerkirim() {
    //     cy.xpath(this.btnKirimLeads).should('be.disabled');
    // }

    clickIconClose() {
        cy.xpath(this.iconClose).click();
    }

    // inputFieldOTP(fieldOTP) {
    //     cy.get(this.fieldOTP).eq(0).type(fieldOTP);
    // }


}

export default new blogArtikel();
