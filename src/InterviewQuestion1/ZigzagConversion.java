package InterviewQuestion1;

public class ZigzagConversion {
	
	    public String convert(String s, int numRows) {
	        
	        
	        int n = s.length();
	        
	        if(numRows < 2) // if numsRows < 2 means we have to return same string as it is.
	        { 
	            return s;
	        }
	        
	        int col = numRows + numRows - 2; // total number of character has been passed after reaching at same row
	        
	        int t = col; // t will give the flexiblity to help which char will come in each level
	        
	        StringBuilder sb = new StringBuilder(); 
	        
	        for(int i = 0; i < numRows; i++) 
	        {
	            
	            for(int j = i; j < n; j = j + col)
	            {
	                char ch = s.charAt(j);
	                
	                if(i == 0) 
	                {

	                    sb.append(ch);
	                }
	                
	                else
	                {
	                    sb.append(ch); 

	                    if((j + t < n) && (j + t != j))
	                    {
	                        char ch1 = s.charAt(j + t);
	                        sb.append(ch1);
	                    }
	                }
	            }
	            
	            t -= 2; // decreasing t by 2 each time
	        }
	        
	        return sb.toString();
	        
	    }
	}


