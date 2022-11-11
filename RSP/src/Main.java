import java.util.Scanner;
import java.util.Random;
public class Main {
    private static Scanner src;
    public static void main(String[] args) {
        String player;
        String computer = "";
        boolean start=true;

        src = new Scanner(System.in);

        Random generator = new Random();
        System.out.println("Select object :" +
                " Rock <R>" +
                " Scissors <S>" +
                " Peaper <P>");

        while (start) {

            int pcmater = generator.nextInt(3) + 1;
            if (pcmater == 1) {
                computer = "R";
            } else if (pcmater == 2) {
                computer = "S";
            } else if (pcmater == 3) {
                computer = "P";
            }

            System.out.println();

            System.out.print("Player : ");
            player = src.next().toUpperCase();

            System.out.println("Computer : " + computer);
            if (player.equals(computer)) {
                System.out.println("Draw !");
            } else if (player.equals("R") && computer.equals("S")) {
                System.out.println("!!! You Won !!!");
            } else if (player.equals("P") && computer.equals("R")) {
                System.out.println("!!! you Won !!!");
            } else if (player.equals("S") && computer.equals("P")) {
                System.out.println("!!! You Won !!!");
            } else if (player.equals("R") && computer.equals("P")) {
                System.out.println("!!! Computer Won !!!");
            } else if (player.equals("P") && computer.equals("S")) {
                System.out.println("!!! Computer Won !!!");
            } else if (player.equals("S") && computer.equals("R")) {
                System.out.println("!!! Computer Won !!!");
            } else
                System.out.println("Incorrect Entry");

            

        }


    }
    }
