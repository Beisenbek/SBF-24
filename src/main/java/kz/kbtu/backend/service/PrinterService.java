package kz.kbtu.backend.service;

import kz.kbtu.backend.model.BWPrinter;
import kz.kbtu.backend.model.ColorPrinter;
import kz.kbtu.backend.model.IPrintable;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PrinterService {
    private  final IPrintable printer;
    public void print(String text) {
        printer.print(text);
    }
}
