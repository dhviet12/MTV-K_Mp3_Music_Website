package com.example.demo.service.likePlaylist;

import com.example.demo.model.LikePlayList;
import com.example.demo.repository.LikePlayListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaylistService implements ILikePlaylistService{

    @Autowired
    private LikePlayListRepository likePlayListRepository;

    @Override
    public List<LikePlayList> findAll() {
        return null;
    }

    @Override
    public LikePlayList findById(Long id) {
        return likePlayListRepository.findLikePlayListById(id);
    }

    @Override
    public LikePlayList save(LikePlayList likePlayList) {
        return likePlayListRepository.save(likePlayList);
    }

    @Override
    public void delete(Long id) {
        likePlayListRepository.deleteLikePlayList(id);
    }
}
