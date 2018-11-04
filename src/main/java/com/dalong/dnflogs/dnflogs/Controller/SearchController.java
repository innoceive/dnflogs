package com.dalong.dnflogs.dnflogs.Controller;

import com.dalong.dnflogs.dnflogs.Repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dalong on 04/11/2018.
 */
@RestController
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping(value = "/{nickname}")
    public String getCharacter(@PathVariable String nickname) {

        return "finded";
    }
}