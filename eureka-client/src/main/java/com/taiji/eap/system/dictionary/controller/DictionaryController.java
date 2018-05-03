package com.taiji.eap.system.dictionary.controller;

import com.taiji.eap.system.dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 潘宏智
 * @date
 */
@RestController
public class DictionaryController {

    @Autowired
    DictionaryService dictionaryService;

    @GetMapping("hi")
    public String hi(@RequestParam String name){
        return dictionaryService.hiService(name);
    }

}
