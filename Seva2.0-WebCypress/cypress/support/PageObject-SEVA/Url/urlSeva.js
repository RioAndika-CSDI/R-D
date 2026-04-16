import 'cypress-xpath'

class urlSeva {
    url = 'https://www.seva.id/?utm_source=testing00&utm_campaign=testing00';
    urlPromo = 'https://www.seva.id/info/promo/fasilitas-dana?utm_source=testing00&utm_campaign=testing00'
    urlBlog = 'https://www.seva.id/blog/pinjol-resmi-ojk-2026?utm_source=testing00&utm_campaign=testing00'
    urlAkunProfile = 'https://www.seva.id/akun/profil?utm_source=testing00&utm_campaign=testing00'
    urlLocalLandingPage = 'https://www.seva.id/info/gadai-bpkb-mobil-di-jakarta-selatan?utm_source=testing00&utm_campaign=testing00'
    urlPusatGadaiTerdekat = 'https://pusatgadaiterdekat.com/?utm_source=testing00&utm_campaign=testing00';
    urlSekolahinBpkb = 'https://sekolahinbpkb.com/?utm_source=testing00&utm_campaign=testing00';
    urlDanaBpkb = 'https://danabpkb.id/?utm_source=testing00&utm_campaign=testing00';
    urlAgunanBpkbMobil = 'https://agunanbpkbmobil.id/?utm_source=testing00&utm_campaign=testing00';
    urlGadaiBpkbMu = 'https://gadaibpkbmu.com/?utm_source=testing00&utm_campaign=testing00';

    blockHeavyResources() {
        cy.intercept('*/*gtm', { statusCode: 200, body: '' })
        cy.intercept('*/*hotjar', { statusCode: 200, body: '' })
        cy.intercept('*/*facebook', { statusCode: 200, body: '' })
        cy.intercept('*/*analytics', { statusCode: 200, body: '' })
        cy.intercept('*/*clarity', { statusCode: 200, body: '' })
        cy.intercept('*/*tiktok', { statusCode: 200, body: '' })
        cy.intercept('*/*ads', { statusCode: 200, body: '' })
        cy.intercept('*/.mp4', { statusCode: 200, body: '' })
        cy.intercept('*/.webm', { statusCode: 200, body: '' })
    }

    visitUrl() {
        this.blockHeavyResources()
        cy.visit(this.url, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlPromo() {
        this.blockHeavyResources()
        cy.visit(this.urlPromo, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlBlog() {
        this.blockHeavyResources()
        cy.visit(this.urlBlog, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlAkunProfile() {
        this.blockHeavyResources()
        cy.visit(this.urlAkunProfile, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlLocalLandingPage() {
        this.blockHeavyResources()
        cy.visit(this.urlLocalLandingPage, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlPusatGadaiTerdekat() {
        this.blockHeavyResources()
        cy.visit(this.urlPusatGadaiTerdekat, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlSekolahinBpkb() {
        this.blockHeavyResources()
        cy.visit(this.urlSekolahinBpkb, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlDanaBpkb() {
        this.blockHeavyResources()
        cy.visit(this.urlDanaBpkb, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlAgunanBpkbMobil() {
        this.blockHeavyResources()
        cy.visit(this.urlAgunanBpkbMobil, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }

    visitUrlGadaiBpkbMu() {
        this.blockHeavyResources()
        cy.visit(this.urlGadaiBpkbMu, { timeout: 180000 })
        cy.viewport(1920, 1080)
    }
}

export default new urlSeva();