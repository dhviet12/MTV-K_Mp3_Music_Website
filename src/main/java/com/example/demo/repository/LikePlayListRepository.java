package com.example.demo.repository;

import com.example.demo.model.LikePlayList;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
public interface LikePlayListRepository extends CrudRepository<LikePlayList , Long> {
    LikePlayList findLikePlayListById(Long id);
}
