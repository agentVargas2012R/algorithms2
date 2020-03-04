package best.practices.jdk8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaContainer {

    public <T> void sort(List<T> list) {
        list.sort((obj1, obj2) -> obj1.toString().compareTo(obj2.toString()));
    }

    public <T> List<T> reverseOrder(List<T> list){
        return list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }


    public <T> List<T> filter(List<T> list, String criteria){
        return list.stream().filter((item) -> {
            return (item.toString().equals(criteria));
        }).collect(Collectors.toList());
    }

    public List<Person> mapObjects(List<String> list) {
        return list.stream().map((obj) -> createPerson(obj)).collect(Collectors.toList());
    }

    public Person createPerson(String obj){
        Person p = new Person();
        p.setName(obj);
        return p;
    }
}
