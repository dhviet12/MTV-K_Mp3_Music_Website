package com.example.demo.service.playlist;

import com.example.demo.model.PlayList;
import com.example.demo.service.IService;

import java.util.List;

public interface IPlaylistService extends IService<PlayList> {
    List<PlayList> getAllByCreatedById(Long id);
}
