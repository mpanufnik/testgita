// umożliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F; // jeśli np. wynik dzielenia zmiennoprzecinkowy, to zmienna musi być zmiennoprzecinkowa

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Dzielenie: " + division);


    }

}
