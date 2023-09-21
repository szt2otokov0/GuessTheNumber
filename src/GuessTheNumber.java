import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int theNumber = rnd.nextInt(0,100);
        //System.out.printf("(Psszt! A szám: %s - de nem mondd el senkinek!)\n",theNumber);
        System.out.println("Adj meg egy számot 0 és 100 között:");
        int yourNumber = scn.nextInt();
        if(yourNumber == theNumber) System.out.printf("Hurrá, eltaláltad! Tényleg %s volt a szám!",theNumber);
        else System.out.println("Ez most nem sikerült... :(");
    }
}