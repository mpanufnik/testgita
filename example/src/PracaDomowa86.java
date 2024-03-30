import java.util.Arrays;

public class PracaDomowa86 {

  /*  public static void main(String[] args) {

        for (int i=3; i<=100; i = i+3)
            System.out.println(i);
    }

    public static void main(String[] args) {
        for (int i=1; i<=100; i++)
            if (i%3==0){
                System.out.println(i);
            }
    }

   */

    public static void main(String[] args) {
        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0;i<(numbers.length/2);i++){
            int temp = numbers[i]; // dla i=0 będzie wartość 1
            numbers[i] = numbers[numbers.length-1-i]; // 4 -> 0
            numbers[numbers.length-1-i] = temp; // 1
            System.out.println("Iteracja numer" + i);
        }

        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
