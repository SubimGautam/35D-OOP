public class question2{
    public static void main(String[] args) {
        double principal = 1000;
        double rateofinterest = 5;
        int timeperiod = 2;

        double simpleinterest = (principal * rateofinterest * timeperiod)/100;
        System.out.println("Principal amount: $" + principal);
        System.out.println("Rate of interest: " + rateofinterest + "%");
        System.out.println("Time period: " + timeperiod + " years");
        System.out.println("Simple Interest: $" + simpleinterest);
    }
}
