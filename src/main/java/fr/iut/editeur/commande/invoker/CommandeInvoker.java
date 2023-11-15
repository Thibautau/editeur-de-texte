package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.Commande;

import java.util.Stack;

public class CommandeInvoker {

    private static CommandeInvoker instance;

    /**
     * @return une nouvelle instance de COmmandeInvoker si elle n'existe pas déjà
     *
     */
    public static synchronized CommandeInvoker getInstance() {
        if(instance == null) {
            instance = new CommandeInvoker();
        }
        return instance;
    }

    private CommandeInvoker() {}

    public void executer(Commande commande) {
        commande.executer();
    }
}
