package com.example.demo.model.comment;

import com.example.demo.model.Song;
import com.example.demo.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CommentOfSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToOne
    private User createdBy;
    @ManyToOne
    private Song song;

    public CommentOfSong() {
    }

    public CommentOfSong(Long id, String content, User createdBy, Song song) {
        this.id = id;
        this.content = content;
        this.createdBy = createdBy;
        this.song = song;
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

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
