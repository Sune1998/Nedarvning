public class Main {
    public static void main(String[] args) {
//main. Her oprettes en ny ansat udfra subclassen ithelp, med brug af superclassen
        IThelp ansat = new IThelp();
        ansat.ansatId = 2323;
        ansat.navn = "Jon hansen";
        ansat.dob = 10186;
        ansat.stilling = "IT help desk";
        ansat.lon = 42000;
        ansat.usrname = "jon122";
        ansat.hashedPword = "6A 5B 3A";


        //her vises hvordan at it subclassens serveradgang administreres.
        if(ansat.adgangServer = true){
            System.out.println(ansat.adgangServer + "Har adgang til serveren");
        }
        else {
            System.out.println("Har ikke adgang til serveren");
        }
    }
}
