import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s: array)
        {
            if(s.equals(value))
                return true;
        }
        return false;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) 
    {
        for (int i =0;i<array.length/2;i++)
        {
            String temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i =0; i<array.length/2; i++)
        {
            if (array[i] != array[(array.length -1) -i])
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean [26];
        int index = 0;
        String str = new String();
        for (int i=0;i<array.length;i++)
        {
            str = str.concat(array[i]);
        }

        for (int j=0;j<str.length();j++)
        {

            if ('A' <= str.charAt(j) && str.charAt(j) <= 'Z')
            { 
                index = str.charAt(j) - 'A';
            }
            else if ('a' <=str.charAt(j) && str.charAt(j) <= 'z')
            {
                index = str.charAt(j) - 'a';
            }
            mark[index] = true;
        }

        for (int l=0;l<26;l++)
        {
            if (mark[l] == false)
                return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (int i=0;i<array.length;i++)
        {
            if (array[i] == value)
            {
                counter++;  
            } 
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) 
    {
        String [] retArr = new String[array.length-1];
        int index = 0;

        for (int i = 0;i<array.length;i++)
        {
            if(array[i] != valueToRemove)
            {
                retArr[index] = array[i];
                index++;
            }
        }
        return retArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) 
    {
        ArrayList <String> retArr = new ArrayList <String>();

        retArr.add(array[0]);
        for (int i = 1; i< array.length;i++)
        {
            if(array[i-1] != array[i])
            {
                retArr.add(array[i]);
            }
        }
        
        String[] finArr = retArr.toArray(new String[0]);

        return finArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        
        ArrayList<String> packArr = new ArrayList<String>();
        String str = new String(array[0]);
        
        for (int i=1; i<array.length; i++)
        {
            if(array[i-1] == array[i])
            {
               str = str+array[i];
              // packArr.add(array[i]);
            }
            else
            {
                packArr.add(str);
                str = array[i];
            }
            
        }
        
        packArr.add(str);
        
        String[] finArr = packArr.toArray(new String[packArr.size()]);

        return finArr;
    }

}
