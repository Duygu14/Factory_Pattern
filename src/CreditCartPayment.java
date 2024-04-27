public class CreditCartPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Kredi kartı ile ödemeniz gerçekleştirildi.");
    }
}
