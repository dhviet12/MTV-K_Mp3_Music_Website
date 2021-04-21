package com.example.demo.controller;

import com.example.demo.service.commentSong.ICommentSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentSongController {
    @Autowired
    ICommentSongService commentSongService;

}
