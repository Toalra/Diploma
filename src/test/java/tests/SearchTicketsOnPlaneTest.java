package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchTicketOnPlanePageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.qameta.allure.Allure.step;

@Tag("go_test")
public class SearchTicketsOnPlaneTest extends TestBase {
    SearchTicketOnPlanePageObject searchTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchChildTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchBabyTicket = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketWithFlight = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsWithExampleCities = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketOnTrain = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchExpTicketOnTrain = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsOnBus = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketBusExp = new SearchTicketOnPlanePageObject();

    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    LocalDate week = today.plusDays(5);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String tomorrowString = tomorrow.format(formatter);
    String weekString = week.format(formatter);

    @Test
    void searchTickets() {
        step("Поиск билетов на самолет за промежуток времени", () -> {
        searchTickets
            .openPage()
            .avia()
            .cityFrom("Казань")
            .cityTo("Москва")
            .dataFrom(tomorrowString)
            .dataBack(weekString)
            .chooseTicket();
        });

        step("Проверка найденных билетов за указанный промежуток времени", () -> {
        searchChildTickets
            .resultLine("Казань" + " — " + "Москва");
        });
    }

    @Test
    void searchTicketWithFlight() {
        step("Поиск билетов с перелетом", () -> {
            searchTicketWithFlight
                    .openPage()
                    .avia()
                    .cityFrom("Казань")
                    .cityTo("Москва")
                    .dataFrom(tomorrowString)
                    .addFlight()
                    .addCityFrom("Москва")
                    .addCityTo("Казань")
                    .addData(weekString)
                    .searchButton()
                    .chooseTicket();
        });
        step("Проверка билетов с перелетом", () -> {
            searchTicketWithFlight
                     .checkCities("Казань" + " — " + "Москва");
        });
    }

    @Test
    void searchTicketsWithExampleCities() {
        step("Поиск билетов с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .openPage()
                    .avia()
                    .exampleCityFrom()
                    .exampleCityTo()
                    .dataFrom(tomorrowString)
                    .searchButton()
                    .chooseTicket();;
        });
        step("Проверка билетов с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .searchedLine();
        });
    }

    @Test
    void searchTicketOnTrain() {
        step("Поиск билетов на поезд", () -> {
            searchTicketOnTrain
                    .openPage()
                    .train()
                    .stationFrom("Казань")
                    .stationTo("Москва")
                    .dataTo(tomorrowString)
                    .searchTrainButton()
                    .trainOfferCard();
        });
        step("Проверка поиска билета на поезд", () -> {
            searchTicketOnTrain
                    .checkCityTrainDepar("Казань")
                    .checkCityTrainArrive("Москва");

        });
    }
    @Test
    void searchExpTicketOnTrain() {
        step("Поиск примерных билетов на поезд", () -> {
            searchExpTicketOnTrain
                    .openPage()
                    .train()
                    .exampleCityTrainFrom()
                    .exampleCityTrainTo()
                    .dataTo(tomorrowString)
                    .searchTrainButton();
        });
        step("Проверка примерных билетов на поезд", () ->{
            searchExpTicketOnTrain
                .checkExpCityTrain();
        });
    }
    @Test
    void searchTicketsOnBus() {
        step("Поиск билетов на автобус", () -> {
            searchTicketsOnBus
                    .openPage()
                    .bus()
                    .busStationFrom("Казань")
                    .busStationTo("Москва")
                    .dateBus(tomorrowString)
                    .searchBusButton();
        });
        step("Проверка найденных билетов на автобус", () -> {
            searchTicketsOnBus
                    .checkCityStartBus("Казань")
                    .checkCityEndBus("Центральный");
        });
    }
    @Test
    void searchTicketBusExp() {
        step("Поик примерных билетов на автобус", () ->{
            searchTicketBusExp
                    .openPage()
                    .bus()
                    .stationFromBusExp()
                    .stationToBusExp()
                    .dateBus(tomorrowString)
                    .searchBusButton();
        });
        step("Проверка найденных примерных балетов на автобус", () -> {
            searchTicketBusExp
                    .checkCityExpBus();

        });


    }
}
