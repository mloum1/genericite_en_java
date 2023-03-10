package genericite_en_java;

import java.util.ArrayList;

public class FileAttente<A> {
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

    public static int nbEntresTotal() {
        return nbEntreesTotal;
    }

    public static <A> boolean difFile(FileAttente<A> p, FileAttente<A> w) {
        if (p.equals(w)) {
            return true;
        }
        return false;
    }

    public boolean difFileNs(FileAttente<A> p) {
        if (this.equals(p)) {
            return true;
        }
        return false;
    }

    public boolean difFile3(FileAttente w) {
        if (this.nbElements() == w.nbElements()) {
            return true;
        }
        return false;
    }

    /// programme qui crée et remplit une file d'attente de de personnes, puis une
    /// file d'attente de tâches
    public static void main(String[] args) {

        // personnes
        Personne loum = new Personne("loum");
        Personne john = new Personne("John");
        Personne doe = new Personne("Doe");
        // taches
        WorkTodo tache__1 = new WorkTodo(1, "design");
        WorkTodo tache__2 = new WorkTodo(2, "painting");
        FileAttente<Personne> personnes = new FileAttente<>();
        FileAttente<WorkTodo> taches = new FileAttente<>();

        // ajout personne dans la file d'attente
        personnes.entre(loum);
        personnes.entre(john);
        personnes.entre(doe);

        // ajout de taches dans la file d'attente
        taches.entre(tache__1);
        taches.entre(tache__2);

        // affichage espace memoire
        System.out.println(personnes);
        System.out.println(taches);
        // affichage nb total des entrées de file d'attente personnes et taches à partir
        // de chaque liste on peut connaitre le nombre d'entrées
        System.out.println(personnes.nbEntresTotal());
        System.out.println(taches.nbEntresTotal());
        // rajout d'un nouvel element pour voir en clair
        WorkTodo tache__3 = new WorkTodo(3, "painting");
        taches.entre(tache__3);
        // va retourner 6
        System.out.println(taches.nbEntresTotal());
        System.out.println(personnes.nbEntresTotal());
        // verif des objets s'ils ont le même type et ont le même contenu cette methode
        // ne peut pas retouner false car il te laissera pas la possibilité de mettre un
        // type différent
        System.out.println(FileAttente.difFile(personnes, personnes));
        System.out.println(FileAttente.difFile(taches, taches));
        // verif pareil pour celui d'en haut la seule différence c'est que celui la est
        // statique et l'autre non
        System.out.println(personnes.difFileNs(personnes));
        System.out.println(taches.difFileNs(taches));

        /// retourne true parce que les longueurs sont égaux
        System.out.println(personnes.difFile3(taches));

    }

}
