package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnBusPageObject {

    SelenideElement
            bus = $(".tab_bus"),
            busStationFrom = $("[data-ti='departure-suggest']").$(".o-input"),
            busStationTo = $("[data-ti='arrival-suggest']").$(".o-input"),
            searchBusButton = $(".o-button-expanded"),
            dateBus = $(".o-dateinput"),
            stationFromBusExp = $("[data-ti='departure-suggest']").$(".o-text-inline"),
            stationToBusExp = $("[data-ti='arrival-suggest']").$(".o-text-inline"),

            checkCityStartBus = $("[data-ti='startPlace']"),
            checkCityEndBus = $("[data-ti='endPlace']"),
            checkCityExpBus = $("[data-ti='main_title']");


    @DisplayName("Общее")
    public SearchTicketOnBusPageObject openPage() {
        open("https://www.tutu.ru/");
        return this;
    }

    @DisplayName("Автобус")
    public SearchTicketOnBusPageObject bus() {
        bus.click();
        return this;
    }
    public SearchTicketOnBusPageObject busStationFrom(String value) {
        busStationFrom.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject busStationTo(String value) {
        busStationTo.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject dateBus(String value) {
        dateBus.setValue(value);
        return this;
    }
    public SearchTicketOnBusPageObject searchBusButton() {
        searchBusButton.click();
        return this;
    }
    public SearchTicketOnBusPageObject stationFromBusExp() {
        stationFromBusExp.click();
        return this;
    }
    public SearchTicketOnBusPageObject stationToBusExp() {
        stationToBusExp.click();
        return this;
    }

    @DisplayName("Проверки")

    public SearchTicketOnBusPageObject checkCityStartBus(String value) {
        checkCityStartBus.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPageObject checkCityEndBus(String value) {
        checkCityEndBus.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnBusPageObject checkCityExpBus() {
        checkCityExpBus.getValue();
        return this;
    }
}
