package com.dspray.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dspray.api.collections.Announce;
import com.dspray.api.dto.AnnouncePostDto;
import com.dspray.api.services.AnnouncesService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/announces")
public class AnnouncesController {
    
    private AnnouncesService _announcesService;

    public AnnouncesController(AnnouncesService announcesService) {
        this._announcesService = announcesService;
    }

    @GetMapping
    public ResponseEntity<List<Announce>> announcesList()  {
        return ResponseEntity.ok().body(this._announcesService.getAnnounces());
    }

    @PostMapping
    public ResponseEntity<?> createAnnounces(@RequestBody AnnouncePostDto announceDto) {
        return ResponseEntity.ok().body(this._announcesService.createAnnounce(announceDto));    
    }
}
