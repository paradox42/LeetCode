package inverseVowel;

public class Solution 
{
    public String reverseVowels(String s) 
    {
        char[] c = s.toCharArray();
        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++)
        {
            if(isVowel(s.charAt(i)))
            {
            	boolean flag = true;
                while(j >= i)
                {
                    if(isVowel(s.charAt(j)) && flag)
                    {
                        char temp;
                        temp = c[i];
                        c[i] = c[j];
                        c[j] = temp;
                        flag = false;
                    }
                    j--;
                }
            }
        }
        String newStr = new String(c);
        return newStr;
    }
    
    public static boolean isVowel(char c)
    {
        char[] vowels = new char[] {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0; i < 10; i++)
        {
            if(vowels[i] == c)
                return true;
        }
        return false;
    }
}