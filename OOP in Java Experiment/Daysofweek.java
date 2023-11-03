import java.util.*;
public class Daysofweek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number of week:");
        int day=sc.nextInt();
        sc.close();
        String name;
        switch(day){
            case 1:
                name="Sunday";
                System.out.println("Day :"+ name);
                break;
            case 2:
                name="Monday";
                System.out.println("Day :"+ name);
                break;
            case 3:
                name="Tuesday";
                System.out.println("Day :"+ name);
                break;
            case 4:
                name="Wednesday";
                System.out.println("Day :"+ name);
                break;
            case 5:
                name="Thursday";
                System.out.println("Day :"+ name);
                break;
            case 6:
                name="Friday";
                System.out.println("Day :"+ name);
                break;
            case 7:
                name="Saturday";
                System.out.println("Day :"+ name);
                break;
            default:System.out.println("wrong choice");
                break;

        }
    }
}
