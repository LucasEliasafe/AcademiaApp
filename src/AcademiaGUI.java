import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class AcademiaGUI extends JFrame {
        private Academia academia;
        private JTextField nomeAlunoField;
        private JTextField idadeAlunoField;
        private JTextField aparelhosAlunoField;
        private JTextField alunosArea;
        private JTextField nomeApartamentoField;
        private JTextField descricaoAparelhoField;
        private JTextArea aparelhoArea;


    public AcademiaGUI() {
        academia = new Academia();

        setTitle("Gestão de Academia");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelAluno = new JPanel(new GridLayout(4,2));
        painelAluno.add(new JLabel("Nome: "));
        nomeAlunoField = new JTextField();
        painelAluno.add(nomeAlunoField);
        painelAluno.add(new JLabel("Idade: "));
        idadeAlunoField = new JTextField();
        painelAluno.add(idadeAlunoField);
        painelAluno.add(new JLabel("Aparelho: "));
        aparelhosAlunoField = new JTextField();
        painelAluno.add(aparelhosAlunoField);
        JButton adicionarAlunoBtn = new JButton("Adicionar Aluno");
        painelAluno.add(adicionarAlunoBtn);
        JButton removerAlunoBtn = new JButton("Remover Aluno");
        painelAluno.add(removerAlunoBtn);


    }
}

