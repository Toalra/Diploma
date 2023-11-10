package utils;

import com.github.javafaker.Faker;

public class RandomTypeTicket {
    public static String
    standart = randomTypeTicket();
    public static String randomTypeTicket() {
        String[] standart = {"Эконом", "Бизнес", "Первый"};
        return new Faker().options().option(standart);
    }
}
