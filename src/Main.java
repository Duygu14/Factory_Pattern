import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PaymentFactory paymentFactory = new PaymentFactory();
        String odemeler =("1:CreditCard " +"\n"+
                "2:BankTransfer " +"\n"+
                "3:PayPal "+"\n"+
                "4:DigitalCuzdan "+"\n"+
                "5:Çıkış ");
        System.out.println(odemeler);
        System.out.println("Lütfen bir ödeme yöntemi seçiniz: ");

        Scanner scanner = new Scanner(System.in);
        int secim=scanner.nextInt();
        switch(secim){
            case 1:
                Payment credirtCardPayment = paymentFactory.createPayment("CreditCard");
                credirtCardPayment.processPayment();
                break;
            case 2:
                Payment bankTransferPayment = paymentFactory.createPayment("BankTransfer");
                bankTransferPayment.processPayment();
                break;
            case 3:
                Payment payPalPayment = paymentFactory.createPayment("PayPal");
                payPalPayment.processPayment();
                break;
            case 4:
                Payment digitalCuzdanPayment = paymentFactory.createPayment("DigitalCüzdan");
                digitalCuzdanPayment.processPayment();
                break;
            case 5:
                System.out.println("Çıkış işleminiz yapılıyor.");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
                break;


        }

    /*
        Payment credirtCardPayment = paymentFactory.createPayment("CreditCard");
        credirtCardPayment.processPayment();

        Payment bankTransferPayment = paymentFactory.createPayment("BankTransfer");
        bankTransferPayment.processPayment();

        Payment payPalPayment = paymentFactory.createPayment("PayPal");
        payPalPayment.processPayment();

        Payment digitalCuzdanPayment = paymentFactory.createPayment("DigitalCüzdan");
        digitalCuzdanPayment.processPayment();
    */
    }
}