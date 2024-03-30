public class PetlaWPetli {

    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) // j = 1, 2 itd. dla każdej wartości przechodzi do pętli i
        {
            for (int i = 1; i <= 10; i++) // i = od 1 do 10 dla każdej wartości j
            {
                System.out.print(i * j + " ");
            } // kończy się pętla i jak dochodzi do 10
            System.out.println(); // wykonuje się jako enter po wykonaniu całej pętli i. Po wykonaniu entera, przechodzi do kolejnego j
        }
    }

}
