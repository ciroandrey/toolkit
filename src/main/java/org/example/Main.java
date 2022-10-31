package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String testerString = "o rato roeu a roupa do rei de roma";

        System.out.println(stringSplitter("o rato roeu a roupa do rei de roma", 10));
        saveFile(testerString,"/home/ciro/Downloads/");
    }

    private static List<String> stringSplitter(String stringToSplit, int bytes) {

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

    private static void saveFile(String content, String path) throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String file = path + dateTimeFormatter.format(currentDateTime) + ".txt";
        Files.write( Paths.get(file), content.getBytes());

    }
}