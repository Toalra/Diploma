package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTicketOnTrainPage {

    SelenideElement
            openTrainTab = $(".tab_train"),
            setStationFrom = $(".j-station_input_from"),
            setStationTo = $(".j-station_input_to"),
            clickSearchTrainButton = $(".m-border_inner"),
            setDataTo = $(".j-date_to"),
            clickTrainOfferCard = $("[data-ti='train-offer-card']").$(".o-container-fluid"),
            clickExampleCityTrainFrom = $(".departure").$(".j-pseudo"),
            clickExampleCityTrainTo = $(".arrival").$(".j-pseudo"),
            checkValueCityTrainDepar = $("[data-ti='card-departure-0']").$("[data-ti='stopover-place']"),
            checkValueCityTrainArrive = $("[data-ti='card-arrival-0']").$("[data-ti='stopover-place']"),
            getValueExpCityTrain = $("[data-ti='card-departure-0']").$(".o-text-inline");

    public SearchTicketOnTrainPage openPage() {
        open("");
        return this;
    }
    public SearchTicketOnTrainPage openTrainTab() {
        openTrainTab.click();
        return this;
    }
    public SearchTicketOnTrainPage setStationFrom(String value) {
        setStationFrom.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage setStationTo(String value) {
        setStationTo.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage setDataTo(String value) {
        setDataTo.setValue(value);
        return this;
    }
    public SearchTicketOnTrainPage clickSearchTrainButton() {
        clickSearchTrainButton.click();
        return this;
    }
    public SearchTicketOnTrainPage clickTrainOfferCard() {
        clickTrainOfferCard.click();
        return this;
    }
    public SearchTicketOnTrainPage clickExampleCityTrainFrom() {
        clickExampleCityTrainFrom.click();
        return this;
    }
    public SearchTicketOnTrainPage clickExampleCityTrainTo() {
        clickExampleCityTrainTo.click();
        return this;
    }

    public SearchTicketOnTrainPage checkValueCityTrainDepar(String value) {
        checkValueCityTrainDepar.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPage checkValueCityTrainArrive(String value) {
        checkValueCityTrainArrive.shouldHave(text(value));
        return this;
    }
    public SearchTicketOnTrainPage getValueExpCityTrain() {
        getValueExpCityTrain.getValue();
        return this;
    }
}
