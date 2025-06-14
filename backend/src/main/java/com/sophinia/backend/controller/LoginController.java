package com.sophinia.backend.controller;

import com.sophinia.backend.dto.LoginDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    public ResponseEntity<?> login (@Valid @RequestBody LoginDTO loginDTO) {

        return null;
    }

}
