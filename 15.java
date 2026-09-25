class A extends Thread{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("A");
            if(i == 1) break;
            
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("B");
            if(i == 1){
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    System.out.println("Error");
                }
                    
                }
            }
    }
}

class Tes{
    public static void main(String a[]){
        A a1 = new A();
        B b1 = new B();
        System.out.println("Start");
        a1.run();
        b1.start();
        System.out.println("End of Main");
    } 
}
