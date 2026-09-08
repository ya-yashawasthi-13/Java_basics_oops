interface i1{
    double pi = 3.14;
}

interface i2{
    abstract void calc(double r);
}

interface i3{
    void arr(int l, int b);
}
interface i4{
    void area(int l, int b, int h);
}

class C implements i1, i2, i3, i4{
    public void calc(double r){
        System.out.println(3.14*r*r);
    }
    public void arr(int l, int b){
            System.out.println(l*b);
    }
    public void area(int l, int b, int h){
            System.out.println(l*b*h);
    }
}

class t{
    public static void main(String a[]){
    C c1 = new C();
    c1.calc(10);
    c1.arr(10,20);
    c1.area(10,20,30);
    }
}

