/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.logic;

import com.mycompany.automovil.persistance.PersistenceController;
import java.util.List;

/**
 *
 * @author Agust
 */
public class LogicController {

    PersistenceController controlador = new PersistenceController();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String patente, String color, int puertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setColor(color);
        auto.setPuertas(puertas);
        
        controlador.agregarAutomovil(auto);
    }

    public List<Automovil> listarAutomoviles() {
        return controlador.listarAutomoviles();
    }
    
}
