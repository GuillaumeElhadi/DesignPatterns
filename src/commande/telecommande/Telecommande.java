package commande.telecommande;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import commande.ICommande;

public class Telecommande {

    private Map<String, ICommande> commandes = new HashMap<>();

    public void presserBouton(String key) {
        List<ICommande> collect = commandes.entrySet().stream().filter(commande -> commande.getKey().equals(key)).map(Map.Entry::getValue).collect(Collectors.toList());
        if(collect != null && !collect.isEmpty()) {
            collect.stream().forEach(ICommande::execute);
        } else {
            System.out.println("Aucune commande de ce type présente");
        }
    }

    /**
     * @param theCommande to add
     */
    public void addCommande(String key, ICommande theCommande) {
        commandes.put(key, theCommande);
    }
}
