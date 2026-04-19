const { defineConfig } = require("cypress");
const allureWriter = require("@shelex/cypress-allure-plugin/writer");

module.exports = defineConfig({

  // ✅ Cypress Cloud Project ID
  projectId: "3x3m8i",

  defaultCommandTimeout: 30000,  // 30 detik
  pageLoadTimeout: 180000,       // 180 detik
  responseTimeout: 180000,
  requestTimeout: 10000,

  e2e: {
    setupNodeEvents(on, config) {

      // ✅ Allure plugin - WAJIB untuk generate allure-results
      allureWriter(on, config);

      // ✅ Disable browser cache
      on('before:browser:launch', (browser, launchOptions) => {
        if (browser.name === 'chrome') {
          launchOptions.args.push('--disable-cache');
          launchOptions.args.push('--disable-application-cache');
          launchOptions.args.push('--disk-cache-size=0');
        }
        return launchOptions;
      });

      return config;
    },

    // ✅ Allure results folder
    env: {
      allureResultsPath: "allure-results",
    },
  },

  video: true,
  screenshotOnRunFailure: true,
  videoCompression: 15,
});