class A{
    int r = 10 ;
    int l = 10 ;
    int b = 20 ;
    int h = 20 ;
    int base = 30 ;
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

class D extends A {
    void tri(){
        System.out.println(super.base * super.h);
    }
}

class are{
    public static void main(String a[]){
        B b1 = new B();
        C c1 = new C();
        D d1 = new D();
        b1.circle();
        c1.rect();
        d1.tri();
    }
}