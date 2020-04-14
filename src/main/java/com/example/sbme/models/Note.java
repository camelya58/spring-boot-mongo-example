package com.example.sbme.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "notes")
public class Note {

    @Id
    private String id;

    private String title;
    private String content;
}
