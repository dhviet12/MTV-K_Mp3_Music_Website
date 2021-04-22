package com.example.demo.repository;

import com.example.demo.model.CommentOfSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentSongRepository extends JpaRepository<CommentOfSong,Long> {
}
