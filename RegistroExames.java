import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroExames extends JFrame {

    private JTextField nomeAnimalField;
    private JTextField especieAnimalField;
    private JTextField dataExameField;
    private JTextField tipoExameField;
    private JTextArea resultadoExameArea;

    public RegistroExames() {
        // Configurações básicas da janela
        setTitle("Registro de Exames");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Registro de Exames", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Painel dos campos de entrada
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        nomeAnimalField = new JTextField();
        especieAnimalField = new JTextField();
        dataExameField = new JTextField();
        tipoExameField = new JTextField();
        resultadoExameArea = new JTextArea();
        resultadoExameArea.setLineWrap(true);

        inputPanel.add(new JLabel("Nome do Animal:"));
        inputPanel.add(nomeAnimalField);
        inputPanel.add(new JLabel("Espécie do Animal:"));
        inputPanel.add(especieAnimalField);
        inputPanel.add(new JLabel("Data do Exame:"));
        inputPanel.add(dataExameField);
        inputPanel.add(new JLabel("Tipo de Exame:"));
        inputPanel.add(tipoExameField);
        inputPanel.add(new JLabel("Resultado do Exame:"));
        inputPanel.add(new JScrollPane(resultadoExameArea));

        panel.add(inputPanel, BorderLayout.CENTER);

        // Painel dos botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        JButton salvarButton = new JButton("Salvar");
        JButton cancelarButton = new JButton("Cancelar");

        buttonPanel.add(salvarButton);
        buttonPanel.add(cancelarButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal à janela
        add(panel);

        // Adiciona ações aos botões
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a lógica para salvar os dados do exame
                JOptionPane.showMessageDialog(null, "Exame salvo com sucesso!");
                dispose(); // Fecha a janela após salvar
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a janela sem salvar os dados do exame
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroExames().setVisible(true);
            }
        });
    }
}
