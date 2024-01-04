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
class Tableau
{
	
	static void afficherTableau( float tab[])
        {
		for (int i=0;i<tab.length;i++)
                {
			System.out.print(tab[i]+"  ");
		}
	}
	static void afficherTableauDernier(float tab[],float tab1[])
        {
		float max;
		int l=0;
		for (int i=(tab.length-3);i<tab.length;i++){
			tab1[l]=tab[i];
			l+=1;
		}
		max=0;
		for(int i=0;i<2;i++){
			for(int j=i+1;j<3;j++){
			if(tab1[i]<tab1[j]){
				max=tab1[j];
				tab1[j]=tab1[i];
				tab1[i]=max;	
			}
		}
		}
		for(int s=0;s<3;s++){
			System.out.print(tab1[s]+"  ");
		}
	
	}
	static void afficherTableauPremier(float tab[],float tab2[],float a)
        {
		int l=0,c=0;
		for (int i=0;i<tab.length;i++){
			if(tab[i]==a) {
				c+=1;
			}
			}
		if(c==1) {
			for(int i=0;i<tab.length;i++){
				if(tab[i]==a) {
					l=i;
							  }
										 }
			if(l>=3) {
				int r=0;
				for(int i=(l-3);i<l;i++) {
					tab2[r]=tab[i];
					r+=1;
				}
				for(int s=0;s<3;s++){
					System.out.print(tab2[s]+"  ");
				}

					 }
			else {
				System.out.println("la position du nombre saisie est inferieur a 3");
			}
			}
				
		else {
			boolean v=true;
			int choix,b=0;
			int table[]=new int[c];
			for (int i=0;i<tab.length;i++){
				if(tab[i]==a) {
					table[b]=i;
					b+=1;
					
				}
			}
				
			System.out.println("on a trouver plusieur nombres egale au nombre que vous avez saisie \n choisir l'une de ces position");
			for (int i=0;i<c;i++){
				System.out.print(table[i]+"  ");
			}
			System.out.print("\n");
			Scanner clavie= new Scanner(System.in);
			choix=clavie.nextInt();
			for (int i=0;i<c;i++){
				if(choix==table[i]){
					v=false;
					}
				}
			while(v){
				System.out.println("mauvais choix l'un de ces valeur");
				choix=clavie.nextInt();
				for (int i=0;i<c;i++){
					System.out.print(table[i]+"  ");
			}
				choix=clavie.nextInt();
				for (int i=0;i<c;i++){
					if(choix==table[i]) {
						v=false;
					}
					
					}
			}
			if(choix>=3) {
				int r=0;
				for(int i=(choix-3);i<choix;i++) {
					tab2[r]=tab[i];
					r+=1;
				}
				for(int s=0;s<3;s++){
					System.out.print(tab2[s]+"  ");
				}

					 }
			else {
				System.out.println("la position du nombre saisie est inferieur a 3");
			}
				
		}
	}
		
	 static void afficherTableauMaxMin(float tab[])
         {
		float min,max1;
		min=tab[0];
		max1=tab[0];
		for (int i=0;i<tab.length;i++){
			if(min>tab[i]){
				min=tab[i];
			}
			if(max1<tab[i]){
				max1=tab[i];
			}
		}
		System.out.println("\n Le plus grand nombre du tableau est :"+max1);
		System.out.println("Le plus petit nombre du tableau est :"+min);
	}
}