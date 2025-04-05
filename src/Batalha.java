public class Batalha {

    //logica da minha luta
    public void iniciarBatalha(Jogador jogadorAleatorio, Inimigo inimigoAleatorio) {
        System.out.println("\nA batalha começou entre " + jogadorAleatorio.getNome() + " e " + inimigoAleatorio.getNome());
        int contador = 1;
        while(jogadorAleatorio.getVida()>0 && inimigoAleatorio.getVida()>0 ){
            System.out.println("\n=============RODADA " + contador + "=============");

            //ataque jogador
            System.out.println(jogadorAleatorio.getNome() + " começou seu ataque " + jogadorAleatorio.getAtaque() + "!");

            int danoCausadoJogador = Math.max(0, jogadorAleatorio.getDano() - inimigoAleatorio.getDefesa());

            inimigoAleatorio.setVida(inimigoAleatorio.getVida() - danoCausadoJogador);
            System.out.println("\nUau! " + inimigoAleatorio.getNome() + " usou sua defesa e sua vida baixou para " + inimigoAleatorio.getVida());

            //ataque inimigo

            System.out.println("\n"+inimigoAleatorio.getNome() + " começou seu ataque " + inimigoAleatorio.getAtaque() + "!");

            int danoCausadoInimigo = Math.max(0, inimigoAleatorio.getDano() - jogadorAleatorio.getDefesa());

            jogadorAleatorio.setVida(jogadorAleatorio.getVida() - danoCausadoInimigo);
            System.out.println("\nIncrível! " + jogadorAleatorio.getNome() + " se defendeu e sua vida baixou para " + jogadorAleatorio.getVida());

            contador++;
            //inimigo ganha
            if (jogadorAleatorio.getVida() <= 0) {
                System.out.println("\nInacreditável! o jogador " + jogadorAleatorio.getNome() + " foi derrotado pelo inimigo terrível " + inimigoAleatorio.getNome());
                break;
            }
            //jogador ganha
            else if (inimigoAleatorio.getVida() <=0){
                System.out.println("\nInacreditável! o terrível inimigo " + inimigoAleatorio.getNome() + " foi derrotado pelo jogador " + jogadorAleatorio.getNome());
                break;
            }
        }
    }
}
