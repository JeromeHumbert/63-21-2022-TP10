import java.util.ArrayList;

public class GestionMatch {
    private static ArrayList<Match> matchs = new ArrayList<>();
    private static String entete = "";

    private static void chargerData(){

    }

    private static void afficherMatch(){

    }

    private static void trierPar(String champs){

    }
    public static void main(String[] args) {
        chargerData();
        System.out.println("##################### Tri naturel #####################");
        matchs.sort(null);
        afficherMatch();
        System.out.println();
        trierPar("idmatch");
        System.out.println("##################### Tri par idMatch #####################");
        afficherMatch();
        System.out.println();
        trierPar("equipedomicile");
        System.out.println("##################### Tri par équipe à domicile #####################");
        afficherMatch();
        System.out.println();
        trierPar("equipeexterieur");
        System.out.println("##################### Tri par équipe à l'extérieur #####################");
        afficherMatch();
        System.out.println();
        trierPar("date");
        System.out.println("##################### Tri par date #####################");
        afficherMatch();
        System.out.println();
        trierPar("nbspectateur");
        System.out.println("##################### Tri par nombre de spectateur #####################");
        afficherMatch();
    }
}
