public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && - operator "i" - koniunkcja - oba wyrażenia są prawdziwe to daje true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);

        // || - lub - true gdy jedno wyrażenie składowe jest równe true, false gdy oba są fałszywe
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || thirdValue);

        // ! - negacja, zwraca wartość przeciwnądo wyrażenia, przed którym się znajduje
        System.out.println(!firstValue); //firstValue - true, ale z negacją zwraca false


    }
}
