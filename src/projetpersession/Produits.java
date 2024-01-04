/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetpersession;

/**
 *
 * @author Blemy
 */
import java.util.Scanner;
class Produits
{
	String code;
	String categorie;
	String nom;
	int prix;
	int quantite;
	static Scanner clav1=new Scanner(System.in);//pour les String
	static Scanner clav2=new Scanner(System.in);//Pour les int
 
  
        
	//La methode pour save les produits
	static void savePro(Produits tabPro[], int dimTab) 
	{
		for(int i=0; i<tabPro.length;i++)
		{
			tabPro[i]=new Produits();//Attribut vers le tableau d'objet
			System.out.println("Pour le produit "+(i+1));
			System.out.println("Entrer le nom du produit");
			tabPro[i].nom=clav1.nextLine();
			System.out.println("Entrer le prix unitaire du produit");
			tabPro[i].prix=clav2.nextInt();
			System.out.println("Entrer la quantitee du produit");
			tabPro[i].quantite=clav2.nextInt();
			System.out.println("Entrer la categorie du produit");
			tabPro[i].categorie=clav1.nextLine();
			tabPro[i].code=tabPro[i].nom.substring(0,2)+tabPro[i].categorie.substring(0,1)+"$"+(i+2);
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		}
	}
	
	//Methode pour afficher tous les produits
	static void afficherProd(Produits tabPro[])
	{
		System.out.println("Les affichages des Produits");
			for(Produits p:tabPro)
		{
			System.out.println(p.toString());
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		}
	}
	
	//Pour saisir les informations
	public String toString()
	{
			  return         "NOM                  : "+nom+"\n"
					+"PRIX UNITAIRE        : "+prix+" GDS"+"\n"
					+"QUANTITE             : "+quantite+"\n"
					+"CATEGORIE            : "+categorie+"\n"
					+"CODE                 : "+code;
	}

	//Methode afficher categorie produits
	static void affCatego(Produits tabPro[])
	{
		String catSaisir;
		int c=0;
		System.out.println("Entrer la categorie du produit que vous voulez afficher");
		catSaisir=clav1.nextLine(); 
		for(int i=0; i<tabPro.length; i++)
		{
			if(tabPro[i].categorie.equalsIgnoreCase(catSaisir))
			{
				System.out.println(tabPro[i].toString());
				c+=1;
			}
		}
			if(c==0)
			{
				System.out.println("Desole! La categorie saisie ne se trouve pas dans le tableau");
			}
	}
	
	//Afficher tous les produits qui viennent avant et après un produit saisi par l’utilisateur
	static void affAvantApres(Produits tabPro[])
	{
		String prodsaisir;
		System.out.println("Entrer code du produit que vous ne voulez pas afficher");
		prodsaisir=clav1.nextLine();
		for(int i=0; i<tabPro.length; i++)
		{
			if(!tabPro[i].code.equalsIgnoreCase(prodsaisir))
			{
                            System.out.println(tabPro[i].toString());		
			}  
		}
	}
	
	//La Methode pour les augmentation de 50%
	static void augmentation(Produits tabPro[])
	{
		int c=0;
		System.out.println("\nVoici les augmentation des 50% :");
		for(int i=0; i<tabPro.length; i++)
		{
			if(tabPro[i].prix<60)
			{
				tabPro[i].prix+=((tabPro[i].prix*50)/100);
				System.out.println(tabPro[i].toString());
				c+=1;
			}
		}
			if(c==0)
			{
                            System.out.println("Les prix des produits ne sont pas inferieur a 60");
			}
	}

	//La Methode pour la dimintion de 50GDS
	static void diminuer(Produits tabPro[])
	{
		String catSaisir;
		int qte=0;
		System.out.println("Entrer la categorie du produit que vous voulez diminuer le prix");
		catSaisir=clav1.nextLine();
		for(int i=0; i<tabPro.length; i++)
		{
			if(tabPro[i].categorie.equalsIgnoreCase(catSaisir))
			{		
				qte+=tabPro[i].quantite;
			}
		}
		if(qte>500&&qte<1000)
		{
			for(int i=0; i<tabPro.length; i++)
			{
				if(tabPro[i].categorie.equalsIgnoreCase(catSaisir))
				{
					tabPro[i].prix-=50;
				}	
			}
		}
	}
	
	//La methode pour supprimer un produit
        static void supprimer(Produits tabPro[])
	{
		String codeSai;
		System.out.println("Entrer code du produit que vous voulez supprimer ");
		codeSai=clav1.nextLine();
		for(int i=0; i<tabPro.length; i++)
		{
			if(tabPro[i].code.equalsIgnoreCase(codeSai))
			{
				tabPro[i].nom="";	
				tabPro[i].prix=0;		
				tabPro[i].quantite=0;	
				tabPro[i].categorie="";
				tabPro[i].code="Supprimer"; 	
			}
                }
			for(int i=0; i<tabPro.length; i++)
			{
				if(!tabPro[i].code.equalsIgnoreCase("Supprimer"))
				{
					System.out.println(tabPro[i].toString());		
				}
			}		
	}
        /*  
            public static void main(String[] args)
    {
                int dimTab;
		//for the dimension tableau
		Scanner clav=new Scanner(System.in);
	
		System.out.println("Entrer la dimension du tableau");
		dimTab=clav.nextInt();
		Produits tabPro[]=new Produits[dimTab];
		Produits t=new Produits();
                        Produits.savePro(tabPro, dimTab);
                         Produits.afficherProd(tabPro);

                        Produits.affCatego(tabPro);

                        Produits.affAvantApres(tabPro);

                        Produits.augmentation(tabPro);

                        Produits.diminuer(tabPro);

                        Produits.supprimer(tabPro);
                    
    }*/
        
}
