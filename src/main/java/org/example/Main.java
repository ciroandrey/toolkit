package org.example;

import java.io.IOException;

import static org.example.utils.FileUtils.saveFile;
import static org.example.utils.StringUtils.stringSplitter;

public class Main {
    public static void main(String[] args) throws IOException {
        String testerString = "o rato roeu a roupa do rei de roma";

        System.out.println(stringSplitter("o rato roeu a roupa do rei de roma", 10));
        saveFile(testerString,"/home/ciro/Downloads/");
    }
}