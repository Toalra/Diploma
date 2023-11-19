package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnBusPage {

    SelenideElement
            busTabOpen = $(".tab_bus"),
            busStationSetCityFrom = $("[data-ti='departure-suggest']").$(".o-input"),
            busStationSetCityTo = $("[data-ti='arrival-suggest']").$(".o-input"),
            clickSearchBusButton = $(".o-button-expanded"),
            setDateBus = $(".o-dateinput"),
            clickStationFromBusExp = $("[data-ti='departure-suggest']").$(".o-text-inline"),
            clickStationToBusExp = $("[data-ti='arrival-suggest']").$(".o-text-inline"),
            checkCityBusStationFrom = $("[data-ti='startPlace']"),
            checkCityBusStationTo = $("[data-ti='endPlace']"),
            checkCityOfExpBus = $("[data-ti='main_title']");


    public SearchTicketOnBusPage openPage() {
        open("");
        return this;
    }

    public SearchTicketOnBusPage busTabOpen() {
        busTabOpen.click();
        return this;
    }
    public SearchTicketOnBusPage busStationSetCityFrom(String value) {
        busStationSetCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage busStationSetCityTo(String value) {
        busStationSetCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage setDateBus(String value) {
        setDateBus.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage clickSearchBusButton() {
        clickSearchBusButton.click();
        return this;
    }
    public SearchTicketOnBusPage clickStationFromBusExp() {
        clickStationFromBusExp.click();
        return this;
    }
    public SearchTicketOnBusPage clickStationToBusExp() {
        clickStationToBusExp.click();
        return this;
    }

    public SearchTicketOnBusPage checkCityBusStationFrom(String value) {
        checkCityBusStationFrom.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPage checkCityBusStationTo(String value) {
        checkCityBusStationTo.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPage checkCityOfExpBus() {
        checkCityOfExpBus.getValue();
        return this;
    }
}
