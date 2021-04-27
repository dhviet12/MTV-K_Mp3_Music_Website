package com.example.demo.model.comment;

import com.example.demo.model.PlayList;
import com.example.demo.model.Song;
import com.example.demo.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CommentOfPlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    @JsonIgnore
    private User user;
    @ManyToOne
    private PlayList playList;

    public CommentOfPlayList() {
    }

    public CommentOfPlayList(Long id, String content, User user, PlayList playList) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.playList = playList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
}
