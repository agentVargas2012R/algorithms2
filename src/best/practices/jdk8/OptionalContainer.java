package best.practices.jdk8;

import java.util.Optional;

public class OptionalContainer {

    public Slide locateSlide(String id) {
        Optional<Slide> slide = getSlide(id);
        return slide.orElse(new Slide());
    }

    public Boolean isPresent(String id){
        Optional<Slide> slide = getSlide(id);
        return slide.isPresent();
    }

    public Optional<Slide> getSlide(String id) {
        Integer randomizer = new Double(Math.round(Math.random() % 2)).intValue();
        Optional<Slide> slide = Optional.empty();

        switch(randomizer){
            case 1:
                Slide sl = new Slide();
                sl.setId(id);
                sl.setTitle("Title");
                sl.setDescription("This is the description");
                slide = Optional.of(sl);
                break;
        }

        return slide;
    }
}
