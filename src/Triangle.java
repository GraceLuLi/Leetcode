import java.util.ArrayList;

public class Triangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        ArrayList<ArrayList<Integer>> records = new ArrayList<ArrayList<Integer>>();
        int level = triangle.size()-1;
        if(level == -1){
            return 0;
        }
        ArrayList<Integer> postLevel = (ArrayList<Integer>)(triangle.get(level)).clone();
        records.add(0, postLevel);
        --level;
        ArrayList<Integer> currLevel;
        while(level >= 0){
             currLevel= new ArrayList<Integer>();
             for(int i = 0; i < postLevel.size()-1; ++i){
                 int currMinTotal = (triangle.get(level)).get(i) + Math.min(postLevel.get(i),postLevel.get(i+1));
                 currLevel.add(currMinTotal);
             }
             postLevel = currLevel;
             --level;
        }
        return postLevel.get(0);
    }
}


