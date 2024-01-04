/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetpersession;
import projetpersession.*;
import java.util.Scanner;

/**
 *
 * @author Blemy
 */
public class ProjetPerSession
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner cl5=new Scanner(System.in);
        String repons;
        do{
        int choixExo;
        Scanner cl=new Scanner(System.in);
        
        System.out.println("1-. Pour un programme Console en Java qui utilise un tableau a 1 dimension de n ");
        System.out.println("2-. Pour un programme Console en Java qui utilise une matrice carree de n");
        System.out.println("3-. Pour un programme Console en Java qui utilise un tableau d'objet a une dimension pour gerer les Stocks de produits dans une quincaillerie");
        System.out.println("4-. Pour terminer le programme");
        System.out.println("Faites votre choix !");
        choixExo=cl.nextInt();
        while(choixExo<1 || choixExo>4)
        {
            System.out.println("Faites votre choix ! Le choix doit etre dans l'intervale 1 a 4");
            choixExo=cl.nextInt();
        }

        switch(choixExo)
        { 
            case 1:
            {
                int choixDansExo1;
                int dimension;
		System.out.println("La dimension du tableau doit etre dans l'intervalle 3 a 7");
		Scanner clavier=new Scanner(System.in);
		dimension=clavier.nextInt();
		while(dimension<3 || dimension>7) {
			System.out.println("Vous avez pas repecter l'intervalle 3 a 7");
                        System.out.println("Faites votre choix ! Le choix doit etre dans l'intervale 3 a 7");
			dimension=clavier.nextInt();
		}
		float tab[]=new float[dimension];
		for(int i=0;i<dimension;i++){
			System.out.println("Entre les elements du tableau");
			tab[i]=clavier.nextFloat();			
		}

                System.out.println("1-. Afficher tous les elements du tableau");
                System.out.println("2-. Afficher en ordre decroissant les 3 derniers elements du tableau");
                System.out.println("3-. Afficher les 3 premiers nombres qui viennent avant un nombre quelconque saisi par l'utilisateur lorsque la position de l'element saisi est superieure a 3");
                System.out.println("4-. Afficher le plus grand et le plus petit nombre du tableau.");
                System.out.println("5-. Pour terminer");
                System.out.println("Choix !");
                choixDansExo1=cl.nextInt();
                while(choixDansExo1<1 || choixDansExo1>5)
                {
                    System.out.println("L'option ne se trouve pas dans le menu !");
                    System.out.println("Le choix !");
                    choixDansExo1=cl.nextInt();                    
                }
                switch(choixDansExo1)
                {
                    case 1:
                    {
                        Tableau.afficherTableau(tab);
                    }break;
                    
                    case 2:
                    {
                        float tab1[]= new float [3];
                        Tableau.afficherTableauDernier(tab, tab1);
                    }break;
                    case 3:
                    {
                        int a;
                        System.out.println("Entrer element que vous voulez rechercher");
                        a=cl.nextInt();
                        float tab2[]= new float [3];
                        Tableau.afficherTableauPremier(tab, tab2, a);
                    }break;
                    case 4:
                    {
                        Tableau.afficherTableauMaxMin(tab);
                    }break;
                    case 5:
                        {
                            System.out.println("Merci !");                           
                        }break;
                }
            }break;
            case 2:
            {
                Scanner clavier=new Scanner(System.in);
		//Pour la saisir du dimenssion
		int dimTab;
		System.out.println("Entrer la dimension du matrice compris entre 2 a 5\n");
		dimTab=clavier.nextInt();
                
		while (dimTab<2 || dimTab>5)
		{
			System.out.println("Vous n'avez pas respecter l'intervalle 2 a 5\n");
			dimTab=clavier.nextInt();
		}
		int tab[][]=new int [dimTab][dimTab];
		
		//Pour faire les saisir
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
                            System.out.println("Entrer les valeurs du matrice\n");
                            tab[i][j]=clavier.nextInt(); 
			}
		}
                
                int choixDansExo2;
                System.out.println("1- Afficher tous les elements de la matrice");
                System.out.println("2-. Afficher le triple de l'inverse de la somme des elements se trouvant sur la diagonale secondaire");
                System.out.println("3-. Permuter les elements de la diagonale principale à deux de la diagonale secondaire de la matrice");
                System.out.println("4-. Copier dans un tableau à 1 dimension tous les nombres saisis dont leur carre est un nombre pair divisible par 2 et par 4, puis afficher le tableau");
                System.out.println("5-. Calculer la somme de la premiere matrice a une autre matrice carree de meme taille dont les nombres seront saisis au clavier par l'utilisateur");
                System.out.println("6-. Pour terminjer");
                System.out.println("Choix !");
                choixDansExo2=cl.nextInt();
                while(choixDansExo2<1 || choixDansExo2>6)
                {
                    System.out.println("L'option ne se trouve pas dans le menu !");
                    System.out.println("Le choix !");
                    choixDansExo2=cl.nextInt();                                
                }
                switch(choixDansExo2)
                {
                    case 1:
                    {
                        Matrice.afficherMatrice(tab); 
                    }break;
                    case 2:
                    {
                        Matrice.afficherMatriceSommeDiagSec(tab, dimTab);
                    }break;
                    case 3:
                    {
                        Matrice.permuterDigonale(tab, dimTab);
                    }break; 
                    case 4:
                    {
                        Matrice.pairDivisible(tab);
                    }break;
                    case 5:
                    {
                        int tab2[][]=new int [dimTab][dimTab];
                        Matrice.sommeMatrice(tab, tab2, dimTab);
                    }break;
                    case 6:
                    {
                        System.out.println("Fin du programme !");
                        System.exit(0);
                    }break;
                }            
        }break;
            case 3:
            {
                int dimTab;
		//for the dimension tableau
		Scanner clav=new Scanner(System.in);
	
		System.out.println("Entrer la dimension du tableau");
		dimTab=clav.nextInt();
		Produits tabPro[]=new Produits[dimTab];
		Produits t=new Produits();
                int choixDansExo3;
                System.out.println("1-. Enregistrer les produits dans un tableau de n produits, ou la valeur de n sera saisie par l'utilisateur");
                System.out.println("2-. Afficher tous les produits du tableau");
                System.out.println("3-. Afficher tous les produits se trouvant dans une categorie saisie par l'utilisateur");
                System.out.println("4-. Afficher tous les produits qui viennent avant et apres un produit saisi par l’utilisateur");
                System.out.println("5-. Augmenter de 50 pourcent le prix unitaire de tous les produits dont leur prix unitaire est inferieur a 60 Gourdes");
                System.out.println("6-. Diminuer de 50 gourdes le prix unitaire de tous les produits d'une categorie dont leur quantite est comprise entre 500 a 1000");
                System.out.println("7-. Supprimer un produit dans le tableau par son code");
                System.out.println("8-. Pour terminer");
                System.out.println("Choix !");
                choixDansExo3=cl.nextInt();
                while(choixDansExo3<1 || choixDansExo3>6)
                {
                    System.out.println("L'option ne se trouve pas dans le menu !");
                    System.out.println("Le choix !");
                    choixDansExo3=cl.nextInt();                                
                }
                switch(choixDansExo3)
                {
                    case 1:
                    {
                        Produits.savePro(tabPro, dimTab);
                    }break;
                    case 2:
                    {
                        Produits.afficherProd(tabPro);
                    }break;
                    case 3:
                    {
                        Produits.affCatego(tabPro);
                    }break;
                    case 4:
                    {
                        Produits.affAvantApres(tabPro);
                    }break;
                    case 5:
                    {
                        Produits.augmentation(tabPro);
                    }break;
                    case 6:
                    {
                        Produits.diminuer(tabPro);
                    }break;
                    case 7:
                    {
                        Produits.supprimer(tabPro);
                    }break;
                    case 8:
                    {
                        System.out.println("Fin du programme !");
                        System.exit(0);                        
                    }break;                        
                }                
            }break;
            case 4:
            {
                System.out.println("Fin du programme !");
                System.exit(0);
            }break;
        
    }
        System.out.println("Voulez-vous continue? Tapez Oui ou Non.");
        repons=cl5.nextLine();
}while(repons.equalsIgnoreCase("oui"));
}
}