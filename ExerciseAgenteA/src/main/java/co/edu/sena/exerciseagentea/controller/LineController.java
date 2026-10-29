/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.model.Line;
import java.util.ArrayList;
import java.util.List;

/**
 * objetivo: controlador Linea
 *
 * @author gilib fecha: 23/10/2026
 */
public class LineController implements ILineController {

    public static List<Line> lines = DataStore.getLines();
    

    @Override
    public void insert(Line line) throws Exception {
        if (line == null) {
            throw new Exception("el galpon esta sin informacion");
        }

        if (line.getId()== 0) {
            throw new Exception("El Numero es obligatorio");
        }

        if ("".equals(line.getName())) {
            throw new Exception("El estado es obligatorio");
        }
        //insertar
        lines.add(line);
    }

    @Override
    public void update(Line line) throws Exception {
        if (line == null) {
            throw new Exception("La ciudad está vacía");
        }
        if (line.getId() == 0) {
            throw new Exception("El Numero es obligatorio");
        }
        if ("".equals(line.getName())) {
            throw new Exception("El estado es obligatorio");
        }

        //validar si el galpon actualizar existe        
        boolean exists = false;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).getId() == line.getId()) {
                line.setName(line.getName().trim());
                lines.set(i, line);
                exists = true;
                break;
            }
        }
        if (!exists) {
            throw new Exception("No existe la linea a actualizar");
        }
    }

    @Override
    public void delete(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El codigo de la linea es obligatorio");
        }

        //eliminar
        for (Line line : lines) {
            if (line.getId() == id) {
                lines.remove(line);
                break;
            }
        }
    }

    @Override
    public Line find(long id) throws Exception {
        if (id == 0) {
            throw new Exception("El codigo de la linea es obligatorio");
        }

        Line result = null;
        for (Line line : lines) {
            if (line.getId() == id) {
                result = line;
            }
        }
        return result;
    }

    @Override
    public List<Line> findAll() throws Exception {
        return lines;
    }

}
