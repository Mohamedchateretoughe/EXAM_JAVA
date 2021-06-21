public class Employe implements IEmploye{


    private int id;
    private String nom_complet;
    private String dateEmbauche;
    private final int FORMAT=6;


    private static int nombreEmploye;
    
    private Service service;

    public Service getService(){
        return service;
    }
    public void setService(Service service){
        this.service=service;
    }

    public Employe(){
        nombreEmploye++;
        id=nombreEmploye;
    }

// Paramètre getters
public int getId(){
    return id;
}
public String getNom_complet(){
    return nom_complet;
}
public String getDateEmbauche(){
    return dateEmbauche;
}
public static int getNombreEmploye(){
    return nombreEmploye;
}

// Parameetre setters
public void setId(int id){
    this.id=id;
}
public void setNom_complet(String nom_complet){
    this.nom_complet=nom_complet;
}
public void setDateEmbauche(String dateEmbauche){
    this.dateEmbauche=dateEmbauche;
}
public static void setNombreEmploye(int nombreEmploye){
    Employe.nombreEmploye=nombreEmploye;
}

//Methode d'héritage est utilisé pour définir une méthode qui est héritée de la classe parente

@Override
public  String affiche(){
    return "Id: "+id+"\n Nom Complet: "+nom_complet+"\n Date d'embauche: "+dateEmbauche;
}
public void compare(){

}


}