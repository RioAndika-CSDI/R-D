import'cypress-xpath'

class urlSeva {
    url = 'https://www.seva.id/?utm_source=testing00&utm_campaign=testing00';

    visitUrl() {
        cy.visit(this.url);
        cy.viewport(1920, 1080)
    }

}

export default new urlSeva();
