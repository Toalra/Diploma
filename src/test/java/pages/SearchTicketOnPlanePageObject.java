package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnPlanePageObject {

    SelenideElement
            avia =  $(".tab_avia"),
            cityFrom = $(".j-city_from"),
            cityTo = $(".j-city_to"),
            searchButton = $(".button_wrp"),
            dataFrom = $(".j-date_from"),
            dataBack = $(".j-date_back"),
            resultLine = $(".o-text-inline"),
            searchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),

            child = $(".counter_child_wrp").$(".increase"),
            typeTicket = $("._small"),
            listType = $(".list"),
            selectedType = $(".s-selected"),
            baby = $(".j-passenger_infant").$(".increase"),
            existTickets = $("[data-ti='offers-header-description']"),
            noneTickets = $(".o3425"),
            chooseTicket = $(".o-container-fluid"),
            checkCities = $(".o-text-inline"),
            checkChild = $("[data-ti='tariff-detail']").$(".o-text-paragraphMedium"),
            checkBaby = $("[data-ti='tariff-detail']").$(".o-text-paragraph"),
            tariff = $(".o-text-headerExtraSmall"),
            addCityFrom = $(".j-last_row").$(".j-city_from"),
            addCityTo = $(".j-last_row").$(".j-city_to"),
            addData = $(".j-last_row").$(".j-date_input"),
            addFlight = $(".j-add_flight_button"),
            exampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            exampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkTypeTicket = $(".o-popper-popupContentBottomSlot").$(".o-text-paragraphSmall");

    public SearchTicketOnPlanePageObject openPage() {
        open("https://www.tutu.ru/");

        return this;
    }

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

    public SearchTicketOnPlanePageObject typeTicket(String value) {
        typeTicket.click();
        listType.$(byText(value)).click();
//        selectedType.click();
        return this;
    }

    public SearchTicketOnPlanePageObject checkTypeTicket(String value) {
        checkTypeTicket.shouldHave(text(value));
        return this;
    }

    public SearchTicketOnPlanePageObject searchButton() {
        searchButton.click();
        return this;
    }

    public SearchTicketOnPlanePageObject noneTickets(String value) {
        noneTickets.shouldHave(text(value));
        return this;
    }

    public SearchTicketOnPlanePageObject chooseTicket() {
        chooseTicket.click();
        return this;
    }

    public SearchTicketOnPlanePageObject tariff() {
        tariff.scrollTo();
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

    public SearchTicketOnPlanePageObject exampleCityFrom() {
        exampleCityFrom.click();
        return this;
    }

    public SearchTicketOnPlanePageObject exampleCityTo() {
        exampleCityTo.click();
        return this;
    }


    //checks
    public SearchTicketOnPlanePageObject resultLine(String value) {
        resultLine.shouldHave(text(value));
        return this;
    }

    public SearchTicketOnPlanePageObject existTickets(String value) {
        existTickets.shouldHave(text(value));
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

    public SearchTicketOnPlanePageObject searchedLine() {
        searchedLine.getValue();
        return this;
    }
}
