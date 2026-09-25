class A implements Runnable{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("A");
            if(i == 1) break ;
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("B");
            if(i == 1){
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ie){
                    System.out.println("Interrupted error");
                }
            }
        }
    }
}

class C implements Runnable{
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("C");
        }
    }
}

class Main{
    public static void main(String[] args){
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());

        t1.start();
        t2.start();
        t3.start();
    }
}


