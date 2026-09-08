class A{
int p = 500 ;
}
class B extends A{
int r = 300 ;
}
class C extends B{
    int t = 100 ;
}
class D extends C{
    void simp(){
    int simple = (super.p + super.r + super.t)/100;
    System.out.println("Simple Interest : "+simple);
    }
}

class Interest{
    public static void main(String a[]){
    D d1 = new D();
    d1.simp();
    }
}