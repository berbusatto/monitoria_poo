public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float  peso;

    private String categoria;
    private int empates;
    private int vitorias;
    private int derrotas;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int empates, int vitorias, int derrotas){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.empates = empates;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso <52.2){
            this.categoria = "Inválido";
        } else if(this.peso < 70.3){
            this.categoria = "Peso leve";
        } else if(this.peso < 83.9){
            this.categoria = "Peso médio";
        } else if (this.peso < 120.2){
            this.categoria = "Peso pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void apresentar(){
        System.out.println("--------------");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Nascido em " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos, " + this.getPeso() + " quilos e com " + this.getAltura() + "m de altura");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void status(){
        System.out.println("--------------");
        System.out.println(this.getNome() + "é um " + this.getCategoria());
        System.out.println("Já obteve " + this.getVitorias() +" vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + "empates");
        System.out.println("--------------");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
         this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
