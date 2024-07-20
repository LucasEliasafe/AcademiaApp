import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class AcademiaGUI {
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
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}

