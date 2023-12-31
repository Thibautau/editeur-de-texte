package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    /**
     *
     * @return un string correspondant au texte
     */
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }


    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    public void majuscule(int start, int end) {
        String leftPart = this.texte.substring(start,end).toUpperCase();
        remplacer(start, end, leftPart);
    }

    public void effacer(int start, int end){
        remplacer(start, end, "");
    }

    public void clear(){
        this.texte = "";
    }

    /**
     * Retourne toString
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
