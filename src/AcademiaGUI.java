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
        private JTextField nomeAparelhoField;
        private JTextField descricaoAparelhoField;
        private JTextArea aparelhosArea;


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
        painelAluno.add(new JLabel("Idade do Aluno: "));
        idadeAlunoField = new JTextField();
        painelAluno.add(idadeAlunoField);
        painelAluno.add(new JLabel("Aparelhos (separados por vírgula):"));
        aparelhosAlunoField = new JTextField();
        painelAluno.add(aparelhosAlunoField);
        JButton adicionarAlunoBtn = new JButton("Adicionar Aluno");
        painelAluno.add(adicionarAlunoBtn);
        JButton removerAlunoBtn = new JButton("Remover Aluno");
        painelAluno.add(removerAlunoBtn);

        JPanel painelAparelho = new JPanel(new GridLayout(3,2));
        painelAparelho.add(new JLabel("Nome do Aparelho: "));
        nomeAparelhoField = new JTextField();
        painelAparelho.add(nomeAparelhoField);
        painelAparelho.add(new JLabel("Descrição do Aparelho: "));
        descricaoAparelhoField = new JTextField();
        painelAparelho.add(descricaoAparelhoField);
        JButton adicionarAparelhoBtn = new JButton("Adicionar Aparelho");
        painelAparelho.add(adicionarAparelhoBtn);
        JButton removerAparelhoBtn = new JButton("Remover Aparelho");
        painelAparelho.add(removerAparelhoBtn);

        alunosArea = new JTextField();
        JScrollPane alunosAreaScroller = new JScrollPane(alunosArea);

        aparelhosArea =  new JTextArea();
        JScrollPane aparelhosScrollPane = new JScrollPane(aparelhosArea);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, alunosScrollPane, aparelhosScrollPane);
        add(splitPane, BorderLayout.CENTER);
        add(painelAluno, BorderLayout.NORTH);
        add(painelAparelho, BorderLayout.SOUTH);




    }
}

