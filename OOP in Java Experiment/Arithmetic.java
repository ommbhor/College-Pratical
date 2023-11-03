public class Arithmetic{
    public static double add(double a,double b){
        return a+b;
    }
    public static double substract(double a,double b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        double a=10.0;
        double b=5.0;
        double sum=add(a, b);
        double difference=substract(a, b);
        double product=mul(a, b);
        System.out.println("Sum is:"+sum);
        System.out.println("Substraction is:"+difference);
        System.out.println("Multiplication is:"+product);
    }
}