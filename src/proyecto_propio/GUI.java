/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_propio;

import java.awt.Color;


/**
 *
 * @author FZ
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setTitle("Cubo_RUBIK");
        setLocationRelativeTo(null);
    }
    
    //Ingreso de Variables
    
    //Matrices Principales
    static    int C1[][]={{0,0,0,0},{0,11,12,13},{0,14,15,16},{0,17,18,19}};
    static    int C2[][]={{0,0,0,0},{0,21,22,23},{0,24,25,26},{0,27,28,29}};
    static    int C3[][]={{0,0,0,0},{0,31,32,33},{0,34,35,36},{0,37,38,39}};
    static    int C4[][]={{0,0,0,0},{0,41,42,43},{0,44,45,46},{0,47,48,49}};
    static    int C5[][]={{0,0,0,0},{0,51,52,53},{0,54,55,56},{0,57,58,59}};
    static    int C6[][]={{0,0,0,0},{0,61,62,63},{0,64,65,66},{0,67,68,69}};
    
    //Matrices Desechables
    static    int C1Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    static    int C2Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    static    int C3Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    static    int C4Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    static    int C5Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    static    int C6Z[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    
    //Variables Para Metodo Resolver
    static String GM []= new String [300];
    
    static int n=1;
    static int incrementador=1;
    static int I=2;
    static int K;
    
 
    void BTN_BLANCO(){
        BTN_A1.setBackground(Color.white);
        BTN_A2.setBackground(Color.white);
        BTN_A3.setBackground(Color.white);
        BTN_B1.setBackground(Color.white);
        BTN_B2.setBackground(Color.white);
        BTN_B3.setBackground(Color.white);
        BTN_D1.setBackground(Color.white);
        BTN_D2.setBackground(Color.white);
        BTN_D3.setBackground(Color.white);
        BTN_I1.setBackground(Color.white);
        BTN_I2.setBackground(Color.white);
        BTN_I3.setBackground(Color.white);
        BTN_RD1.setBackground(Color.white);
        BTN_RD2.setBackground(Color.white);
        BTN_RD3.setBackground(Color.white);
        BTN_RI1.setBackground(Color.white);
        BTN_RI2.setBackground(Color.white);
        BTN_RI3.setBackground(Color.white);
        
    }
    
    //Funcionamiento Condicional para que vuelva a alamcenar los movimientos
    void GX(){
        if (GM[0].equals("P")&&I==0) {
            n=1;
            incrementador=1;
            I=2;
            BTN_BLANCO();
        }
    }
    void Resolver(){      
        GM[0]="P";
        
        if (n==0) {
            incrementador=incrementador-1;
            K=incrementador;
        }
        if (n==0) {
            I=K;
            if (GM[K].equals("A1")){
                BTN_BLANCO();
                BTN_A1.setBackground(Color.green);
            } else if (GM[K].equals("A2")){
                BTN_BLANCO();
                BTN_A2.setBackground(Color.green);
            }else if (GM[K].equals("A3")){
                BTN_BLANCO();
                BTN_A3.setBackground(Color.green);
            }else if (GM[K].equals("B1")){
                BTN_BLANCO();
                BTN_B1.setBackground(Color.green);
            }else if (GM[K].equals("B2")){
                BTN_BLANCO();
                BTN_B2.setBackground(Color.green);
            }else if (GM[K].equals("B3")){
                BTN_BLANCO();
                BTN_B3.setBackground(Color.green);
            }else if (GM[K].equals("D1")){
                BTN_BLANCO();
                BTN_D1.setBackground(Color.green);
            }else if (GM[K].equals("D2")){
                BTN_BLANCO();
                BTN_D2.setBackground(Color.green);
            }else if (GM[K].equals("D3")){
                BTN_BLANCO();
                BTN_D3.setBackground(Color.green);
            }else if (GM[K].equals("I1")){
                BTN_BLANCO();
                BTN_I1.setBackground(Color.green);
            }else if (GM[K].equals("I2")){
                BTN_BLANCO();
                BTN_I2.setBackground(Color.green);
            }else if (GM[K].equals("I3")){
                BTN_BLANCO();
                BTN_I3.setBackground(Color.green);
            }else if (GM[K].equals("RD1")){
                BTN_BLANCO();
                BTN_RD1.setBackground(Color.green);
            }else if (GM[K].equals("RD2")){
                BTN_BLANCO();
                BTN_RD2.setBackground(Color.green);
            }else if (GM[K].equals("RD3")){
                BTN_BLANCO();
                BTN_RD3.setBackground(Color.green);
            }else if (GM[K].equals("RI1")){
                BTN_BLANCO();
                BTN_RI1.setBackground(Color.green);
            }else if (GM[K].equals("RI2")){
                BTN_BLANCO();
                BTN_RI2.setBackground(Color.green);
            }else if (GM[K].equals("RI3")){
                BTN_BLANCO();
                BTN_RI3.setBackground(Color.green);
            }
            
        }       
        GX();
        
    }
    
    
    //Declaracion de Movimientos
      void A1(){
         for (int i=1; i<=3; i++) {
            C1Z[i][1]=C1[i][1];
            C2Z[i][1]=C2[i][1];
            C3Z[i][1]=C3[i][1];
            C4Z[i][1]=C4[i][1];

         }
         for (int i=1; i<=3; i++) {
             C1[i][1]=C2Z[i][1];
             C2[i][1]=C3Z[i][1];
             C3[i][1]=C4Z[i][1];
             C4[i][1]=C1Z[i][1];    
         }
         //Rotacion Cara #5
         
         for (int i=1; i<= 3; i++) {
            C5Z[1][i]=C5[1][i];
            C5Z[2][i]=C5[2][i];
            C5Z[3][i]=C5[3][i];            
        }
        C5 [1][1]=C5Z[1][3];
        C5 [2][1]=C5Z[1][2];
        C5 [3][1]=C5Z[1][1];
         
        C5 [1][2]=C5Z[2][3];
        C5 [2][2]=C5Z[2][2];
        C5 [3][2]=C5Z[2][1];
        
        C5 [1][3]=C5Z[3][3];
        C5 [2][3]=C5Z[3][2];
        C5 [3][3]=C5Z[3][1];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC1_11.getBackground();
         Ct2=TC1_21.getBackground();
         Ct3=TC1_31.getBackground();

         TC1_11.setBackground(TC2_11.getBackground());
         TC1_21.setBackground(TC2_21.getBackground());
         TC1_31.setBackground(TC2_31.getBackground());

         TC2_11.setBackground(TC3_11.getBackground());
         TC2_21.setBackground(TC3_21.getBackground());
         TC2_31.setBackground(TC3_31.getBackground());

         TC3_11.setBackground(TC4_11.getBackground());
         TC3_21.setBackground(TC4_21.getBackground());
         TC3_31.setBackground(TC4_31.getBackground());

         TC4_11.setBackground(Ct1);
         TC4_21.setBackground(Ct2);
         TC4_31.setBackground(Ct3);
         
         //Formato de Color Rotacion C5
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC5_11.getBackground(); Cu21=TC5_21.getBackground(); Cu31=TC5_31.getBackground();
         Cu12=TC5_12.getBackground(); Cu22=TC5_22.getBackground(); Cu32=TC5_32.getBackground();
         Cu13=TC5_13.getBackground(); Cu23=TC5_23.getBackground(); Cu33=TC5_33.getBackground();
         
         TC5_11.setBackground(Cu13);
         TC5_12.setBackground(Cu23);
         TC5_13.setBackground(Cu33);
         
         TC5_21.setBackground(Cu12);
         TC5_22.setBackground(Cu22);
         TC5_23.setBackground(Cu32);
         
         TC5_31.setBackground(Cu11);
         TC5_32.setBackground(Cu21);
         TC5_33.setBackground(Cu31);
         
          if (n==1) {
              GM[incrementador]="B1";
              incrementador=incrementador+1;
          }
        
    } //Fin del Metodo A1
    
     void A2(){
         for (int i=1; i<=3; i++) {
             C1Z[i][2]=C1[i][2];
             C2Z[i][2]=C2[i][2];
             C3Z[i][2]=C3[i][2];
             C4Z[i][2]=C4[i][2];

        }
        for (int i=1; i<=3; i++) {
             C1[i][2]=C2Z[i][2];
             C2[i][2]=C3Z[i][2];
             C3[i][2]=C4Z[i][2];
             C4[i][2]=C1Z[i][2];
        }
        
        //Formato para Color
        
         Color Ct1,Ct2,Ct3;
         Ct1=TC1_12.getBackground();
         Ct2=TC1_22.getBackground();
         Ct3=TC1_32.getBackground();

         TC1_12.setBackground(TC2_12.getBackground());
         TC1_22.setBackground(TC2_22.getBackground());
         TC1_32.setBackground(TC2_32.getBackground());

         TC2_12.setBackground(TC3_12.getBackground());
         TC2_22.setBackground(TC3_22.getBackground());
         TC2_32.setBackground(TC3_32.getBackground());

         TC3_12.setBackground(TC4_12.getBackground());
         TC3_22.setBackground(TC4_22.getBackground());
         TC3_32.setBackground(TC4_32.getBackground());

         TC4_12.setBackground(Ct1);
         TC4_22.setBackground(Ct2);
         TC4_32.setBackground(Ct3);
         
          if (n==1) {
              GM[incrementador]="B2";
              incrementador=incrementador+1;
          }
         
        
    } //Fin del metodo A2
    
     void A3(){
        for (int i=1; i<=3; i++) {
            C1Z[i][3]=C1[i][3];
            C2Z[i][3]=C2[i][3];
            C3Z[i][3]=C3[i][3];
            C4Z[i][3]=C4[i][3];

        }
        for (int i=1; i<=3; i++) {
             C1[i][3]=C2Z[i][3];
             C2[i][3]=C3Z[i][3];
             C3[i][3]=C4Z[i][3];
             C4[i][3]=C1Z[i][3];
        }
       //Rotacion Cara #6
       for (int i=1; i<= 3; i++) {
            C6Z[1][i]=C6[1][i];
            C6Z[2][i]=C6[2][i];
            C6Z[3][i]=C6[3][i];            
        }
       
       C6[1][3]=C6Z[1][1];
       C6[1][2]=C6Z[2][1];
       C6[1][1]=C6Z[3][1];
       
       C6[2][3]=C6Z[1][2];
       C6[2][2]=C6Z[2][2];
       C6[2][1]=C6Z[3][2];
       
       C6[3][3]=C6Z[1][3];
       C6[3][2]=C6Z[2][3];
       C6[3][1]=C6Z[3][3];
       
       //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC1_13.getBackground();
         Ct2=TC1_23.getBackground();
         Ct3=TC1_33.getBackground();

         TC1_13.setBackground(TC2_13.getBackground());
         TC1_23.setBackground(TC2_23.getBackground());
         TC1_33.setBackground(TC2_33.getBackground());

         TC2_13.setBackground(TC3_13.getBackground());
         TC2_23.setBackground(TC3_23.getBackground());
         TC2_33.setBackground(TC3_33.getBackground());

         TC3_13.setBackground(TC4_13.getBackground());
         TC3_23.setBackground(TC4_23.getBackground());
         TC3_33.setBackground(TC4_33.getBackground());

         TC4_13.setBackground(Ct1);
         TC4_23.setBackground(Ct2);
         TC4_33.setBackground(Ct3);
         
         //Formato de Color Rotacion C6
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC6_11.getBackground(); Cu21=TC6_21.getBackground(); Cu31=TC6_31.getBackground();
         Cu12=TC6_12.getBackground(); Cu22=TC6_22.getBackground(); Cu32=TC6_32.getBackground();
         Cu13=TC6_13.getBackground(); Cu23=TC6_23.getBackground(); Cu33=TC6_33.getBackground();
         
         TC6_11.setBackground(Cu31);
         TC6_12.setBackground(Cu21);
         TC6_13.setBackground(Cu11);
         
         TC6_21.setBackground(Cu32);
         TC6_22.setBackground(Cu22);
         TC6_23.setBackground(Cu12);
         
         TC6_31.setBackground(Cu33);
         TC6_32.setBackground(Cu23);
         TC6_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="B3";
              incrementador=incrementador+1;
          }
         
    } //Fin del Metodo A3
    
    //Movimientos hacia Abajo
    
      void B1(){
        for (int i=1; i<=3; i++) {
            C1Z[i][1]=C1[i][1];
            C2Z[i][1]=C2[i][1];
            C3Z[i][1]=C3[i][1];
            C4Z[i][1]=C4[i][1];
        }
        for (int i=1; i<=3; i++) {
            C1[i][1]=C4Z[i][1];
            C2[i][1]=C1Z[i][1];
            C3[i][1]=C2Z[i][1];
            C4[i][1]=C3Z[i][1];
        }
        //Rotacion Cara #5
         
         for (int i=1; i<= 3; i++) {
            C5Z[1][i]=C5[1][i];
            C5Z[2][i]=C5[2][i];
            C5Z[3][i]=C5[3][i];       
         }
         C5[1][3]=C5Z[1][1];
         C5[1][2]=C5Z[2][1];
         C5[1][1]=C5Z[3][1];
         
         C5[2][3]=C5Z[1][2];
         C5[2][2]=C5Z[2][2];
         C5[2][1]=C5Z[3][2];
         
         C5[3][3]=C5Z[1][3];
         C5[3][2]=C5Z[2][3];
         C5[3][1]=C5Z[3][3];
         
         //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC4_11.getBackground();
         Ct2=TC4_21.getBackground();
         Ct3=TC4_31.getBackground();

         TC4_11.setBackground(TC3_11.getBackground());
         TC4_21.setBackground(TC3_21.getBackground());
         TC4_31.setBackground(TC3_31.getBackground());

         TC3_11.setBackground(TC2_11.getBackground());
         TC3_21.setBackground(TC2_21.getBackground());
         TC3_31.setBackground(TC2_31.getBackground());

         TC2_11.setBackground(TC1_11.getBackground());
         TC2_21.setBackground(TC1_21.getBackground());
         TC2_31.setBackground(TC1_31.getBackground());

         TC1_11.setBackground(Ct1);
         TC1_21.setBackground(Ct2);
         TC1_31.setBackground(Ct3);
         
          //Formato de Color Rotacion C5
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC5_11.getBackground(); Cu21=TC5_21.getBackground(); Cu31=TC5_31.getBackground();
         Cu12=TC5_12.getBackground(); Cu22=TC5_22.getBackground(); Cu32=TC5_32.getBackground();
         Cu13=TC5_13.getBackground(); Cu23=TC5_23.getBackground(); Cu33=TC5_33.getBackground();
         
         TC5_11.setBackground(Cu31);
         TC5_12.setBackground(Cu21);
         TC5_13.setBackground(Cu11);
         
         TC5_21.setBackground(Cu32);
         TC5_22.setBackground(Cu22);
         TC5_23.setBackground(Cu12);
         
         TC5_31.setBackground(Cu33);
         TC5_32.setBackground(Cu23);
         TC5_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="A1";
              incrementador=incrementador+1;
          }
        
        
    } //Fin del Metodo B1
    
     void B2(){
        for (int i=1; i<=3; i++) {
            C1Z[i][2]=C1[i][2];
            C2Z[i][2]=C2[i][2];
            C3Z[i][2]=C3[i][2];
            C4Z[i][2]=C4[i][2];
        }
        for (int i=1; i<=3; i++) {
            C1[i][2]=C4Z[i][2];
            C2[i][2]=C1Z[i][2];
            C3[i][2]=C2Z[i][2];
            C4[i][2]=C3Z[i][2];
        }
     //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC4_12.getBackground();
         Ct2=TC4_22.getBackground();
         Ct3=TC4_32.getBackground();

         TC4_12.setBackground(TC3_12.getBackground());
         TC4_22.setBackground(TC3_22.getBackground());
         TC4_32.setBackground(TC3_32.getBackground());

         TC3_12.setBackground(TC2_12.getBackground());
         TC3_22.setBackground(TC2_22.getBackground());
         TC3_32.setBackground(TC2_32.getBackground());

         TC2_12.setBackground(TC1_12.getBackground());
         TC2_22.setBackground(TC1_22.getBackground());
         TC2_32.setBackground(TC1_32.getBackground());

         TC1_12.setBackground(Ct1);
         TC1_22.setBackground(Ct2);
         TC1_32.setBackground(Ct3);
         
          if (n==1) {
              GM[incrementador]="A2";
              incrementador=incrementador+1;
          }
        
    }//Fin del Metodo B2
     
     void B3(){
        for (int i=1; i<=3; i++) {
            C1Z[i][3]=C1[i][3];
            C2Z[i][3]=C2[i][3];
            C3Z[i][3]=C3[i][3];
            C4Z[i][3]=C4[i][3];
        }
        for (int i=1; i<=3; i++) {
            C1[i][3]=C4Z[i][3];
            C2[i][3]=C1Z[i][3];
            C3[i][3]=C2Z[i][3];
            C4[i][3]=C3Z[i][3];
        }
        //Rotacion Cara #6
       for (int i=1; i<= 3; i++) {
            C6Z[1][i]=C6[1][i];
            C6Z[2][i]=C6[2][i];
            C6Z[3][i]=C6[3][i];            
        }
       C6[1][1]=C6Z[1][3];
       C6[1][2]=C6Z[2][3];
       C6[1][3]=C6Z[3][3];
       
       C6[2][3]=C6Z[3][2];
       C6[2][2]=C6Z[2][2];
       C6[2][1]=C6Z[1][2];
       
       C6[3][3]=C6Z[3][1];
       C6[3][2]=C6Z[2][1];
       C6[3][1]=C6Z[1][1];
       
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC4_13.getBackground();
         Ct2=TC4_23.getBackground();
         Ct3=TC4_33.getBackground();

         TC4_13.setBackground(TC3_13.getBackground());
         TC4_23.setBackground(TC3_23.getBackground());
         TC4_33.setBackground(TC3_33.getBackground());

         TC3_13.setBackground(TC2_13.getBackground());
         TC3_23.setBackground(TC2_23.getBackground());
         TC3_33.setBackground(TC2_33.getBackground());

         TC2_13.setBackground(TC1_13.getBackground());
         TC2_23.setBackground(TC1_23.getBackground());
         TC2_33.setBackground(TC1_33.getBackground());

         TC1_13.setBackground(Ct1);
         TC1_23.setBackground(Ct2);
         TC1_33.setBackground(Ct3);
         
         //Formato de Color Rotacion Arriba
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC6_11.getBackground(); Cu21=TC6_21.getBackground(); Cu31=TC6_31.getBackground();
         Cu12=TC6_12.getBackground(); Cu22=TC6_22.getBackground(); Cu32=TC6_32.getBackground();
         Cu13=TC6_13.getBackground(); Cu23=TC6_23.getBackground(); Cu33=TC6_33.getBackground();
         
         TC6_11.setBackground(Cu13);
         TC6_12.setBackground(Cu23);
         TC6_13.setBackground(Cu33);
         
         TC6_21.setBackground(Cu12);
         TC6_22.setBackground(Cu22);
         TC6_23.setBackground(Cu32);
         
         TC6_31.setBackground(Cu11);
         TC6_32.setBackground(Cu21);
         TC6_33.setBackground(Cu31);
         
          if (n==1) {
              GM[incrementador]="A3";
              incrementador=incrementador+1;
          }
    }//Fin del Metodo B3
    
    
    //Movimientos Laterales hacia la derecha
    
     void D1 (){
        for (int i=1; i<=3; i++) {
            C2Z[1][i]=C2[1][i];
            C6Z[1][i]=C6[1][i];
            C4Z[3][i]=C4[3][i];
            C5Z[1][i]=C5[1][i];
        }
        //Almacenar Variables C1
        for (int i =1; i <=3; i++) {
           C1Z[1][i]=C1[1][i];
           C1Z[2][i]=C1[2][i];
           C1Z[3][i]=C1[3][i];
           
        }
        C2[1][1]=C5Z[1][1];
        C2[1][2]=C5Z[1][2];
        C2[1][3]=C5Z[1][3];
        
        C6[1][1]=C2Z[1][1];
        C6[1][2]=C2Z[1][2];
        C6[1][3]=C2Z[1][3];
        
        C4[3][1]=C6Z[1][3];
        C4[3][2]=C6Z[1][2];
        C4[3][3]=C6Z[1][1];
        
        C5[1][1]=C4Z[3][3];
        C5[1][2]=C4Z[3][2];
        C5[1][3]=C4Z[3][1];
         
        //Rotacion Arriba
        C1[1][3]=C1Z[3][3];
        C1[1][2]=C1Z[2][3];
        C1[1][1]=C1Z[1][3];
        
        C1[2][3]=C1Z[3][2];
        C1[2][2]=C1Z[2][2];
        C1[2][1]=C1Z[1][2];
        
        C1[3][3]=C1Z[3][1];
        C1[3][2]=C1Z[2][1];
        C1[3][1]=C1Z[1][1];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC6_11.getBackground();
         Ct2=TC6_12.getBackground();
         Ct3=TC6_13.getBackground();

         TC6_11.setBackground(TC2_11.getBackground());
         TC6_12.setBackground(TC2_12.getBackground());
         TC6_13.setBackground(TC2_13.getBackground());

         TC2_11.setBackground(TC5_11.getBackground());
         TC2_12.setBackground(TC5_12.getBackground());
         TC2_13.setBackground(TC5_13.getBackground());

         TC5_11.setBackground(TC4_33.getBackground());
         TC5_12.setBackground(TC4_32.getBackground());
         TC5_13.setBackground(TC4_31.getBackground());

         TC4_31.setBackground(Ct3);
         TC4_32.setBackground(Ct2);
         TC4_33.setBackground(Ct1);
         
         //Formato de Color Rotacion Arriba
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC1_11.getBackground(); Cu21=TC1_21.getBackground(); Cu31=TC1_31.getBackground();
         Cu12=TC1_12.getBackground(); Cu22=TC1_22.getBackground(); Cu32=TC1_32.getBackground();
         Cu13=TC1_13.getBackground(); Cu23=TC1_23.getBackground(); Cu33=TC1_33.getBackground();
         
         TC1_11.setBackground(Cu13);
         TC1_12.setBackground(Cu23);
         TC1_13.setBackground(Cu33);
         
         TC1_21.setBackground(Cu12);
         TC1_22.setBackground(Cu22);
         TC1_23.setBackground(Cu32);
         
         TC1_31.setBackground(Cu11);
         TC1_32.setBackground(Cu21);
         TC1_33.setBackground(Cu31);
         
          if (n==1) {
              GM[incrementador]="I1";
              incrementador=incrementador+1;
          }
         
    } //Fin del Metodo D1
    
    
     void D2 (){
        for (int i=1; i<=3; i++) {
            C2Z[2][i]=C2[2][i];
            C6Z[2][i]=C6[2][i];
            C4Z[2][i]=C4[2][i];
            C5Z[2][i]=C5[2][i];
        }
        
        C2 [2][1]= C5Z [2][1];
        C2 [2][2]= C5Z [2][2];
        C2 [2][3]= C5Z [2][3];
        
        C6 [2][1]= C2Z [2][1];
        C6 [2][2]= C2Z [2][2];
        C6 [2][3]= C2Z [2][3];
        
        C4 [2][1]= C6Z [2][3];
        C4 [2][2]= C6Z [2][2];
        C4 [2][3]= C6Z [2][1];
        
        C5 [2][1]= C4Z [2][3];
        C5 [2][2]= C4Z [2][2];
        C5 [2][3]= C4Z [2][1];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC6_21.getBackground();
         Ct2=TC6_22.getBackground();
         Ct3=TC6_23.getBackground();

         TC6_21.setBackground(TC2_21.getBackground());
         TC6_22.setBackground(TC2_22.getBackground());
         TC6_23.setBackground(TC2_23.getBackground());

         TC2_21.setBackground(TC5_21.getBackground());
         TC2_22.setBackground(TC5_22.getBackground());
         TC2_23.setBackground(TC5_23.getBackground());

         TC5_21.setBackground(TC4_23.getBackground());
         TC5_22.setBackground(TC4_22.getBackground());
         TC5_23.setBackground(TC4_21.getBackground());

         TC4_21.setBackground(Ct3);
         TC4_22.setBackground(Ct2);
         TC4_23.setBackground(Ct1);
         
          if (n==1) {
              GM[incrementador]="I2";
              incrementador=incrementador+1;
          }
        
    } //Fin del Metodo D2
    
     void D3 (){
        for (int i=1; i<=3; i++) {
            C2Z[3][i]=C2[3][i];
            C6Z[3][i]=C6[3][i];
            C4Z[1][i]=C4[1][i];
            C5Z[3][i]=C5[3][i];
        }
        //Almacenar Variables C3
        for (int i =1; i <=3; i++) {
           C3Z[1][i]=C3[1][i];
           C3Z[2][i]=C3[2][i];
           C3Z[3][i]=C3[3][i];
           
        }
        C2 [3][1]= C5Z [3][1];
        C2 [3][2]= C5Z [3][2];
        C2 [3][3]= C5Z [3][3];
        
        C6 [3][1]= C2Z [3][1];
        C6 [3][2]= C2Z [3][2];
        C6 [3][3]= C2Z [3][3];
        
        C4 [1][1]= C6Z [3][3];
        C4 [1][2]= C6Z [3][2];
        C4 [1][3]= C6Z [3][1];
        
        C5 [3][1]= C4Z [1][3];
        C5 [3][2]= C4Z [1][2];
        C5 [3][3]= C4Z [1][1];
        
        //Rotacion Abajo C3
        C3[1][3]=C3Z[1][1];
        C3[1][2]=C3Z[2][1];
        C3[1][1]=C3Z[3][1];
        
        C3[2][3]=C3Z[1][2];
        C3[2][2]=C3Z[2][2];
        C3[2][1]=C3Z[3][2];
        
        C3[3][3]=C3Z[1][3];
        C3[3][2]=C3Z[2][3];
        C3[3][1]=C3Z[3][3];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC6_31.getBackground();
         Ct2=TC6_32.getBackground();
         Ct3=TC6_33.getBackground();

         TC6_31.setBackground(TC2_31.getBackground());
         TC6_32.setBackground(TC2_32.getBackground());
         TC6_33.setBackground(TC2_33.getBackground());

         TC2_31.setBackground(TC5_31.getBackground());
         TC2_32.setBackground(TC5_32.getBackground());
         TC2_33.setBackground(TC5_33.getBackground());

         TC5_31.setBackground(TC4_13.getBackground());
         TC5_32.setBackground(TC4_12.getBackground());
         TC5_33.setBackground(TC4_11.getBackground());

         TC4_11.setBackground(Ct3);
         TC4_12.setBackground(Ct2);
         TC4_13.setBackground(Ct1);
         
         //Formato de Color Rotacion Abajo
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC3_11.getBackground(); Cu21=TC3_21.getBackground(); Cu31=TC3_31.getBackground();
         Cu12=TC3_12.getBackground(); Cu22=TC3_22.getBackground(); Cu32=TC3_32.getBackground();
         Cu13=TC3_13.getBackground(); Cu23=TC3_23.getBackground(); Cu33=TC3_33.getBackground();
         
         TC3_11.setBackground(Cu13);
         TC3_12.setBackground(Cu23);
         TC3_13.setBackground(Cu33);
         
         TC3_21.setBackground(Cu12);
         TC3_22.setBackground(Cu22);
         TC3_23.setBackground(Cu32);
         
         TC3_31.setBackground(Cu11);
         TC3_32.setBackground(Cu21);
         TC3_33.setBackground(Cu31);

          if (n==1) {
              GM[incrementador]="I3";
              incrementador=incrementador+1;
          }
        
    } //Fin del Metodo D3
    
    //Movimientos Laterales hacia la izquierda  
     void I1(){
        for (int i=1; i<=3; i++) {
            C2Z[1][i]=C2[1][i];
            C6Z[1][i]=C6[1][i];
            C4Z[3][i]=C4[3][i];
            C5Z[1][i]=C5[1][i];
        }
        //Almacenar Variables C1
        for (int i =1; i <=3; i++) {
           C1Z[1][i]=C1[1][i];
           C1Z[2][i]=C1[2][i];
           C1Z[3][i]=C1[3][i];
           
        }
        C2[1][1]=C6Z[1][1];
        C2[1][2]=C6Z[1][2];
        C2[1][3]=C6Z[1][3];
        
        C5[1][1]=C2Z[1][1];
        C5[1][2]=C2Z[1][2];
        C5[1][3]=C2Z[1][3];
        
        C4[3][1]=C5Z[1][3];
        C4[3][2]=C5Z[1][2];
        C4[3][3]=C5Z[1][1];
        
        C6[1][3]=C4Z[3][1];
        C6[1][2]=C4Z[3][2];
        C6[1][1]=C4Z[3][3];
        
        //Rotacion C1
        C1[1][3]=C1Z[1][1];
        C1[1][2]=C1Z[2][1];
        C1[1][1]=C1Z[3][1];
        
        C1[2][3]=C1Z[1][2];
        C1[2][2]=C1Z[2][2];
        C1[2][1]=C1Z[3][2];
        
        C1[3][3]=C1Z[1][3];
        C1[3][2]=C1Z[2][3];
        C1[3][1]=C1Z[3][3];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC5_11.getBackground();
         Ct2=TC5_12.getBackground();
         Ct3=TC5_13.getBackground();

         TC5_11.setBackground(TC2_11.getBackground());
         TC5_12.setBackground(TC2_12.getBackground());
         TC5_13.setBackground(TC2_13.getBackground());

         TC2_11.setBackground(TC6_11.getBackground());
         TC2_12.setBackground(TC6_12.getBackground());
         TC2_13.setBackground(TC6_13.getBackground());

         TC6_11.setBackground(TC4_33.getBackground());
         TC6_12.setBackground(TC4_32.getBackground());
         TC6_13.setBackground(TC4_31.getBackground());

         TC4_31.setBackground(Ct3);
         TC4_32.setBackground(Ct2);
         TC4_33.setBackground(Ct1);
         
         //Formato de Color Rotacion Arriba
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC1_11.getBackground(); Cu21=TC1_21.getBackground(); Cu31=TC1_31.getBackground();
         Cu12=TC1_12.getBackground(); Cu22=TC1_22.getBackground(); Cu32=TC1_32.getBackground();
         Cu13=TC1_13.getBackground(); Cu23=TC1_23.getBackground(); Cu33=TC1_33.getBackground();
         
         TC1_11.setBackground(Cu31);
         TC1_12.setBackground(Cu21);
         TC1_13.setBackground(Cu11);
         
         TC1_21.setBackground(Cu32);
         TC1_22.setBackground(Cu22);
         TC1_23.setBackground(Cu12);
         
         TC1_31.setBackground(Cu33);
         TC1_32.setBackground(Cu23);
         TC1_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="D1";
              incrementador=incrementador+1;
          }
    }   //Fin del Metodo I1
    
     void I2(){
        for (int i=1; i<=3; i++) {
            C2Z[2][i]=C2[2][i];
            C6Z[2][i]=C6[2][i];
            C4Z[2][i]=C4[2][i];
            C5Z[2][i]=C5[2][i];
        }
        C2[2][1]=C6Z[2][1];
        C2[2][2]=C6Z[2][2];
        C2[2][3]=C6Z[2][3];
        
        C5[2][1]=C2Z[2][1];
        C5[2][2]=C2Z[2][2];
        C5[2][3]=C2Z[2][3];
        
        C4[2][1]=C5Z[2][3];
        C4[2][2]=C5Z[2][2];
        C4[2][3]=C5Z[2][1];
        
        C6[2][3]=C4Z[2][1];
        C6[2][2]=C4Z[2][2];
        C6[2][1]=C4Z[2][3];
        
         //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC5_21.getBackground();
         Ct2=TC5_22.getBackground();
         Ct3=TC5_23.getBackground();

         TC5_21.setBackground(TC2_21.getBackground());
         TC5_22.setBackground(TC2_22.getBackground());
         TC5_23.setBackground(TC2_23.getBackground());

         TC2_21.setBackground(TC6_21.getBackground());
         TC2_22.setBackground(TC6_22.getBackground());
         TC2_23.setBackground(TC6_23.getBackground());

         TC6_21.setBackground(TC4_23.getBackground());
         TC6_22.setBackground(TC4_22.getBackground());
         TC6_23.setBackground(TC4_21.getBackground());

         TC4_21.setBackground(Ct3);
         TC4_22.setBackground(Ct2);
         TC4_23.setBackground(Ct1);
         
          if (n==1) {
              GM[incrementador]="D2";
              incrementador=incrementador+1;
          }
    }//Fin del metodo I2
    
     void I3(){
        for (int i=1; i<=3; i++) {
            C2Z[3][i]=C2[3][i];
            C6Z[3][i]=C6[3][i];
            C4Z[1][i]=C4[1][i];
            C5Z[3][i]=C5[3][i];
        }
        //Almacenar Variables C3
        for (int i =1; i <=3; i++) {
           C3Z[1][i]=C3[1][i];
           C3Z[2][i]=C3[2][i];
           C3Z[3][i]=C3[3][i];          
        }
        C2[3][1]=C6Z[3][1];
        C2[3][2]=C6Z[3][2];
        C2[3][3]=C6Z[3][3];
        
        C5[3][1]=C2Z[3][1];
        C5[3][2]=C2Z[3][2];
        C5[3][3]=C2Z[3][3];
        
        C4[1][1]=C5Z[3][3];
        C4[1][2]=C5Z[3][2];
        C4[1][3]=C5Z[3][1];
        
        C6[3][3]=C4Z[1][1];
        C6[3][2]=C4Z[1][2];
        C6[3][1]=C4Z[1][3];
        
        //Rotacion C3
        C3[1][3]=C3Z[3][3];
        C3[1][2]=C3Z[2][3];
        C3[1][1]=C3Z[1][3];
        
        C3[2][3]=C3Z[3][2];
        C3[2][2]=C3Z[2][2];
        C3[2][1]=C3Z[1][2];
        
        C3[3][3]=C3Z[3][1];
        C3[3][2]=C3Z[2][1];
        C3[3][1]=C3Z[1][1];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC5_31.getBackground();
         Ct2=TC5_32.getBackground();
         Ct3=TC5_33.getBackground();

         TC5_31.setBackground(TC2_31.getBackground());
         TC5_32.setBackground(TC2_32.getBackground());
         TC5_33.setBackground(TC2_33.getBackground());

         TC2_31.setBackground(TC6_31.getBackground());
         TC2_32.setBackground(TC6_32.getBackground());
         TC2_33.setBackground(TC6_33.getBackground());

         TC6_31.setBackground(TC4_13.getBackground());
         TC6_32.setBackground(TC4_12.getBackground());
         TC6_33.setBackground(TC4_11.getBackground());

         TC4_11.setBackground(Ct3);
         TC4_12.setBackground(Ct2);
         TC4_13.setBackground(Ct1);
         
         //Formato de Color Rotacion Abajo
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC3_11.getBackground(); Cu21=TC3_21.getBackground(); Cu31=TC3_31.getBackground();
         Cu12=TC3_12.getBackground(); Cu22=TC3_22.getBackground(); Cu32=TC3_32.getBackground();
         Cu13=TC3_13.getBackground(); Cu23=TC3_23.getBackground(); Cu33=TC3_33.getBackground();
         
         TC3_11.setBackground(Cu31);
         TC3_12.setBackground(Cu21);
         TC3_13.setBackground(Cu11);
         
         TC3_21.setBackground(Cu32);
         TC3_22.setBackground(Cu22);
         TC3_23.setBackground(Cu12);
         
         TC3_31.setBackground(Cu33);
         TC3_32.setBackground(Cu23);
         TC3_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="D3";
              incrementador=incrementador+1;
          }
        
    }//Fin del Metodo I3
    
    //Movimientos de Rotacion Derecha 
     void RD1(){
        for (int i =1; i <=3; i++) {
            C5Z [i][3]=C5[i][3];
            C1Z [3][i]=C1[3][i];
            C6Z[i][1]=C6[i][1];
            C3Z [1][i]=C3[1][i];
        }
        //Guardar Cara C2 Rotacion Derecha parte Frontal
        for (int i = 1; i <=3; i++) {
            C2Z[1][i]=C2[1][i];
            C2Z[2][i]=C2[2][i];
            C2Z[3][i]=C2[3][i];
        }
        
        //Rotacion RD1
        for (int i = 1; i <=3; i++) {
            C1[3][i]=C5Z[4-i][3];
            C6[i][1]=C1Z [3][i];
            C3[1][i]=C6Z [4-i][1];
            C5[i][3]=C3Z [1][i];
        }
        //Rotacion C2 Cara Derecha Parte Frontal
        C2[1][1]=C2Z[3][1];
        C2[1][2]=C2Z[2][1];
        C2[1][3]=C2Z[1][1];
        
        C2[2][1]=C2Z[3][2];
        C2[2][2]=C2Z[2][2];
        C2[2][3]=C2Z[1][2];
        
        C2[3][1]=C2Z[3][3];
        C2[3][2]=C2Z[2][3];
        C2[3][3]=C2Z[1][3];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC6_11.getBackground();
         Ct2=TC6_21.getBackground();
         Ct3=TC6_31.getBackground();

         TC6_11.setBackground(TC1_31.getBackground());
         TC6_21.setBackground(TC1_32.getBackground());
         TC6_31.setBackground(TC1_33.getBackground());

         TC1_31.setBackground(TC5_33.getBackground());
         TC1_32.setBackground(TC5_23.getBackground());
         TC1_33.setBackground(TC5_13.getBackground());

         TC5_13.setBackground(TC3_11.getBackground());
         TC5_23.setBackground(TC3_12.getBackground());
         TC5_33.setBackground(TC3_13.getBackground());

         TC3_11.setBackground(Ct3);
         TC3_12.setBackground(Ct2);
         TC3_13.setBackground(Ct1);
         
          //Formato de Color Rotacion Arriba
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC2_11.getBackground(); Cu21=TC2_21.getBackground(); Cu31=TC2_31.getBackground();
         Cu12=TC2_12.getBackground(); Cu22=TC2_22.getBackground(); Cu32=TC2_32.getBackground();
         Cu13=TC2_13.getBackground(); Cu23=TC2_23.getBackground(); Cu33=TC2_33.getBackground();
         
         TC2_11.setBackground(Cu31);
         TC2_12.setBackground(Cu21);
         TC2_13.setBackground(Cu11);
         
         TC2_21.setBackground(Cu32);
         TC2_22.setBackground(Cu22);
         TC2_23.setBackground(Cu12);
         
         TC2_31.setBackground(Cu33);
         TC2_32.setBackground(Cu23);
         TC2_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="RI1";
              incrementador=incrementador+1;
          }
        
    } //Fin del Metodo RD1
     void RD2(){
        for (int i =1; i <=3; i++) {
            C5Z [i][2]=C5[i][2];
            C1Z [2][i]=C1[2][i];
            C6Z[i][2]=C6[i][2];
            C3Z [2][i]=C3[2][i];
        }
        //Rotacion RD2
        for (int i = 1; i <=3; i++) {
            C1[2][i]=C5Z[4-i][2];
            C6[i][2]=C1Z [2][i];
            C3[2][i]=C6Z [4-i][2];
            C5[i][2]=C3Z [2][i];
        }
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC6_12.getBackground();
         Ct2=TC6_22.getBackground();
         Ct3=TC6_32.getBackground();

         TC6_12.setBackground(TC1_21.getBackground());
         TC6_22.setBackground(TC1_22.getBackground());
         TC6_32.setBackground(TC1_23.getBackground());

         TC1_21.setBackground(TC5_32.getBackground());
         TC1_22.setBackground(TC5_22.getBackground());
         TC1_23.setBackground(TC5_12.getBackground());

         TC5_12.setBackground(TC3_21.getBackground());
         TC5_22.setBackground(TC3_22.getBackground());
         TC5_32.setBackground(TC3_23.getBackground());

         TC3_21.setBackground(Ct3);
         TC3_22.setBackground(Ct2);
         TC3_23.setBackground(Ct1);
         
          if (n==1) {
              GM[incrementador]="RI2";
              incrementador=incrementador+1;
          }
    }// Fin del Metodo RD2
    
     void RD3(){
        for (int i =1; i <=3; i++) {
            C5Z [i][1]=C5[i][1];
            C1Z [1][i]=C1[1][i];
            C6Z[i][3]=C6[i][3];
            C3Z [3][i]=C3[3][i];
        }
        
        //Guardar Cara C4 Rotacion Derecha parte Trasera
        for (int i = 1; i <=3; i++) {
            C4Z[1][i]=C4[1][i];
            C4Z[2][i]=C4[2][i];
            C4Z[3][i]=C4[3][i];
        }
        //Rotacion RD3
        for (int i = 1; i <=3; i++) {
            C1[1][i]=C5Z[4-i][1];
            C6[i][3]=C1Z [1][i];
            C3[3][i]=C6Z [4-i][3];
            C5[i][1]=C3Z [3][i];
        }
        
        //Rotacion C4 Cara Derecha Parte Trasera
        C4[1][1]=C4Z[1][3];
        C4[1][2]=C4Z[2][3];
        C4[1][3]=C4Z[3][3];
        
        C4[2][1]=C4Z[1][2];
        C4[2][2]=C4Z[2][2];
        C4[2][3]=C4Z[3][2];
        
        C4[3][1]=C4Z[1][1];
        C4[3][2]=C4Z[2][1];
        C4[3][3]=C4Z[3][1];
        
        //Formato Color
        
        Color Ct1,Ct2,Ct3;
        Ct1=TC6_13.getBackground();
        Ct2=TC6_23.getBackground();
        Ct3=TC6_33.getBackground();
        
         TC6_13.setBackground(TC1_11.getBackground());
         TC6_23.setBackground(TC1_12.getBackground());
         TC6_33.setBackground(TC1_13.getBackground());

         TC1_11.setBackground(TC5_31.getBackground());
         TC1_12.setBackground(TC5_21.getBackground());
         TC1_13.setBackground(TC5_11.getBackground());

         TC5_11.setBackground(TC3_31.getBackground());
         TC5_21.setBackground(TC3_32.getBackground());
         TC5_31.setBackground(TC3_33.getBackground());

         TC3_31.setBackground(Ct3);
         TC3_32.setBackground(Ct2);
         TC3_33.setBackground(Ct1);
         
          //Formato de Color Rotacion C4
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC4_11.getBackground(); Cu21=TC4_21.getBackground(); Cu31=TC4_31.getBackground();
         Cu12=TC4_12.getBackground(); Cu22=TC4_22.getBackground(); Cu32=TC4_32.getBackground();
         Cu13=TC4_13.getBackground(); Cu23=TC4_23.getBackground(); Cu33=TC4_33.getBackground();
         
         TC4_11.setBackground(Cu13);
         TC4_12.setBackground(Cu23);
         TC4_13.setBackground(Cu33);
         
         TC4_21.setBackground(Cu12);
         TC4_22.setBackground(Cu22);
         TC4_23.setBackground(Cu32);
         
         TC4_31.setBackground(Cu11);
         TC4_32.setBackground(Cu21);
         TC4_33.setBackground(Cu31);
         
          if (n==1) {
              GM[incrementador]="RI3";
              incrementador=incrementador+1;
          }
    } //Fin del Metodo RD3
    
    //Movimientos de Rotacion Izquierda
     void RI1(){
        for (int i =1; i <=3; i++) {
            C5Z [i][3]=C5[i][3];
            C1Z [3][i]=C1[3][i];
            C6Z[i][1]=C6[i][1];
            C3Z [1][i]=C3[1][i];
        }
        //Guardar Cara C2 Rotacion Derecha parte Frontal
        for (int i = 1; i <=3; i++) {
            C2Z[1][i]=C2[1][i];
            C2Z[2][i]=C2[2][i];
            C2Z[3][i]=C2[3][i];
        }
        //Rotacion RI1
        for (int i = 1; i <=3; i++) {
            C1[3][i]=C6Z[i][1];
            C6[i][1]=C3Z [1][4-i];
            C3[1][i]=C5Z [i][3];
            C5[i][3]=C1Z [3][4-i];
        }
         //Rotacion C2 Cara Derecha Parte Frontal
        C2[1][1]=C2Z[1][3];
        C2[1][2]=C2Z[2][3];
        C2[1][3]=C2Z[3][3];
        
        C2[2][1]=C2Z[1][2];
        C2[2][2]=C2Z[2][2];
        C2[2][3]=C2Z[3][2];
        
        C2[3][1]=C2Z[1][1];
        C2[3][2]=C2Z[2][1];
        C2[3][3]=C2Z[3][1];
        
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC5_13.getBackground();
         Ct2=TC5_23.getBackground();
         Ct3=TC5_33.getBackground();

         TC5_13.setBackground(TC1_33.getBackground());
         TC5_23.setBackground(TC1_32.getBackground());
         TC5_33.setBackground(TC1_31.getBackground());

         TC1_31.setBackground(TC6_11.getBackground());
         TC1_32.setBackground(TC6_21.getBackground());
         TC1_33.setBackground(TC6_31.getBackground());

         TC6_11.setBackground(TC3_13.getBackground());
         TC6_21.setBackground(TC3_12.getBackground());
         TC6_31.setBackground(TC3_11.getBackground());

         TC3_11.setBackground(Ct1);
         TC3_12.setBackground(Ct2);
         TC3_13.setBackground(Ct3);
         
         //Formato de Color Rotacion Media
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC2_11.getBackground(); Cu21=TC2_21.getBackground(); Cu31=TC2_31.getBackground();
         Cu12=TC2_12.getBackground(); Cu22=TC2_22.getBackground(); Cu32=TC2_32.getBackground();
         Cu13=TC2_13.getBackground(); Cu23=TC2_23.getBackground(); Cu33=TC2_33.getBackground();
         
         TC2_11.setBackground(Cu13);
         TC2_12.setBackground(Cu23);
         TC2_13.setBackground(Cu33);
         
         TC2_21.setBackground(Cu12);
         TC2_22.setBackground(Cu22);
         TC2_23.setBackground(Cu32);
         
         TC2_31.setBackground(Cu11);
         TC2_32.setBackground(Cu21);
         TC2_33.setBackground(Cu31);
         
          if (n==1) {
              GM[incrementador]="RD1";
              incrementador=incrementador+1;
          }
        
        
    }// FIn del Metodo RI1
    
     void RI2(){
        for (int i =1; i <=3; i++) {
            C5Z [i][2]=C5[i][2];
            C1Z [2][i]=C1[2][i];
            C6Z[i][2]=C6[i][2];
            C3Z [2][i]=C3[2][i];
        }
        //Rotacion RI2
        for (int i = 1; i <=3; i++) {
            C1[2][i]=C6Z[i][2];
            C6[i][2]=C3Z [2][4-i];
            C3[2][i]=C5Z [i][2];
            C5[i][2]=C1Z [2][4-i];
        }
        //Formato para Color
         Color Ct1,Ct2,Ct3;
         Ct1=TC5_12.getBackground();
         Ct2=TC5_22.getBackground();
         Ct3=TC5_32.getBackground();

         TC5_12.setBackground(TC1_23.getBackground());
         TC5_22.setBackground(TC1_22.getBackground());
         TC5_32.setBackground(TC1_21.getBackground());

         TC1_21.setBackground(TC6_12.getBackground());
         TC1_22.setBackground(TC6_22.getBackground());
         TC1_23.setBackground(TC6_32.getBackground());

         TC6_12.setBackground(TC3_23.getBackground());
         TC6_22.setBackground(TC3_22.getBackground());
         TC6_32.setBackground(TC3_21.getBackground());

         TC3_21.setBackground(Ct1);
         TC3_22.setBackground(Ct2);
         TC3_23.setBackground(Ct3);
         
          if (n==1) {
              GM[incrementador]="RD2";
              incrementador=incrementador+1;
          }
    }//Fin del Metodo RI2
    
     void RI3(){
        for (int i =1; i <=3; i++) {
            C5Z [i][1]=C5[i][1];
            C1Z [1][i]=C1[1][i];
            C6Z[i][3]=C6[i][3];
            C3Z [3][i]=C3[3][i];
        }
        
        //Guardar Cara C4 Rotacion Izquierda parte Trasera
        for (int i = 1; i <=3; i++) {
            C4Z[1][i]=C4[1][i];
            C4Z[2][i]=C4[2][i];
            C4Z[3][i]=C4[3][i];
        }
        //Rotacion RI3
        for (int i = 1; i <=3; i++) {
            C1[1][i]=C6Z[i][3];
            C5[i][1]=C1Z [1][4-i];
            C3[3][i]=C5Z [i][1];
            C6[i][3]=C3Z [3][4-i];
        }
        //Rotacion C4 Cara Izquierda Parte Trasera
        C4[1][1]=C4Z[3][1];
        C4[1][2]=C4Z[2][1];
        C4[1][3]=C4Z[1][1];
        
        C4[2][1]=C4Z[3][2];
        C4[2][2]=C4Z[2][2];
        C4[2][3]=C4Z[1][2];
        
        C4[3][1]=C4Z[3][3];
        C4[3][2]=C4Z[2][3];
        C4[3][3]=C4Z[1][3];
        
        //Formato Color
        
        Color Ct1,Ct2,Ct3;
        Ct1=TC5_11.getBackground();
        Ct2=TC5_21.getBackground();
        Ct3=TC5_31.getBackground();
        
         TC5_11.setBackground(TC1_13.getBackground());
         TC5_21.setBackground(TC1_12.getBackground());
         TC5_31.setBackground(TC1_11.getBackground());

         TC1_11.setBackground(TC6_13.getBackground());
         TC1_12.setBackground(TC6_23.getBackground());
         TC1_13.setBackground(TC6_33.getBackground());

         TC6_13.setBackground(TC3_33.getBackground());
         TC6_23.setBackground(TC3_32.getBackground());
         TC6_33.setBackground(TC3_31.getBackground());

         TC3_31.setBackground(Ct1);
         TC3_32.setBackground(Ct2);
         TC3_33.setBackground(Ct3);
         
         //Formato de Color Rotacion C4
         Color Cu11,Cu12,Cu13,Cu21,Cu22,Cu23,Cu31,Cu32,Cu33;
         
         Cu11=TC4_11.getBackground(); Cu21=TC4_21.getBackground(); Cu31=TC4_31.getBackground();
         Cu12=TC4_12.getBackground(); Cu22=TC4_22.getBackground(); Cu32=TC4_32.getBackground();
         Cu13=TC4_13.getBackground(); Cu23=TC4_23.getBackground(); Cu33=TC4_33.getBackground();
         
         TC4_11.setBackground(Cu31);
         TC4_12.setBackground(Cu21);
         TC4_13.setBackground(Cu11);
         
         TC4_21.setBackground(Cu32);
         TC4_22.setBackground(Cu22);
         TC4_23.setBackground(Cu12);
         
         TC4_31.setBackground(Cu33);
         TC4_32.setBackground(Cu23);
         TC4_33.setBackground(Cu13);
         
          if (n==1) {
              GM[incrementador]="RD3";
              incrementador=incrementador+1;
          }
        
    }
    
    
    void VerEtiquetas(){
    String a11,a12,a13,a21,a22,a23,a31,a32,a33;
    a11=String.valueOf(C1[1][1]);   TC1_11.setText(a11);
    a12=String.valueOf(C1[1][2]);   TC1_12.setText(a12);
    a13=String.valueOf(C1[1][3]);   TC1_13.setText(a13);
    
    a21=String.valueOf(C1[2][1]);   TC1_21.setText(a21);
    a22=String.valueOf(C1[2][2]);   TC1_22.setText(a22);
    a23=String.valueOf(C1[2][3]);   TC1_23.setText(a23);
    
    a31=String.valueOf(C1[3][1]);   TC1_31.setText(a31);
    a32=String.valueOf(C1[3][2]);   TC1_32.setText(a32);
    a33=String.valueOf(C1[3][3]);   TC1_33.setText(a33);

        
    a11=String.valueOf(C2[1][1]);
    a12=String.valueOf(C2[1][2]);
    a13=String.valueOf(C2[1][3]);
    
    a21=String.valueOf(C2[2][1]);
    a22=String.valueOf(C2[2][2]);
    a23=String.valueOf(C2[2][3]);
    
    a31=String.valueOf(C2[3][1]);
    a32=String.valueOf(C2[3][2]);
    a33=String.valueOf(C2[3][3]);    
    
    TC2_11.setText(a11);
    TC2_12.setText(a12);
    TC2_13.setText(a13);

    TC2_21.setText(a21);
    TC2_22.setText(a22);
    TC2_23.setText(a23);

    TC2_31.setText(a31);
    TC2_32.setText(a32);
    TC2_33.setText(a33);
        
    a11=String.valueOf(C3[1][1]);
    a12=String.valueOf(C3[1][2]);
    a13=String.valueOf(C3[1][3]);
    
    a21=String.valueOf(C3[2][1]);
    a22=String.valueOf(C3[2][2]);
    a23=String.valueOf(C3[2][3]);
    
    a31=String.valueOf(C3[3][1]);
    a32=String.valueOf(C3[3][2]);
    a33=String.valueOf(C3[3][3]);    
    
        TC3_11.setText(a11);
        TC3_12.setText(a12);
        TC3_13.setText(a13);
        
        TC3_21.setText(a21);
        TC3_22.setText(a22);
        TC3_23.setText(a23);
        
        TC3_31.setText(a31);
        TC3_32.setText(a32);
        TC3_33.setText(a33);
        
    a11=String.valueOf(C4[1][1]);
    a12=String.valueOf(C4[1][2]);
    a13=String.valueOf(C4[1][3]);
    
    a21=String.valueOf(C4[2][1]);
    a22=String.valueOf(C4[2][2]);
    a23=String.valueOf(C4[2][3]);
    
    a31=String.valueOf(C4[3][1]);
    a32=String.valueOf(C4[3][2]);
    a33=String.valueOf(C4[3][3]);    
    
        TC4_11.setText(a11);
        TC4_12.setText(a12);
        TC4_13.setText(a13);
        
        TC4_21.setText(a21);
        TC4_22.setText(a22);
        TC4_23.setText(a23);
        
        TC4_31.setText(a31);
        TC4_32.setText(a32);
        TC4_33.setText(a33);
        
    a11=String.valueOf(C5[1][1]);   TC5_11.setText(a11);
    a12=String.valueOf(C5[1][2]);   TC5_12.setText(a12);
    a13=String.valueOf(C5[1][3]);   TC5_13.setText(a13);
    
    a21=String.valueOf(C5[2][1]);   TC5_21.setText(a21);
    a22=String.valueOf(C5[2][2]);   TC5_22.setText(a22);
    a23=String.valueOf(C5[2][3]);   TC5_23.setText(a23);
    
    a31=String.valueOf(C5[3][1]);   TC5_31.setText(a31);
    a32=String.valueOf(C5[3][2]);   TC5_32.setText(a32);
    a33=String.valueOf(C5[3][3]);   TC5_33.setText(a33);
    
    a11=String.valueOf(C6[1][1]);   TC6_11.setText(a11);
    a12=String.valueOf(C6[1][2]);   TC6_12.setText(a12);
    a13=String.valueOf(C6[1][3]);   TC6_13.setText(a13);
    
    a21=String.valueOf(C6[2][1]);   TC6_21.setText(a21);
    a22=String.valueOf(C6[2][2]);   TC6_22.setText(a22);
    a23=String.valueOf(C6[2][3]);   TC6_23.setText(a23);
    
    a31=String.valueOf(C6[3][1]);   TC6_31.setText(a31);
    a32=String.valueOf(C6[3][2]);   TC6_32.setText(a32);
    a33=String.valueOf(C6[3][3]);   TC6_33.setText(a33);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TC1_11 = new javax.swing.JTextField();
        TC1_33 = new javax.swing.JTextField();
        TC1_13 = new javax.swing.JTextField();
        TC1_12 = new javax.swing.JTextField();
        TC1_21 = new javax.swing.JTextField();
        TC1_22 = new javax.swing.JTextField();
        TC1_23 = new javax.swing.JTextField();
        TC1_31 = new javax.swing.JTextField();
        TC1_32 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        TC2_11 = new javax.swing.JTextField();
        TC2_33 = new javax.swing.JTextField();
        TC2_13 = new javax.swing.JTextField();
        TC2_12 = new javax.swing.JTextField();
        TC2_21 = new javax.swing.JTextField();
        TC2_22 = new javax.swing.JTextField();
        TC2_23 = new javax.swing.JTextField();
        TC2_31 = new javax.swing.JTextField();
        TC2_32 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        TC3_11 = new javax.swing.JTextField();
        TC3_33 = new javax.swing.JTextField();
        TC3_13 = new javax.swing.JTextField();
        TC3_12 = new javax.swing.JTextField();
        TC3_21 = new javax.swing.JTextField();
        TC3_22 = new javax.swing.JTextField();
        TC3_23 = new javax.swing.JTextField();
        TC3_31 = new javax.swing.JTextField();
        TC3_32 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        TC4_11 = new javax.swing.JTextField();
        TC4_33 = new javax.swing.JTextField();
        TC4_13 = new javax.swing.JTextField();
        TC4_12 = new javax.swing.JTextField();
        TC4_21 = new javax.swing.JTextField();
        TC4_22 = new javax.swing.JTextField();
        TC4_23 = new javax.swing.JTextField();
        TC4_31 = new javax.swing.JTextField();
        TC4_32 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TC5_11 = new javax.swing.JTextField();
        TC5_33 = new javax.swing.JTextField();
        TC5_13 = new javax.swing.JTextField();
        TC5_12 = new javax.swing.JTextField();
        TC5_21 = new javax.swing.JTextField();
        TC5_22 = new javax.swing.JTextField();
        TC5_23 = new javax.swing.JTextField();
        TC5_31 = new javax.swing.JTextField();
        TC5_32 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        TC6_11 = new javax.swing.JTextField();
        TC6_33 = new javax.swing.JTextField();
        TC6_13 = new javax.swing.JTextField();
        TC6_12 = new javax.swing.JTextField();
        TC6_21 = new javax.swing.JTextField();
        TC6_22 = new javax.swing.JTextField();
        TC6_23 = new javax.swing.JTextField();
        TC6_31 = new javax.swing.JTextField();
        TC6_32 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN_START = new javax.swing.JButton();
        BTN_RESOLVER = new javax.swing.JButton();
        BTN_A3 = new javax.swing.JButton();
        BTN_A1 = new javax.swing.JButton();
        BTN_A2 = new javax.swing.JButton();
        BTN_B3 = new javax.swing.JButton();
        BTN_B1 = new javax.swing.JButton();
        BTN_B2 = new javax.swing.JButton();
        BTN_D3 = new javax.swing.JButton();
        BTN_D1 = new javax.swing.JButton();
        BTN_D2 = new javax.swing.JButton();
        BTN_I3 = new javax.swing.JButton();
        BTN_I1 = new javax.swing.JButton();
        BTN_I2 = new javax.swing.JButton();
        BTN_RI1 = new javax.swing.JButton();
        BTN_RI3 = new javax.swing.JButton();
        BTN_RI2 = new javax.swing.JButton();
        BTN_RD3 = new javax.swing.JButton();
        BTN_RD1 = new javax.swing.JButton();
        BTN_RD2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC1_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_11.setText("11");
        TC1_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC1_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_33.setText("11");
        TC1_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC1_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_13.setText("11");
        TC1_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC1_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_12.setText("11");
        TC1_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC1_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_21.setText("11");
        TC1_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC1_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_22.setText("11");
        TC1_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TC1_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TC1_22ActionPerformed(evt);
            }
        });
        jPanel1.add(TC1_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC1_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_23.setText("11");
        TC1_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC1_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_31.setText("11");
        TC1_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC1_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC1_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC1_32.setText("11");
        TC1_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TC1_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 120, 120));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC2_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_11.setText("11");
        TC2_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC2_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_33.setText("11");
        TC2_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC2_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_13.setText("11");
        TC2_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC2_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_12.setText("11");
        TC2_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC2_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_21.setText("11");
        TC2_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC2_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_22.setText("11");
        TC2_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC2_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_23.setText("11");
        TC2_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC2_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_31.setText("11");
        TC2_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC2_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC2_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC2_32.setText("11");
        TC2_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(TC2_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 120, 120));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC3_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_11.setText("11");
        TC3_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC3_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_33.setText("11");
        TC3_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC3_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_13.setText("11");
        TC3_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC3_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_12.setText("11");
        TC3_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC3_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_21.setText("11");
        TC3_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC3_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_22.setText("11");
        TC3_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC3_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_23.setText("11");
        TC3_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC3_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_31.setText("11");
        TC3_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC3_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC3_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC3_32.setText("11");
        TC3_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(TC3_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 120, 120));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC4_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_11.setText("11");
        TC4_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC4_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_33.setText("11");
        TC4_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC4_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_13.setText("11");
        TC4_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC4_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_12.setText("11");
        TC4_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC4_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_21.setText("11");
        TC4_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC4_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_22.setText("11");
        TC4_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC4_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_23.setText("11");
        TC4_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC4_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_31.setText("11");
        TC4_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC4_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC4_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC4_32.setText("11");
        TC4_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.add(TC4_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 120, 120));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC5_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_11.setText("11");
        TC5_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC5_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_33.setText("11");
        TC5_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC5_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_13.setText("11");
        TC5_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC5_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_12.setText("11");
        TC5_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC5_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_21.setText("11");
        TC5_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC5_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_22.setText("11");
        TC5_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC5_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_23.setText("11");
        TC5_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC5_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_31.setText("11");
        TC5_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC5_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC5_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC5_32.setText("11");
        TC5_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.add(TC5_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 120, 120));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TC6_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_11.setText("11");
        TC6_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 32));

        TC6_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_33.setText("11");
        TC6_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 37, 32));

        TC6_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_13.setText("11");
        TC6_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 37, 32));

        TC6_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_12.setText("11");
        TC6_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 37, 32));

        TC6_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_21.setText("11");
        TC6_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 37, 32));

        TC6_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_22.setText("11");
        TC6_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 37, 32));

        TC6_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_23.setText("11");
        TC6_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 37, 32));

        TC6_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_31.setText("11");
        TC6_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 37, 32));

        TC6_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TC6_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TC6_32.setText("11");
        TC6_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(TC6_32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 37, 32));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 120, 120));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 80, 30));

        BTN_START.setText("Iniciar");
        BTN_START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_STARTActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_START, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, -1));

        BTN_RESOLVER.setText("Resolver");
        BTN_RESOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RESOLVERActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RESOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, -1, -1));

        BTN_A3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_A3.setText("A3");
        BTN_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_A3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 40, 20));

        BTN_A1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_A1.setText("A1");
        BTN_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_A1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 40, 20));

        BTN_A2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_A2.setText("A2");
        BTN_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_A2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 40, 20));

        BTN_B3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_B3.setText("B3");
        BTN_B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_B3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 40, 20));

        BTN_B1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_B1.setText("B1");
        BTN_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_B1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 40, 20));

        BTN_B2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_B2.setText("B2");
        BTN_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_B2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 40, 20));

        BTN_D3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_D3.setText("D3");
        BTN_D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_D3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 40, 20));

        BTN_D1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_D1.setText("D1");
        BTN_D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_D1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 40, 20));

        BTN_D2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_D2.setText("D2");
        BTN_D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_D2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 40, 20));

        BTN_I3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_I3.setText("I3");
        BTN_I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_I3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 40, 20));

        BTN_I1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_I1.setText("I1");
        BTN_I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_I1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 40, 20));

        BTN_I2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_I2.setText("I2");
        BTN_I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_I2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 40, 20));

        BTN_RI1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RI1.setText("Ri1");
        BTN_RI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RI1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 50, 20));

        BTN_RI3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RI3.setText("RI3");
        BTN_RI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RI3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 50, 20));

        BTN_RI2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RI2.setText("RI2");
        BTN_RI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RI2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 50, 20));

        BTN_RD3.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RD3.setText("RD3");
        BTN_RD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RD3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 50, 20));

        BTN_RD1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RD1.setText("RD1");
        BTN_RD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RD1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 50, 20));

        BTN_RD2.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        BTN_RD2.setText("RD2");
        BTN_RD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RD2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_RD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TC1_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TC1_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TC1_22ActionPerformed

    private void BTN_STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_STARTActionPerformed
        //Iniciar Valores
        
        TC1_11.setText("11");
        TC1_12.setText("12");
        TC1_13.setText("13");
        
        TC1_21.setText("14");
        TC1_22.setText("15");
        TC1_23.setText("16");
        
        TC1_31.setText("17");
        TC1_32.setText("18");
        TC1_33.setText("19");
        
        TC2_11.setText("21");
        TC2_12.setText("22");
        TC2_13.setText("23");
        
        TC2_21.setText("24");
        TC2_22.setText("25");
        TC2_23.setText("26");
        
        TC2_31.setText("27");
        TC2_32.setText("28");
        TC2_33.setText("29");
        
        TC3_11.setText("31");
        TC3_12.setText("32");
        TC3_13.setText("33");
        
        TC3_21.setText("34");
        TC3_22.setText("35");
        TC3_23.setText("36");
        
        TC3_31.setText("37");
        TC3_32.setText("38");
        TC3_33.setText("39");
        
        TC4_11.setText("41");
        TC4_12.setText("42");
        TC4_13.setText("43");
        
        TC4_21.setText("44");
        TC4_22.setText("45");
        TC4_23.setText("46");
        
        TC4_31.setText("47");
        TC4_32.setText("48");
        TC4_33.setText("49");
        TC5_11.setText("51");
        TC5_12.setText("52");
        TC5_13.setText("53");
        
        TC5_21.setText("54");
        TC5_22.setText("55");
        TC5_23.setText("56");
        
        TC5_31.setText("57");
        TC5_32.setText("58");
        TC5_33.setText("59");
        
        TC6_11.setText("61");
        TC6_12.setText("62");
        TC6_13.setText("63");
        
        TC6_21.setText("64");
        TC6_22.setText("65");
        TC6_23.setText("66");
        
        TC6_31.setText("67");
        TC6_32.setText("68");
        TC6_33.setText("69");
        
        //Guardar Colores
        
        //Cara_1
        TC1_11.setBackground(Color.red);
        TC1_12.setBackground(Color.red);
        TC1_13.setBackground(Color.red);
        
        TC1_21.setBackground(Color.red);
        TC1_22.setBackground(Color.red);
        TC1_23.setBackground(Color.red);
        
        TC1_31.setBackground(Color.red);
        TC1_32.setBackground(Color.red);
        TC1_33.setBackground(Color.red);
        
        //Cara_2
        TC2_11.setBackground(Color.yellow);
        TC2_12.setBackground(Color.yellow);
        TC2_13.setBackground(Color.yellow);
        
        TC2_21.setBackground(Color.yellow);
        TC2_22.setBackground(Color.yellow);
        TC2_23.setBackground(Color.yellow);
        
        TC2_31.setBackground(Color.yellow);
        TC2_32.setBackground(Color.yellow);
        TC2_33.setBackground(Color.yellow);
        
        //Cara_3
        TC3_11.setBackground(Color.orange);
        TC3_12.setBackground(Color.orange);
        TC3_13.setBackground(Color.orange);
        
        TC3_21.setBackground(Color.orange);
        TC3_22.setBackground(Color.orange);
        TC3_23.setBackground(Color.orange);
        
        TC3_31.setBackground(Color.orange);
        TC3_32.setBackground(Color.orange);
        TC3_33.setBackground(Color.orange);
        
        //Cara_4
        TC4_11.setBackground(Color.white);
        TC4_12.setBackground(Color.white);
        TC4_13.setBackground(Color.white);
        
        TC4_21.setBackground(Color.white);
        TC4_22.setBackground(Color.white);
        TC4_23.setBackground(Color.white);
        
        TC4_31.setBackground(Color.white);
        TC4_32.setBackground(Color.white);
        TC4_33.setBackground(Color.white);
        
        //Cara_5
        TC5_11.setBackground(Color.green);
        TC5_12.setBackground(Color.green);
        TC5_13.setBackground(Color.green);
        
        TC5_21.setBackground(Color.green);
        TC5_22.setBackground(Color.green);
        TC5_23.setBackground(Color.green);
        
        TC5_31.setBackground(Color.green);
        TC5_32.setBackground(Color.green);
        TC5_33.setBackground(Color.green);
        
        //Cara_6
         TC6_11.setBackground(Color.blue);
        TC6_12.setBackground(Color.blue);
        TC6_13.setBackground(Color.blue);
        
        TC6_21.setBackground(Color.blue);
        TC6_22.setBackground(Color.blue);
        TC6_23.setBackground(Color.blue);
        
        TC6_31.setBackground(Color.blue);
        TC6_32.setBackground(Color.blue);
        TC6_33.setBackground(Color.blue);
    }//GEN-LAST:event_BTN_STARTActionPerformed

    private void BTN_RESOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RESOLVERActionPerformed
        n=0;
        Resolver();
    }//GEN-LAST:event_BTN_RESOLVERActionPerformed
    
    //BotonA3
    private void BTN_A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_A3ActionPerformed
        
        A3();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_A3ActionPerformed
    
    //Boton A1
    private void BTN_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_A1ActionPerformed

        A1();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_A1ActionPerformed
    
    //Boton A2
    private void BTN_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_A2ActionPerformed
        
        A2();
         VerEtiquetas();
         Resolver();
    }//GEN-LAST:event_BTN_A2ActionPerformed
    
    //Boton B3
    private void BTN_B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_B3ActionPerformed
         
         B3();
         VerEtiquetas();
         Resolver();
    }//GEN-LAST:event_BTN_B3ActionPerformed
    
    //Boton B1
    private void BTN_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_B1ActionPerformed
         
         B1();
         VerEtiquetas();
         Resolver();
    }//GEN-LAST:event_BTN_B1ActionPerformed
    
    //BotonB2
    private void BTN_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_B2ActionPerformed
        
        B2();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_B2ActionPerformed
    
    //BotonD3
    private void BTN_D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_D3ActionPerformed
        
        D3();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_D3ActionPerformed
    
    //BotonD1
    private void BTN_D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_D1ActionPerformed
        
        D1();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_D1ActionPerformed

    //BotonD2
    private void BTN_D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_D2ActionPerformed
        
        D2();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_D2ActionPerformed

    //BotonI3
    private void BTN_I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_I3ActionPerformed
        
        I3();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_I3ActionPerformed

    //BotonI1
    private void BTN_I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_I1ActionPerformed
        
        I1();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_I1ActionPerformed

    //BotonI2
    private void BTN_I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_I2ActionPerformed
        
        I2();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_I2ActionPerformed

    //BotonRI1
    private void BTN_RI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RI1ActionPerformed
        
        RI1();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_RI1ActionPerformed

    //BotonRI3
    private void BTN_RI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RI3ActionPerformed
        
        RI3();
        VerEtiquetas();
        Resolver();
        
    }//GEN-LAST:event_BTN_RI3ActionPerformed

    //BotonRI2
    private void BTN_RI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RI2ActionPerformed
        
        RI2();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_RI2ActionPerformed

    //BotonRD3
    private void BTN_RD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RD3ActionPerformed
        
        RD3();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_RD3ActionPerformed

    //BotonRD1
    private void BTN_RD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RD1ActionPerformed

        RD1();
        VerEtiquetas();
        Resolver();
    }//GEN-LAST:event_BTN_RD1ActionPerformed

    //BotonRD2
    private void BTN_RD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RD2ActionPerformed
       
       RD2();
       VerEtiquetas();
       Resolver();
    }//GEN-LAST:event_BTN_RD2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_A1;
    private javax.swing.JButton BTN_A2;
    private javax.swing.JButton BTN_A3;
    private javax.swing.JButton BTN_B1;
    private javax.swing.JButton BTN_B2;
    private javax.swing.JButton BTN_B3;
    private javax.swing.JButton BTN_D1;
    private javax.swing.JButton BTN_D2;
    private javax.swing.JButton BTN_D3;
    private javax.swing.JButton BTN_I1;
    private javax.swing.JButton BTN_I2;
    private javax.swing.JButton BTN_I3;
    private javax.swing.JButton BTN_RD1;
    private javax.swing.JButton BTN_RD2;
    private javax.swing.JButton BTN_RD3;
    private javax.swing.JButton BTN_RESOLVER;
    private javax.swing.JButton BTN_RI1;
    private javax.swing.JButton BTN_RI2;
    private javax.swing.JButton BTN_RI3;
    private javax.swing.JButton BTN_START;
    private javax.swing.JTextField TC1_11;
    private javax.swing.JTextField TC1_12;
    private javax.swing.JTextField TC1_13;
    private javax.swing.JTextField TC1_21;
    private javax.swing.JTextField TC1_22;
    private javax.swing.JTextField TC1_23;
    private javax.swing.JTextField TC1_31;
    private javax.swing.JTextField TC1_32;
    private javax.swing.JTextField TC1_33;
    private javax.swing.JTextField TC2_11;
    private javax.swing.JTextField TC2_12;
    private javax.swing.JTextField TC2_13;
    private javax.swing.JTextField TC2_21;
    private javax.swing.JTextField TC2_22;
    private javax.swing.JTextField TC2_23;
    private javax.swing.JTextField TC2_31;
    private javax.swing.JTextField TC2_32;
    private javax.swing.JTextField TC2_33;
    private javax.swing.JTextField TC3_11;
    private javax.swing.JTextField TC3_12;
    private javax.swing.JTextField TC3_13;
    private javax.swing.JTextField TC3_21;
    private javax.swing.JTextField TC3_22;
    private javax.swing.JTextField TC3_23;
    private javax.swing.JTextField TC3_31;
    private javax.swing.JTextField TC3_32;
    private javax.swing.JTextField TC3_33;
    private javax.swing.JTextField TC4_11;
    private javax.swing.JTextField TC4_12;
    private javax.swing.JTextField TC4_13;
    private javax.swing.JTextField TC4_21;
    private javax.swing.JTextField TC4_22;
    private javax.swing.JTextField TC4_23;
    private javax.swing.JTextField TC4_31;
    private javax.swing.JTextField TC4_32;
    private javax.swing.JTextField TC4_33;
    private javax.swing.JTextField TC5_11;
    private javax.swing.JTextField TC5_12;
    private javax.swing.JTextField TC5_13;
    private javax.swing.JTextField TC5_21;
    private javax.swing.JTextField TC5_22;
    private javax.swing.JTextField TC5_23;
    private javax.swing.JTextField TC5_31;
    private javax.swing.JTextField TC5_32;
    private javax.swing.JTextField TC5_33;
    private javax.swing.JTextField TC6_11;
    private javax.swing.JTextField TC6_12;
    private javax.swing.JTextField TC6_13;
    private javax.swing.JTextField TC6_21;
    private javax.swing.JTextField TC6_22;
    private javax.swing.JTextField TC6_23;
    private javax.swing.JTextField TC6_31;
    private javax.swing.JTextField TC6_32;
    private javax.swing.JTextField TC6_33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
