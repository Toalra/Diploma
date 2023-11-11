package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SearchTicketOnPlanePageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static io.qameta.allure.Allure.step;

@Tag("go_test")
public class SearchTicketsOnPlaneTest extends TestBase {
    SearchTicketOnPlanePageObject searchTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchChildTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchBabyTicket = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketWithFlight = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsWithExampleCities = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketOnTrain = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsOnBus = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketOnEtrain = new SearchTicketOnPlanePageObject();

    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    LocalDate week = today.plusDays(5);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String tomorrowString = tomorrow.format(formatter);
    String weekString = week.format(formatter);

    Faker faker = new Faker(new Locale("ru-RU"));
    String city1 = faker.address().cityName();

    String city2 = faker.address().cityName();

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
            .searchButton()
            .chooseTicket();
        });

        step("Проверка найденных билетов за указанный промежуток времени", () -> {
        searchChildTickets
            .resultLine("Казань" + " — " + "Москва");
        });
    }

    @Test
        void searchChildTickets(){
        step("Поиск билетов на самолет с 1 ребенком", () -> {
            searchChildTickets
                    .openPage()
                    .avia()
                    .cityFrom("Казань")
                    .cityTo("Москва")
                    .dataFrom(tomorrowString)
                    .dataBack(weekString)
                    .child()
                    .searchButton()
                    .chooseTicket();
        });

        step("Проверка выбранного билета по указанным параметрам в поиске с 1 ребенком", () -> {
            searchChildTickets
                    .checkCities("Казань" + " — " + "Москва")
                    .checkChild("за двоих");
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
    void searchTicketOnEtrain() {
        step("Поик билетов на электричку", () ->{
            searchTicketOnEtrain
                    .openPage()
                    .etrain()
                    .stationFromEtrain("Казань (Татарстан)")
                    .stationToEtrain("Москва")
                    .dataTo(tomorrowString)
                    .searchButton();
        });
        step("Проверка найденных балетов на электричку", () -> {
            searchTicketOnEtrain
                    .checkCityEtrain("Казань → Москва");

        });


    }
}
