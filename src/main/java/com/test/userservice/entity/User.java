package com.test.userservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 0, message = "The age cannot be less than 0")
    @Max(value = 120, message = "The age cannot be greater than 120")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    //@NotBlank(message = "Age is mandatory")
    private int age;

    @Email(message = "Email is not valid")
    @NotBlank(message = "Email is mandatory")
    private String email;


}
