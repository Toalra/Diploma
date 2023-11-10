package utils;

import com.github.javafaker.Faker;

public class RandomTypeTicket {
    public static String
    standart = randomTypeTicket();
    public static String randomTypeTicket() {
        String[] standart = {"", "Бизнес", "Первый", "Эконом"};
        return new Faker().options().option(standart);
    }
}
