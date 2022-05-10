package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    public AnimalsCage() {
        System.out.println("AnimalsCage bean is created");
    }
    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        //System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
