/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1001.controller;
import com.tib.kuis_1001.entity.Aksesoris_1001;
import com.tib.kuis_1001.service.Aksesoris_1001Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 19
 */
@RestController
@RequestMapping("/Aksesoris_1001")
public class Aksesoris_1001Controller {
    @Autowired
    private Aksesoris_1001Service Aksesoris_1001Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris_1001 insertOrUpdate(@RequestBody Aksesoris_1001 Aksesoris_1001){
        return Aksesoris_1001Service.insertOrUpdate(Aksesoris_1001);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris_1001> findAll(){
        return Aksesoris_1001Service.findAll();
    }
  
}
