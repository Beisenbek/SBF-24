package kz.kbtu.backend.service;

import kz.kbtu.backend.model.BWPrinter;
import kz.kbtu.backend.model.ColorPrinter;
import kz.kbtu.backend.model.IPrintable;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class PrinterService {
    private  final IPrintable printer;
    public void print(String text) {
        printer.print(text);
    }

    @EventListener
    public void someFunction(String message){
        printer.print(message);
    }

    @EventListener
    public void someFunction(Integer message){
        printer.print(message.toString());
    }

}
