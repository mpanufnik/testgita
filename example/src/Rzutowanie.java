public class Rzutowanie {

    public static void main(String[] args) {

        int a = 5, b = 2;
        double c = 12, d = 15;

        System.out.println(a / (double)b); // zmieniamy typ b na double


        int wynik1 = a/b;
        double wynik2 = c/d;

        System.out.println(wynik2);
    }

}
