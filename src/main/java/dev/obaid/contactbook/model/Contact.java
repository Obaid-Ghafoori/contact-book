package dev.obaid.contactbook.model;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private  String name;
    private  String phoneNumber;
    private Optional<String> email;



}
