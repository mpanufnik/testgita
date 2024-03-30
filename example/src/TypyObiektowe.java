public class TypyObiektowe {

    public static void main(String[] args) {


        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt od -128 do 127
        Short secondNumber = 32689; // 2 bajty od -32 768 do 32 767
        Integer thirdNumber = 32223333; // 4 bajty od -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2138000L;   // 8 bajtów od -2^63 do (2^63)-1 (posiadają przyrostek L , lub l)

        //liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // - 4 bajty - max ok 6-7 liczb po przecinku (posiadają przyrostek F , lub f)
        Double sixthNumber = 3.9999999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku (posiadają przyrostek D , lub d)

        // wartość logiczna
        Boolean prawda = true;
        Boolean fałsz = false;

        // ciągi znaków
        String hello = "Hello Bartek";

        System.out.println(hello.charAt(0));

    }
}
