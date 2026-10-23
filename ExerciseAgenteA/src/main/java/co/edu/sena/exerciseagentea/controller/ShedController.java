/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 * objetivo:controlador galpon
 * @author gilib
 * fecha: 22/10/2026
 */
public class ShedController  implements IShedController{
     public static List<Shed> sheds = new ArrayList<>();
     
        public ShedController() {
        Shed shed = new Shed(1, "Disponible");
        sheds.add(shed);
    }   
     @Override
    public void insert(Shed shed) throws Exception {
        if (shed == null) {
            throw new Exception("el galpon esta sin informacion");
        }

        if (shed.getNumber() == 0) {
            throw new Exception("El Numero es obligatorio");
        }

        if ("".equals(shed.getState())) {
            throw new Exception("El estado es obligatorio");
        }
        //insertar
        sheds.add(shed);
    }

     @Override
    public void update(Shed shed) throws Exception {
        if (shed == null) {
            throw new Exception("La ciudad está vacía");
        }

        if (shed.getNumber() == 0) {
            throw new Exception("El Numero es obligatorio");
        }

        if ("".equals(shed.getState())) {
            throw new Exception("El estado es obligatorio");
        }

        //validar si el galpon actualizar existe        
        boolean exists = false;
        for (int i = 0; i < sheds.size(); i++) {
            if (sheds.get(i).getNumber() == shed.getNumber()) {
                //actualizar
                sheds.set(i, shed);
                exists = true;
                break;
            }
        }

        if (!exists) {
            throw new Exception("No existe el galpon a actualizar");
        }
    }

     @Override
    public void delete(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }

        //eliminar
        for (Shed shed : sheds) {
            if (shed.getNumber() == id) {
                sheds.remove(shed);
                break;
            }
        }
    }
     @Override
    public Shed find(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El id es obligatorio");
        }

        Shed result = null;
        for (Shed shed : sheds) {
            if (shed.getNumber() == id) {
                result = shed;
            }
        }

        return result;
    }

     @Override
    public List<Shed> findAll() throws Exception {
        return sheds;
    }
}
