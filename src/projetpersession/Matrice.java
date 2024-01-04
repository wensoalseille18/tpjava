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
public class Matrice
 {		
	//Methode Afficher matrice
	static void afficherMatrice(int tab[][])
	{
		System.out.println("La matrice saisie est :\n");
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
                            System.out.print(tab[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	//Methode Afficher le triple de l'inverse de la somme des elements se trouvant sur la diagonale
	static void afficherMatriceSommeDiagSec(int tab[][] , int dimTab)
	{
		int s =0;
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
				if(i+j==dimTab-1)
				{
					s=s+tab[i][j];
				} 
			}
		}
		
		System.out.println("La somme des elements sur la diagonale secondaire est : "+(s));
		
		int tri=s*3;
		System.out.println("Le triple est : "+tri);
		
		int r=0;
		while(tri != 0)
		{
			r = r * 10;
			r = r + tri%10;
			tri = tri/10;
		}
		System.out.println("L'invers est : "+r);
	}
	//Methode pour permuter les diagonales
	static void permuterDigonale(int tab[][],int dimTab) {
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
				if(i==j)
				{
					int temp = tab[i][j];
                    tab[i][j] =tab[i][dimTab- 1 - j];
                    tab[i][dimTab - 1 - j] = temp;

				}
			}
		}
		
		// Afficher la matrice modifiee
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }


	//Le tableau a 1 dimension des nombres saisis dont leur carree est pair divisible par 2 et par 4
	static void pairDivisible(int tab[][])
	{
		int comp=0;
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
				if(Math.pow(tab[i][j],2)%2==0 && Math.pow(tab[i][j],2)%4==0)
				{
					comp=comp+1;
				}
			}
		}
		int l=0;
		int nouvTab[]=new int [comp];
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab[i].length; j++)
			{
				if(Math.pow(tab[i][j],2)%2==0 && Math.pow(tab[i][j],2)%4==0)
				{
					nouvTab[l]=tab[i][j];
					l+=1;
				}
			}
		}
		System.out.println("Le tableau a 1 dimension des nombres saisis dont leur carre est pair divisible par 2 et par 4 est : \n");
	for(int i=0;i<l;i++) {
		System.out.print(nouvTab[i]);
	}
	}
	
	
	static void sommeMatrice(int tab[][], int tab2[][], int dimTab)
	{
		Scanner clavier=new Scanner(System.in);
		int [][]som=new int [dimTab][dimTab];
		for(int i = 0; i<dimTab; i++)
		{
			for(int j = 0; j<dimTab; j++)
			{
				System.out.println("Entrer les valeurs du matrice");
				tab2[i][j]=clavier.nextInt();
				System.out.println("");
			}
		}
	
		for(int i = 0; i<tab2.length; i++)
		{
			for(int j = 0; j<tab2.length; j++)
			{
				som[i][j]=tab[i][j] + tab2[i][j];
			}
		}
		
		System.out.println("La a somme de deux matrices est : ");
		for(int i = 0; i<tab.length; i++)
		{
			for(int j = 0; j<tab.length; j++)
			{
				System.out.print(som[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}