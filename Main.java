import java.util.Scanner;
public class Main{
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        UseCase uc=new UseCase();
        do {
            choix=menu();
            switch (choix) {
                case 1:
                System.out.println("Saisir le libelle");
                String libelle=scanner.nextLine();
                Service sr=new Service();
                sr.setLibelle(libelle);
                uc.ajoutService(sr);
                    break;

                case 2:
                uc.listerService();
                    break;

                case 3:  
                System.out.println(" Saisir le nom complet ");
                String nom_complet=scanner.nextLine();

                System.out.println(" Saisir la date d'embauche ");
                String dateEmbauche=scanner.nextLine();
                Employe ep=new Employe();
                ep.setNom_complet(nom_complet);
                ep.setDateEmbauche(dateEmbauche);
                uc.ajoutEmploye(ep);     
                    break;

                case 4:
                    break;
                    
                case 5: 
                    break;

                case 6:
                    System.out.println("Au bientot !");
                    break;
                   
                default:
                    System.out.println("faire votre choix");
                    break;
            }

        }
        while(choix!=6);
    }

        public static int menu(){
            System.out.println("1-Ajouter un service"
                                +"\n2-lister Service"
                                +"\n3-Ajouter un employe"
                                +"\n4-Affecter un service a un employe"
                                +"\n5-Afficher les employes d'un service"
                                +"\n6-Quitter"
                                +"\n Faites votre choix M. : ");
            String choix;
            
            choix=scanner.nextLine();
            return Integer.parseInt(choix);
        }
        

    }