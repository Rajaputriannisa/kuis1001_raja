/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1001.service;

import com.tib.kuis_1001.entity.Aksesoris_1001;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tib.kuis_1001.repo.Aksesoris_1001Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("Aksesoris_1001Service")
@Transactional
public class Aksesoris_1001Service {

    @Autowired
    private Aksesoris_1001Repo repo;

    public Aksesoris_1001 insertOrUpdate(Aksesoris_1001 Aksesoris_1001) {
        return repo.save(Aksesoris_1001);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Aksesoris_1001> findAll() {
        return repo.findAllAksesoris_1001();
    }

   
}
