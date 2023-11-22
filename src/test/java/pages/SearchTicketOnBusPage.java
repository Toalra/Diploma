package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnBusPage {

    SelenideElement
            busTabOpen = $(".tab_bus"),
            busStationCityFromSet = $("[data-ti='departure-suggest']").$(".o-input"),
            busStationCityToSet = $("[data-ti='arrival-suggest']").$(".o-input"),
            searchBusButtonClick = $(".o-button-expanded"),
            dateBusSet = $(".o-dateinput"),
            stationFromBusExpClick = $("[data-ti='departure-suggest']").$(".o-text-inline"),
            stationToBusExpClick = $("[data-ti='arrival-suggest']").$(".o-text-inline"),
            cityBusStationCheck = $("[data-ti='main_title']"),
            cityOfExpBusFromCheck = $(".o-text-header");


    public SearchTicketOnBusPage openPage() {
        open("");
        return this;
    }
    public SearchTicketOnBusPage busTabOpen() {
        busTabOpen.click();
        return this;
    }
    public SearchTicketOnBusPage busStationCityFromSet(String value) {
        busStationCityFromSet.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage busStationCityToSet(String value) {
        busStationCityToSet.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage dateBusSet(String value) {
        dateBusSet.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage searchBusButtonClick() {
        searchBusButtonClick.click();
        return this;
    }
    public SearchTicketOnBusPage stationFromBusExpClick() {
        stationFromBusExpClick.click();
        return this;
    }
    public SearchTicketOnBusPage stationToBusExpClick() {
        stationToBusExpClick.click();
        return this;
    }

    public SearchTicketOnBusPage cityBusStationCheck() {
        cityBusStationCheck.getValue();
        return this;
    }

    public SearchTicketOnBusPage cityOfExpBusFromCheck() {
        cityOfExpBusFromCheck.getValue();
        return this;
    }
}
