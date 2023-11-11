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
            cityFrom = $(".j-city_from"),
            stationFrom = $(".j-station_input_from"),
            cityTo = $(".j-city_to"),
            stationTo = $(".j-station_input_to"),
            searchButton = $(".button_wrp"),
            searchTrainButton = $(".j-button-submit"),
            dataToTrain = $(".j-date_to"),
            dataFrom = $(".j-date_from"),
            dataBack = $(".j-date_back"),
            resultLine = $(".o-text-inline"),
            trainOfferCard = $("[data-ti='train-offer-card']").$(".o-container-fluid"),
            searchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            child = $(".counter_child_wrp").$(".increase"),
            baby = $(".j-passenger_infant").$(".increase"),
            noneTickets = $("[data-ti='offers_result']").$(".o3425"),
            chooseTicket = $(".o-container-fluid"),
            checkCities = $(".o-text-inline"),
            checkChild = $("[data-ti='tariff-detail']").$(".o-text-paragraphMedium"),
            checkBaby = $("[data-ti='tariff-detail']").$(".o-text-paragraph"),
            addCityFrom = $(".j-last_row").$(".j-city_from"),
            addCityTo = $(".j-last_row").$(".j-city_to"),
            addData = $(".j-last_row").$(".j-date_input"),
            addFlight = $(".j-add_flight_button"),
            exampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            exampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkTypeTicket = $(".o-popper-popupContentBottomSlot").$(".o-text-paragraphSmall"),
            checkCityTrainDepar = $("[data-ti='card-departure-0']").$(".o-text-inline"),
            checkCityTrainArrive = $("[data-ti='card-arrival-0']").$(".o-text-inline");


    @DisplayName("Общее")
    public SearchTicketOnPlanePageObject openPage() {
        open("https://www.tutu.ru/");

        return this;
    }

    public SearchTicketOnPlanePageObject searchButton() {
        searchButton.click();
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
        return this;
    }

    public SearchTicketOnPlanePageObject child() {
        child.click();
        return this;
    }

    public SearchTicketOnPlanePageObject baby() {
        baby.click();
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

    public SearchTicketOnPlanePageObject dataToTrain(String value) {
        dataToTrain.setValue(value);
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

    public SearchTicketOnPlanePageObject checkBaby(String value) {
        checkBaby.shouldHave(text(value));
        return this;
    }

    public SearchTicketOnPlanePageObject checkTypeTicket(String value) {
        checkTypeTicket.shouldHave(text(value));
        return this;
    }

    public SearchTicketOnPlanePageObject noneTickets(String value) {
        noneTickets.shouldHave(text(value));
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
}
