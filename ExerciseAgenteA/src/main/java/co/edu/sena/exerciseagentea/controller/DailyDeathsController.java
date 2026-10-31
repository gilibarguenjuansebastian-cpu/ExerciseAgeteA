/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.model.DailyDeath;
import java.util.List;

/**
 *objetivo: controlador muertes diario 
 * @author gilib
 * fecha: 29/10/2026
 */
public class DailyDeathsController implements IDailyDeathsController {
    
    public static List<DailyDeath> dailyDeaths = DataStore.getDailyDeaths();
    
    @Override
    public void insert(DailyDeath dailyDeath) throws Exception {
        
        if ( dailyDeath == null) {
            throw new Exception("sin informacion");
        }
        if ( dailyDeath.getDate()== null) {
            throw new Exception("La fecha es obligatoria");
        }        
        if (dailyDeath.getId()== 0) {
            throw new Exception("El id es obligatorio");
        }
        
        if (dailyDeath.getDeaths()== 0) {
            throw new Exception("El Numero de muertes es obligatorio");
        }

        if ("".equals(dailyDeath.getUser())) {
            throw new Exception("El usuario es obligatorio");
        }
        
        if ("".equals(dailyDeath.getCode())) {
            throw new Exception("El codigo de registro es obligatorio");
        }
        if ("".equals(dailyDeath.getObservations())) {
            throw new Exception("las observaciones son obligatorias");
        }
        //insertar
        dailyDeaths.add(dailyDeath);
    
    }

    @Override
    public void update(DailyDeath dailyDeath) throws Exception {
        if ( dailyDeath == null) {
            throw new Exception(" sin informacion");
        }
        if ( dailyDeath.getDate()== null) {
            throw new Exception("La fecha es obligatoria");
        }        
        if (dailyDeath.getId()== 0) {
            throw new Exception("El id es obligatorio");
        }

        if (dailyDeath.getDeaths()== 0) {
            throw new Exception("El Numero de muertes es obligatorio");
        }

        if ("".equals(dailyDeath.getUser())) {
            throw new Exception("El usuario es obligatorio");
        }
        
        if ("".equals(dailyDeath.getCode())) {
            throw new Exception("El codigo de registro es obligatorio");
        }
        if ("".equals(dailyDeath.getObservations())) {
            throw new Exception("las observaciones son obligatorias");
        }
        //validar si el galpon actualizar existe        
        boolean exists = false;
        for (int i = 0; i < dailyDeaths.size(); i++) {
            if (dailyDeaths.get(i).getId()== dailyDeath.getId()) {
                dailyDeaths.set(i, dailyDeath);
                exists = true;
                break;
            }
        }
        if (!exists) {
            throw new Exception("No existe el registro a actualizar");
        }    }
    @Override
    public void delete(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }

        //eliminar
        for (DailyDeath dailyDeath : dailyDeaths) {
            if (dailyDeath.getId()== id) {
                dailyDeaths.remove(dailyDeath);
                break;
            }
        }    
    }

    @Override
    public DailyDeath find(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }

        DailyDeath result = null;
        for (DailyDeath dailyDeath : dailyDeaths) {
            if (dailyDeath.getId() == id) {
                result = dailyDeath;
            }
        }
        return result;
    }

    @Override
    public List<DailyDeath> findAll() throws Exception {
        return dailyDeaths;
    }

    
}
