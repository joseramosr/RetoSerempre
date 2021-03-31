package co.com.serempre.certificacion.tiendacerca.stepdefinitions;

import static co.com.serempre.certificacion.tiendacerca.exceptions.InvalidCellPhoneNumberException.*;
import co.com.serempre.certificacion.tiendacerca.exceptions.InvalidCellPhoneNumberException;
import static co.com.serempre.certificacion.tiendacerca.exceptions.InvalidUserRegistrationException.*;
import co.com.serempre.certificacion.tiendacerca.exceptions.InvalidPersonalDataException;
import static co.com.serempre.certificacion.tiendacerca.exceptions.InvalidPersonalDataException.*;
import co.com.serempre.certificacion.tiendacerca.exceptions.InvalidUserRegistrationException;
import co.com.serempre.certificacion.tiendacerca.models.UserData;
import co.com.serempre.certificacion.tiendacerca.questions.*;
import co.com.serempre.certificacion.tiendacerca.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.*;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterConsumerUserStepDefinition {

    @Before
    public void init(){
        setTheStage(new OnlineCast());
    }


    @Given("^that the (.*) is on the home page of TiendaCerca$")
    public void thatTheAnalystIsOnTheHomePageOfTiendaCerca(String actorName) {
        theActorCalled(actorName).wasAbleTo(NavigateTo.theTiendaCercaPage());
    }

    @When("^he fills out the registration data$")
    public void heFillsOutTheRegistrationData(List<UserData> userDataList) {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.ofTheUser(userDataList),
                ChooseTypeOfExperience.inTheShop(userDataList),
                EnterCellPhoneNumber.ofTheUser(userDataList, UserData.get().getCellPhoneNumber()),
                AcceptTermsAndConditions.ofThePage(),
                EnterPersonalData.ofTheUser(userDataList),
                EnterAddress.ofTheUser(userDataList)
        );
    }

    @Then("^he should see the successful registration message$")
    public void heShouldSeeTheSuccessfulRegistrationMessage() {
        theActorInTheSpotlight().should(seeThat(TheSuccessfulRegistrationMessage.is(), equalTo("¡Te has registrado exitosamente!"))
                .orComplainWith(InvalidUserRegistrationException.class, SUCCESSFUL_REGISTRATION_MESSAGE_ERROR));
    }

    @When("^he fills out the registration data with an invalid data$")
    public void heFillsOutTheRegistrationDataWithAnInvalidData(List<UserData> userDataList) {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.ofTheUser(userDataList),
                ChooseTypeOfExperience.inTheShop(userDataList),
                EnterCellPhoneNumber.ofTheUser(userDataList, UserData.get().getCellPhoneNumber()),
                AcceptTermsAndConditions.ofThePage(),
                EnterPersonalData.ofTheUser(userDataList)
        );
    }


    @Then("^he should see the invalid first name message$")
    public void heShouldSeeTheInvalidFirstNameMessage() {
        theActorInTheSpotlight().should(seeThat(TheInvalidFirstNameMessage.is(), equalTo("El nombre debe ser válido"))
                .orComplainWith(InvalidPersonalDataException.class, INVALID_FIRST_NAME_MESSAGE_ERROR));
    }

    @Then("^he should see the invalid last name message$")
    public void heShouldSeeTheInvalidLastNameMessage() {
        theActorInTheSpotlight().should(seeThat(TheInvalidLastNameMessage.is(), equalTo("El apellido debe ser válido"))
                .orComplainWith(InvalidPersonalDataException.class, INVALID_LAST_NAME_MESSAGE_ERROR));
    }

    @Then("^he should see the invalid email message$")
    public void heShouldSeeTheInvalidEmailMessage() {
        theActorInTheSpotlight().should(seeThat(TheInvalidEmailMessage.is(), equalTo("El correo debe ser válido"))
                .orComplainWith(InvalidPersonalDataException.class, INVALID_EMAIL_MESSAGE_ERROR));
    }

    @When("^he fills out the registration data with a cell phone number greater than ten digits$")
    public void heFillsOutTheRegistrationDataWithACellPhoneNumberGreaterThanTenDigits(List<UserData> userDataList) {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.ofTheUser(userDataList),
                ChooseTypeOfExperience.inTheShop(userDataList),
                EnterCellPhoneNumber.ofTheUser(userDataList, UserData.get().getCellPhoneNumberGreaterThanTenDigits()),
                AcceptTermsAndConditions.ofThePage(),
                EnterPersonalData.ofTheUser(userDataList),
                EnterAddress.ofTheUser(userDataList)
        );
    }

    @Then("^he should see the invalid cell phone number alert$")
    public void heShouldSeeTheInvalidCellPhoneNumberAlert() {
        theActorInTheSpotlight().should(seeThat(TheInvalidCellPhoneNumberAlertMessage.is(), equalTo("El campo Teléfono debe contener entre 8 y 10 dígitos."))
                .orComplainWith(InvalidCellPhoneNumberException.class, INVALID_CELL_PHONE_NUMBER_ALERT_ERROR));
    }

    @When("^he fills out the registration data with a cell phone number less than eight digits$")
    public void heFillsOutTheRegistrationDataWithACellPhoneNumberLessThanEightDigits(List<UserData> userDataList) {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.ofTheUser(userDataList),
                ChooseTypeOfExperience.inTheShop(userDataList),
                EnterCellPhoneNumber.ofTheUser(userDataList, UserData.get().getCellPhoneNumberLessThanEightDigits())
        );
    }

    @Then("^he should see the invalid cell phone number message$")
    public void heShouldSeeTheInvalidCellPhoneNumberMessage() {
        theActorInTheSpotlight().should(seeThat(TheInvalidCellPhoneNumberMessage.is(), equalTo("El teléfono debe ser un número válido"))
                .orComplainWith(InvalidCellPhoneNumberException.class, INVALID_CELL_PHONE_NUMBER_MESSAGE_ERROR));
    }

}
