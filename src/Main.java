import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj dlugosc tablicy");
        int rozmiar = skaner.nextInt();
        System.out.println("Podaj maksymalną wartość");
        int maks = skaner.nextInt();

        int[] tab = new int[rozmiar];
        tab = liczbylos(maks, rozmiar);
        //zad1
        pokaz(tab);
        //zad2
        pokaz2(tab);

    }


    public static int[] liczbylos(int K, int k) {

        Random losowo = new Random();
        int[] tab = new int[k];
        for (int i = 0; i < k; i++) {
            tab[i] = losowo.nextInt(1, K + 1);
        }
        return tab;
    }

    //ZAD 1
    public static void pokaz(int[] tab) {

        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            if(i != tab.length-1){
                System.out.print(tab[i] + ", ");
            }
            else System.out.print(tab[i]);
        }
        System.out.println("]");
    }

    //ZAD 2
    public static void pokaz2(int[] tab) {

        System.out.print("[");
        for (int i = tab.length-1; i >= 0; i--) {
            if(i != 0){
                System.out.print(tab[i] + ", ");
            }
            else System.out.print(tab[i]);
        }
        System.out.print("]");
    }

    //ZAD 6
}