package kz.kbtu.backend.config;

import kz.kbtu.backend.model.BWPrinter;
import kz.kbtu.backend.model.ColorPrinter;
import kz.kbtu.backend.model.D3ColorPrinter;
import kz.kbtu.backend.model.IPrintable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {

    @Value("${server.port}")
    private String port;
    @Bean
    IPrintable getPrinter() {
       if(port.contains("8080"))
            return new ColorPrinter();
       return new D3ColorPrinter();
    }
}
