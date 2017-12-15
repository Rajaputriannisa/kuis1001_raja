/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1001.repo;

/**
 *
 * @author Mahasiswa 19
 */
import com.tib.kuis_1001.entity.Mobil_1001;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Mobil_1001Repo extends CrudRepository<Mobil_1001, Long> {

    @Query("select m from Mobil_1001 m")
    public List<Mobil_1001> findAllMobil_1001();
}
