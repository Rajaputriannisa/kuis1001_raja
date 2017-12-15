package com.tib.kuis_1001.controller;

import com.tib.kuis_1001.entity.Mobil_1001;
import com.tib.kuis_1001.service.Mobil_1001Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahasiswa 19
 */

@RestController
@RequestMapping("/Mobil_1001")
public class Mobil_1001Controller {
    
 @Autowired
    private Mobil_1001Service Mobil_1001Service;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1001 insert(@RequestBody Mobil_1001 Mobil_1001) {
        return Mobil_1001Service.insert(Mobil_1001);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1001 update(@RequestBody Mobil_1001 Mobil_1001) {
        return Mobil_1001Service.update(Mobil_1001);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return Mobil_1001Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Mobil_1001 getById(@PathVariable("id") Long id){
        return Mobil_1001Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1001> getAll(){
        return Mobil_1001Service.getAll();
    }
}

