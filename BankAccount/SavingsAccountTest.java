public class SavingsAccountTest{
    public static void main(String[] args) {

        Bank fineco = new Bank();   //Crazione dell' array di tipo banca
        CheckingAccount check = new CheckingAccount(0); //Oggetto per verificare le commissioni

        //Prima persona che effettua operazioni
        fineco.getBanca(1).deposit(5000);
        fineco.getBanca(1).deposit(100);
        fineco.getBanca(1).printConto();
        System.out.println("1) Bilancio della Persona 1: "+fineco.getBanca(1).getBalance()+"€");

        //Seconda persona che effettua operazioni
        fineco.getBanca(2).deposit(500);
        fineco.getBanca(2).withdraw(200);
        fineco.getBanca(2).printConto();
        System.out.println("2)Bilancio della Persona 2: "+fineco.getBanca(2).getBalance()+"€");


        //Tassamento
        fineco.tassamento(100);
        System.out.println("\n1)Bilancio prima persona dopo tassamento: "+fineco.getBanca(1).getBalance()+"€");
        System.out.println("2)Bilancio seconda persona dopo tassamento: "+fineco.getBanca(2).getBalance()+"€");

        //Bilancio totale e totale depositi
        System.out.println("\n-Questo è il bilancio di tutti i conti della banca: "+fineco.totBilancio()+"€");
        System.out.println("-Questo è il numero di depositi avvenuti nella banca: "+fineco.totDepositi()+" Depositi effettuati");

        //Conversione in dollari
        System.out.println("\n1)Conversione del saldo in dollari del conto: " + fineco.getBanca(1).printConto());
        System.out.println("Il saldo in euro era: " + fineco.getBanca(1).getBalance()+"€");
        System.out.println("Il saldo convertito in dollari è: "+ fineco.getBanca(1).convert()+"$");
        System.out.println("\n2)Conversione del saldo in dollari del conto: " + fineco.getBanca(2).printConto());
        System.out.println("Il saldo in euro era: " + fineco.getBanca(2).getBalance()+"€");
        System.out.println("Il saldo convertito in dollari è: "+ fineco.getBanca(2).convert()+"$");

        //Operazioni di tipo Check
        check.deposit(20);
        check.deposit(10);
        check.withdraw(10);
        check.deposit(10);
        check.withdraw(10);
        System.out.println("\n-Il bilancio attuale senza commisioni è: "+check.getBalance());
        check.deductFees();
        System.out.println("-Il bilancio con applicate le commisioni è: "+check.getBalance());

    }
}