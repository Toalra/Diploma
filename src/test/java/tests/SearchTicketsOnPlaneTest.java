package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.BeforeSuite;
import pages.SearchTicketOnPlanePageObject;
import utils.RetryRule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static io.qameta.allure.Allure.step;
import static utils.RandomTypeTicket.standart;

@Tag("go_test")
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

    @BeforeSuite
    public void setUp(ITestContext context) {
        for(ITestNGMethod method : context.getAllTestMethods()){
            method.setRetryAnalyzerClass(RetryRule.class);
        }
    }

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
            .resultLine(city1 + " — " + city2);
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

        step("Проверка выбранного билета по указанным параметрам в поиске", () -> {
            searchChildTickets
                    .checkCities("Казань — Москва")
                    .checkChild("за двоих");
        });
    }

    @Test
    void searchBabyTicket(){
        step("Поиск билетов на самолет с 1 малышом", () -> {
            searchBabyTicket
                    .openPage()
                    .avia()
                    .cityFrom("Казань")
                    .cityTo("Москва")
                    .dataFrom(tomorrowString)
                    .dataBack(weekString)
                    .baby()
                    .searchButton()
                    .chooseTicket();
        });

        step("Проверка выбранного билета по указанным параметрам в поиске", () -> {
            searchBabyTicket
                    .checkCities("Казань — Москва")
                    .checkBaby("Ручная кладь 10 кг для взрослого, нет для малыша");
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
                     .checkCities("Москва — Казань");
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
    void searchRandomTypeTicket() {
        step("Поиск с рандомным типом билета", () -> {
            searchRandomTypeTicket
                    .openPage()
                    .avia()
                    .cityFrom("Казань")
                    .cityTo("Москва")
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
