package com.example.demo.service.playlist;

import com.example.demo.model.PlayList;
import com.example.demo.repository.IPlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService implements IPlaylistService {

    @Autowired
    IPlaylistRepository playlistRepository;

    @Override
    public List<PlayList> findAll() {
        return playlistRepository.findAll();
    }

    @Override
    public PlayList findById(Long id) {
        return playlistRepository.findById(id).get();
    }

    @Override
    public PlayList save(PlayList playList) {
        return playlistRepository.save(playList);
    }

    @Override
    public void delete(Long id) {
        playlistRepository.deleteById(id);
    }

    @Override
    public List<PlayList> getAllByCreatedById(Long id) {
        return playlistRepository.getAllByCreatedById(id);
    }
}
