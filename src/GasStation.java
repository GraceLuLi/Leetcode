
public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	int len = gas.length;
        int[] balance = new int[len];
        for(int i = 0; i < len; ++i){
        	balance[i] = gas[i] - cost[i];
        }
        int[] starts = new int[len];
        int index = 0;
        for(int i = 0; i < len; i++){
        	while(i < len && balance[i] < 0){
        		++i;
        	}
        	if(i == len){
        		break;
        	}
        	starts[index] = i;
        	++index;
        	while(i < len && balance[i] > 0){
        		++i;
        	}
        }
        int startIndex, sum;
        while(index > 0){
        	--index;
        	startIndex = starts[index];
        	sum = 0;
        	int i = startIndex;
        	while(true){
        		sum += balance[i];
        		if(sum < 0){
        			break;
        		}
        		++i;
        		if(i == len){
        			i = 0;  // make it a circle
        		}
        		if(i == startIndex){
        			return startIndex;
        		}
        	}
        }
        return -1;
    }
    
    public static void main(String[] args){
    	int[] gas = new int[]{2};
    	int[] cost = new int[]{2};
    	int r = canCompleteCircuit(gas, cost);
    	System.out.print(r);
    }
}
