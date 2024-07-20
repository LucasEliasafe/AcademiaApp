import java.util.ArrayList;
import java.util.List;

    public class Academia {
        private List<Aluno> alunos;
        private List<Aparelho> aparelhos;

    public Academia() {
        this.alunos = new ArrayList<>();
        this.aparelhos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAparelho(Aparelho aparelho) {
        aparelhos.add(aparelho);
    }

    public void removerAparelho(Aparelho aparelho) {
        aparelhos.remove(aparelho);
    }

    public List<Aparelho> getAparelhos() {
        return aparelhos;
    }
}
