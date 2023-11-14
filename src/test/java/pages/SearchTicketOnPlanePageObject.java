package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.text;
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
            chooseTicket = $(".o-container-fluid"),
            resultLine = $(".o-text-inline"),
            searchedLine = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            addCityFrom = $(".j-last_row").$(".j-city_from"),
            addCityTo = $(".j-last_row").$(".j-city_to"),
            addData = $(".j-last_row").$(".j-date_input"),
            addFlight = $(".j-add_flight_button"),
            exampleCityFrom = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            exampleCityTo = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            checkCities = $(".o-text-inline");


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


    @DisplayName("Проверки")
    public SearchTicketOnPlanePageObject resultLine(String value) {
        resultLine.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePageObject checkCities(String value) {
        checkCities.shouldHave(text(value));
        return this;
    }

}
