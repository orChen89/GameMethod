public class Game {

    public String name;
    public double price;
    public int yearOfPublish;

    public void print() {

        System.out.println();
        System.out.println("The official name of game number is: " + name);
        System.out.println("The current price of the game is: " + price + " ILS");
        System.out.println("The game has published on: " + yearOfPublish);
    }

    public void install() {

        System.out.println("< " + name + " > " + "is being installed!!");
    }
}
