package com.lv.filehandler;

import com.lv.filehandler.impl.CountFileWords;
import com.lv.filehandler.impl.SkipStopWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileHandler {
    public static Map<String, Integer> handle(Scanner scanner, String[] args) {
        List<String> text = new ArrayList<>();
        String line;
        Map<String, Integer> result = new HashMap<>();

        try(final BufferedReader sample = new BufferedReader(new FileReader("sample.txt"))) {
            while ((line = sample.readLine()) != null) {
                text.add(line);
            }

            for (int i = 1; i < args.length; i++) {
                if (args[i].equals("-F")) {
                    final FileHandlerCommands r = new CountFileWords(text);
                    result.put("-F", r.count());
                }

                if (args[i].indexOf("-S") != -1) {
                    final FileHandlerCommands r = new SkipStopWords(text, args[i]);
                    result.put("-S", r.count());
                }

                if (args[i].equals("-C")) {

                }

                if (args[i].equals("-L")) {

                }
            }
        } catch(IOException e) {

        }
        return result;
    }
}
