# Practice Quiz 2 Problems

## 1. Simple Classes and Object Overriding
```java
public class Theater {
    private int seatingCapacity;
    private int ticketsSold;
    private String productionName;

    public Theater(int seatingCapacity, int ticketsSold, String productionName) {

        this.seatingCapacity = seatingCapacity;
        this.ticketsSold = ticketsSold;
        this.productionName = productionName;

    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o.getClass() != this.getClass()) {
            return false;
        } else {
            Theater t = (Theater) o;
            return this.seatingCapacity == t.seatingCapacity && this.ticketsSold == t.ticketsSold && this.productionName.equals(t.productionName);
        }
    }

    public String toString() {
        return "Production: " + this.productionName + "\nTickets Sold: " + this.ticketsSold;
    }
}
```

## 2. Refactoring
### a)
We have been asked to design classes with all instance fields being declared as private because then we can't access them outside of the class. Also these instance fields cannot be modified then by outside classes or users.

**Solution:**
Protects the integrity of the data from unintended changes. The data may only be accessed externally in a controlled fashion as allowed by the class. Basically, the class knows how its data should be used - by making the instance variables private =, it cna control the use and make sure everything us being accessed correctly.

### b)
It would be better to use an instance method instead of a static method because then we need to create objects in order to use the methods. In addition, the data cannot be accessed by any other classes or even be changed by outside classes or users.

**Solution:**
Want/need to access data for a particular instance of a class. You cannot access instance variables from a static method.

### c)
```java
public class TVWatcher {
    
    private Point location;
    private int minutes;
    private List<String> shows;

    public TVWatcher(Point location, int minutes) {
        this.location = location;
        this.minutes = minutes;
        shows = new ArrayList<String>();
    }
    // space to maybe add code?

    public void combineMins(TVWatcher watcher2) {
        this.minutes = this.minutes + watcher2.minutes;
    }

    public void printAShow(){
        System.out.println(“Start the day with: “ +
        this.shows.get(0));
    }

    public int getMinutes() {
        return minutes;
    }
}

public class Util {}

public class UseWatchers {
    public static void main(String[] args) {
        TVWatcher julie = new TVWatcher(new Point(1,2), 30);
        TVWatcher kirsten = new TVWatcher(new Point(-7,15), 100);
        julie.combineMins(kirsten);
        // Util.combineMins(julie, kirsten);
        System.out.println(“More minutes: “ + julie.getMinutes());
    }
}