public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a: " + a); //0

        int b = a++; //postikrementacja - najpierw przypisuje starą wartość (a), a później dodaje wartość 1 do wartości a
        System.out.println("Wartość b: " + b); //0
        System.out.println("Wartość a: " + a); //1
        System.out.println("Wartość a: " + a); //1


        int c = ++a; //preikrementacja - najpierw zwiększa warość a, a później dodaje wartość a
        System.out.println("Wartość c: " + c); //2
        System.out.println("Wartość a: " + a); //2 ????


    }
}
