package com.example.sbme.controllers;

import com.example.sbme.models.Note;
import com.example.sbme.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @PostMapping("/notes")
    public Note create(@RequestBody() Note note){
        note.setId(UUID.randomUUID().toString());
        return noteRepository.save(note);
    }
    @GetMapping("/notes")
    public List<Note> getAll(){
        return noteRepository.findAll();
    }
}
