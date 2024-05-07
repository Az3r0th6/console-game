import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maquinaexpendedora { // Corrected class name

    private static final int CAFE = 1;
    private static final int MATE = 2;
    private static final int GASEOSA = 3;
    private static final int CERVEZA = 4;

    public static void main(String[] args) {
        // Create the main window
        JFrame ventana = new JFrame("Máquina Expendedora de Bebidas");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(410, 310);
        ventana.setLayout(new FlowLayout());

        // Create a panel for beverage selection
        JPanel panelBebidas = new JPanel();
        panelBebidas.setLayout(new GridLayout(10, 6));

        // Create buttons with action listeners
        JButton botonCafe = new JButton("Café");
        botonCafe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarBebida(CAFE);
            }
        });
        panelBebidas.add(botonCafe);

        JButton botonMate = new JButton("Mate");
        botonMate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarBebida(MATE);
            }
        });
        panelBebidas.add(botonMate);

        JButton botonGaseosa = new JButton("Gaseosa");
        botonGaseosa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarBebida(GASEOSA);
            }
        });
        panelBebidas.add(botonGaseosa);

        JButton botonCerveza = new JButton("Cerveza");
        botonCerveza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarBebida(CERVEZA);
            }
        });
        panelBebidas.add(botonCerveza);

        // Add the panel to the window
        ventana.add(panelBebidas);

        // Make the window visible
        ventana.setVisible(true);
    }

    private static void seleccionarBebida(int opcion) {
        String mensaje;
        switch (opcion) {
            case CAFE:
                mensaje = "Café, ¡Buenisima elección!";
                break;
            case MATE:
                mensaje = "Mate, ¿Eres argentino, uruguayo o paraguayo?";
                break;
            case GASEOSA:
                mensaje = "Gaseosa, ¡Cuidado con el azúcar!";
                break;
            case CERVEZA:
                mensaje = "Cerveza, ¡Si tomaste, no manejes!";
                break;
            default:
                mensaje = "Opción no válida";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

