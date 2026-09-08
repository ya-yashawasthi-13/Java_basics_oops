import java.util.Scanner;

class A{
    Scanner sc = new Scanner(System.in);
    int unit;
    
    A(){
        System.out.println("Enter units:");
        unit = sc.nextInt();
    }
}
class B extends A{
    void cons(){
        int consume = super.unit * 7;
        System.out.println("Bill: "+consume);
    }
}
class Bill{
    public static void main(String a[]){
        B b1 = new B();
        b1.cons();
    }
}