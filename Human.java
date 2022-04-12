import java.util.ArrayList;

public class Human{
    //attributes
    private String name;
    private int age;

    private int health = 100;

    private int wisdom = 3;
    private int strength =3;
    private int dexterity = 3;

    private static int allHumans = 0;

/////constructor
    public Human(){
        allHumans ++;
    }
    public Human(String name) {
        this.name =name;
        allHumans ++;
    }

    public Human( String name, int age) {
        this.name =name;
        this.age = age;
        allHumans ++;
    }


//// instance methods
    public void eat(int foodCalories){
        System.out.println(this.name  + " is eating an apple!om nom nom!");
        this.health += foodCalories;

    }
    public Human getPoisoned() {
        System.out.println(this.name + " is poisoned! OH NOOOOOOOOOOO");
        this.health -= 3;
        return this;
    }

    public void pastaAndCreamSauce(){
        System.out.println(this.name + " was fully regenerated");
        this.health = 100;
    }
    public void attack(Human attackee){
        attackee.setHealth(attackee.getHealth()-this.strength);
    }

///getters and setters
    public static int getAllHumans(){
        return allHumans;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}