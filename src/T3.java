public class T3 {

    public static void main(String[] args) {
        double[][] tab = {
                {1, 3},
                {-3, 1},
                {1.5, -3},
                {3, 1}
        };

//        ZAD T3.2
        double[][] W = współrzędneP(tab);
        pokazM(W);
        System.out.println();

//        ZAD T3.3
        double[][] tabelaDist = TabelaOdległości(tab);
        pokazM(tabelaDist);
        System.out.println();
//        ZAD T3.1
        double[] point = MaxPOdPoczątku(tab);
        pokazT(point);
        System.out.println();



    }

    public static double[][] współrzędneP(double[][]tab) {

        double[][] W = new double[4][2];
        double maxX = tab[0][0];
        double maxY = tab[0][1];
        double minX = tab[0][0];
        double minY = tab[0][1];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i][0] < minX) {
                minX = tab[i][0];
            }
            if (tab[i][1] < minY) {
                minY = tab[i][1];
            }
            if (tab[i][0] > maxX) {
                maxX = tab[i][0];
            }
            if (tab[i][1] > maxY) {
                maxY = tab[i][1];
            }
        }
        W[0][0] = maxX;
        W[0][1] = maxY;
        W[1][0] = minX;
        W[1][1] = maxY;
        W[2][0] = minX;
        W[2][1] = minY;
        W[3][0] = maxX;
        W[3][1] = minY;

        System.out.println("W1 = (" + maxX + "," + maxY + ")");
        System.out.println("W2 = (" + maxX + "," + minY + ")");
        System.out.println("W3 = (" + minX + "," + minY + ")");
        System.out.println("W4 = (" + minX + "," + maxY + ")");

        return W;
    }

    //    ZadT3.1(dorobic generator punktów do tego zadania)
    public static double[] MaxPOdPoczątku(double[][] tab) {
        double distMAX = 0;
        int indexM = 0;
        double[] point = new double[2];
        for (int i = 0; i < tab.length; i++) {
            double dis = tab[i][0] * tab[i][0] + tab[i][1] * tab[i][1];
            if (dis > distMAX) {
                distMAX = dis;
                indexM = i;
            }
        }
        point[0] = tab[indexM][0];
        point[1] = tab[indexM][1];
        return point;
    }

    //    Zad T3.3(
    public static double[][] TabelaOdległości(double[][]tab) {
        int k = 0;
        double[][] tabelaDist = new double[6][2];
        for (int i = 0; i < tab.length; i++) {
            for (int j = i+1; j < tab.length; j++) {
                tabelaDist[k][0] = (i + 1) * 100 + (j + 1);
                tabelaDist[k][1] = (tab[i][0] - tab[j][0]) * (tab[i][0] - tab[j][0]) + (tab[i][1] - tab[j][1]) * (tab[i][1] - tab[j][1]);
                k++;
            }

        }
        return tabelaDist;

    }

    public static void pokazM(double[][] W) {


        for (int j = 0; j < W.length; j++) {
            for (int i = 0; i < W[0].length; i++) {
                System.out.printf("%7.2f", W[j][i]);
            }
            System.out.println();
        }
    }
    public static void pokazT(double[] tab) {

        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            if (i != tab.length - 1) {
                System.out.print(tab[i] + ", ");
            } else System.out.print(tab[i]);
        }
        System.out.println("]");
    }
}

