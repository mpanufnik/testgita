public class TypyProste {

    // liczby stałoprzecinkowe
    byte firstNumber = 127; // 1 bajt od -128 do 127
    short secondNumber = 32689; // 2 bajty od -32 768 do 32 767
    int thirdNumber = 32223333; // 4 bajty od -2 147 483 648 do 2 147 483 647
    long fourthNumber = 2138000L;   // 8 bajtów od -2^63 do (2^63)-1 (posiadają przyrostek L , lub l)

    //liczby zmiennoprzecinkowe
    float fifthNumber = 4.99934F; // - 4 bajty - max ok 45 liczb po przecinku (posiadają przyrostek F , lub f)
    double sixthNumber = 3.9999999999999999D; // 8 bajtów - max ok 300 cyfr po przecinku (posiadają przyrostek D , lub d)

    // wartość logiczna
    boolean prawda = true;
    boolean fałsz = false;

    // pojedynczy znak
    char letter = 'A';
}
