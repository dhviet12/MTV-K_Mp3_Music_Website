package com.example.demo.model;

import com.example.demo.model.user.User;

import javax.persistence.*;

@Entity
public class LikeSong {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Song song;

    public LikeSong() {
    }

    public LikeSong(Long id, User user, Song song) {
        this.id = id;
        this.user = user;
        this.song = song;
    }

    public LikeSong(User user, Song song) {
        this.user = user;
        this.song = song;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
