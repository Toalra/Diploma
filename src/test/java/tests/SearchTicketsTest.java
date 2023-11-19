package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchTicketOnBusPageObject;
import pages.SearchTicketOnPlanePageObject;
import pages.SearchTicketOnTrainPageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.qameta.allure.Allure.step;

@Tag("go_test")
public class SearchTicketsTest extends TestBase {
    SearchTicketOnPlanePageObject searchTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchChildTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketWithFlight = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsWithExampleCities = new SearchTicketOnPlanePageObject();
    SearchTicketOnTrainPageObject searchTicketOnTrain = new SearchTicketOnTrainPageObject();
    SearchTicketOnTrainPageObject searchExpTicketOnTrain = new SearchTicketOnTrainPageObject();
    SearchTicketOnBusPageObject searchTicketsOnBus = new SearchTicketOnBusPageObject();
    SearchTicketOnBusPageObject searchTicketBusExp = new SearchTicketOnBusPageObject();

    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    LocalDate week = today.plusDays(5);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String tomorrowString = tomorrow.format(formatter);
    String weekString = week.format(formatter);

    @Test
    @DisplayName("Проверка поиска билета на самолет для указанных городов")
    void searchTickets() {
        step("Поиск билетов на самолет за промежуток времени", () -> {
        searchTickets
            .openPage()
            .clickAviaTab()
            .setValueCityFrom("Казань")
            .setValueCityTo("Москва")
            .setDataFrom(tomorrowString)
            .setDataBack(weekString)
            .chooseFoundTicket();
        });

        step("Проверка найденных билетов на самолет за указанный промежуток времени", () -> {
        searchChildTickets
            .checkResultLineCities("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет с добавлением перелета")
    void searchTicketWithFlight() {
        step("Поиск билетов на самолет с перелетом", () -> {
            searchTicketWithFlight
                    .openPage()
                    .clickAviaTab()
                    .setValueCityFrom("Казань")
                    .setValueCityTo("Москва")
                    .setDataFrom(tomorrowString)
                    .clickAddFlight()
                    .setAddFlightCityFrom("Москва")
                    .setAddFlightCityTo("Казань")
                    .setAddFlightData(weekString)
                    .searchButtonClick()
                    .chooseFoundTicket();
        });
        step("Проверка билетов на самолет с перелетом", () -> {
            searchTicketWithFlight
                     .checkValueCities("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет после нажатия на город из примера")
    void searchTicketsWithExampleCities() {
        step("Поиск билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .openPage()
                    .clickAviaTab()
                    .clickExampleCityFrom()
                    .clickExampleCityTo()
                    .setDataFrom(tomorrowString)
                    .searchButtonClick()
                    .chooseFoundTicket();;
        });
        step("Проверка билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .getValueSearchedLine();
        });
    }

    @Test
    @DisplayName("Проверка поиска билета на поезд для указанных городов")
    void searchTicketOnTrain() {
        step("Поиск билетов на поезд", () -> {
            searchTicketOnTrain
                    .openPage()
                    .train()
                    .stationFrom("Казань")
                    .stationTo("Москва")
                    .setDataTo(tomorrowString)
                    .clickSearchTrainButton()
                    .clickTrainOfferCard();
        });
        step("Проверка поиска билета на поезд", () -> {
            searchTicketOnTrain
                    .checkValueCityTrainDepar("Казань")
                    .checkValueCityTrainArrive("Москва");

        });
    }
    @Test
    @DisplayName("Проверка билетов на поезд после нажатия на город из примера")
    void searchExpTicketOnTrain() {
        step("Поиск примерных билетов на поезд", () -> {
            searchExpTicketOnTrain
                    .openPage()
                    .train()
                    .clickExampleCityTrainFrom()
                    .clickExampleCityTrainTo()
                    .setDataTo(tomorrowString)
                    .clickSearchTrainButton();
        });
        step("Проверка билетов на поезд из примера", () ->{
            searchExpTicketOnTrain
                    .getValueExpCityTrain();
        });
    }
    @Test
    @DisplayName("Проверка найденных билетов на автобус для указанных городов")
    void searchTicketsOnBus() {
        step("Поиск билетов на автобус", () -> {
            searchTicketsOnBus
                    .openPage()
                    .busTabOpen()
                    .busStationSetCityFrom("Казань")
                    .busStationSetCityTo("Москва")
                    .setDateBus(tomorrowString)
                    .clickSearchBusButton();
        });
        step("Проверка найденных билетов на автобус", () -> {
            searchTicketsOnBus
                    .checkCityBusStationFrom("Казань")
                    .checkCityBusStationTo("Центральный");
        });
    }
    @Test
    @DisplayName("Проверка найденных билетов на автобус после нажатия на город из примера")
    void searchTicketBusExp() {
        step("Поик примерных билетов на автобус", () ->{
            searchTicketBusExp
                    .openPage()
                    .busTabOpen()
                    .clickStationFromBusExp()
                    .clickStationToBusExp()
                    .setDateBus(tomorrowString)
                    .clickSearchBusButton();
        });
        step("Проверка найденных билетов на автобус из примера", () -> {
            searchTicketBusExp
                    .checkCityOfExpBus();

        });


    }
}
