package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnBusPageObject {

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


    public SearchTicketOnBusPageObject openPage() {
        open("https://www.tutu.ru/");
        return this;
    }

    public SearchTicketOnBusPageObject busTabOpen() {
        busTabOpen.click();
        return this;
    }
    public SearchTicketOnBusPageObject busStationSetCityFrom(String value) {
        busStationSetCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject busStationSetCityTo(String value) {
        busStationSetCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject setDateBus(String value) {
        setDateBus.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject clickSearchBusButton() {
        clickSearchBusButton.click();
        return this;
    }
    public SearchTicketOnBusPageObject clickStationFromBusExp() {
        clickStationFromBusExp.click();
        return this;
    }
    public SearchTicketOnBusPageObject clickStationToBusExp() {
        clickStationToBusExp.click();
        return this;
    }

    public SearchTicketOnBusPageObject checkCityBusStationFrom(String value) {
        checkCityBusStationFrom.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPageObject checkCityBusStationTo(String value) {
        checkCityBusStationTo.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPageObject checkCityOfExpBus() {
        checkCityOfExpBus.getValue();
        return this;
    }
}
