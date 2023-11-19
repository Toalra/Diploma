package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnPlanePageObject {

    SelenideElement
            clickAviaTab =  $(".tab_avia"),
            setValueCityFrom = $(".j-city_from"),
            setValueCityTo = $(".j-city_to"),
            searchButtonClick = $(".button_wrp"),
            setDataFrom = $(".j-date_from"),
            setDataBack = $(".j-date_back"),
            chooseFoundTicket = $(".o-container-fluid"),
            checkResultLineCities = $(".o-text-inline"),
            getValueSearchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            setAddFlightCityFrom = $(".j-last_row").$(".j-city_from"),
            setAddFlightCityTo = $(".j-last_row").$(".j-city_to"),
            setAddFlightData = $(".j-last_row").$(".j-date_input"),
            clickAddFlight = $(".j-add_flight_button"),
            clickExampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            clickExampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkValueCities = $(".o-text-inline");

    public SearchTicketOnPlanePageObject openPage() {
        open("https://www.tutu.ru/");
        return this;
    }

    public SearchTicketOnPlanePageObject clickAviaTab() {
        clickAviaTab.click();
        return this;
    }
    public SearchTicketOnPlanePageObject setValueCityFrom(String value) {
        setValueCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject setValueCityTo(String value) {
        setValueCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject setDataFrom(String value) {
        setDataFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject setDataBack(String value) {
        setDataBack.setValue(value);
        setDataBack.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePageObject searchButtonClick() {
        searchButtonClick.click();
        return this;
    }
    public SearchTicketOnPlanePageObject chooseFoundTicket() {
        chooseFoundTicket.click();
        return this;
    }
    public SearchTicketOnPlanePageObject setAddFlightCityFrom(String value) {
        setAddFlightCityFrom.click();
        setAddFlightCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject setAddFlightCityTo(String value) {
        setAddFlightCityTo.click();
        setAddFlightCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject clickAddFlight() {
        clickAddFlight.click();
        return this;
    }
    public SearchTicketOnPlanePageObject setAddFlightData(String value) {
        setAddFlightData.setValue(value);
        setAddFlightData.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePageObject getValueSearchedLine() {
        getValueSearchedLine.getValue();
        return this;
    }
    public SearchTicketOnPlanePageObject clickExampleCityFrom() {
        clickExampleCityFrom.click();
        return this;
    }
    public SearchTicketOnPlanePageObject clickExampleCityTo() {
        clickExampleCityTo.click();
        return this;
    }

    public SearchTicketOnPlanePageObject checkResultLineCities(String value) {
        checkResultLineCities.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkValueCities(String value) {
        checkValueCities.shouldHave(text(value));
        return this;
    }

}
