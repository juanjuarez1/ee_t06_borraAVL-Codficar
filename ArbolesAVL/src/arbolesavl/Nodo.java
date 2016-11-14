/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesavl;

/**
 *
 * @author JUAREZ
 */

import java.io.*;

class Nodo
{
	int dato;
	int balance;
	Nodo izqda;
	Nodo drcha;
	Nodo padre;
	public Nodo()
	{
		izqda = drcha= null;
	}
	public Nodo (int x)
	{
		dato = x;
		izqda = drcha = null;
	}
	public Nodo buscarNodo(int buscado)
	{
		if (buscado == dato)
			return this;
		else if (buscado < dato)
			if (izqda != null)
				return izqda.buscarNodo(buscado);
			else
				return null;
		else if (buscado > dato)
			if (drcha != null)
				return drcha.buscarNodo(buscado);
			else
				return null;
		return this;
	}
	public void re_enorden()
	{
		if (izqda != null)
			izqda.re_enorden();
		System.out.print("\t" + dato);
		if (drcha != null)
			drcha.re_enorden();
	}
	public void re_preorden()
	{
		System.out.print("\t"+ dato);
		if (izqda != null)
			izqda.re_preorden();
		if(drcha != null)
			drcha.re_preorden();
	}
	public void re_postorden()
	{
		if(izqda != null)
			izqda.re_postorden();
		if(drcha !=null)
			drcha.re_postorden();
		System.out.print("\t" + dato);
	}
}



