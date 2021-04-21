package com.example.demo.repository;

import com.example.demo.model.CommentOfSong;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentSongRepository extends CrudRepository<CommentOfSong,Long> {
}
