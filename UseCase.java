public class UseCase{
    private final int TAILLE=7;
        private int nombreService;
        private Service[] tabService= new Service[TAILLE];
    
        private Employe[] tabEmploye= new Employe[TAILLE];
        private int nombreEmploye;
       
        //Creation Service
        public void ajoutService(Service sr){
            if(nombreService<TAILLE){
                tabService[nombreService]=sr;
                nombreService++;
            }else{
                System.out.println("Tableau rempli");
            }
        }
    
        public void listerService(){
            for(Service sr:tabService){
                if(sr!=null)
                    System.out.println(sr.affiche());
            }
        }
    
        public void ajoutEmploye(Employe ep){
            if(nombreEmploye<TAILLE){
                tabEmploye[nombreEmploye]=ep;
                nombreEmploye++;
            }else{
                System.out.println("Tableau rempli");
            }
        }
    }