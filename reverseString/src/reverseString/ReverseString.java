package reverseString;

/*Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".*/

public class ReverseString 
{
	public static void main(String[] args)
	{
		System.out.println(reverseString("apple banana cine"));

	}
	
	public static String reverseString(String s)
    {
        char[] s1 = s.toCharArray();
        String newStr = new String();
        
        int i = 0;
    	int j = s1.length - i - 1;
        while(i < j)
        {
        	char temp = 0;

        	temp = s1[i];
        	s1[i] = s1[j];
        	s1[j] = temp;
        	
        	i ++;
        	j = s1.length - i - 1;
        }
        
        newStr = String.valueOf(s1);
        return newStr;
    }
}

