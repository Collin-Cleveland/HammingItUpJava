package src.main.zipcode;

import java.util.ArrayList;
import java.util.List;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        if (!(s.length() == s1.length())){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        else {
            this.s = s;
            this.s1 = s1;
        }
    }

    public int getHammingDistance() {
        int count = 0;
        List<String> sArrList = new ArrayList<>(List.of(s.split("")));
        List<String> s1ArrList = new ArrayList<>(List.of(s1.split("")));

        for (int i = 0; i < s.length(); i++){
            if (!sArrList.get(i).equals(s1ArrList.get(i))){
                count++;
            }
        }
        return count;
    }
}
