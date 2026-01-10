public class MainFile{
    private PaymentService paymentService;
    public MainFile(){
        paymentService=new Razorpay();
        System.out.println(paymentService.pay());
    }

    public static void main(String[] args) {
        MainFile obj=new MainFile();
    }
}