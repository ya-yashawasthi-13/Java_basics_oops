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
        if (super.avg >= 90) {
            System.out.println("Grade = A+");
        } else if (super.avg >= 80) {
            System.out.println("Grade = A");
        } else if (super.avg >= 70) {
        System.out.println("Grade = B");
        } else if (super.avg >= 60) {
        System.out.println("Grade = C");
        } else if (super.avg >= 50) {
        System.out.println("Grade = E");
        } else {
           System.out.println("Grade = Fail"); 
        }
    }
}

class Stud {
    public static void main(String a[]){
    C c1 = new C();
    c1.stud();
 }
}
