package classetesteaprender;

public class PersonagemLol {
    
    public String nome;
    public double velocidade;
    public double forca;
    public double mana;
    public double xp;
    public double dano;

    public PersonagemLol(String nome, double velocidade, double forca, double mana, double xp, double dano) {
        
        this.nome = nome;
        this.velocidade = velocidade;
        this.forca = forca;
        this.mana = mana;
        this.xp = xp;
        this.dano = dano;

    }

    public PersonagemLol(String nome, double velocidade){

    }

    public PersonagemLol(String nome){

        this.nome = nome;
    }

    public PersonagemLol(){

    }

    public void correr(){
    }

    public void atacar(){
    }

    public void equipar(Equipamento e) {

        forca += e.forca;
        dano += e.dano;
    }
}