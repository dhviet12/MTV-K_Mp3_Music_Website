package com.example.demo.model;

import com.example.demo.model.user.User;

import javax.persistence.*;

@Entity
public class LikePlaylist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private PlayList playList;

    public LikePlaylist() {
    }

    public LikePlaylist(User user, PlayList playList) {
        this.user = user;
        this.playList = playList;
    }

    public LikePlaylist(Long id, User user, PlayList playList) {
        this.id = id;
        this.user = user;
        this.playList = playList;
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

    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
}
