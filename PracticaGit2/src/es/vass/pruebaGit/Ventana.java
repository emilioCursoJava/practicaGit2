package es.vass.pruebaGit;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ventana
{
static Frame awtventana;
static JFrame swingventana;


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
public void awtventana()
{
awtventana= new Frame("Ventana libreria awt") ;
awtventana.reshape(100,200,400,400);
awtventana.setLayout(new FlowLayout());
awtventana.show();	
}

public void swingventana()
{
swingventana= new JFrame("Ventana libreria swing") ;
swingventana.reshape(550,200,400,400);
swingventana.setLayout(new FlowLayout());
swingventana.show();	
}

public static void main (String [] args)
 {
 	Ventana x=new Ventana();
 	x.awtventana();
 	x.swingventana();
 
 }

public void metodoEmilio () {
	
	System.out.println("metodo de emilio +  ");
}
	

}