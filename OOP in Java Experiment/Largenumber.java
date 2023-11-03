public class Largenumber {
    public static void main(String[] args) {
        int a=25;
        int b=34;
        int c=56;
        int max;
        if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max=b;
        }
        else{
            max=c;
        }
        System.out.println("Max Number is:"+max);
    }
}
