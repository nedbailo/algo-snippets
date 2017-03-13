package problems;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ilya on 3/3/2017.
 * This class solves the problem of determining whether all characters in the string are unique
 */
//TODO:complete
public class AllUniqueChars {
    public boolean checkIfAllUniqueUsingSet(String s){
        Set characters = new HashSet();
        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (!characters.add(c)){
                return false;
            }
        }
        return true;
    }

    public boolean checkIfAllUniqueUsingSetWithoutAdditionalDataStructures(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 2; i++){
            if (charArray[i] == charArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
