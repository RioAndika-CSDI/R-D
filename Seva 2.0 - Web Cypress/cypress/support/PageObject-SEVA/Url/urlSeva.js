import'cypress-xpath'

class urlSeva {
    url = 'https://www.seva.id/?utm_source=testing00&utm_campaign=testing00';
    urlPromo = 'https://www.seva.id/info/promo/fasilitas-dana?utm_source=testing00&utm_campaign=testing00'
    urlBlog = 'https://www.seva.id/blog/pinjol-resmi-ojk-2026?utm_source=testing00&utm_campaign=testing00'
    urlAkunProfile = 'https://www.seva.id/akun/profil?utm_source=testing00&utm_campaign=testing00'

    visitUrl() {
        cy.visit(this.url);
        cy.viewport(1920, 1080)
    }

    visitUrlPromo() {
        cy.visit(this.urlPromo);
    }

    visitUrlBlog() {
        cy.visit(this.urlBlog);
    }

    visitUrAkunProfile() {
        cy.visit(this.urlAkunProfile);
    }

}

export default new urlSeva();
