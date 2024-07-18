public class Aluno {
    private String nome;
    private int idade;
    private String[] aparelhos;

    public Aluno(String nome, int idade, String[] aparelhos) {
        this.nome = nome;
        this.idade = idade;
        this.aparelhos = aparelhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String[] getAparelhos() {
        return aparelhos;
    }

    public void setAparelhos(String[] aparelhos) {
        this.aparelhos = aparelhos;
    }


}
