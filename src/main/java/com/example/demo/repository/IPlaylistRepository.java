package com.example.demo.repository;

import com.example.demo.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPlaylistRepository extends PagingAndSortingRepository<PlayList, Long> {
}
