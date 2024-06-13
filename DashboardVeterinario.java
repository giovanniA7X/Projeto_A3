import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardVeterinario extends JFrame {

    private JButton examesButton;
    private JButton consultasButton;
    private JButton receitasButton;
    private JButton sairButton;

    public DashboardVeterinario() {
        // Configurações básicas da janela
        setTitle("Dashboard Veterinários");
        setSize(890, 454);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Dashboard Veterinários", SwingConstants.CENTER);
        titleLabel.setPreferredSize(new Dimension(890, 30));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Painel dos botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        examesButton = new JButton("Exames");
        examesButton.setPreferredSize(new Dimension(200, 150));
        consultasButton = new JButton("Consultas");
        consultasButton.setPreferredSize(new Dimension(200, 150));
        receitasButton = new JButton("Receitas");
        receitasButton.setPreferredSize(new Dimension(200, 150));

        buttonPanel.add(examesButton);
        buttonPanel.add(consultasButton);
        buttonPanel.add(receitasButton);

        panel.add(buttonPanel, BorderLayout.CENTER);

        // Botão "Sair"
        sairButton = new JButton("Sair");
        sairButton.setPreferredSize(new Dimension(200, 30));
        sairButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(sairButton, BorderLayout.SOUTH);

        // Adiciona o painel principal à janela
        add(panel);

        // Adiciona ações aos botões
        examesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Abrir tela de Exames");
            }
        });

        consultasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Abrir tela de Consultas");
            }
        });

        receitasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Abrir tela de Receitas");
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DashboardVeterinario().setVisible(true);
            }
        });
    }
}
