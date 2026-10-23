package tn.esprim.gestionfoyer.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.Services.IChamberService;
import tn.esprim.gestionfoyer.entities.Chambre;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreRestController {
    @Autowired
    private IChamberService chamberService;

    @GetMapping("/retrive-all-chambres")
    public List<Chambre> getChamberes() {
        List<Chambre> listChambres = chamberService.retrieveAllChambers();
        return listChambres;
    }

    @GetMapping("/retrive-chambre/{chambre-id}")
    public Chambre retriveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chamberService.retrieveChambre(chId);
        return chambre;
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chamberService.addChambre(c);
        return chambre;
    }

    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chamberService.removechambre(chId);
    }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {

        Chambre chambre = chamberService.modifyChambre(c);
        return chambre;

    }
}


