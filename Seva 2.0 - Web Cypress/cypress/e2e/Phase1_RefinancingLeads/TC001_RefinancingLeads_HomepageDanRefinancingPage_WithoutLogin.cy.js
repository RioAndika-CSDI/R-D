import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import refinancingPage from "../../support/PageObject-SEVA/pageObject-Refinancing/refinancingPage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC001_RefinancingLeads_HomepageDanRefinancingPage_WithoutLogin', () => {
    it('TC001_RefinancingLeads_HomepageDanRefinancingPage_WithoutLogin', () => {
    
        cy.clearSession();
    //Homepage
        cy.log('HOMEPAGE✅✅✅')
        urlSeva.visitUrl()
        cy.wait(5000)
        homePage.clickBtnTerimaCookie()
        homePage.clickTabFasilitasDana()
        
    })
})