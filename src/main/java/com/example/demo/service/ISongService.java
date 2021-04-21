package com.example.demo.service;

import com.example.demo.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> getAll();
    Song save(Song song);
    Song findById(Long id);
    void deleteSong(Long id);
}
