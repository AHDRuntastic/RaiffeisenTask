package cucumber.stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomeSavings;

public class HomeSavingsSD extends TestBase {
    HomeSavings homeSavings;


    public void definingObj(){
        homeSavings = new HomeSavings(driver);
    }

    @Given("The home savings section is viewed to the user")
    public void theHomeSavingsSectionIsViewedToTheUser() {
        definingObj();
    }

    @When("The user taps on download product information option")
    public void theUserTapsOnDownloadProductInformationOption() throws InterruptedException {
        homeSavings.setDownloadBtn();
    }

    @Then("The document is shown to the user in new browser tab")
    public void theDocumentIsShownToTheUserInNewBrowserTab() {

        String actualResult = homeSavings.getNewWindowUrl();
        String expectedResult = "https://www.raibau.at/mmedia/webuse/ssl/1480937785.pdf";
        Assert.assertEquals(actualResult, expectedResult );

    }

    @Given("The products section is viewed to the user")
    public void theProductsSectionIsViewedToTheUser() {
        definingObj();
    }

    @When("The user taps on to the product option")
    public void theUserTapsOnToTheProductOption() throws InterruptedException {
        homeSavings.setProductBtn();
    }

    @Then("The selected product’s information is shown to the user in new webpage")
    public void theUserRedirectToNewWebPage() {
        String actualResult = homeSavings.getNewWindowUrl();
        String expectedResult = "https://www.bausparen.at/de/bausparen/jugend.html";
        Assert.assertEquals(actualResult, expectedResult );
    }

    @Given("The home savings bonus section is viewed to the user")
    public void theHomeSavingsBonusSectionIsViewedToTheUser() {
        definingObj();
    }

    @When("The user taps on to the inform now option")
    public void theUserTapsOnToTheInformNowOption() {
        homeSavings.setHomeSavingBonusBtn();
    }

    @Then("All the info regarding to home savings bonus will show to the user in new webpage")
    public void allTheInfoRegardingToHomeSavingsBonusWillShowToTheUserInNewWebpage() {
        String actualResult = homeSavings.getNewWindowUrl();
        String expectedResult = "https://www.bausparen.at/de/bausparen/praemie.html";
        Assert.assertEquals(actualResult, expectedResult );
    }

    @Given("The profit tables for home savings section is viewed to the user")
    public void theProfitTablesForHomeSavingsSectionIsViewedToTheUser() throws InterruptedException {
        definingObj();
        Thread.sleep(3000);
    }

    @When("The user taps on to the compare products option")
    public void theUserTapsOnToTheCompareProductsOption() {
        homeSavings.setCompareProductsBtn();
    }

    @Then("All the paytables are shown to the user in new webpage")
    public void allThePaytablesAreShownToTheUserInNewWebpage() {
        String actualResult = homeSavings.getNewWindowUrl();
        String expectedResult = "https://www.bausparen.at/de/bausparen/gewinntabellen.html";
        Assert.assertEquals(actualResult, expectedResult );
    }

    @Given("The email option is shown")
    public void theEmailOptionIsShown() {
        definingObj();
    }

    @And("The user add a valid email")
    public void theUserAddAValidEmail() {
        homeSavings.setEmailBtn();
    }

    @When("The user taps on submit option")
    public void theUserTapsOnSubmitOption() throws InterruptedException {
        homeSavings.setSubmitBtn();
    }

    @Then("The success message is shown")
    public void theSuccessMessageIsShown() throws InterruptedException {
        String actualResult = homeSavings.setConfirmMessage();
        String expectedResult = "Vielen Dank. Sie erhalten in Kürze eine E-Mail mit einem Link um Ihre Anmeldung zu den WOHNWELT News zu bestätigen.";
        Assert.assertEquals(actualResult, expectedResult );
    }
}
