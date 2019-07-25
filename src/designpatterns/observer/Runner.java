package designpatterns.observer;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import designpatterns.*;

public class Runner {
    public static void main(String[] args) {

        Britney britney = new Britney();
        Journalist journalist1 = new Journalist("journalist 1");
        Journalist journalist2 = new Journalist("journalist 2");
        Journalist journalist3 = new Journalist("journalist 3");
        Journalist journalist4 = new Journalist("journalist 4");

        List<Journalist> listOfCrazyJournalists = Stream.of(journalist1, journalist2, journalist3, journalist4)
                .collect(Collectors.toList());

        listOfCrazyJournalists.forEach(journalist -> journalist.subscribeToSubject(britney));

        britney.setMentalState("better !");
        britney.notifyObservers();

        journalist4.unsubscribeToSubject(britney);

        britney.setMentalState("bad again...");
        britney.notifyObservers();

        journalist1.unsubscribeToSubject(britney);
        journalist2.unsubscribeToSubject(britney);
        journalist3.unsubscribeToSubject(britney);

        britney.setMentalState("suicicidal /!\\");
        britney.notifyObservers();
    }
}