public class Enkapsulacja {

    public static void main(String[] args) {

        /*
            Enkapsulacja (hermetyzacja) - pakowanie właściwości w taki sposób, aby nie było do nich bezpośredniego dostępu
            z innych klas

         */
        KontoBankowe oszczednosciowe = new KontoBankowe();

        //oszczednosciowe.saldo = 10000000;

        oszczednosciowe.wplac(5000);

        if (oszczednosciowe.wyplac(4244))
        {
            System.out.println("wypłacono");
        }
        else
            System.out.println("za mało kasy");



        //oszczednosciowe.setSaldo(10000);
        System.out.println(oszczednosciowe.getSaldo());

    }

}


class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    private int saldo; // private - modyfikator dostępu

    int getSaldo()  // get - pobieranie wartości
    {
        return saldo;
    }

    void setSaldo(int saldo)
    {
        /*
        WARUNKI!!!

         */
        this.saldo = saldo;

    }

    boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
            setSaldo(saldo - ile);

        return true;
    }

    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }

}