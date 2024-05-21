Import Java.util.Scanner;


public class JogoDaVelha{
    public static void main(String[] args){


        Campo[][] velha=new Campo[3][3];
        char simboloAtual='X';
        boolean game=true;
        String Vitoria="";
        Scanner scan=new Scanner(System.in);
    
        while (game) {
             desenhaJogo(velha);
             vitoria=verificaVitoria(velha);
             if(!vitoria.equals("")){
                System.out.println("Jogador %s venceu%n", vitoria);
                braek;
             }
        }

    }
    
    public static void desenhaJogo(Campo[][] velha){
        //limparTela();
        System.out.println("       0    1    2");
        System.out.printf("0  %c / %c / %c %c",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo);
        System.out.println("       ------------");
        System.out.printf("1  %c / %c / %c %c",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo);
        System.out.println("       ------------");
        System.out.printf("2  %c / %c / %c %c",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo);
    }

    public static Sting verificaVitoria(Campo[][] velha){
        return "";
    }

}