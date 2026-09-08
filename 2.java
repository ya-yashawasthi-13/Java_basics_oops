abstract class Test{
    abstract void compute(double i, double j, double k);
}

class Min{
    void compute(double i, double j, double k){
        if(i < j && i < k){
            System.out.println("Min is: "+i);
        }else if(j < k && j < i){
            System.out.println("Min is: "+j);   
        }else{
            System.out.println("Min is: "+k);
        }

    }
}

class Max{
    void compute(double i, double j, double k){
        if(i > j && i > k){
            System.out.println("Max is: "+i);
        }else if(j > k && j > i){
            System.out.println("Max is: "+j);   
        }else{
            System.out.println("Max is: "+k);
        }
    }
}

class Tes{
    public static void main(String a[]){
        Min m1 = new Min();
        Max m2 = new Max();
        m1.compute(10,20,30);
        m2.compute(10,20,30);
    }
}
