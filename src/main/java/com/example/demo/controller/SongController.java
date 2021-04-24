package com.example.demo.controller;

import com.example.demo.model.Song;
import com.example.demo.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SongController {
    @Autowired
    private ISongService songService;

    @RequestMapping(value = "/songs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Song>> getAllSong() {
        List<Song> songList = songService.getAll();
        if (songList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(songList, HttpStatus.OK);
    }

    @GetMapping(value = "/song/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Song> detailSong(@PathVariable Long id) {
        Song song = songService.findById(id);
        if (song == null) {
            System.out.println("Song with id : " + id + "not found");
            return new ResponseEntity<Song>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @PostMapping(value = "/create-song", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Song> createSong(@RequestBody Song song) {
        songService.save(song);
        return new ResponseEntity<Song>(song, HttpStatus.CREATED);
    }

    @PutMapping(value = "/edit-song/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Song> editSong(@PathVariable Long id, @RequestBody Song song) {
        song.setId(id);
        songService.save(song);
        return new ResponseEntity<>(song, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete-song/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
