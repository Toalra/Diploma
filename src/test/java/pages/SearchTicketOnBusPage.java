package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnBusPage {

    SelenideElement
            openBusTab = $(".tab_bus"),
            setBusStationCityFrom = $("[data-ti='departure-suggest']").$(".o-input"),
            setBusStationCityTo = $("[data-ti='arrival-suggest']").$(".o-input"),
            clickSearchBusButton = $(".o-button-expanded"),
            setDateBus = $(".o-dateinput"),
            clickStationFromBusExp = $("[data-ti='departure-suggest']").$(".o-text-inline"),
            clickStationToBusExp = $("[data-ti='arrival-suggest']").$(".o-text-inline"),
            checkCityBusStation = $("[data-ti='main_title']"),
            checkCityOfExpBusFrom = $("[data-ti='top_schedule_content']").$(".o-text-header");
            //checkCityOfExpBusTo = $("[data-ti='search_form']").$("[data-ti='arrival']");


    public SearchTicketOnBusPage openPage() {
        open("");
        return this;
    }
    public SearchTicketOnBusPage openBusTab() {
        openBusTab.click();
        return this;
    }
    public SearchTicketOnBusPage setBusStationCityFrom(String value) {
        setBusStationCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnBusPage setBusStationCityTo(String value) {
        setBusStationCityTo.setValue(value);
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

    public SearchTicketOnBusPage checkCityBusStation() {
        checkCityBusStation.getValue();
        return this;
    }

    public SearchTicketOnBusPage checkCityOfExpBusFrom() {
        checkCityOfExpBusFrom.getValue();
        return this;
    }
//    public SearchTicketOnBusPage checkCityOfExpBusTo() {
//        checkCityOfExpBusTo.getValue();
//        return this;
//    }
}
