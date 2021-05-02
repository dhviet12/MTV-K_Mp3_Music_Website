package com.example.demo.model;

import com.example.demo.model.user.User;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class PlayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String fileImage;
    private String description;
    private Timestamp timeCreate;
    private Timestamp timeUpdate;
    private Long view;
    @OneToMany
    private List<Song> songs;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User createdBy;

    public PlayList() {
    }

    public PlayList(Long id, String name, String description, Timestamp timeCreate, Timestamp timeUpdate, Long view, List<Song> songs, Category category, User createdBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timeCreate = timeCreate;
        this.timeUpdate = timeUpdate;
        this.view = view;
        this.songs = songs;
        this.category = category;
        this.createdBy = createdBy;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Timestamp timeCreate) {
        this.timeCreate = timeCreate;
    }

    public Timestamp getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getFileImage() {
        return fileImage;
    }

    public void setFileImage(String fileImage) {
        this.fileImage = fileImage;
    }
}
