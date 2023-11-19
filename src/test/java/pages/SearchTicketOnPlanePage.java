package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnPlanePage {

    SelenideElement
            clickAviaTab =  $(".tab_avia"),
            setValueCityFrom = $(".j-city_from"),
            setValueCityTo = $(".j-city_to"),
            clickOnSearchButton = $(".button_wrp"),
            setDataFrom = $(".j-date_from"),
            setDataBack = $(".j-date_back"),
            clickOnFoundTicket = $(".o-container-fluid"),
            checkResultLineCities = $(".o-text-inline"),
            getValueSearchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            setAddFlightCityFrom = $(".j-last_row").$(".j-city_from"),
            setAddFlightCityTo = $(".j-last_row").$(".j-city_to"),
            setAddFlightData = $(".j-last_row").$(".j-date_input"),
            clickAddFlight = $(".j-add_flight_button"),
            clickExampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            clickExampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkValueCities = $(".o-text-inline");

    public SearchTicketOnPlanePage openPage() {
        open("");
        return this;
    }

    public SearchTicketOnPlanePage clickAviaTab() {
        clickAviaTab.click();
        return this;
    }
    public SearchTicketOnPlanePage setValueCityFrom(String value) {
        setValueCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage setValueCityTo(String value) {
        setValueCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage setDataFrom(String value) {
        setDataFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage setDataBack(String value) {
        setDataBack.setValue(value);
        setDataBack.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePage clickOnSearchButton() {
        clickOnSearchButton.click();
        return this;
    }
    public SearchTicketOnPlanePage clickOnFoundTicket() {
        clickOnFoundTicket.click();
        return this;
    }
    public SearchTicketOnPlanePage setAddFlightCityFrom(String value) {
        setAddFlightCityFrom.click();
        setAddFlightCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage setAddFlightCityTo(String value) {
        setAddFlightCityTo.click();
        setAddFlightCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage clickAddFlight() {
        clickAddFlight.click();
        return this;
    }
    public SearchTicketOnPlanePage setAddFlightData(String value) {
        setAddFlightData.setValue(value);
        setAddFlightData.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePage getValueSearchedLine() {
        getValueSearchedLine.getValue();
        return this;
    }
    public SearchTicketOnPlanePage clickExampleCityFrom() {
        clickExampleCityFrom.click();
        return this;
    }
    public SearchTicketOnPlanePage clickExampleCityTo() {
        clickExampleCityTo.click();
        return this;
    }

    public SearchTicketOnPlanePage checkResultLineCities(String value) {
        checkResultLineCities.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePage checkValueCities(String value) {
        checkValueCities.shouldHave(text(value));
        return this;
    }

}
