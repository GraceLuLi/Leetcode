
public class Pow{
 public double pow(double x, int n){
    if(n == 0){
        return (double)1;
    }
    if(n == 1){
        return x;
    }
    if(x == (double)1 ){
        return x;
    }
    if(x == (double)-1){
        if(n%2 == 0){
            return -x;
        }
        return x;
    }
    if(n < 0){
        return pow(1/x, -n);
    }
    int n1 = n/2;
    double r1 = pow(x, n1);
    double r2 = (n%2 == 0? r1:r1*x);

    return r1*r2;
 }
}
