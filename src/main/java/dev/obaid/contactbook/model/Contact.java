package dev.obaid.contactbook.model;

import lombok.*;

import java.util.Optional;


@Builder
@Data
@ToString(exclude = "email")
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private  String name;
    private  String phoneNumber;
    private Optional<String> email;



}
