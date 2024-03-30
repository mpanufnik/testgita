public class Statycznosc {

    public static void main(String[] args) {
        //Matematyka test = new Matematyka();
        //double wynik = test.dodaj(10, 20);

        double wynik = Matematyka.dodaj(10, 15);

        System.out.println(wynik);

        Klient a = new Klient("Arkadiusz");
        Klient b = new Klient("Wiola");
        Klient c = new Klient("Karol");

        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }

}

class Matematyka
{
    static double dodaj(double a, double b)
    {
        return a + b;
    }
}

class Klient
{
    Klient(String imie)
    {
        this.imie = imie;

        nastepnyId++;
        id = nastepnyId;
    }
    String imie;
    int id = 0;
    static int nastepnyId = 0; // statyczna wartość
}