import java.util.Scanner;

class Ques{
    static double pi = 3.14 ;

    static void area(double rad){
        System.out.println("Area of circle: " +pi*rad*rad);
    }

    static void circ(double rad){
        System.out.println("Circumference of circle: " +2*pi*rad);
    }
}
class Ass4{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        double rad;
        System.out.println("Enter radius of circle: ");
        rad = sc.nextDouble();
        Ques.area(rad);
        Ques.circ(rad);
    }
}
