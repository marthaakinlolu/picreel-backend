package com.example.picreel.service;

import com.example.picreel.model.PicreelModel;
import com.example.picreel.repository.PicreelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicreelService {
    private final PicreelRepository picreelRepository;

    @Autowired
    public PicreelService(PicreelRepository picreelRepository) {
        this.picreelRepository = picreelRepository;
    }

    public PicreelModel addPics(PicreelModel requestObject){
        PicreelModel response =  picreelRepository.save(requestObject);
        return response;
    }

    public List<PicreelModel> getPics() {
        return picreelRepository.findAll();
    }

    public void deletePics(long id) {
        picreelRepository.deleteById(id);
    }
}
