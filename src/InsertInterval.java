import java.util.ArrayList;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class InsertInterval {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

    	ArrayList<Interval> result = new ArrayList<Interval>();
        int i = 0;
        boolean flag = false;
        while(i < intervals.size()){
        	Interval old = intervals.get(i);
        	if(old.end < newInterval.start){
        		result.add(old);
        		++i;
        	}
        	else if(old.start > newInterval.end){
        		result.add(newInterval);
        		flag = true;
        		break;
        	}
        	else{// newInterval overlap with original interval
        		//merge two interval
        		int newS = Math.min(old.start, newInterval.start);
        		int newE = Math.max(old.end, newInterval.end);
        		newInterval = new Interval(newS, newE);
        		++i;
        	}
        }  
        while(i < intervals.size()){
        	result.add(intervals.get(i));
        	++i;
        }
        if(!flag){
        	result.add(newInterval);
        }
        return result;
    }
}