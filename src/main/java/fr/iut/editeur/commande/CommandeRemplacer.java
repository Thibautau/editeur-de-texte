package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;indexDebut;indexFin;text");
            return;
        }
        String texte = parameters[3];
        //System.out.println(parameters[1] + " "+parameters[2] +" "+ texte);
        //System.out.println("YEDHYEDOED");

        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), texte);
        super.executer();
    }
}
