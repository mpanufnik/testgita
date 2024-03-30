import java.util.Scanner;

public class PracaDomowa91 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.imie = "Anna";
        student1.nazwisko = "Nowak";
        student1.nick = "anowak";
        student1.email = "anowak@wp.pl";
        student1.numerIndeksu = "001";

        Student student2 = new Student();
        student2.imie = "Mariusz";
        student2.nazwisko = "Pudzianowski";
        student2.nick = "mpudzianowski";
        student2.email = "mpudzianowski@wp.pl";
        student2.numerIndeksu = "002";

        Student student3 = new Student();
        student3.imie = "Jan";
        student3.nazwisko = "Kowalski";
        student3.nick = "jkowalski";
        student3.email = "jkowalski@wp.pl";
        student3.numerIndeksu = "003";

        student1.przedstawSie();
        student1.zalogujSie();
        student1.podajEmail();
        student1.podajNrIndeksu();

        Student[] studenci = new Student[3]; // 3 elementy w tablicy
        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;

        for (int i = 0; i < studenci.length; i++) {
            studenci[i].podajEmail();
            studenci[i].podajNrIndeksu();
            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
        }

        String imie = "Kasia";
        Scanner scanner = new Scanner(System.in);


    }

}
