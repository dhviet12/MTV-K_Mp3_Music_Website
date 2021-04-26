package com.example.demo.repository;

import com.example.demo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    //Top 10 bai hat moi nhat
    @Query(value = "select * from song order by created_time desc limit 10", nativeQuery = true)
    List<Song> findAllByCreatedTimeOrderByCreatedTime();
    //Top 10 bai hat theo luot xem
    @Query(value = "select * from song order by number_of_view desc limit 10", nativeQuery = true)
    List<Song> findAllByNumberOfViewOrderByNumberOfView();

    @Query(value = "select * from song where song.name_song like ?", nativeQuery = true)
    List<Song> findAllByNameSong(String nameSong);

}
