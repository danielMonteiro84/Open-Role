package br.com.danielmonteiro.open_role.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "^[A-Za-z0-9._]{3,20}$", message = "Username must be between 3 and 20 characters long and can only contain letters, numbers, periods, and underscores")
    private String username;

    @Email(message = "Please, insert a valid e-mail")
    private String email;

    @Length(min = 6, max = 100)
    private String password;
    private String description;
    private String curriculum;
}