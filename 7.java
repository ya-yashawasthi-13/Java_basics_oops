class A{
    int r = 10 ;
    int l = 10 ;
    int b = 20 ;
}

class B extends A{
    void circle(){
        System.out.println(3.14 * super.r * super.r);
    }
}

class C extends A{
    void rect(){
        System.out.println(super.l * super.b);
    }
}

class arr{
    public static void main(String a[]){
        B b1 = new B();
        C c1 = new C();
        b1.circle();
        c1.rect();
    }
}