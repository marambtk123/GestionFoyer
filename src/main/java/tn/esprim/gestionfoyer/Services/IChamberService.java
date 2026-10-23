package tn.esprim.gestionfoyer.Services;
import tn.esprim.gestionfoyer.entities.Chambre;


import java.util.List;

public interface IChamberService  {
    public Chambre save(Chambre chambre);

    public List<Chambre> retrieveAllChambers();

    public Chambre retrieveChambre(long chambreId);

    public Chambre addChambre(Chambre c);

    public void removechambre(long chambreId);

    public Chambre modifyChambre(Chambre chambre);
}
