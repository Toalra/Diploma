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
            clickSearchTrainButton = $(".m-border_inner"),
            setDataTo = $(".j-date_to"),
            clickTrainOfferCard = $("[data-ti='train-offer-card']").$(".o-container-fluid"),
            clickExampleCityTrainFrom = $(".departure").$(".j-pseudo"),
            clickExampleCityTrainTo = $(".arrival").$(".j-pseudo"),
            checkValueCityTrainDepar = $("[data-ti='card-departure-0']").$("[data-ti='stopover-place']"),
            checkValueCityTrainArrive = $("[data-ti='card-arrival-0']").$("[data-ti='stopover-place']"),
            getValueExpCityTrain = $("[data-ti='card-departure-0']").$(".o-text-inline");

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
    public SearchTicketOnTrainPageObject setDataTo(String value) {
        setDataTo.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPageObject clickSearchTrainButton() {
        clickSearchTrainButton.click();
        return this;
    }
    public SearchTicketOnTrainPageObject clickTrainOfferCard() {
        clickTrainOfferCard.click();
        return this;
    }
    public SearchTicketOnTrainPageObject clickExampleCityTrainFrom() {
        clickExampleCityTrainFrom.click();
        return this;
    }
    public SearchTicketOnTrainPageObject clickExampleCityTrainTo() {
        clickExampleCityTrainTo.click();
        return this;
    }

    public SearchTicketOnTrainPageObject checkValueCityTrainDepar(String value) {
        checkValueCityTrainDepar.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPageObject checkValueCityTrainArrive(String value) {
        checkValueCityTrainArrive.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPageObject getValueExpCityTrain() {
        getValueExpCityTrain.getValue();
        return this;
    }
}
