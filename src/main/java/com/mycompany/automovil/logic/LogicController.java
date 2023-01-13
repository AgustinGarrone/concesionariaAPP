package com.mycompany.automovil.logic;

import com.mycompany.automovil.persistance.PersistenceController;
import java.util.List;

/**
 *
 * @author Agust
 */
public class LogicController {

    PersistenceController controladorPersistencia = new PersistenceController();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String patente, String color, int puertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setColor(color);
        auto.setPuertas(puertas);
        
        controladorPersistencia.agregarAutomovil(auto);
    }

    public List<Automovil> listarAutomoviles() {
        return controladorPersistencia.listarAutomoviles();
    }

    public void eliminarAuto(Long idAuto) {
        controladorPersistencia.eliminarAuto(idAuto);
    }

    public Automovil listarAutomovil(Long idAuto) {
        return controladorPersistencia.listarAutomovil(idAuto);
    }


    public void editarAutomovil(Automovil automovil) {
        controladorPersistencia.editarAutomovil(automovil);
    }
    
}
