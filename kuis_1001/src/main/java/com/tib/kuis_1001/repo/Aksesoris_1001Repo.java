/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1001.repo;

import com.tib.kuis_1001.entity.Aksesoris_1001;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Aksesoris_1001Repo extends CrudRepository<Aksesoris_1001, Long> {

    @Query("select a from Aksesoris_1001 a")
    public List<Aksesoris_1001> findAllAksesoris_1001();
}
