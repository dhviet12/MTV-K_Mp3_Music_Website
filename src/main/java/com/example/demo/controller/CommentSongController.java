package com.example.demo.controller;

import com.example.demo.model.CommentOfSong;
import com.example.demo.model.Song;
import com.example.demo.model.user.User;
import com.example.demo.service.ISongService;
import com.example.demo.service.SongServiceImp;
import com.example.demo.service.commentSong.ICommentSongService;
import com.example.demo.service.user.IUserService;
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

    @Autowired
    SongServiceImp songServiceImp;

    @Autowired
    IUserService userService;



    @GetMapping("")
    public ResponseEntity<List<CommentOfSong>>list(){
        List<CommentOfSong> commentOfSong = commentSongService.findAll();
        return new ResponseEntity(commentOfSong, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<List<CommentOfSong>>post(@RequestBody CommentOfSong commentOfSong){
        User user = userService.getCurrentUser();
//        Song song = songServiceImp.findById(id);
//        commentOfSong.setSong(song);
        commentOfSong.setUser(user);
        commentSongService.save(commentOfSong);
        return new ResponseEntity(commentOfSong,HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<CommentOfSong>update(@RequestBody CommentOfSong commentOfSong, @PathVariable Long id){
        commentOfSong.setId(id);
        String user = String.valueOf(userService.getCurrentUser());
        String users = commentSongService.findById(id).getUser().getUsername();
        boolean us= users.equals(user);
        if (us){
            commentSongService.save(commentOfSong);
            return new ResponseEntity<>(HttpStatus.OK);
        }else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CommentOfSong>delete(@PathVariable Long id){
        String user = String.valueOf(userService.getCurrentUser());
        String users = commentSongService.findById(id).getUser().getUsername();
        boolean us = users.equals(user);
        if (us){
            commentSongService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentOfSong>detail(@PathVariable Long id){
        CommentOfSong commentOfSong = commentSongService.findById(id);
        return  new ResponseEntity<>(commentOfSong,HttpStatus.OK);
    }

}
