package pl.devsoftware.jsonloggingexample.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Value
@AllArgsConstructor
public class MessageDTO {

    @Getter
    private final String message;

}
