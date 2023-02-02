package genericite_en_java;

import java.util.ArrayList;

public class FileAttente <A>{
    private String nomFile;
    private static int nbEntreesTotal = 0;
    private ArrayList<A> contenu;

    public FileAttente() {
        contenu = new ArrayList<A>();
    }

    public void entre(A p) {
        contenu.add(p);
        nbEntreesTotal++;
    }

    public A sort() {
        A p = null;
        if (!contenu.isEmpty()) {
            p = contenu.get(0);
            contenu.remove(0);
        }
        return p;
    }

    public int nbElements() {
        return contenu.size();
    }

    public boolean estVide() {
        return contenu.isEmpty();
    }

    public String toString() {
        return "" + descriptionContenu();
    }

    private String descriptionContenu() {
        String resultat = "";
        for (A p : this.contenu)
            resultat += p + " ";
        return resultat;
    }

}
