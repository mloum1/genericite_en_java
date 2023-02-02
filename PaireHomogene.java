package genericite_en_java;

public class PaireHomogene extends Paire {

    public PaireHomogene() {
    }

    public PaireHomogene(Object f, Object s) {
        super(f, s);
    }

    public static void main(String[] args) {
        PaireHomogene paire = new PaireHomogene(2, 2);
        System.out.println(paire);
    }
}
