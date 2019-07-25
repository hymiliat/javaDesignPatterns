package designpatterns.observer;

import java.util.List;
import java.util.ArrayList;

public class Britney implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    private String mentalState = "bad";

    public void setMentalState(String mentalState) {
        this.mentalState = mentalState;
    }

    public String getMentalState() {
        return this.mentalState;
    }

    @Override
    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observerList.forEach(o -> o.notifyMe());
    }

}