package com.lv;

import com.lv.filehandler.FileHandler;
import com.lv.filehandler.FileHandlerValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/*Word Counter

        Create console Data analyzer utility which: accepts as command line parameters:



        - (must) local file system path to a *.txt file(s)

        - (must) data command(s)





        supports the following data processing commands:

        Application should count all words in the provided file and support following options.

        - (must) (-F) file name(s)

        - (must) (-S) words counter should support "stopwords" option. "Stopwords" are words which will not be counted.
        For example we need to exclude English articles (a, the) and
        preposition words (at, on etc.) or any other words

        - (must) (-C) count number of characters in the file

        - (nice to have)(-L) count words which start with a Capital letter



        Data processing results should be printed to output for each file separately and for all resources as total.

        Unit testing is not required, but is a nice to have.

        Also it would be nice if it will be built with maven





        Command line parameters example for Java implementation:

        java –jar scraper.jar -F sample.txt –C -S=a*/

public class Application {
    public static void main(String[] args) {

        final boolean isValid = FileHandlerValidation.validate(args);

        if (isValid) {
            final Scanner scanner = new Scanner(System.in);
            final Map<String, Integer> handle = FileHandler.handle(scanner, args);
            handle.forEach((K, V) -> {
                System.out.println("Key: " + K + ", Val: " + V);
            });
        } else {
            System.out.println("The arguments wrong...");
        }

    }
}
