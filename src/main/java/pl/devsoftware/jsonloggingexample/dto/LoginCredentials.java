package pl.devsoftware.jsonloggingexample.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class LoginCredentials {

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

}
