package com.example.picreel.controller;

import com.example.picreel.model.PicreelModel;
import com.example.picreel.service.PicreelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/api")
public class PicreelController {

    private final PicreelService picreelService;

    @Autowired
    public PicreelController(PicreelService picreelService) {
        this.picreelService = picreelService;
    }

    @PostMapping("/postPicreel")
    public PicreelModel addPics(@RequestBody PicreelModel request){
        return picreelService.addPics(request);
    }

    @GetMapping("/getPicreel")
    public List<PicreelModel> getPics() {
        return picreelService.getPics();
    }

    @DeleteMapping("/deletePics")
    public void deletePics(@RequestParam long id) {
        picreelService.deletePics(id);
    }

}
