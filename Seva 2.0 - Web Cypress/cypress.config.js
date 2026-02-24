const { defineConfig } = require("cypress");
const allureWriter = require("@shelex/cypress-allure-plugin/writer");

module.exports = defineConfig({

  // ✅ Cypress Cloud Project ID
  projectId: "3x3m8i",

  defaultCommandTimeout: 10000,  // 10 detik
  pageLoadTimeout: 30000,        // 30 detik
  responseTimeout: 30000,
  requestTimeout: 10000,

  e2e: {
    setupNodeEvents(on, config) {

      // ✅ Allure plugin
      allureWriter(on, config);

      // ✅ Disable browser cache (INI bagian hapus cache)
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
  },

  video: true,                    // ✅ Video direkam → tersimpan di Cypress Cloud
  screenshotOnRunFailure: true,   // ✅ Screenshot saat gagal → tersimpan di Cypress Cloud
  videoCompression: 15,
});