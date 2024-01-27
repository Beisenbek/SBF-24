package kz.kbtu.backend.controller;

import kz.kbtu.backend.model.ColorPrinter;
import kz.kbtu.backend.model.D3ColorPrinter;
import kz.kbtu.backend.model.Greeting;
import kz.kbtu.backend.service.GreetingService;
import kz.kbtu.backend.service.PrinterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrinterController {

    private final PrinterService printerService;

    @GetMapping("/print")
    public String print(@RequestParam(value = "text", defaultValue = "World") String text) {
        printerService.print(text);
        return "test";
    }
}