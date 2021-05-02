package com.example.demo.controller;

import com.example.demo.model.PlayList;
import com.example.demo.service.playlist.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PlayList>> getAllPlayList(){
        List<PlayList> playLists = playlistService.findAll();
        if( playLists.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(playLists,HttpStatus.OK);
    }

    @GetMapping(value = "/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PlayList>> getAllPlayListByUser(@PathVariable Long id){
        List<PlayList> playLists = playlistService.getAllByCreatedById(id);
        if( playLists.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(playLists,HttpStatus.OK);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayList playList){
        Timestamp createdTime = new Timestamp(System.currentTimeMillis());
        playList.setTimeCreate(createdTime);
        playlistService.save(playList);
        return new ResponseEntity<>(playList, HttpStatus.CREATED);
    }

    @PutMapping(value = "/edit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PlayList> editPlayList(@PathVariable Long id, @RequestBody PlayList playList) {
        Timestamp updatedTime = new Timestamp(System.currentTimeMillis());
        playList.setTimeUpdate(updatedTime);
        playList.setId(id);
        playlistService.save(playList);
        return new ResponseEntity<>(playList, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deletePlayList(@PathVariable Long id) {
        playlistService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
