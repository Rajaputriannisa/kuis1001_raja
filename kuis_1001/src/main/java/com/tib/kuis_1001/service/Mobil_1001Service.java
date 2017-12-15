/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1001.service;

import com.tib.kuis_1001.entity.Mobil_1001;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tib.kuis_1001.repo.Mobil_1001Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("Mobil_1001Service")
@Transactional
public class Mobil_1001Service {

    @Autowired
    private Mobil_1001Repo repo;

    public Mobil_1001 insert(Mobil_1001 Mobil_1001) {
        return repo.save(Mobil_1001);
    }
    
    public Mobil_1001 update(Mobil_1001 Mobil_1001) {
        return repo.save(Mobil_1001);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1001 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Mobil_1001> getAll(){
        return repo.findAllMobil_1001();
    }
}
