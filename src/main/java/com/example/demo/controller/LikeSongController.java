package com.example.demo.controller;

import com.example.demo.model.CommentOfSong;
import com.example.demo.model.LikeSong;
import com.example.demo.model.Song;
import com.example.demo.model.user.User;
import com.example.demo.model.user.response.ResponseMessage;
import com.example.demo.service.SongServiceImp;
import com.example.demo.service.likeSong.LikeSongService;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/likeSong")
public class LikeSongController {
    @Autowired
    LikeSongService likeSongService;

    @Autowired
    UserService userService;

    @Autowired
    SongServiceImp songService;

    @PostMapping("/like/{id}")
    public ResponseEntity<?> like(@RequestBody LikeSong likeSong, @PathVariable Long id) {
        Song song = songService.findById(id);
        if (song == null) {
            return new ResponseEntity<>(new ResponseMessage("Cant find this song"), HttpStatus.BAD_REQUEST);
        }
        likeSong.setSong(song);
        User currentUser = userService.getCurrentUser();
        likeSong.setUser(currentUser);
        return new ResponseEntity<>(likeSongService.save(likeSong), HttpStatus.CREATED);
    }
}
