package genericite_en_java;

import java.util.Date;

public class EntreeAgenda extends Paire {

    public EntreeAgenda() {
    }

    public EntreeAgenda(Object f, Object s) {
        super(f, s);
    }

   

    @Override
    public void setFst(Object a) {
        a = new Date();
        super.setFst(a);
    }


    public static void main(String[] args) {
        EntreeAgenda nouel_Entre = new EntreeAgenda("20-02-23", " match de Montpellier vs Paris");


    }

}
