public class BankTransferPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Banka transferi ile ödemeniz gerçekleştirildi.");
    }
}
