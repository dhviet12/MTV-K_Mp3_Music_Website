package com.example.demo.controller;

import com.example.demo.model.LikePlayList;
import com.example.demo.model.LikeSong;
import com.example.demo.model.PlayList;
import com.example.demo.model.Song;
import com.example.demo.model.user.response.ResponseMessage;
import com.example.demo.service.likePlaylist.ILikePlaylistService;
import com.example.demo.service.playlist.IPlaylistService;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/likePlaylist")
@CrossOrigin("*")
public class LikePlaylistController {
    @Autowired
    private ILikePlaylistService likePlaylistService;

    @Autowired
    IPlaylistService playlistService;

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findLike(@PathVariable Long id) {
        LikePlayList likePlayList = likePlaylistService.findById(id);
        return new ResponseEntity<>(likePlayList, HttpStatus.OK);
    }

    @PostMapping("/like")
    public ResponseEntity<?> like(@RequestBody LikePlayList likePlayList) {
        return new ResponseEntity<>(likePlaylistService.save(likePlayList), HttpStatus.CREATED);
    }

    @DeleteMapping("/unlike/{id}")
    public ResponseEntity<?> unlike(@PathVariable Long id) {
        likePlaylistService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
