/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizbotones.app;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author bruno
 */
public class Sistema {
    private int[][] contadorColor = new int[16][16];
    private JButton[][] buttons = new JButton[16][16];
    
    private JFrame jframe = new JFrame();
    
    public void inicializar(){
        JButton botonReiniciar = new JButton("Reiniciar Colores");
        
        botonReiniciar.setBounds(2, 2, 250, 25);
        jframe.add(botonReiniciar);
        
        botonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int contadorFila = 0; contadorFila < 16; contadorFila++) {
                    for (int contadorColumna = 0; contadorColumna < 16; contadorColumna++) {
                        buttons[contadorFila][contadorColumna].setBackground(null);
                    }
                }
            }
        });
        
        agregarBotones();
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(532, 532);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
    
    public void agregarBotones(){
        int contadorFila = 0;
        int contadorColumna = 0;
        
        for (contadorFila = 0; contadorFila < 16; contadorFila++) {
            for (contadorColumna = 0; contadorColumna < 16; contadorColumna++) {
                contadorColor[contadorFila][contadorColumna]=0;
                buttons[contadorFila][contadorColumna] = new JButton();
                buttons[contadorFila][contadorColumna].setBounds(28*(contadorFila+1), 28*(contadorColumna+1), 25, 25);
                jframe.add(buttons[contadorFila][contadorColumna]);
                
                final int i = contadorFila;
                final int j = contadorColumna;
                
                buttons[contadorFila][contadorColumna].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        cambiarColor(i,j);
                    }
                });
            }
        }
    }
    
    public void cambiarColor(int i, int j) {        
        int contadorBoton = contadorColor[i][j]; 
        switch(contadorBoton){
            case 0:
                buttons[i][j].setBackground(Color.black);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 1:
                buttons[i][j].setBackground(Color.gray);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 2:
                buttons[i][j].setBackground(Color.red);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 3:
                buttons[i][j].setBackground(Color.blue);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 4:
                buttons[i][j].setBackground(Color.GREEN);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 5:
                buttons[i][j].setBackground(Color.ORANGE);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 6:
                buttons[i][j].setBackground(Color.YELLOW);
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 7:
                buttons[i][j].setBackground(new Color(138,43,226));
                contadorColor[i][j]=contadorBoton+1;
                break;
            case 8:
                buttons[i][j].setBackground(Color.white);
                contadorColor[i][j]=0;
                break;
        }
    }
}
