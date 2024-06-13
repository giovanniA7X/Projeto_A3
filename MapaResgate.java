import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MapaResgate extends JFrame {

    public MapaResgate() {
        // Configurações básicas da janela
        setTitle("Mapa de Resgate");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria um editor de texto com HTML
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        // Habilita o suporte a JavaScript
        editorPane.setContentType("text/html");
        editorPane.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);

        // Define a URL do mapa externo (exemplo)
        String mapaURL = "https://www.google.com/maps";
        try {
            editorPane.setPage(new URI(mapaURL).toURL());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        // Adiciona o editor de texto em um JScrollPane para permitir rolagem
        JScrollPane scrollPane = new JScrollPane(editorPane);

        // Adiciona o JScrollPane à janela
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Botão para fechar a janela
        JButton fecharButton = new JButton("Fechar");
        fecharButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Adiciona o botão à janela
        getContentPane().add(fecharButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MapaResgate().setVisible(true);
            }
        });
    }
}
