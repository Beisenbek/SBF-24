package kz.kbtu.backend.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BWPrinter implements IPrintable {
    @Override
    public void print(String text) {
        log.info(String.format("black-white text: %s", text));
    }
}
