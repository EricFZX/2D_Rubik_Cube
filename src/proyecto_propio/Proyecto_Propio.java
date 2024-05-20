
package proyecto_propio;

import java.util.Scanner;

public class Proyecto_Propio {
    
    //Variables Globales
    static String s ="\t";
    
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
    
    //Arreglo Menu
    static String A[]={"","A1[1]","A2[2]","A3[3]"};
    static String B[]={"","B1[4]","B2[5]","B3[6]"};
    static String DE[]={"","D1[7]","D2[8]","D3[9]"};
    static String I[]={"","I1[10]","I2[11]","I3[12]"};
    static String RD[]={"","RD1[13]","RD2[14]","RD3[15]"};
    static String ID[]={"","RI1[16]","RI2[17]","RI3[18]"};
    
    //Arreglo Guardar Movimientos
    
    static String GM []= new String [150];
    static int n=1;
    static int incrementador=1;
    
    public static void GMP(int m){
        if (n==1) {
            switch  (m){
                case 1:
                    GM[incrementador]="B1";
                    break;
                case 2:
                    GM[incrementador]="B2";
                    break;
                case 3:
                    GM[incrementador]="B3";
                    break;
                case 4:
                    GM[incrementador]="A1";
                    break;
                case 5:
                    GM[incrementador]="A2";
                    break;
                case 6:
                    GM[incrementador]="A3";
                    break;
                case 7:
                    GM[incrementador]="I1";
                    break;
                case 8:
                    GM[incrementador]="I2";
                    break;
                case 9:
                    GM[incrementador]="I3";
                    break;
                case 10:
                    GM[incrementador]="D1";
                    break;
                case 11:
                    GM[incrementador]="D2";
                    break;
                case 12:
                    GM[incrementador]="D3";
                    break;
                case 13:
                    GM[incrementador]="RI1";
                    break;
                case 14:
                    GM[incrementador]="RI2";
                    break;
                case 15:
                    GM[incrementador]="RI3";
                    break;
                case 16:
                    GM[incrementador]="RD1";
                    break;
                case 17:
                    GM[incrementador]="RD2";
                    break;
                case 18:
                    GM[incrementador]="RD3";
                    break;        
            }
            incrementador=incrementador+1;
        }    
    }
    //Subprograma Funcion Arreglo Aplicado en Imprimir Cara
    public static void Arreglo(){
        incrementador=incrementador-1;
            
            int K;
            K=incrementador;
            System.out.println("Realizar Movimiento:"+GM[K]);
            
            if (incrementador==0) {
                n=1;
                incrementador=1;
            
        }
    }
    public static void Cara (int C[][]){
        
        String s1=s+s+s+s+s;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print(s1);
            for (int j =1; j <=3; j++) {
                System.out.print(C[i][j]+s);
                
            }
            System.out.println("");
        }
        System.out.println("");
    } //Fin del Metodo Cara
    
    public static void Cara_1 (int C[][]){
        if (n==0) {
            Arreglo();
        } else{
            System.out.println("");
        }
        String s1=s+s+s+s+s;
        System.out.println(s1+"A1"+s+"A2"+s+"A3");
        System.out.println("");
        for (int i = 1; i <= 3; i++) {
            if (i==3) {
                System.out.print(s+s+"RI1"+s+"RI2"+s+"RI3"+s);
            } else {
                System.out.print(s1);
            }
            for (int j =1; j <=3; j++) {
                System.out.print(C[i][j]+s);
                
            }
            if (i==3) {
                System.out.print("RD1"+s+"RD2"+s+"RD3"+s);
            } 
            System.out.println("");
        }
        System.out.println("");
    } //Fin del Metodo Cara
    
     public static void Cara5_2_6(int C5[][],int C2[][],int C6[][] ){
        
        //Declaracion de Strings
        String l[] ={"","l1","l2","l3"};
        String D[] ={"","D1","D2","D3"};
        
        for (int i = 1; i <=3; i++) {
            System.out.print(s+l[i]+s);
            for (int j = 1; j <=3; j++) {
                System.out.print(C5[i][j]+s);
            }
            for (int j = 1; j <=3; j++) {
                System.out.print(C2[i][j]+s);
            }
            for (int j = 1; j <=3; j++) {
                System.out.print(C6[i][j]+s);
            }
            System.out.print(D[i]+"\t"+"|"+A[i]+"\t"+B[i]+"\t"+DE[i]+"\t"+I[i]+"\t"+RD[i]+"\t"+ID[i]+"\t");
            if (i==1) {
                System.out.print("RESOLVER[19]");
            }
            if (i==2) {
                System.out.print("FINALIZAR[19]");
            }
            System.out.println("");
        }System.out.println("");
        
    } //Fin de Cara5_2_6
     
    public static void Cruz(){
        String s1=s+s+s+s+s;
        Cara_1(C1);
        Cara5_2_6(C5,C2,C6);
        Cara(C3);
        Cara(C4);
        System.out.println(s1+"B1"+s+"B2"+s+"B3");
        System.out.println("");
    } //Fin Cara_Completa
    
    //Movimientos Hacia Arriba
    
    public static void A1(){
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
    } //Fin del Metodo A1
    
    public static void A2(){
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
    } //Fin del metodo A2
    
    public static void A3(){
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
    } //Fin del Metodo A3
    
    //Movimientos hacia Abajo
    
     public static void B1(){
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
        
        
    } //Fin del Metodo B1
    
    public static void B2(){
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
    }//Fin del Metodo B2
    public static void B3(){
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
    }//Fin del Metodo B3
    
    
    //Movimientos Laterales hacia la derecha
    
    public static void D1 (){
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
    } //Fin del Metodo D1
    
    
    public static void D2 (){
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
        
    } //Fin del Metodo D2
    
    public static void D3 (){
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
    } //Fin del Metodo D3
    
    //Movimientos Laterales hacia la izquierda  
    public static void I1(){
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
    }   //Fin del Metodo I1
    
    public static void I2(){
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
    }//Fin del metodo I2
    
    public static void I3(){
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
                 
        
    }//Fin del Metodo I3
    
    //Movimientos de Rotacion Derecha 
    public static void RD1(){
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
        
    } //Fin del Metodo RD1
    public static void RD2(){
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
    }// Fin del Metodo RD2
    
    public static void RD3(){
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
        
    } //Fin del Metodo RD3
    
    //Movimientos de Rotacion Izquierda
    public static void RI1(){
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
    }// FIn del Metodo RI1
    
    public static void RI2(){
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
    }//Fin del Metodo RI2
    
    public static void RI3(){
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
        
    }
    
    public static void main(String[] args) {
        //Metodo para escojer Movimiento
        Scanner Leer = new Scanner (System.in);
        int Tipo;
        
        //Ciclo Repetivo para el Cubo
        do {
            Cruz();
            System.out.println("Ingrese el movimientos a realizar:");
            Tipo= Leer.nextInt();
            
            
            switch  (Tipo){
                //Movimientos Hacia Arriba
                
                //Movimiento A1 
                case 1:
                    A1();
                    GMP(Tipo);
                    break;
                
                //Movimiento A2
                case 2:
                    A2();
                    GMP(Tipo);
                    break;
                
                //Movimiento A3
                case 3:
                    A3();
                    GMP(Tipo);
                    break;
                    
                 //Movimientos Hacia Abajo
                    
                //Movimiento B1
                case 4:
                    B1();
                    GMP(Tipo);
                    break;
                //Movimiento B2
                case 5:
                    B2();
                    GMP(Tipo);
                    break; 
                //Movimiento B3
                case 6:
                    B3();
                    GMP(Tipo);
                    break; 
                    
                //Movimientos Hacia la Derecha
                
                //Movimiento D1
                case 7:
                    D1();
                    GMP(Tipo);
                    break;
                //Movimiento D2
                case 8:
                    D2();
                    GMP(Tipo);
                    break; 
                //Movimiento D3
                case 9:
                    D3();
                    GMP(Tipo);
                    break; 
                //Movimiento I1
                case 10:
                    I1();
                    GMP(Tipo);
                    break;
                //Movimiento I2
                case 11:
                    I2();
                    GMP(Tipo);
                    break;
                //Movimiento I3
                case 12:
                    I3();
                    GMP(Tipo);
                    break;
                //Movimiento RD1
                case 13:
                    RD1();
                    GMP(Tipo);
                    break;
                //Movimiento RD2
                case 14:
                    RD2();
                    GMP(Tipo);
                    break;
                //Movimiento RD3
                case 15:
                    RD3();
                    GMP(Tipo);
                    break;
                //Movimiento RI1
                case 16:
                    RI1();
                    GMP(Tipo);
                    break;
                //Movimiento RI2
                case 17:
                    RI2();
                    GMP(Tipo);
                    break;
                 //Movimiento RI3
                case 18:
                    RI3();
                    GMP(Tipo);
                    break;
                case 19:
                    n=0;
            }
    
        } while (Tipo!=20);
        
    }
    
}
