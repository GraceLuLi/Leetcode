import java.util.*;

public class MaxPoints {
    public static int maxPoints(Point[] points) {

    	if(points.length <= 2)
    	{
    		return points.length;
    	}
    	Map<Double, Integer> slopeNumMap;
    	int result = 0;
    	for(int i = 0; i < points.length; i++)
    	{
    		Point anchorPoint = points[i];
    		int samePointCount = 1;
    		int parallelPointCount = 0;
    		slopeNumMap = new HashMap<Double, Integer>();
    	    int maxPointsAnchor = 0;
    		
    		for(int j = i+1; j < points.length; j++)
    		{
    			Point currPoint = points[j];
    			if(currPoint.x == anchorPoint.x && currPoint.y == anchorPoint.y)
    			{
    				samePointCount++;
    			}
    			else if(currPoint.x == anchorPoint.x)
    			{
    				parallelPointCount++;
    			}
    			else
    			{
    				double slope = (((double)currPoint.y) -anchorPoint.y)/(currPoint.x - anchorPoint.x);
    				if(slope == -0)
    				{
    					slope = 0;
    				}
    				if(slopeNumMap.containsKey(slope))
    				{
    					int num = slopeNumMap.get(slope);
    					slopeNumMap.put(slope,num+1 );
    				}
    				else
    				{
    					slopeNumMap.put(slope, 1);
    				}   				
    			}
    		}
            int maxSameSlope = 0;
    		for(int value : slopeNumMap.values())
    		{
    			if(value > maxSameSlope)
    			{
    				maxSameSlope = value;
    			}
    		}
    		maxPointsAnchor = Math.max(maxSameSlope, parallelPointCount) + samePointCount;
        	if(maxPointsAnchor > result)
        	{
        		result = maxPointsAnchor;
        	}
    	}
        return result;
    }
    
    
    public static void main(String[] args){
    	
    	Point a  = new Point(2,3);
    	Point b  = new Point(3,3);
    	Point c  = new Point(-5,3);
    	Point[] points = {a,b,c};
    	//int r = maxPoints(points);
    	//System.out.println(r);
    	
    	Map<Double, Integer>slopeNumMap = new HashMap<Double, Integer>();
    	slopeNumMap.put(0.0, 2);
    	slopeNumMap.put(-0.0, 1);
		for(int value : slopeNumMap.values())
		{
			System.out.println(value);
		}
    }
}
