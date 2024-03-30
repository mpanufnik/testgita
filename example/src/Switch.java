public class Switch {

    public static void main(String[] args) {

        String danie = "pizza";

        switch (danie) {
            case "pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "łosoś":
                System.out.println("Cena to 30 zł");
                break;
            case "frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }

}
