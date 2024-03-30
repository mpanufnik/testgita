public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;


        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else { // tylko dla pojedynczego warunku
            System.out.println("Podaj inną liczbę.");
        }
    }

}
