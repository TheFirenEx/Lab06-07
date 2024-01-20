import java.util.Random;
import java.util.Scanner;

public class GeneratorTablicNiepowtarzający {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj ilość generowanych pozycji w tablicy");
        int rozmiar = skaner.nextInt();
        System.out.println("Podaj maksymalną wartość");
        int maks = skaner.nextInt();

        int[] tab;
        tab = tabGen1(rozmiar, maks);
        pokaz(tab);

//ZAD13
        int[] tabP;
        tabP = podzial_parzyste(tab);
        pokaz(tabP);

        int[] tabNP;
        tabNP = podzial_nieparzyste(tab);
        pokaz(tabNP);


    }

    public static int[] tabGen1(int n, int k) {   //METODA 1
        Random losowo = new Random();
        boolean jest;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int pom = losowo.nextInt(1, k + 1);
            jest = false;
            for (int j = 0; j < i; j++) {
                if (pom == tab[j]) {
                    jest = true;
                    break;
                } //else tab[i] = pom;
            }
            if (jest) i--;
            else tab[i] = pom;
        }
        return tab;
    }

    public static int[] tabGen2(int n, int k) {   //METODA 2

        Random losowo = new Random();
        int[] los = new int[k];
        for (int i = 0; i < k; i++) {
            los[i] = i + 1;
        }
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int index = losowo.nextInt(k);
            tab[i] = los[index];
            los[index] = los[k - 1];
            k--;
        }
        return tab;
    }

    public static void pokaz(int[] tab) {

        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            if (i != tab.length - 1) {
                System.out.print(tab[i] + ", ");
            } else System.out.print(tab[i]);
        }
        System.out.println("]");
    }

    //ZAD 13
    public static int[] podzial_parzyste(int[] tab) {

        int[] tabP;
        int licznikP = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) licznikP++;
        }

        tabP = new int[licznikP];
        int indexP = 0;
        for (int i = 0; i < tab.length; i++) {

            if (tab[i] % 2 == 0) {
                tabP[indexP] = tab[i];
                indexP++;
            }
        }

        return tabP;
    }

    public static int[] podzial_nieparzyste(int[] tab) {

        int[] tabNP;
        int licznikNP = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) licznikNP++;
        }


        tabNP = new int[licznikNP];
        int indexNP = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                tabNP[indexNP] = tab[i];
                indexNP++;
            }

        }
        return tabNP;
    }

//    public static void pokaz13(int[] T) {
//
//        System.out.print("[");
//        for (int i = 0; i < T.length; i++) {
//            if (i != T.length - 1) {
//                System.out.print(T[i] + ", ");
//            } else System.out.print(T[i]);
//        }
//        System.out.println("]");
//    }


}