package exercise_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Example {
    private List<Human> humanList;

    public Example(){
        humanList = new ArrayList<>();
        humanList.add(new Human("Иван", "Иванов",
                new Address("Москва", "Ленина", "12"),
                LocalDate.of(2002, 3, 1)));
        humanList.add(new Human("Сергей", "Сергеевич",
                new Address("Москва", "Ташкенсткая", "2"),
                LocalDate.of(2001, 5, 4)));
        humanList.add(new Human("Михаил", "Михайлов",
                new Address("Самара", "Ленина", "45"),
                LocalDate.of(2004, 1, 25)));
        humanList.add(new Human("Андрей", "Андреев",
                new Address("Москва", "Ленина", "56А"),
                LocalDate.of(1999, 12, 5)));
        humanList.add(new Human("Александр", "Александров",
                new Address("Екатеринбург", "Воскресенская", "33Б"),
                LocalDate.of(1998, 7, 19)));

    }
}
