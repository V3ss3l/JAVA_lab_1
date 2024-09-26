package exercise_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HumanUtils {


    public static List<Human> findByLastName(List<Human> humanList, String lastName){
        List<Human> tempList = new ArrayList<>();
        for (Human temp: humanList) {
             if(temp.getLastName().equals(lastName)) tempList.add(temp);
        }
        return tempList;
    }

    public static List<Human> findByCity(List<Human> humanList, String city){
        List<Human> tempList = new ArrayList<>();
        for (Human temp: humanList) {
            if(temp.getAddress().getCity().equals(city)) tempList.add(temp);
        }
        return tempList;
    }

    public static List<Human> findByDateRange(List<Human> humanList, LocalDate firstDate, LocalDate secondDate){
        List<Human> tempList = new ArrayList<>();
        for (Human temp: humanList) {
            if(temp.getBirthDate().isAfter(firstDate)
                    && temp.getBirthDate().isBefore(secondDate)) tempList.add(temp);
        }
        return tempList;
    }

    public static Human findOldest(List<Human> humanList){
        Human result = new Human();
        for (Human temp: humanList) {
            if(temp.getBirthDate().isBefore(result.getBirthDate())) result = temp;
        }
        return result;
    }

    public static Human findYoungest(List<Human> humanList){
        Human result = humanList.getFirst();
        for (Human temp: humanList) {
            if(temp.getBirthDate().isAfter(result.getBirthDate())) result = temp;
        }
        return result;
    }

    public static Map<String, List<Human>> findAllByOneStreet(List<Human> humanList){
        return humanList.stream().collect(Collectors.groupingBy(Human::getStreet));
    }

}
