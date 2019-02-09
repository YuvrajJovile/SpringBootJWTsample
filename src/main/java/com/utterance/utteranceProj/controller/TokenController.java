package com.utterance.utteranceProj.controller;

import com.utterance.utteranceProj.model.JwtUser;
import com.utterance.utteranceProj.security.JwtTokenGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {


    private JwtTokenGenerator jwtTokenGenerator;

    public TokenController(JwtTokenGenerator jwtGenerator){
        this.jwtTokenGenerator = jwtGenerator;
    }

    @PostMapping
    private String generate(@RequestBody final JwtUser jwtUser){

        //need to pass userId and role as well
        return jwtTokenGenerator.generate(jwtUser);
    }
}
