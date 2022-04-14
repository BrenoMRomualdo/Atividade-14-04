import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception{
       Personagem cacador = new Personagem(10, 0, 0);
       Personagem soneca = new Personagem (2,4,10);
       Personagem guloso = new Personagem (4,10,2);
       Personagem lascado = new Personagem(0, 10, 10);
       Random gerador = new Random();
       soneca.setnome("Soneco");
       guloso.setnome("Gulozin");
       cacador.setnome("Kratos");
       lascado.setnome("dolly");
       //1: cacar
       //2: comer
       //3: dormir
       while(true){
            int oQueFazer = gerador.nextInt(3) + 1;
            switch(oQueFazer){
                case 1:
                    soneca.cacar();
                    guloso.dormir();
                    System.out.println("\n");
                    break;
                case 2:
                    soneca.comer();
                    guloso.cacar();
                    System.out.println("\n");
                    break;
                case 3:
                    soneca.dormir();
                    guloso.comer();
                    System.out.println("\n");
                    break;
            }
            System.out.println("-----------------------------"); 
            Thread.sleep(2000);
       }
    }
}