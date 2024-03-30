
//public class ProgramowanieObiektowe {
/*
    public static void main(String[] args) {

        Monitor abc = new Monitor();

// obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie ze sobą powiązanych do dalszego
        // łatwiejszego użycia
// klasy - foremki do tworzenia egzemplarzy obiektów
        // properties - właściwości - opisują obiekt np. szerokość, wysokość
        // metody - funkcje - określają zachowanie np. włącz, wyłącz
    }

}


class Monitor // klasy piszemy z dużych liter
{
    int szerokosc;
    int wysokosc;

    void wlacz() // metody piszemy małymi literami
    {

    }
    void wylacz()
    {

    }


}

 */
public class ProgramowanieObiektowe {

    public static void main(String[] args) {

        //new Punkt(); // puste nawiasy mówią - wywołaj domyślny konstruktor (w tym przypadku - zarezerwuj miejsce w pamięci)


        // Punkt p;
        //  p = new Punkt(); // można zapisać w jednej linii - poniżej

        //  Punkt p = new Punkt(); // wywołanie domyślnego konstruktora
        Punkt p = new Punkt(10, 155); // wywołanie konstruktora z parametrami za pomocą podanych argumentów
        Punkt p2 = new Punkt(10, 45);

        //p.x = 5;  jeśli zadelkarujemy tu zmienne, to parametry konstruktora zostaną zmienione
        //p.y = 20;

        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);

        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);

    }
}
    class Punkt
    {
        Punkt() // puste nawiasy, więc to domyślny konstruktor

        {
            System.out.println("Wywołano konstruktor domyślny");
        }
        Punkt (int pierwszy, int drugi) // posiada parametry pierwszy i drugi
        {
            System.out.println("Wywołano konstruktor z dwoma parametrami domyślny");

            x = pierwszy;
            y = drugi;
        }
        int x;
        int y;

    }

    // słowo kluczowe this np. this.x = x - this odnosi się do konkretnego obiektu, na którym pracujemy

