package controller;

public class Ex4 {
    public Ex4(){
        super();
    }
    public String frecbin(int n){
        //O ponto de parada foi pensado quando o número digitado pelo usuário chegar a 0.
        if( n == 0){
            String s = String.valueOf(0);
            return s;
        //Se o número for igual 1, retorna 1.
        } else if (n == 1){
            String s = String.valueOf(1);
            return s;
        }
        //A chamada da função recursiva divide o número por 2 e guarda na variável "n" o resto da divisão.
        //Como a função recursiva vem resolvendo de trás para frente, a ordem resultado vem correta.
        return frecbin(n / 2 ) + ( n % 2 );
    }
}
