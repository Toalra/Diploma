package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.SearchTicketOnPlanePageObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.AnnotationRegistry.getValue;
import static utils.RandomTypeTicket.standart;

public class SearchTicketsOnPlaneTest extends TestBase {
    SearchTicketOnPlanePageObject searchTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchChildTickets = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchBabyTicket = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketWithFlight = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchTicketsWithExampleCities = new SearchTicketOnPlanePageObject();
    SearchTicketOnPlanePageObject searchRandomTypeTicket = new SearchTicketOnPlanePageObject();

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
            .cityFrom(city1)
            .cityTo(city2)
            .dataFrom(tomorrowString)
            .dataBack(weekString)
            .searchButton()
            .chooseTicket();
        });

        step("Проверка найденных билетов за указанный промежуток времени", () -> {
        searchChildTickets
            .resultLine(city1 + " — " + city2);
        });
    }

    @Test
        void searchChildTickets(){
        step("Поиск билетов на самолет с 1 ребенком", () -> {
            searchChildTickets
                    .openPage()
                    .avia()
                    .cityFrom(city1)
                    .cityTo(city2)
                    .dataFrom(tomorrowString)
                    .dataBack(weekString)
                    .child()
                    .searchButton()
                    .chooseTicket();
        });

        step("Проверка выбранного билета по указанным параметрам в поиске", () -> {
            searchChildTickets
                    .checkCities(city1 + " — " + city2)
                    .checkChild("за двоих");
        });
    }

    @Test
    void searchBabyTicket(){
        step("Поиск билетов на самолет с 1 малышом", () -> {
            searchBabyTicket
                    .openPage()
                    .avia()
                    .cityFrom(city1)
                    .cityTo(city2)
                    .dataFrom(tomorrowString)
                    .dataBack(weekString)
                    .baby()
                    .searchButton()
                    .chooseTicket();
        });

        step("Проверка выбранного билета по указанным параметрам в поиске", () -> {
            searchBabyTicket
                    .checkCities(city1 + " — " + city2)
                    .checkBaby("Ручная кладь 10 кг для взрослого, нет для малыша");
        });
    }
    @Test
    void searchTicketWithFlight() {
        step("Поиск билетов с перелетом", () -> {
            searchTicketWithFlight
                    .openPage()
                    .avia()
                    .cityFrom(city1)
                    .cityTo(city2)
                    .dataFrom(tomorrowString)
                    .addFlight()
                    .addCityFrom(city2)
                    .addCityTo(city1)
                    .addData(weekString)
                    .searchButton()
                    .chooseTicket();
        });
        step("Проверка билетов с перелетом", () -> {
            searchTicketWithFlight
                     .checkCities(city2 + " — " + city1);
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
                    .searchedLine(getValue(cityFrom));
        });
    }

    @Test
    void searchRandomTypeTicket() {
        step("Поиск с рандомным типом билета", () -> {
            searchRandomTypeTicket
                    .openPage()
                    .avia()
                    .cityFrom(city1)
                    .cityTo(city2)
                    .dataFrom(tomorrowString)
                    .dataBack(weekString)
                    .typeTicket(standart)
                    .searchButton()
                    .chooseTicket();
        });
        step("Проверка поиска с рандомным типом билета", () -> {
            searchRandomTypeTicket
                    .checkTypeTicket(standart);
        });
    }
}
