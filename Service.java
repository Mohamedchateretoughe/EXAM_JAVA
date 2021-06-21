public class Service implements IEmploye{

  
    private int id;
    private String libelle;

    
    private static int nombreService;

    
    //1 service pour plusieurs employés
    private Employe[] tabEmploye=new Employe[7];
    private int nombreEmploye;

    
    public Service(){
        nombreService++;
        id=nombreService;
    }

    //Parametre Getters

    public int getId(){
        return id;
    }
    public String getLibelle(){
        return libelle;
    }
    public static int getNombreService(){
        return nombreService;
    }
    public Employe[] getTabEmploye(){
        return tabEmploye;
    }

    //Parametre Setters

    public void setId(int id){
        this.id=id;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }
    public static void setNombreService(int nombreService){
        Service.nombreService=nombreService;
    }

//Methode d'héritage est utilisé pour définir une méthode qui est héritée de la classe parente

@Override
    public String affiche(){
        return "Id: "+id+"\n Libelle: "+libelle;
    }
    public void compare(){

    }


}
