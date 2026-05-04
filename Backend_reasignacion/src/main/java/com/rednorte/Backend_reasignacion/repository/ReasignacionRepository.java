/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.rednorte.Backend_reasignacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rednorte.Backend_reasignacion.model.ReasignacionLog;

@Repository
public interface ReasignacionRepository extends JpaRepository<ReasignacionLog, Long>{

}