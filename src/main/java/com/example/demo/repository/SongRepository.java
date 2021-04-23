package com.example.demo.repository;

import com.example.demo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    @Query(value = "select * from song order by creation_time desc limit 10", nativeQuery = true)
    List<Song> findAllByCreationTimeOrderByCreationTime();
    @Query(value = "select * from song order by number_of_view desc limit 10", nativeQuery = true)
    List<Song> findAllByNumberOfViewOrderByNumberOfView();

    @Query(value = "select * from song where song.name_song like ?", nativeQuery = true)
    List<Song> findAllByNameSong(String nameSong);

}
