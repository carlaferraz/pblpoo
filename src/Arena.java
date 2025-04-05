import java.util.ArrayList;
import java.util.Random;

public class Arena {
    public static void main(String[] args) {
        ArrayList<Inimigo> listaInimigo = new ArrayList<>();
        ArrayList<Jogador> listaJogador = new ArrayList<>();


        Inimigo gengar = new Inimigo("Gengar", "Lambida", 40,100,20);
        listaInimigo.add(gengar);

        Inimigo zhou = new Inimigo("Zhou", "Falar Muito Baixo", 80,100,5);
        listaInimigo.add(zhou);

        Inimigo haunter = new Inimigo("Haunter", "Abismar",35,100,20);
        listaInimigo.add(haunter);



        Jogador gabi = new Jogador ("Gabi", "Ser Surda", 60, 100, 30);
        listaJogador.add(gabi);

        Jogador carla = new Jogador ("Carla", "Ser Muito Surda", 70, 100, 20);
        listaJogador.add(carla);

        Jogador baiano = new Jogador ("Baiano", "Faltar Aula", 35, 100, 50);
        listaJogador.add(baiano);




        Batalha batalha = new Batalha();

        Random random = new Random();
        int numeroInimigo = random.nextInt(listaInimigo.size());
        Inimigo inimigoAleatorio = listaInimigo.get(numeroInimigo);

        int numeroJogador = random.nextInt(listaJogador.size());
        Jogador jogadorAleatorio = listaJogador.get(numeroJogador);

        System.out.println("----------" + "\nInimigo selecionado: " + inimigoAleatorio.getNome() + "\nAtaque: " + inimigoAleatorio.getAtaque() + "\nDano: " + inimigoAleatorio.getDano() + "\nVida: " + inimigoAleatorio.getVida() +  "\nDefesa: " + inimigoAleatorio.getDefesa() + "\n----------");
        System.out.println("Jogador selecionado: " + jogadorAleatorio.getNome() + "\nAtaque: " + jogadorAleatorio.getAtaque() + "\nDano: " + jogadorAleatorio.getDano() + "\nVida: " + jogadorAleatorio.getVida() + "\nDefesa: " + jogadorAleatorio.getDefesa() + "\n----------");


        //importando a logica da classe Batalha
        batalha.iniciarBatalha(jogadorAleatorio, inimigoAleatorio);
    }
}
