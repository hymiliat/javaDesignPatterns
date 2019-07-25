# The observer design pattern
The idea of the Observer design pattern is to implement one to many communication, where the communicator (Subject) communicates to one or several listeners (Observers).

It is comparable to a bunch of journalists which have to get the latest news about Britney. What if Britney could call each and every one of these journalists individually, to notify them about any changes of mood she has?

## The theory
Our Subject, Britney, will maintain a list of journalists Observers and notify them when her mind state changes... She will however require the journalists to subscribe or attach themselves to her. Make no mistake, they may unsubscribe from her moods as soon as they like!

![][observer.jpg]

## Compiling
``` batch 
# From src/
javac -d ../target designpatterns/observer/Runner.java
```

## Running
``` batch
# From target/
java designpatterns.observer.Runner
```