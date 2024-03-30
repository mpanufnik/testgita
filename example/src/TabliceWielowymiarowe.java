public class TabliceWielowymiarowe {

    public static void main(String[] args) {

        //tablice np. 4x4 jak szachownica - tablica dwuwymiarowa

        int[][] tab = new int[4][3];

        tab[0][0] = 25;
        tab[3][2] = 70;

        System.out.println(tab[3][2]);

        int[][] tab2 =
                {
                        {4, 15, 17},
                        {5, 12, 125},
                        {651, 1256, -24},
                        {6555, 2, -25}
                };
        System.out.println(tab2[1][2]); // wiersz 2, kolumna 3

    }

}
