public class Personagem{
    private String nome;
    private int energia = 10;
    private int fome;
    private int sono;
    private String status;
    private final static int LIMITE_SUPERIOR = 10;
    
    public Personagem(int energia, int fome, int sono){
        if (energia >=0 && energia <=10)
            this.energia = energia;
        if (fome >= 0 && fome <=10)
            this.fome = fome;
        if (sono >= 0 && sono <=10)
            this.sono = sono;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    void status(){
        System.out.println(nome + "Energia = " + energia);
        System.out.println(nome + "Fome = " + fome);
        System.out.println(nome + "Sono = " + sono);
    }
    public String getStatus(){
        return this.status;
    }
    
    void cacar(){
        if (this.energia >= 2){
            System.out.println(nome + " caçando...");
            this.energia = this.energia - 2;
            getStatus();
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
            getStatus();
        }
        this.fome = Math.min (this.fome + 1, LIMITE_SUPERIOR);
        this.sono = Math.min(this.sono + 1, LIMITE_SUPERIOR);
    }
    
    void comer(){
        if (this.fome >= 1){
            System.out.println(this.nome + " comendo...");
            this.fome -= 1;
            //this.energia += 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
            getStatus();
        }
        else{
            System.out.printf("%s sem fome...\n", nome);
            getStatus();
        }
    }
    
    void dormir(){
        if (this.sono >= 1){
            System.out.println(String.format("%s dormindo...", this.nome));
            this.sono -=1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR? this.energia + 1 : this.energia;
            getStatus();
        }
        else{
            System.out.println(nome + " sem sono...");
            getStatus();
        }
    
        }
    }