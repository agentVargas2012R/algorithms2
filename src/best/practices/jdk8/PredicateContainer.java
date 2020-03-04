package best.practices.jdk8;

import java.util.function.Predicate;

public class PredicateContainer {

    private Predicate<Object> nullCheck = obj -> ( obj == null);

    public Boolean isNull(Object obj){
        return nullCheck.test(obj);
    }
}
