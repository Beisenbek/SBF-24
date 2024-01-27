package kz.kbtu.backend.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ColorPrinter implements IPrintable {
    @Override
    public void print(String text) {
        log.info(String.format("color text: %s", text));
    }
}

