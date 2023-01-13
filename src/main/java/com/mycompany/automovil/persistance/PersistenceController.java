package com.mycompany.automovil.persistance;

import com.mycompany.automovil.logic.Automovil;
import com.mycompany.automovil.persistance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> listarAutomoviles() {
        return autoJpa.findAutomovilEntities();
    }

    public void eliminarAuto(Long idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil listarAutomovil(Long idAuto) {
        return autoJpa.findAutomovil(idAuto);
        
    }

    public void editarAutomovil(Automovil automovil) {
        try {
            autoJpa.edit(automovil);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
