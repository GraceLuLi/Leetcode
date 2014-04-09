import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class MergeIntevals {
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    	int size = intervals.size();
    	if(size <= 1){
    		return intervals;
    	}
    	Collections.sort(intervals, new CustomComparator());
    	ArrayList<Interval> result = new ArrayList<Interval>();
    	Interval pre = new Interval();
    	Interval curr = new Interval();
    	result.add(intervals.get(0));
    	int i = 1;
    	int j = 0;
        while(i < size){
        	pre = result.get(j);
        	curr= intervals.get(i);
        	if(curr.start > pre.end){
        		result.add(curr);
        		++j;
        	}
        	else if(curr.end > pre.end){
        		pre.end = curr.end;
        	}
        	++i;
        }
        return result;
    }
    public static class CustomComparator implements Comparator<Interval> {        
        public int compare(Interval i1, Interval i2) {
            if(i1.start == i2.start){
                return 0;
            }
            else if(i1.start > i2.start){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
    public static void main(String[] args){
    	ArrayList<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(new Interval(1,4));
    	intervals.add(new Interval(1,4));
		System.out.println();
    	for(Interval i : intervals){
    		System.out.print(i.start);
    		System.out.print(i.end+" ");
    	}
    	
    	Collections.sort(intervals, new CustomComparator());
		System.out.println();
    	for(Interval i : intervals){
    		System.out.print(i.start);
    		System.out.print( i.end + " ");
    	}
    	
    }
}
