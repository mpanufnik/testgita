import java.util.Scanner;

// dla wielu warunków
public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();

        if(firstNumber == 0) {
            System.out.println("Liczba jest równa 0");
        } else if (firstNumber > 0) {
            System.out.println("Liczba jest większa od 0");
        } else if (firstNumber > 10) {
            System.out.println("Liczba jest większa od 10");
        } else if (firstNumber < 0) {
            System.out.println("Liczba jest mniejsza od 0");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }

    }

}

// można też użyć skróconego sposobu
// String czyParzysta = x % 2 == 0 "parzysta" : "nieparzysta"; -- jeżeli modulo 2 wynosi 0 to wyświetl "parzysta", a jak nie to "nieparzysta"
