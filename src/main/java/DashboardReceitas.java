import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardReceitas extends JFrame {

    private JTable receitasTable;

    public DashboardReceitas() {
        // Configurações básicas da janela
        setTitle("Dashboard de Receitas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Dashboard de Receitas", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        // Painel da lista de receitas
        JPanel listaReceitasPanel = new JPanel();
        listaReceitasPanel.setLayout(new BorderLayout());
        listaReceitasPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Model para a tabela de receitas
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Exame");
        tableModel.addColumn("Prescrição");
        tableModel.addColumn("Data da Receita");
        tableModel.addColumn("ID da Consulta");

        // Exemplos de receitas
        Object[][] data = {
                {1, "Antibiótico para infecção", "2024-06-01", 101},
                {2, "Anti-inflamatório para dor", "2024-06-02", 102},
                {3, "Vitaminas para fortalecimento", "2024-06-03", 103},
                {4, "Antiparasitário para vermes", "2024-06-04", 104},
                {5, "Analgésico para alívio imediato", "2024-06-05", 105}
        };
        for (Object[] row : data) {
            tableModel.addRow(row);
        }

        receitasTable = new JTable(tableModel);

        // Scroll pane para a tabela de receitas
        JScrollPane scrollPane = new JScrollPane(receitasTable);
        listaReceitasPanel.add(scrollPane, BorderLayout.CENTER);

        // Botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 10, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton novaReceitaButton = new JButton("Nova Receita");
        JButton editarReceitaButton = new JButton("Editar Receita");
        JButton excluirReceitaButton = new JButton("Excluir Receita");
        JButton sairButton = new JButton("Sair");

        buttonPanel.add(novaReceitaButton);
        buttonPanel.add(editarReceitaButton);
        buttonPanel.add(excluirReceitaButton);
        buttonPanel.add(sairButton);

        // Adiciona os painéis ao painel principal
        panel.add(listaReceitasPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.EAST);

        // Adiciona o painel principal à janela
        add(panel);

        // Adiciona ações aos botões
        novaReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para adicionar uma nova receita
                JOptionPane.showMessageDialog(null, "Adicionar nova receita");
            }
        });

        editarReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para editar uma receita existente
                JOptionPane.showMessageDialog(null, "Editar receita existente");
            }
        });

        excluirReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente aqui a ação para excluir uma receita existente
                JOptionPane.showMessageDialog(null, "Excluir receita existente");
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
                new DashboardReceitas().setVisible(true);
            }
        });
    }
}
