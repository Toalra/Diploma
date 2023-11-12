package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnPlanePageObject {

    SelenideElement
            avia =  $(".tab_avia"),
            train = $(".tab_train"),
            bus = $(".tab_bus"),
            etrain = $(".tab_etrain"),
            cityFrom = $(".j-city_from"),
            stationFrom = $(".j-station_input_from"),
            busStationFrom = $("[data-ti='departure-suggest']").$(".o-input"),
            stationFromEtrain = $(".j-station_input_from"),
            stationToEtrain = $("j-station_input_to"),
            cityTo = $(".j-city_to"),
            stationTo = $(".j-station_input_to"),
            busStationTo = $("[data-ti='arrival-suggest']").$(".o-input"),
            searchButton = $(".button_wrp"),
            searchTrainButton = $(".m-border_inner"),
            searchBusButton = $(".o-button-expanded"),
            dataTo = $(".j-date_to"),
            dataFrom = $(".j-date_from"),
            dataBack = $(".j-date_back"),
            dateBus = $(".o-dateinput"),
            resultLine = $(".o-text-inline"),
            trainOfferCard = $("[data-ti='train-offer-card']").$(".o-container-fluid"),
            searchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            child = $(".counter_child_wrp").$(".increase"),
            chooseTicket = $(".o-container-fluid"),
            checkCities = $(".o-text-inline"),
            checkChild = $("[data-ti='tariff-detail']").$(".o-text-paragraphMedium"),
            addCityFrom = $(".j-last_row").$(".j-city_from"),
            addCityTo = $(".j-last_row").$(".j-city_to"),
            addData = $(".j-last_row").$(".j-date_input"),
            addFlight = $(".j-add_flight_button"),
            exampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            exampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkCityTrainDepar = $("[data-ti='card-departure-0']").$("[data-ti='stopover-place']"),
            checkCityTrainArrive = $("[data-ti='card-arrival-0']").$("[data-ti='stopover-place']"),
            checkCityStartBus = $("[data-ti='startPlace']"),
            checkCityEndBus = $("[data-ti='endPlace']"),
            checkCityEtrain = $(".b-etrain__schedule_title");


    @DisplayName("Общее")
    public SearchTicketOnPlanePageObject openPage() {
        open("https://www.tutu.ru/");
        return this;
    }

    @DisplayName("Самолет")
    public SearchTicketOnPlanePageObject avia() {
        avia.click();
        return this;
    }
    public SearchTicketOnPlanePageObject cityFrom(String value) {
        cityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject cityTo(String value) {
        cityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject dataFrom(String value) {
        dataFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject dataBack(String value) {
        dataBack.setValue(value);
        dataBack.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePageObject searchButton() {
        searchButton.click();
        return this;
    }
    public SearchTicketOnPlanePageObject child() {
        child.click();
        return this;
    }
    public SearchTicketOnPlanePageObject chooseTicket() {
        chooseTicket.click();
        return this;
    }
    public SearchTicketOnPlanePageObject addCityFrom(String value) {
        addCityFrom.click();
        addCityFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject addCityTo(String value) {
        addCityTo.click();
        addCityTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject addFlight() {
        addFlight.click();
        return this;
    }
    public SearchTicketOnPlanePageObject addData(String value) {
        addData.setValue(value);
        addData.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePageObject searchedLine() {
        searchedLine.getValue();
        return this;
    }
    public SearchTicketOnPlanePageObject exampleCityFrom() {
        exampleCityFrom.click();
        return this;
    }
    public SearchTicketOnPlanePageObject exampleCityTo() {
        exampleCityTo.click();
        return this;
    }


    @DisplayName("Поезд")
    public SearchTicketOnPlanePageObject train() {
        train.click();
        return this;
    }
    public SearchTicketOnPlanePageObject stationFrom(String value) {
        stationFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject stationTo(String value) {
        stationTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject dataTo(String value) {
        dataTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject searchTrainButton() {
        searchTrainButton.click();
        return this;
    }
    public SearchTicketOnPlanePageObject trainOfferCard() {
        trainOfferCard.click();
        return this;
    }

    @DisplayName("Автобус")
    public SearchTicketOnPlanePageObject bus() {
        bus.click();
        return this;
    }
    public SearchTicketOnPlanePageObject busStationFrom(String value) {
        busStationFrom.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject busStationTo(String value) {
        busStationTo.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject dateBus(String value) {
        dateBus.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject searchBusButton() {
        searchBusButton.click();
        return this;
    }

    @DisplayName("Электричка")
    public SearchTicketOnPlanePageObject etrain() {
        etrain.click();
        return this;
    }
    public SearchTicketOnPlanePageObject stationFromEtrain(String value) {
        stationFromEtrain.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePageObject stationToEtrain(String value) {
        stationToEtrain.setValue(value);
        return this;
    }

    @DisplayName("Проверки")
    public SearchTicketOnPlanePageObject resultLine(String value) {
        resultLine.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCities(String value) {
        checkCities.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkChild(String value) {
        checkChild.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCityTrainDepar(String value) {
        checkCityTrainDepar.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCityTrainArrive(String value) {
        checkCityTrainArrive.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCityStartBus(String value) {
        checkCityStartBus.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCityEndBus(String value) {
        checkCityEndBus.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCityEtrain(String value) {
        checkCityEtrain.shouldHave(text(value));
        return this;
    }
}
