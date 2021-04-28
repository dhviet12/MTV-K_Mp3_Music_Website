package com.example.demo.repository;

import com.example.demo.model.PlayList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPlaylistRepository extends PagingAndSortingRepository<PlayList, Long> {

    List<PlayList> findAllByUserUsername(String username);
}

