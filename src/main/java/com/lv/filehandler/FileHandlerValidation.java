package com.lv.filehandler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandlerValidation {
    public static List<String> commands = Arrays.asList("-F", "-S", "-C", "-L");

    static public boolean validate(String[] args) {
        if(args.length < 2) {
            return false;
        }

        final String[] splited = args[0].split("\\.");

        if (!splited[splited.length -1].equals("txt")) {
            return false;
        }

        final List<String> selectedCommands = commands.stream().filter(command -> {
            for (int i = 1; i < args.length; i++) {
                if (command.equals(args[i])) {
                    return true;
                }
            }
            return false;
        }).collect(Collectors.toList());


        if (selectedCommands.size() < 1) {
            return false;
        }

        return true;
    }
}
