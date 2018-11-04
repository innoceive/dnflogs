package com.dalong.dnflogs.dnflogs.controller;

import com.dalong.dnflogs.dnflogs.domain.dto.ServerInfoDTO;
import com.dalong.dnflogs.dnflogs.repository.CharacterRepository;
import com.dalong.dnflogs.dnflogs.service.DNFOpenAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dalong on 04/11/2018.
 */
@RestController
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private DNFOpenAPIService apiService;

    @GetMapping(value = "/{nickname}")
    public List<ServerInfoDTO> getCharacter(@PathVariable String nickname) {
        return apiService.findAll();
    }
}