package com.example.demo.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameSong;
    private String description;
    private String fileMp3;
    private String avatar;
    private String author;
    @ManyToMany
    private List<Singer> singer;
    @ManyToOne
    private User poster;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Like> likes;
    @OneToMany
    private List<CommentOfSong> comments;

    public Song() {
    }

    public Song(Long id, String nameSong, String description, String fileMp3, String avatar, String author, List<Singer> singer, User poster, Category category, List<Like> likes, List<CommentOfSong> comments) {
        this.id = id;
        this.nameSong = nameSong;
        this.description = description;
        this.fileMp3 = fileMp3;
        this.avatar = avatar;
        this.author = author;
        this.singer = singer;
        this.poster = poster;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Singer> getSinger() {
        return singer;
    }

    public void setSinger(List<Singer> singer) {
        this.singer = singer;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
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
