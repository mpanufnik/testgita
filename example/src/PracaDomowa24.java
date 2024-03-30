public class PracaDomowa24 {

    public static void main(String[] args) {


        int[] wielokrotnosci;
        wielokrotnosci = new int[10];

        wielokrotnosci[0] = 1;
        wielokrotnosci[1] = 2;
        wielokrotnosci[2] = 3;
        wielokrotnosci[3] = 4;
        wielokrotnosci[4] = 5;
        wielokrotnosci[5] = 6;
        wielokrotnosci[6] = 7;
        wielokrotnosci[7] = 8;
        wielokrotnosci[8] = 9;
        wielokrotnosci[9] = 10;

        int i = 0;

        while (i < wielokrotnosci.length) {

            System.out.println(wielokrotnosci[i] * 10);
            i++;
        }
    }
}
