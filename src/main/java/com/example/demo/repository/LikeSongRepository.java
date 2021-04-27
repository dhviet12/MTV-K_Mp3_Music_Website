package com.example.demo.repository;

import com.example.demo.model.LikeSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LikeSongRepository extends JpaRepository<LikeSong,Long> {


}
