package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchTicketOnBusPage;
import pages.SearchTicketOnPlanePage;
import pages.SearchTicketOnTrainPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.qameta.allure.Allure.step;

@Tag("go_test")
public class SearchTicketsTest extends TestBase {
    SearchTicketOnPlanePage searchTickets = new SearchTicketOnPlanePage();
    SearchTicketOnPlanePage searchChildTickets = new SearchTicketOnPlanePage();
    SearchTicketOnPlanePage searchTicketWithFlight = new SearchTicketOnPlanePage();
    SearchTicketOnPlanePage searchTicketsWithExampleCities = new SearchTicketOnPlanePage();
    SearchTicketOnTrainPage searchTicketOnTrain = new SearchTicketOnTrainPage();
    SearchTicketOnTrainPage searchExpTicketOnTrain = new SearchTicketOnTrainPage();
    SearchTicketOnBusPage searchTicketsOnBus = new SearchTicketOnBusPage();
    SearchTicketOnBusPage searchTicketBusExp = new SearchTicketOnBusPage();

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
            .aviaTabClick()
            .valueCityFromSet("Казань")
            .valueCityToSet("Москва")
            .dataFromSet(tomorrowString)
            .dataBackSet(weekString)
            .foundTicketClickOn();
        });

        step("Проверка найденных билетов на самолет за указанный промежуток времени", () -> {
        searchChildTickets
            .resultLineCitiesCheck("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет с добавлением перелета")
    void searchTicketWithFlight() {
        step("Поиск билетов на самолет с перелетом", () -> {
            searchTicketWithFlight
                    .openPage()
                    .aviaTabClick()
                    .valueCityFromSet("Казань")
                    .valueCityToSet("Москва")
                    .dataFromSet(tomorrowString)
                    .addFlightClick()
                    .addFlightCityFromSet("Москва")
                    .addFlightCityToSet("Казань")
                    .addFlightDataSet(weekString)
                    .searchButtonClickOn()
                    .foundTicketClickOn();
        });
        step("Проверка билетов на самолет с перелетом", () -> {
            searchTicketWithFlight
                     .valueCitiesCheck("Казань" + " — " + "Москва");
        });
    }

    @Test
    @DisplayName("Проверка билетов на самолет после нажатия на город из примера")
    void searchTicketsWithExampleCities() {
        step("Поиск билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .openPage()
                    .aviaTabClick()
                    .exampleCityFromClick()
                    .exampleCityToClick()
                    .dataFromSet(tomorrowString)
                    .searchButtonClickOn()
                    .foundTicketClickOn();;
        });
        step("Проверка билетов на самолет с городами из примера", () -> {
            searchTicketsWithExampleCities
                    .valueSearchedLineGet();
        });
    }

    @Test
    @DisplayName("Проверка поиска билета на поезд для указанных городов")
    void searchTicketOnTrain() {
        step("Поиск билетов на поезд", () -> {
            searchTicketOnTrain
                    .openPage()
                    .trainTabOpen()
                    .stationFromSet("Казань")
                    .stationToSet("Москва")
                    .dataToSet(tomorrowString)
                    .searchTrainButtonClick()
                    .trainOfferCardClick();
        });
        step("Проверка поиска билета на поезд", () -> {
            searchTicketOnTrain
                    .valueCityTrainDeparCheck("Казань")
                    .valueCityTrainArriveCheck("Москва");

        });
    }
    @Test
    @DisplayName("Проверка билетов на поезд после нажатия на город из примера")
    void searchExpTicketOnTrain() {
        step("Поиск примерных билетов на поезд", () -> {
            searchExpTicketOnTrain
                    .openPage()
                    .trainTabOpen()
                    .exampleCityTrainFromClick()
                    .exampleCityTrainToClick()
                    .dataToSet(tomorrowString)
                    .searchTrainButtonClick();
        });
        step("Проверка билетов на поезд из примера", () ->{
            searchExpTicketOnTrain
                    .valueExpCityTrainGet();
        });
    }
    @Test
    @DisplayName("Проверка найденных билетов на автобус для указанных городов")
    void searchTicketsOnBus() {
        step("Поиск билетов на автобус", () -> {
            searchTicketsOnBus
                    .openPage()
                    .busTabOpen()
                    .busStationCityFromSet("Казань")
                    .busStationCityToSet("Москва")
                    .dateBusSet(tomorrowString)
                    .searchBusButtonClick();
        });
        step("Проверка найденных билетов на автобус", () -> {
            searchTicketsOnBus
                    .cityBusStationCheck();
        });
    }
    @Test
    @DisplayName("Проверка найденных билетов на автобус после нажатия на город из примера")
    void searchTicketBusExp() {
        step("Поик примерных билетов на автобус", () ->{
            searchTicketBusExp
                    .openPage()
                    .busTabOpen()
                    .stationFromBusExpClick()
                    .stationToBusExpClick()
                    .dateBusSet(tomorrowString)
                    .searchBusButtonClick();
        });
        step("Проверка найденных билетов на автобус из примера", () -> {
            searchTicketBusExp
                    .cityOfExpBusFromCheck();

        });
    }
}
