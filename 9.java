class A{
    int pf = 10000;
    int tax = 2000;
    int sal = 30000;
}

class B extends A{
    void gros(){
        int gr = super.pf + super.tax + super.sal ;
        System.out.println("Gross Salary :"+gr);
    }
}

class C extends B{
    void net(){
        int gr = super.pf + super.tax + super.sal ;
        int al = super.pf + super.tax ;
        int n = gr - al ;
        System.out.println("Net Salary :"+n);
    }
}

class Salary{
    public static void main(String a[]){
        B b1 = new B();
        C c1 = new C();
        b1.gros();
        c1.net();
    }
}