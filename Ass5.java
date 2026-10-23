import java.util.Scanner;

class A{
    int unit;

    A(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units:");
        unit = sc.nextInt();
    }

    double calculateBill(){
        return unit * 7;
    }
}
class B extends A{
    double calculateBill(){
        return super.calculateBill();
    }
}
class Ass5{
    public static void main(String a[]){
        B b1 = new B();
        System.out.println("Bill: " + b1.calculateBill());
    }
}