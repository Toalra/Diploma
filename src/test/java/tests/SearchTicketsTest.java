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
            .avia()
            .cityFrom("Казань")
            .cityTo("Москва")
            .dataFrom(tomorrowString)
            .dataBack(weekString)
            .chooseTicket();
        });

        step("Проверка найденных билетов на самолет за указанный промежуток времени", () -> {
        searchChildTickets
            .resultLine("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет с добавлением перелета")
    void searchTicketWithFlight() {
        step("Поиск билетов на самолет с перелетом", () -> {
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
        step("Проверка билетов на самолет с перелетом", () -> {
            searchTicketWithFlight
                     .checkCities("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет после нажатия на город из примера")
    void searchTicketsWithExampleCities() {
        step("Поиск билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .openPage()
                    .avia()
                    .exampleCityFrom()
                    .exampleCityTo()
                    .dataFrom(tomorrowString)
                    .searchButton()
                    .chooseTicket();;
        });
        step("Проверка билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .searchedLine();
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
    @DisplayName("Проверка билетов на поезд после нажатия на город из примера")
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
        step("Проверка билетов на поезд из примера", () ->{
            searchExpTicketOnTrain
                .checkExpCityTrain();
        });
    }
    @Test
    @DisplayName("Проверка найденных билетов на автобус для указанных городов")
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
    @DisplayName("Проверка найденных билетов на автобус после нажатия на город из примера")
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
        step("Проверка найденных билетов на автобус из примера", () -> {
            searchTicketBusExp
                    .checkCityExpBus();

        });


    }
}
