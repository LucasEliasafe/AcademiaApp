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


}
