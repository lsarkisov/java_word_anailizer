package com.lv.filehandler.impl;

import com.lv.filehandler.FileHandlerCommands;

import java.util.List;

public class CountFileWords implements FileHandlerCommands {
    List<String> text;

    public CountFileWords(List<String> text) {
        this.text = text;
    }

    @Override
    public int count() {
        return text.stream().mapToInt(t -> (int) t.split("\\s").length).sum();
    }
}
