public class digitalCuzdanPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("DigitalCuzdan ile ödemeniz gerçekleştirildi.");
    }
}
