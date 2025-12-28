public class DemoSavingsAccount {
    public static void main(String[] args)

    {
        SavingsAccount sa1 = new SavingsAccount("Sita", 123456);

        System.out.println(sa1.name);
        System.out.println(sa1.acno);
        System.out.println(sa1.sortcode);
        System.out.println(sa1.getBalance());
        sa1.deposit(500.00f);
        System.out.println(sa1.getBalance());

        System.out.println("---------------------");

        SavingsAccount sa2 = new SavingsAccount("Abinaya", 789456);
        System.out.println(sa2.name);
        System.out.println(sa2.acno);
        System.out.println(sa2.sortcode);
        System.out.println(sa2.getBalance());
        sa2.withdraw(50.0f);
        System.out.println(sa2.getBalance());

    }
}
