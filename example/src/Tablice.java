public class Tablice {

    public static void main(String[] args) {

        // int zmienna1, zmienna2, zmienna3.... - można zastąpić

        int[] tab; // zadeklarowanie tablicy

        tab = new int[5];   // rezerwujemy miejsce dla nowej tablicy tab o typie int i wielkości 5

        tab[0] = 20;    // podajemy wartośći w tablicy
        tab[1] = 5;
        tab[2] = 22;
        tab[3] = 45;
        tab[4] = 77;

        System.out.println(tab[2]); // odwołujemy się do miejsca 0 w tablicy tab, tablice zawsze indeksujemy od 0

        int[] tab2 = {4, 14, 4, 412}; // inny sposób podania wartości
        System.out.println(tab2[0]);
        System.out.println(tab2.length);
        System.out.println(tab2[tab2.length - 1]); // odwołanie do ostatniego elementu w tablicy



    }

}
