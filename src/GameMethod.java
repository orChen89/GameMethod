public class GameMethod {

    public static void main(String[] args) {

        Game game1 = new Game();

        game1.name = "Fifa 22";
        game1.price = 157.99;
        game1.yearOfPublish = 2021;

        game1.print();
        System.out.println();
        game1.install();

        Game game2 = new Game();

        game2.name = "Call Of Duty - Warzone";
        game2.price = 0;
        game2.yearOfPublish = 2020;

        game2.print();
        System.out.println();
        game2.install();


        Game game3 = new Game();

        game3.name = "Counter Strike - Source";
        game3.price = 79.99;
        game3.yearOfPublish = 2004;

        game3.print();
        System.out.println();
        game3.install();
    }
}
