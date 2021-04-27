package com.example.demo.repository.comment;

import com.example.demo.model.comment.CommentOfPlayList;
import org.springframework.data.repository.CrudRepository;

public interface CommentPlayListRepository extends CrudRepository<CommentOfPlayList, Long> {

}
