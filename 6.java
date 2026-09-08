class A{
    int sub1 = 50 ;
    int sub2 = 60 ;
    int sub3 = 88 ;
}

class B extends A{
    int total = super.sub1 + super.sub2 + super.sub3 ;
    int avg = total/3 ;
    int per = (total*100)/300;
}

class C extends B{
    void stud(){
        System.out.println("Total Marks = " +super.total);
        System.out.println("Average Marks = "+super.avg);
        System.out.println("Percentage = " +super.per+ "%");
    }
}

class Student {
    public static void main(String a[]){
    C c1 = new C();
    c1.stud();
 }
}
