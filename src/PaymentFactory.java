public class PaymentFactory {

    //if else kullanmamızı istiyor

    //payment isimli bir metod oluşturuyoruz
    public Payment createPayment(String paymentType){

        if(paymentType.equalsIgnoreCase("CreditCard")){
            return new CreditCartPayment(); //ihtiyacımız olan nesneleri oluşturduk.
        }
        else if(paymentType.equalsIgnoreCase("BankTransfer")){
            return new BankTransferPayment();
        }
        else if(paymentType.equalsIgnoreCase("Paypal")){
            return new PayPalPayment();
        } else if ((paymentType.equalsIgnoreCase("DigitalCuzdan"))) {
            return  new digitalCuzdanPayment();
        }






        return null;
    }
}
