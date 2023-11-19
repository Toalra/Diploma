package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnTrainPageObject {

    SelenideElement
            train = $(".tab_train"),

            stationFrom = $(".j-station_input_from"),
            stationTo = $(".j-station_input_to"),
            searchTrainButton = $(".m-border_inner"),
            dataTo = $(".j-date_to"),

            trainOfferCard = $("[data-ti='train-offer-card']").$(".o-container-fluid"),

            exampleCityTrainFrom = $(".departure").$(".j-pseudo"),
            exampleCityTrainTo = $(".arrival").$(".j-pseudo"),

            checkCityTrainDepar = $("[data-ti='card-departure-0']").$("[data-ti='stopover-place']"),
            checkCityTrainArrive = $("[data-ti='card-arrival-0']").$("[data-ti='stopover-place']"),
            checkExpCityTrain = $("[data-ti='card-departure-0']").$(".o-text-inline");

    public SearchTicketOnTrainPageObject openPage() {
        open("https://www.tutu.ru/");
        return this;
    }
    public SearchTicketOnTrainPageObject train() {
        train.click();
        return this;
    }
    public SearchTicketOnTrainPageObject stationFrom(String value) {
        stationFrom.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPageObject stationTo(String value) {
        stationTo.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPageObject dataTo(String value) {
        dataTo.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPageObject searchTrainButton() {
        searchTrainButton.click();
        return this;
    }
    public SearchTicketOnTrainPageObject trainOfferCard() {
        trainOfferCard.click();
        return this;
    }
    public SearchTicketOnTrainPageObject exampleCityTrainFrom() {
        exampleCityTrainFrom.click();
        return this;
    }
    public SearchTicketOnTrainPageObject exampleCityTrainTo() {
        exampleCityTrainTo.click();
        return this;
    }

    public SearchTicketOnTrainPageObject checkCityTrainDepar(String value) {
        checkCityTrainDepar.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPageObject checkCityTrainArrive(String value) {
        checkCityTrainArrive.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPageObject checkExpCityTrain() {
        checkExpCityTrain.getValue();
        return this;
    }
}
