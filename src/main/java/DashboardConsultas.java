import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardConsultas extends JFrame {

    private JTable consultasTable;

    public DashboardConsultas() {
        // Configurações básicas da janela
        setTitle("Dashboard de Consultas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Dashboard de Consultas", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Painel da lista de consultas
        JPanel listaConsultasPanel = new JPanel();
        listaConsultasPanel.setLayout(new BorderLayout());
        listaConsultasPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Model para a tabela de consultas
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Consulta");
        tableModel.addColumn("Laudo");
        tableModel.addColumn("Data da Consulta");
        tableModel.addColumn("ID do Veterinário");
        tableModel.addColumn("ID do Animal");

        // Exemplos de consultas
        Object[][] data = {
                {1, "Fratura na pata esquerda", "2024-06-01", 101, 201},
                {2, "Infecção respiratória", "2024-06-02", 102, 202},
                {3, "Desidratação severa", "2024-06-03", 103, 203},
                {4, "Parasitas intestinais", "2024-06-04", 104, 204},
                {5, "Trauma craniano", "2024-06-05", 105, 205}
        };
        for (Object[] row : data) {
            tableModel.addRow(row);
        }

        consultasTable = new JTable(tableModel);

        // Scroll pane para a tabela de consultas
        JScrollPane scrollPane = new JScrollPane(consultasTable);
        listaConsultasPanel.add(scrollPane, BorderLayout.CENTER);

        // Botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 10, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton novaConsultaButton = new JButton("Nova Consulta");
        JButton editarConsultaButton = new JButton("Editar Consulta");
        JButton excluirConsultaButton = new JButton("Excluir Consulta");
        JButton sairButton = new JButton("Sair");

        buttonPanel.add(novaConsultaButton);
        buttonPanel.add(editarConsultaButton);
        buttonPanel.add(excluirConsultaButton);
        buttonPanel.add(sairButton);

        // Adiciona os painéis ao painel principal
        panel.add(listaConsultasPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.EAST);

        // Adiciona o painel principal à janela
        add(panel);

        // Adiciona ações aos botões
        novaConsultaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para adicionar uma nova consulta
                JOptionPane.showMessageDialog(null, "Adicionar nova consulta");
            }
        });

        editarConsultaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para editar uma consulta existente
                JOptionPane.showMessageDialog(null, "Editar consulta existente");
            }
        });

        excluirConsultaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para excluir uma consulta existente
                JOptionPane.showMessageDialog(null, "Excluir consulta existente");
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para fechar a janela
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DashboardConsultas().setVisible(true);
            }
        });
    }
}
