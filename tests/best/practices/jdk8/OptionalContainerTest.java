package best.practices.jdk8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OptionalContainerTest {

    private OptionalContainer optionalContainer = new OptionalContainer();

    @Test
    public void test1() {
        Slide slide = optionalContainer.locateSlide("1");
        System.out.println("SLIDE: " + slide.getId());
    }

    @Test
    public void test2() {
        if(optionalContainer.isPresent("1")){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
    }

    /**
     * Shows how to throw an exception from an optional object
     */
    @Test
    public void test3() {
        Optional<Slide> slide = optionalContainer.getSlide("1");
        slide.orElseThrow(() -> new RuntimeException("Test"));
    }

    @Test
    public void filterMapCollect() {
        List<String> contacts = new ArrayList<String>();
        contacts.add("Alex");
        contacts.add("Bob");
        contacts.add("Carol");
        contacts.add("Damon");
        contacts.add("Earl");
        contacts.add("Frank");
        contacts.add("Greg");

        //filter and collect the filtered result;
        List<String> result = contacts.stream()
                .filter((contact) -> contact.equals("Alex"))
                .map((alex) -> alex = alex + " Redondo")
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> result2 = contacts.stream()
                .map((alex) -> alex = alex + " Redondo")
                .collect(Collectors.toList());
        System.out.println(result2);

        List<String> result3 = contacts.stream()
                .filter((contact) -> !(contact.equals("Alex")))
                .map((alex) -> alex = alex + " Redondo")
                .collect(Collectors.toList());
        System.out.println(result3);
    }



}
