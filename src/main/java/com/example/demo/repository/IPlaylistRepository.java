package com.example.demo.repository;

import com.example.demo.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IPlaylistRepository extends JpaRepository<PlayList, Long> {

    List<PlayList> getAllByCreatedById(Long id);
}

