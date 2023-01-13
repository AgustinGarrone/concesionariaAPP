package com.mycompany.automovil.persistance;

import com.mycompany.automovil.logic.Automovil;
import java.util.List;

public class PersistenceController {
    
    AutomovilJpaController controlador = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        controlador.create(auto);
    }

    public List<Automovil> listarAutomoviles() {
        return controlador.findAutomovilEntities();
    }
    
}
