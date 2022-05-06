# Practice Problems

## 1.
```java
public class Book {
    
    private String title;
    private int pages;

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle; // Can still change the book title from outside the class
    }
}
```
## 2.
### a)
```java
Array<Book> books = new Array<Book>();
int counter = 0;
for (int i = 0; i < books.length; i++) {
    if (books[i].getPages() < 100) {
        counter++;
    }
}
```
### b)
```java
//For loop condition changes
int counter = 0;
for (Book book : books) {
    if (book.getPages() < 100) {
        counter++;
    }
}

//Size syntax, indexing syntax changes
ArrayList<Book> books = new ArrayList<Book>();
int counter = 0;
for (int i = 0; i < books.size(); i++) {
    if (books.get(i).getPages() < 100) {
        counter++;
    }
}
```
### c)
Some differences between Arrays and ArraysLists are that Arrays are fixed size and ArraysLists are not. Another difference is that Arrays are primitive data types and ArraysLists are not.

**Solution**:
Syntax, but more importantly available methods. An ArrayList is an array
internally but has helpful methods we can call. It also only can hold objects
(but we have wrapper classes to help with that). Arrays can hold primitive data types and objects.

### d)
```java
public class Pokemon {
    private String id;
    private String name;
    private String type;
    public Pokemon(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    public String getID(){ return id; }
    public String getName(){ return name; }
    public String getType() { return type; }
}

public class Trainer {
    private String id;
    private String name;
    public Trainer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getID() { return id; }
    public String getName() { return name; }
}

public class PokemonTracker {
    /*
    * TODO: fill in the following method to return the team
    * with the max number of fire type pokemon, given
    * the following parameters.
    *
    * trainersFromTeam: a map where the key is the team (ex//
    * “yellow”, “red”, “blue”) and the value
    * is a list of trainer objects on that
    * team.
    *
    * pokemonFromTrainer: a map where the key is the trainer’s
    * ID and the value is a list of pokemon
    * that belong to that trainer
    *
    * Return: this function should return the team that has the
    * maximum number of fire type pokemon out of the
    * teams in trainersFromTeam
    */
    public static String getTeamWithMaxFire(Map<String, List<Trainer>> trainersFromTeam, Map<String, List<Pokemon>> pokemonFromTrainer) {

        //Variables to keep track of the current best team
        String bestTeam = "";
        int maxFire = 0;
        //loop through teams and get all the trainers
        for (String team: trainersFromTeam.keySet()) {
            //count of fire type on this team
            int fire = 0;
            
            List<Trainer> trainers = trainersFromTeam.get(team);
            if (trainers != null) {//can’t loop if null!
            //loop through trainers on team to get pokemon
                for (Trainer trainer: trainers) {
                    List<Pokemon> poks= pokemonFromTrainer.get(trainer.getID());
                    if (poks != null) { //can’t loop through null list
                        for (Pokemon pok: poks) {
                            if (pok.getType().equals("fire")) { // not ==
                                fire++;
                            }
                        }
                    }
                }
            }
            //check if this team beats the best so far
            if (fire > maxFire) {
                bestTeam = team;
                maxFire = fire;
            }
        }
        return bestTeam;
    }
}
```
## 3.
### a)
The instance variables in Point are x and y
### b)
There are getters in the class which get x and get y. There is also a setter which increases x by dx that is passed into the method translateX().
### c)
The return type of getX() is double.
### d)
Using this. is not required on line 8 and 9 for this constructor because the variables are private and nobody can access them however they can change x through the setter method.

**Solution**:
Parameters have different names than the instance variables. It is only needed if the parameters names match the instance variables (There are conflicting names withing the same scope). 

## Using a simple class:
### a)
```java
//Write the code to declare and create a Point object named p1, with an x value of 0.5 and y value of 1.0
Point p1 = new Point(0.5, 1.0);
```
### b)
```java
// Write the code to access p1’s x value
p1.getX();
```
### c)
```java
// Write the code to shift p1'st x value by 5
p1.translateX(5);
```
### d)
The code would not compile because the variable COUNT is final which means it cannot be changed or overwritten.

## OOP:
### 1.
Encapsulation is the process of hiding the details of a class from the user. It is useful because it allows for better scalability like working in a large group project and it is better for debugging. 

**Solution**:
Encapsulation is bundling data and methods. Allows for data hiding (private methods). Can also make debugging easier and helps with organization.