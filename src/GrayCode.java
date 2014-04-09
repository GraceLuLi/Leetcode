import java.util.ArrayList;

public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n == 0){
            result.add(0);
            return result;
        }
        if(n == 1){
            result.add(0);
            result.add(1);
            return result;
        }
        result = grayCode(n-1);
        ArrayList<Integer> copy = (ArrayList<Integer>)result.clone();
        int addend = (int)Math.pow(2,n-1);
        int i = copy.size()-1;        
        while(i >= 0){
            result.add(copy.get(i)+ addend);            
            --i;
        }
        return result;
    }
}