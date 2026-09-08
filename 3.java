interface i1{
    double pi = 3.14;
}

interface i2{
    double area(double r);
}

class yy implements i1, i2{
    public double area(double r){
        return(3.14*r*r);
    }
}

class tt{
    public static void main(String a[]){
    yy t1 = new yy();
    System.out.println(t1.area(3.45));
    }
}