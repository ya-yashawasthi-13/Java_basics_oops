class A extends Thread{
   public void run(){
    for(int i = 0 ; i < 3 ; i++){
        System.out.println("A"+i);
    }
    System.out.println("End of Thread A");
   } 
}

class B extends Thread{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("B"+i);
        }
        System.out.println("End of Thread B");
    }
}
class C extends Thread{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("C"+i);
        }
        System.out.println("End of Thread C");
    }
}

class Testthread{
    public static void main(String a[]){
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        System.out.println("Start Main");
        a1.run();
        b1.run();
        c1.run();
        System.out.println("End of Main");
    }
}