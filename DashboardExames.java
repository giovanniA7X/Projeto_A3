import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardExames extends JFrame {

    private JTable examesTable;

    public DashboardExames() {
        // Configurações básicas da janela
        setTitle("Dashboard de Exames");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Dashboard de Exames", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Painel da lista de exames
        JPanel listaExamesPanel = new JPanel();
        listaExamesPanel.setLayout(new BorderLayout());
        listaExamesPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Model para a tabela de exames
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID do Exame");
        tableModel.addColumn("Resultado");
        tableModel.addColumn("Data do Pedido");
        tableModel.addColumn("Data do Resultado");
        tableModel.addColumn("ID da Consulta");

        // Exemplos de exames
        Object[][] data = {
                {1, "Normal", "2024-06-01", "2024-06-05", 101},
                {2, "Anormal", "2024-06-02", "2024-06-06", 102},
                {3, "Normal", "2024-06-03", "2024-06-07", 103},
                {4, "Anormal", "2024-06-04", "2024-06-08", 104},
                {5, "Normal", "2024-06-05", "2024-06-09", 105}
        };
        for (Object[] row : data) {
            tableModel.addRow(row);
        }

        examesTable = new JTable(tableModel);

        // Scroll pane para a tabela de exames
        JScrollPane scrollPane = new JScrollPane(examesTable);
        listaExamesPanel.add(scrollPane, BorderLayout.CENTER);

        // Botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 10, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton novoExameButton = new JButton("Novo Exame");
        JButton editarExameButton = new JButton("Editar Exame");
        JButton excluirExameButton = new JButton("Excluir Exame");
        JButton sairButton = new JButton("Sair");

        buttonPanel.add(novoExameButton);
        buttonPanel.add(editarExameButton);
        buttonPanel.add(excluirExameButton);
        buttonPanel.add(sairButton);

        // Adiciona os painéis ao painel principal
        panel.add(listaExamesPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.EAST);

        // Adiciona o painel principal à janela
        add(panel);

        // Adiciona ações aos botões
        novoExameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para adicionar um novo exame
                JOptionPane.showMessageDialog(null, "Adicionar novo exame");
            }
        });

        editarExameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para editar um exame existente
                JOptionPane.showMessageDialog(null, "Editar exame existente");
            }
        });

        excluirExameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para excluir um exame existente
                JOptionPane.showMessageDialog(null, "Excluir exame existente");
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
                new DashboardExames().setVisible(true);
            }
        });
    }
}
