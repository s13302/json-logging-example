package pl.devsoftware.jsonloggingexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.devsoftware.jsonloggingexample.dto.MessageDTO;

@RestController
public class HelloController {

    @GetMapping("/")
    public MessageDTO hello() {
        return new MessageDTO("Hello world");
    }

    @GetMapping("/secured")
    public MessageDTO securedHello() {
        return new MessageDTO("Hello secured");
    }

}
