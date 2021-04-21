package com.example.demo.model;

import com.example.demo.model.user.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Song> songs;
    private String kindOfMusic;
    private Date timeCreate;
    private String description;
    @ManyToOne
    private User user;
    private Date timeUpdate;
    private int view;

    public PlayList() {
    }

    public PlayList(Long id, String name, List<Song> song, String kindOfMusic, Date timeCreate, String description, User user, Date timeUpdate, int view) {
        this.id = id;
        this.name = name;
        this.songs = song;
        this.kindOfMusic = kindOfMusic;
        this.timeCreate = timeCreate;
        this.description = description;
        this.user = user;
        this.timeUpdate = timeUpdate;
        this.view = view;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSong() {
        return songs;
    }

    public void setSong(List<Song> song) {
        this.songs = song;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Date timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
