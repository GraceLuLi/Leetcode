import java.util.ArrayList;

public class PascalsTriangleII {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        if(rowIndex < 0){
            return list1;
        }
        list1.add(1);
        if(rowIndex == 0){
            return list1;
        }
        list1.add(1);
        if(rowIndex == 1){
            return list1;
        }
        int i = 2;
        while(i <= rowIndex){
            list2 = new ArrayList<Integer>();
            list2.add(1);
            for(int j=1; j < list1.size(); ++j){
                list2.add(list1.get(j-1)+list1.get(j));
            }
            list2.add(1);
            list1 = list2;
            ++i;
        }
        return list1;
    }
}
