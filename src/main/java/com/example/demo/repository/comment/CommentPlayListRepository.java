package com.example.demo.repository.comment;

import com.example.demo.model.comment.CommentOfPlayList;
import com.example.demo.model.comment.CommentOfSong;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentPlayListRepository extends CrudRepository<CommentOfPlayList, Long> {
//    @Query(value = "select * from comment_of_song where song_id = ?", nativeQuery = true)
    List<CommentOfPlayList> getAllByPlayListId(Long id);
}