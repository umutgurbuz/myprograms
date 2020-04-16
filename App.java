import java.util.*; 
/*
 * 
 * 	This program finds the largest k unique character sequence in a string. k is given as the first char at string.
 * 	For example input: 2aabbcbbd returns bbcbb, since it is the longest substring that includes 2 unique character.
 * 
 * 
 */
class Main {

  public static String KUniqueCharacters(String str) {

    String longeString="";
    String toReturn="";
    int count=0;
    int size=Character.getNumericValue(str.charAt(0));
    
    for(int i=1;i<str.length()-1;i++){
    	int j=i;
    	while(count<=size && j<str.length()) {
    		if(longeString.indexOf(str.charAt(j))<0) {
    			
    			if(count!=size) {
    			longeString = longeString + str.charAt(j);
    			//System.out.println("if "+ j);
    			}
    			count++;
    		}
    		else {
    			longeString = longeString + str.charAt(j);
    			//System.out.println("else "+ j);

    		}	
    		
    		j++;
    	}
    	if(longeString.length()>toReturn.length()) {
    		toReturn=longeString;
    	}
    	count=0;
    	longeString="";   	
    }
    return toReturn;
  }	

  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(KUniqueCharacters(s.nextLine())); 
    s.close();
  }

  }

