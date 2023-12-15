import java.util.Random;

public class Macierze {

    public static void main(String[] args) {

        int K = 20;
        int M = 5;
        int N = 5;


        int[][] MacGen = new int[M][N];
        MacGen = MacierzGen(M, N, K);
        pokaz(MacGen);
        System.out.println();
//SUMA A i B
        int[][] A = new int[M][N];
        A = MacierzGen(M, N, K);
        pokaz(A);
        System.out.println();

        int[][] B = new int[M][N];
        B = MacierzGen(M, N, K);
        pokaz(B);
        System.out.println();

        int[][] C = new int[M][N];
        C = sumowanieM(A, B);
        pokaz(C);
        System.out.println();

    }

    public static int[][] MacierzGen(int M, int N, int K) {

        Random los = new Random();
        int[][] MacGen = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                MacGen[i][j] = los.nextInt(K + 1);
            }
        }
        return MacGen;
    }


    public static void pokaz(int[][] MacGen) {


        for (int j = 0; j < MacGen[0].length; j++) {
            System.out.print("[");
            for (int i = 0; i < MacGen.length; i++) {
                if (i != MacGen.length - 1) {
                    System.out.print(MacGen[j][i] + ", ");
                } else System.out.print(MacGen[j][i]);
            }
            System.out.println("]");
        }
    }

    public static int[][] sumowanieM(int[][] A, int[][] B) {

        int[][] sumaM = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                sumaM[i][j] = A[i][j] + B[i][j];
            }
        }
        return sumaM;
    }

    public static int sumowanieElementówM(int[][] MacGen) {
        int suma = 0;
        for (int i = 0; i < MacGen.length; i++) {
            for (int j = 0; j < MacGen[0].length; j++) {
                suma = suma + MacGen[i][j];
            }
        }
        return suma;

    }
}