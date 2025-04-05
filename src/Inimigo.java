public class Inimigo {
    private String nome;
    private String ataque;
    private int dano;
    private int vida;
    private int defesa;

    public Inimigo(String nome, String ataque, int dano, int vida, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.dano = dano;
        this.vida = vida;
        this.defesa = defesa;
    }



    public String getNome() {
        return nome;
    }

    public String getAtaque() {
        return ataque;
    }

    public int getDano() {
        return dano;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }




    public void setVida(int vida) {
        this.vida = vida;
    }

}
