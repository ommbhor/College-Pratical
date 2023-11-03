public class Stringclass {
    public static void main(String[] args) {
        String s="Hello, ";
        String a="World!";
        String con=s+a;
        int len=con.length();
        String upr=con.toUpperCase();
        String lwr=con.toLowerCase();
        boolean contains=con.contains("world");
        int index=con.indexOf('o');
        System.out.println("Concatenated: " + con);
        System.out.println("Length: " + len);
        System.out.println("Uppercase: " + upr);
        System.out.println("Lowercase: " + lwr);
        System.out.println("Contains 'world': " + contains);
        System.out.println("Index of 'o': " + index);
        
    }
}
