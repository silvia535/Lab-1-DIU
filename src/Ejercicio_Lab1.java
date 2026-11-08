import java.awt.*;
import javax.swing.*;
//SILVIA MIGUEL MARTÍN


public class Ejercicio_Lab1 {

    private Ejercicio_Lab1() {
        JFrame ventana = new JFrame("Ej. Lab 1");
        ventana.setSize(280, 570);
        ventana.setLayout(new BorderLayout());
        ventana.setLocationRelativeTo(null);

        JPanel header = new JPanel(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        gb.fill = GridBagConstraints.BOTH;
        gb.weightx = 1;
        gb.weighty = 1;

        addCell(header, Color.GREEN, 0, 0.1, 1, gb);
        addCell(header, Color.RED, 1, 0.7, 7, gb);
        addCell(header, Color.GREEN, 8, 0.1, 1, gb);
        addCell(header, Color.BLUE, 9, 0.1, 1, gb);
        header.setPreferredSize(new Dimension(280, 20));
        ventana.add(header, BorderLayout.NORTH);

        JPanel central = new JPanel(new GridLayout(6, 1));
        central.setPreferredSize(new Dimension(280, 490));
        Color[] colors2 = {Color.BLACK, Color.GRAY, Color.PINK};
        for (int i = 0; i < 6; i++) {
            JPanel central2 = new JPanel(new GridLayout(3, 1));
            central2.setPreferredSize(new Dimension(280, 20));
            for (Color color : colors2) {
                central2.add(createPanel(color));
            }
            central2.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
            central.add(central2);
        }

        ventana.add(central, BorderLayout.CENTER);

        JPanel footer = new JPanel(new GridLayout(1, 4, 16, 10));
        footer.setPreferredSize(new Dimension(280, 60));
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};

        for (Color color : colors) {
            footer.add(createPanel(color));
        }
        ventana.add(footer, BorderLayout.SOUTH);

        central.setBorder(BorderFactory.createEmptyBorder(16, 0, 16, 0)); 

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    // Método para añadir celdas al encabezado
    private void addCell(JPanel panel, Color color, int gridx, double weightx, int gridwidth, GridBagConstraints gb) {
        gb.gridx = gridx;
        gb.weightx = weightx;
        gb.gridwidth = gridwidth;
        panel.add(createPanel(color), gb);
    }

    // Método para crear un panel de color específico
    private JPanel createPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ejercicio_Lab1::new);
    }
}
