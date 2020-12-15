package com.lv.filehandler.impl;

import com.lv.filehandler.FileHandlerCommands;

import java.util.List;

public class SkipStopWords implements FileHandlerCommands {
    List<String> text;

    public SkipStopWords(List<String> text, String arg) {
        System.out.println("ARG: " + arg);
        this.text = text;
    }

    @Override
    public int count() {
        return 0;
    }
}
