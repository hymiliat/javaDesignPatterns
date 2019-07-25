package designpatterns.observer;

public class Journalist implements Observer {

    private String name;
    private Subject subject;

    public Journalist(String name) {
        this.name = name;
    }

    public void subscribeToSubject(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void unsubscribeToSubject(Subject subject) {
        this.subject.detach(this);
        this.subject = null;
    }

    @Override
    public void notifyMe() {
        Britney britney = (Britney) this.subject;
        System.out.println("Journalist " + name + " understood that britney is feeling " + britney.getMentalState());
    }
}