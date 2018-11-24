package com.example.noureddine.numerosprims;
class NumerosPrims {
    private int[] numerosPr;
    int i=0;
    private int fin = 0;
    private int resoltado;
    NumerosPrims(int numT, int numero){
        numerosPr=new int[numT];
        if (numerosPr[1]==0){
            numerosPr[0]=1;
            numerosPr[1]=2;
        }
        if (numerosPr[numero-1]==0){
            if(numerosPr[2]==0){
                i=3;
                fin=2;
            }
            while (fin<numero){
                if(isPrimer(i)){
                    numerosPr[fin]=i;
                    fin++;
                    System.out.println(fin+" i= "+i);
                }
                i++;
            }
        }
        this.resoltado=numerosPr[numero-1];

    }

    int getResoltado() {
        return resoltado;
    }
    private boolean isPrimer(int num) {
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


}
