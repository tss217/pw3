package com.example.provapmatt2;

import java.util.Random;

public class Vm {
    private int sizeF;
    private int sizeS;
    private int[] firstVector;
    private int[] secundVector;

    private  int biggerNros;

    private int linhas;
    private int colunas;
    private int[][]matrix;


    public void getSize(int sizeF,int sizeS){
        this.firstVector = new int[sizeF];
        this.secundVector = new int[sizeS];
        this.sizeF = sizeF;
        this.sizeS = sizeS;
    }

    //geradores
    public void getSizeMatriz(int linhas,int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.matrix = new int[linhas][colunas];
    }

    public void setFirstVector(){
        Random random = new Random();
        for(int i=0; i<this.sizeF;i++){
            this.firstVector[i] = random.nextInt(100);

        }
    }

    public void setSecundVector(){
        Random random = new Random();
        for(int i = 0;i<this.sizeS;i++){
            this.secundVector[i] = random.nextInt(100);
        }
    }

    public void setMatrix(){
        Random random = new Random();
        for (int i =0;i<this.linhas;i++){
            for(int j =0;j<this.colunas;j++){
                this.matrix [i][j] = random.nextInt(100);
            }
        }
    }


    public void setBiggerNrosFist(){
        this.biggerNros = this.firstVector[0];

        for(int i =0;i<this.sizeF;i++){
            if(this.firstVector[i] > biggerNros){
                this.biggerNros = this.firstVector[i];
            }
        }
    }
// prints
    public String printFirtVector(){
        setFirstVector();
        String strFist = "";
        for(int i =0;i<this.sizeF;i++){
            strFist += this.firstVector[i]+" ";
        }return  strFist;
    }

    public String printSecondVector(){
        setSecundVector();
        String strSencd = "";
        for (int i =0;i<this.sizeS;i++){
            strSencd += this.secundVector[i]+" ";
        }return  strSencd;
    }

    public String printMatriz(){
        setMatrix();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<this.linhas;i++){
            for(int j=0;j<this.colunas;j++){
                sb.append(this.matrix[i][j]).append("\t");
            }sb.append("\n");
        }return sb.toString();
    }


}
