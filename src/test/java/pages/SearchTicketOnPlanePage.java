package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnPlanePage {

    SelenideElement
            aviaTabClick =  $(".tab_avia"),
            valueCityFromSet = $(".j-city_from"),
            valueCityToSet = $(".j-city_to"),
            searchButtonClickOn = $(".button_wrp"),
            dataFromSet = $(".j-date_from"),
            dataBackSet = $(".j-date_back"),
            foundTicketClickOn = $("[data-ti='departure']"),
            resultLineCitiesCheck = $(".o-text-inline"),
            valueSearchedLineGet = $("[data-ti='searchPanel']").$(".o-text-headerSmall-md"),
            addFlightCityFromSet = $(".j-last_row").$(".j-city_from"),
            addFlightCityToSet = $(".j-last_row").$(".j-city_to"),
            addFlightDataSet = $(".j-last_row").$(".j-date_input"),
            addFlightClick = $(".j-add_flight_button"),
            exampleCityFromClick = $(".j-city_from_pseudo_container").$(".j-pseudo"),
            exampleCityToClick = $(".j-city_to_pseudo_container").$(".j-pseudo"),
            valueCitiesCheck = $(".o-text-inline");

    public SearchTicketOnPlanePage openPage() {
        open("");
        return this;
    }

    public SearchTicketOnPlanePage aviaTabClick() {
        aviaTabClick.click();
        return this;
    }
    public SearchTicketOnPlanePage valueCityFromSet(String value) {
        valueCityFromSet.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage valueCityToSet(String value) {
        valueCityToSet.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage dataFromSet(String value) {
        dataFromSet.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage dataBackSet(String value) {
        dataBackSet.setValue(value);
        dataBackSet.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePage searchButtonClickOn() {
        searchButtonClickOn.click();
        return this;
    }
    public SearchTicketOnPlanePage foundTicketClickOn() {
        foundTicketClickOn.click();
        return this;
    }
    public SearchTicketOnPlanePage addFlightCityFromSet(String value) {
        addFlightCityFromSet.click();
        addFlightCityFromSet.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage addFlightCityToSet(String value) {
        addFlightCityToSet.click();
        addFlightCityToSet.setValue(value);
        return this;
    }
    public SearchTicketOnPlanePage addFlightClick() {
        addFlightClick.click();
        return this;
    }
    public SearchTicketOnPlanePage addFlightDataSet(String value) {
        addFlightDataSet.setValue(value);
        addFlightDataSet.pressEnter();
        return this;
    }
    public SearchTicketOnPlanePage valueSearchedLineGet() {
        valueSearchedLineGet.getValue();
        return this;
    }
    public SearchTicketOnPlanePage exampleCityFromClick() {
        exampleCityFromClick.click();
        return this;
    }
    public SearchTicketOnPlanePage exampleCityToClick() {
        exampleCityToClick.click();
        return this;
    }

    public SearchTicketOnPlanePage resultLineCitiesCheck(String value) {
        resultLineCitiesCheck.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnPlanePage valueCitiesCheck(String value) {
        valueCitiesCheck.shouldHave(text(value));
        return this;
    }

}
