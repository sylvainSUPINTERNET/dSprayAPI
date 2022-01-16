package com.dspray.api.services;

import java.util.List;

import com.dspray.api.collections.Announce;
import com.dspray.api.dto.AnnouncePostDto;
import com.dspray.api.repositories.AnnouncesRepository;

import org.springframework.stereotype.Service;

@Service
public class AnnouncesService {

    private AnnouncesRepository _announcesRepository;

    public AnnouncesService(AnnouncesRepository announcesRepository){
        this._announcesRepository = announcesRepository;
    }

    public List<Announce> getAnnounces() {
        return this._announcesRepository.findAll();
    }

    public Announce createAnnounce(AnnouncePostDto announcePostDto) {
        Announce newAnnounce = new Announce();
        newAnnounce.amount = announcePostDto.amount;
        newAnnounce.contractAddress = announcePostDto.contractAddress;
        newAnnounce.contractTitle = announcePostDto.contractTitle;
        return this._announcesRepository.insert(newAnnounce);
    }
}
