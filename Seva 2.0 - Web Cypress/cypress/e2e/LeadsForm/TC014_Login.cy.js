import homePage from "../../support/PageObject-SEVA/pageObject-Homepage/homePage"
import urlSeva from "../../support/PageObject-SEVA/Url/urlSeva"



describe('TC014_Login', () => {
    it('TC014_Login', () => {

//Homepage
    cy.log('HOMEPAGE✅✅✅')
    urlSeva.visitUrl()
    cy.wait(5000)
    homePage.clickBtnTerimaCookie()
    homePage.clickBtnMasukRegister()
    homePage.inputNomorHpLogin('89676848410')
    homePage.clickBtnSelanjutnya()
    cy.wait(20000)
    homePage.inputFieldOTP('123456')
    cy.wait(10000)
    homePage.verifySuccessLogin()

  })
})