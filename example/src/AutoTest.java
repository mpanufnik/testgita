public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto(); // obiekt Auto
        mercedes.marka = "Mercedes"; // przypisanie wartośći do pól
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();   // wywołanie metod
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();

    }

}






