class A{
int p = 100;
int r = 2 ;
int t = 300;
}
class B extends A{
    void SI(){
        int s = (super.p * super.r * super.t)/100;
        System.out.println("Simple Interest : "+s);
    }
    void CI(){
        double c = super.p*Math.pow((1 + (super.r/100.0)),super.t);
        double ci = c - super.p;
        System.out.println("Compound Interest : "+ci);
    }
}
class intres{
    public static void main(String a[]){
        B b1 = new B();
        b1.SI();
        b1.CI();
    }
}