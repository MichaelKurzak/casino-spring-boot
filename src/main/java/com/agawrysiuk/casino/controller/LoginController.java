package com.agawrysiuk.casino.controller;

import com.agawrysiuk.casino.model.accounts.CasinoUser;
import com.agawrysiuk.casino.repo.CasinoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    private final CasinoUserRepository casinoUserRepository;

    @Autowired
    public LoginController(CasinoUserRepository casinoUserRepository) {
        this.casinoUserRepository = casinoUserRepository;
    }

    @GetMapping(path="/all") //for testing purposes
    public @ResponseBody List<CasinoUser> getAllUsers() {
        return casinoUserRepository.findAll();
    }
}