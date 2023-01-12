/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.persistance;

import com.mycompany.automovil.logic.Automovil;

/**
 *
 * @author Agust
 */
public class PersistenceController {
    
    AutomovilJpaController controlador = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        controlador.create(auto);
    }
    
}
