package com.example.demo.model;

import com.example.demo.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameSong;
    private String description;
    private String fileMp3;
    private String fileImage;
    private String author;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private Long view;
    @ManyToMany(mappedBy = "songs")
    private List<Singer> singer;
    @ManyToOne
    private User CreateBy;
    @ManyToOne
    private Category category;
    @OneToMany
    @JsonIgnore
    private List<Like> likes;
    @OneToMany
    private List<CommentOfSong> comments;

    public Song() {
    }

    public Song(Long id, String nameSong, String description, String fileMp3, String fileImage, String author, Timestamp createdTime, Timestamp updatedTime, Long view, List<Singer> singer, User createBy, Category category, List<Like> likes, List<CommentOfSong> comments) {
        this.id = id;
        this.nameSong = nameSong;
        this.description = description;
        this.fileMp3 = fileMp3;
        this.fileImage = fileImage;
        this.author = author;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.view = view;
        this.singer = singer;
        CreateBy = createBy;
        this.category = category;
        this.likes = likes;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileMp3() {
        return fileMp3;
    }

    public void setFileMp3(String fileMp3) {
        this.fileMp3 = fileMp3;
    }

    public String getFileImage() {
        return fileImage;
    }

    public void setFileImage(String fileImage) {
        this.fileImage = fileImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getView() {
        return view;
    }

    public void setView(Long view) {
        this.view = view;
    }

    public List<Singer> getSinger() {
        return singer;
    }

    public void setSinger(List<Singer> singer) {
        this.singer = singer;
    }

    public User getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(User createBy) {
        CreateBy = createBy;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<CommentOfSong> getComments() {
        return comments;
    }

    public void setComments(List<CommentOfSong> comments) {
        this.comments = comments;
    }
}
