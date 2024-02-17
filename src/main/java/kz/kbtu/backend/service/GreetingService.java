package kz.kbtu.backend.service;

import kz.kbtu.backend.model.Greeting;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@RequiredArgsConstructor
public class GreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final ApplicationEventPublisher applicationEventPublisher;

    public Greeting generateGreeting(String name){
        applicationEventPublisher.publishEvent("hello from Greeting Service!");
        applicationEventPublisher.publishEvent(123);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
