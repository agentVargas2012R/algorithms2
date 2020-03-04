package best.practices.jdk8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaContainerTest {

    private LambdaContainer lambdaContainer = new LambdaContainer();
    private PredicateContainer predicateContainer = new PredicateContainer();

    @Test
    public void test1() {
        List<String> people = new ArrayList<String>();
        people.add("mike");
        people.add("jen");
        people.add("alex");

        lambdaContainer.sort(people);

        for(String s : people){
            System.out.println(s);
        }
    }

    /**
     * Shows how to use generic types with lambdas
     */
    @Test
    public void test2() {
        List<Person> people =  new ArrayList<Person>();

        Person person = new Person();
        person.setName("mike");
        people.add(person);

        Person person2 = new Person();
        person2.setName("jen");
        people.add(person2);

        Person person3 = new Person();
        person3.setName("alex");
        people.add(person3);

        lambdaContainer.sort(people);
        for(Person p : people){
            System.out.println(p.getName());
        }
    }

    /**
     * Shows how to deal with reversing a list
     */
    @Test
    public void test3() {
        List<String> people = new ArrayList<String>();
        people.add("alex");
        people.add("jen");
        people.add("mike");

        List<String> sortedPeeps = lambdaContainer.reverseOrder(people);

        for(String s : sortedPeeps){
            System.out.println(s);
        }
    }

    /**
     * shows how to deal with null checks
     */
    @Test
    public void test4() {
        Person p = new Person();
        if(predicateContainer.isNull(p)){
            System.out.println("P IS NULL");
        }

        p = null;
        if(predicateContainer.isNull(p)){
            System.out.println("P IS NULL");
        }

    }

    /**
     * shows how to use mapping objects technique
     */
    @Test
    public void test5() {
        List<String> people = new ArrayList<String>();
        people.add("alex");
        people.add("jen");
        people.add("mike");

        List<Person> sortedPeeps = lambdaContainer.mapObjects(people);
        for(Person p : sortedPeeps){
            System.out.println(p.getName());
        }
    }

    /**
     * Shows how to use streams + filters
     */
    @Test
    public void test6() {
        List<String> people = new ArrayList<String>();
        people.add("alex");
        people.add("jen");
        people.add("mike");

        List<String> sortedPeeps = lambdaContainer.filter(people, "jen");
        for(String s : sortedPeeps){
            System.out.println(s);
        }
    }

    /**
     * Shows how to use new JDK expection throwing technique
     */
    @Test(expected = RuntimeException.class)
    public void test7() {
        Function<String, RuntimeException> exFunction  = RuntimeException::new;
        throw exFunction.apply("message");
    }
}
