abstract class Test{
    abstract void calc(int i, int j);
    void show(){
        System.out.println("i am in Show");
    }
}

class A extends Test{
    void calc(int i, int j){
        System.out.println(i+j);
    }
    void disp(){
        System.out.println("I am in Display");
    }
}

class Demo{
    public static void main(String a[]){
        A a1 = new A();
        a1.calc(10,20);
        a1.show();
        a1.disp();
    }
}