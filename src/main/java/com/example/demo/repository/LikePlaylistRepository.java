package com.example.demo.repository;

import com.example.demo.model.LikePlaylist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikePlaylistRepository extends JpaRepository<LikePlaylist,Long> {
}
