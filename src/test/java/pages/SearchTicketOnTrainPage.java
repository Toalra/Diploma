package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnTrainPage {

    SelenideElement
            trainTabOpen = $(".tab_train"),
            stationFromSet = $(".j-station_input_from"),
            stationToSet = $(".j-station_input_to"),
            searchTrainButtonClick = $(".m-border_inner"),
            dataToSet = $(".j-date_to"),
            trainOfferCardClick = $("[data-ti='train-offer-card']").$(".o-container-fluid"),
            exampleCityTrainFromClick = $(".departure").$(".j-pseudo"),
            exampleCityTrainToClick = $(".arrival").$(".j-pseudo"),
            valueCityTrainDeparCheck = $("[data-ti='card-departure-0']").$("[data-ti='stopover-place']"),
            valueCityTrainArriveCheck = $("[data-ti='card-arrival-0']").$("[data-ti='stopover-place']"),
            valueExpCityTrainGet = $("[data-ti='card-departure-0']").$(".o-text-inline");

    public SearchTicketOnTrainPage openPage() {
        open("");
        return this;
    }
    public SearchTicketOnTrainPage trainTabOpen() {
        trainTabOpen.click();
        return this;
    }
    public SearchTicketOnTrainPage stationFromSet(String value) {
        stationFromSet.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage stationToSet(String value) {
        stationToSet.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage dataToSet(String value) {
        dataToSet.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage searchTrainButtonClick() {
        searchTrainButtonClick.click();
        return this;
    }
    public SearchTicketOnTrainPage trainOfferCardClick() {
        trainOfferCardClick.click();
        return this;
    }
    public SearchTicketOnTrainPage exampleCityTrainFromClick() {
        exampleCityTrainFromClick.click();
        return this;
    }
    public SearchTicketOnTrainPage exampleCityTrainToClick() {
        exampleCityTrainToClick.click();
        return this;
    }

    public SearchTicketOnTrainPage valueCityTrainDeparCheck(String value) {
        valueCityTrainDeparCheck.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPage valueCityTrainArriveCheck(String value) {
        valueCityTrainArriveCheck.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPage valueExpCityTrainGet() {
        valueExpCityTrainGet.getValue();
        return this;
    }
}
