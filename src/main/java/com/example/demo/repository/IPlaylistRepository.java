package com.example.demo.repository;

import com.example.demo.model.PlayList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistRepository extends PagingAndSortingRepository<PlayList, Long> {
}
