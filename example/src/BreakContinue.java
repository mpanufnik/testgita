public class BreakContinue {

    public static void main(String[] args) {

/*
        for (int i = 0; i < 10; i++) {
            if (i == 3)
                continue;   // przerwij iteracje jeśli i == 3 i przejdź do następnej iteracji. Tutaj pomija wiersz 4
            break;  // przerywa iteracje np. po kliknięciu czegoś

            System.out.println(i);
        }
*/
        for (int j = 1; j <= 10; j++) // j = 1, 2 itd. dla każdej wartości przechodzi do pętli i
        {
            for (int i = 1; i <= 10; i++) // i = od 1 do 10 dla każdej wartości j
            {
                if (i == 4)
                    continue;   // przerwij iteracje jeśli i == 3 i przejdź do następnej iteracji. Tutaj pomija wiersz 4
                    //break;  // przerywa iteracje np. po kliknięciu czegoś


                System.out.print(i * j + " ");
            } // kończy się pętla i jak dochodzi do 10
            System.out.println(); // wykonuje się jako enter po wykonaniu całej pętli i. Po wykonaniu entera, przechodzi do kolejnego j
        }
    }
}
