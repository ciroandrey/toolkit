package org.example.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static List<String> stringSplitter(String stringToSplit, int bytes) {

        List<String> resultList = new ArrayList<String>();
        String chunk = "";
        int charStart = 0;
        int finalChar = stringToSplit.length() - 1;

        for (char character : stringToSplit.toCharArray()) {

            if (charStart == finalChar) {
                chunk = chunk + character;
                resultList.add(chunk);
            }
            else if (chunk.length() < bytes - 1) {
                chunk = chunk + character;
            }
            else if (chunk.length() == bytes - 1) {
                chunk = chunk + character;
                resultList.add(chunk);
                chunk = new String();
            }
            else {
                chunk = chunk + character;
                resultList.add(chunk);
            }

            charStart++;

        }
        return resultList;
    }
}
