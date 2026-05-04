public interface PaymentGateway {
    void process();
}

class Paypal implements PaymentGateway {
    public void process(){
        System.out.println("Processing credit card payment");
    }
}

class Credit implements PaymentGateway{
    public void process(){
        System.out.println("Processing credit card payment");

    }
}