public class DoWhileLoop {

    public static void main(String[] args) {
/*
        int number = 5; //wartość początkowa

        do {
            System.out.println("Moja wartość to :" + number + " i jestem mniejsza od 20");
            number++;
        } while (number<20);  // najpierw wykonywany jest kod, a dopiero później sprawdzany warunek, więc pierwsza iteracja może go nie spełniać
*/

        String[] kursyProgramowania =
                {
                        "Java",
                        "Java aplikacje",
                        "Java aspekty zaawansowane",
                        "Java android",
                        "C#",
                        "C# tworzenie aplikacji"

                };
        int i = 0;
        //while (i < 7) // dopóki i mniejsze niż 7
        while (i < kursyProgramowania.length) // odniesienie do całej długości tablicy
        {
          //  System.out.println(i); // wypisz i
            System.out.println(kursyProgramowania[i]); //odniesienie do tablicy kursyProgramowania

            i++; // zwiększ i o 1
        }

        i = 0;
        do {

            System.out.println(kursyProgramowania[i]);

            i++;
        } while(i < kursyProgramowania.length);
        
    }

}
