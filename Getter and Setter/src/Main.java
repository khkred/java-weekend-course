public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();


        bankAccount.setCustomerName("Pavan");

        String customerName = bankAccount.getCustomerName();

        System.out.println("Customer Name : "+customerName);

    }
}
