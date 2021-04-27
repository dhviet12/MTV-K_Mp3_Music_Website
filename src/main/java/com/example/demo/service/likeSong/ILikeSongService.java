package com.example.demo.service.likeSong;

import com.example.demo.model.LikeSong;

public interface ILikeSongService {
    LikeSong save (LikeSong likeSong);
    void delete(Long id);

}
