package org.sdk.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtils {

    public static void saveFile(String content, String path) throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH:mm:ss");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String file = path + dateTimeFormatter.format(currentDateTime) + ".txt";
        Files.write( Paths.get(file), content.getBytes());

    }
}
