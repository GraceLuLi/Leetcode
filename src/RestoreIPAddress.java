import java.util.ArrayList;

public class RestoreIPAddress {
    public static ArrayList<String> restoreIpAddresses(String s) {  	
    	ArrayList<String> result = new ArrayList<String>();
    	if(s == null || s.length() == 0){
    		return result;
    	}
    	getIP(s, 4, "", result);
    	return result;
    }
    public static void getIP(String s, int num, String tmp, ArrayList<String> result){
    	//num means s need to be separated into  num parts 
    	int len = s.length();
    	if(len == 0 && num == 0){
    		result.add(tmp);
    		return;
    	}
    	if(len > 3*num || len < num){
    		return;
    	}
    	if(tmp.length() != 0){
    		tmp += '.';
    	}

    	String newPart;
    	for(int i = 1; i <= 3; ++i){
    		if(i <= len){
    			newPart = s.substring(0,i);
    			int newPartInt = Integer.parseInt(newPart);
    			if( newPartInt < 0 || newPartInt > 255){
    				continue;
    			}
        		getIP(s.substring(i), num-1, tmp+newPart, result);
                if(i == 1 && newPart.equals("0")){
        			break;
        		}
    		}
    	}
    }
    public static void main(String[] args){
    	ArrayList<String> list = restoreIpAddresses("0000");
    	for(String a : list){
        	System.out.println(a);
    	}
    }
}
