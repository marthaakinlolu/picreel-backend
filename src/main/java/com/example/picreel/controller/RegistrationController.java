package com.example.picreel.controller;

import com.example.picreel.model.RegistrationModel;
import com.example.picreel.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("register")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/user")
    public RegistrationModel addData(@RequestBody RegistrationModel request){
        return registrationService.addData(request);
    }
}
