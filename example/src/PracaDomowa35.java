import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

/*
class Account
{
    private double balance;

    public Account()
    {
        this.balance = 0;
    }

    public void deposit(double value)
    {
        this.balance = balance + value;
    }

    public void withdraw(double value)
    {
        if(value <= this.balance){
            this.balance = balance - value;
        }
        else {
            System.out.println("Nie masz wystarczających środków na wypłatę");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }

}

public class PracaDomowa35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Saldo początkowe: " + account.getBalance());
        System.out.println("Wprowadź kwotę wpłaty.");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Saldo po wpłacie: " + account.getBalance());
        System.out.println("Wprowadź kwotę wypłaty.");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Saldo po wypłacie: " + String.format("%.2f", account.getBalance()));

    }

}

 */

class Account{ // nowa klasa

    private double balance; // pole prywatne

    public Account() // konstruktor klasy
    {
        this.balance = 0;
    }

    public void deposit(double value)
    {
        this.balance = balance + value;
    }

    public void withdraw(double value)
    {
        if (value <= this.balance) {
            this.balance = balance - value;
        } else {
            System.out.println("Nie masz wystarczających środków na wypłatę");
        }
    }

    public double getBalance()
    {
        return this.balance;
    }
}

public class PracaDomowa35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Saldo początkowe: " + account.getBalance());
        System.out.println("Wprowadź kwotę wpłaty: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Saldo po wpłacie: " + account.getBalance());
        System.out.println("Wprowadź kwotę wypłaty: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Saldo po wypłacie: " + account.getBalance());

    }

}