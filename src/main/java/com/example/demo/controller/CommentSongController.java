package com.example.demo.controller;

import com.example.demo.model.CommentOfSong;
import com.example.demo.service.commentSong.ICommentSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/commentSong")
@CrossOrigin("*")
public class CommentSongController {
    @Autowired
    ICommentSongService commentSongService;

    @GetMapping("")
    public ResponseEntity<List<CommentOfSong>>list(){
        List<CommentOfSong> commentOfSong = commentSongService.findAll();
        return new ResponseEntity(commentOfSong, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<List<CommentOfSong>>post(@RequestBody CommentOfSong commentOfSong){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<CommentOfSong>postComment(@RequestBody CommentOfSong commentOfSong, @PathVariable Long id ,@PathVariable String username){
        commentOfSong.setId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
