package com.example.demo.repository;

import com.example.demo.model.LikePlayList;
import com.example.demo.model.LikeSong;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface LikePlayListRepository extends CrudRepository<LikePlayListRepository , Long> {
    LikePlayList findLikePlayListById(Long id);

    @Modifying
    @Transactional
    @Query(value = "delete from like_playlist where playlist_id = ?1 ; ", nativeQuery = true)
    void deleteLikePlayList (Long id);
}
