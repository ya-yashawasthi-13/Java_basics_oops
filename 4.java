class A{
    int l = 10 ;
    int b = 20 ;
}

class B extends A {
    void ar(){
    System.out.println(super.l * super.b);
    }
}

class area{
    public static void main(String a[]){
        B b1 = new B();
        b1.ar();
    }
}