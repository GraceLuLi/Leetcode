import java.util.ArrayList;

public class InsertInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    	
    	ArrayList<Interval> result = new ArrayList<Interval>();
    	Interval clone = new Interval(newInterval.start, newInterval.end);
    	Interval pre  = new Interval();
    	Interval next = new Interval();
    	int i = 0;
    	while(i < intervals.size()){
    		pre = intervals.get(i);
    		if(pre.start <= clone.start){
    			clone.start = pre.start;
    			break;
    		}
    		else if(pre.end <= clone.start){
    			clone.start = pre.start;
    			break;
    		}
    		else{
    			result.add(pre);
    			++i;
    		}
    	}
    	++i;
    	while(i < intervals.size()){
    		next = intervals.get(i);
    		if(next.start >= clone.end){
    			clone.end = next.end;
    			break;
    		}
    		else if(next.end >= clone.end){
    			clone.end = next.end;
    			break;
    		}
    	}
    	
        
    }
}