class T{
    public static void main(String a[]){
        A a1 = new A();
        B b1 = new B();
        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());
        a1.setPriority(Thread.MIN_PRIORITY);
        b1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());
        a1.start();
        b1.start();
    }
}
