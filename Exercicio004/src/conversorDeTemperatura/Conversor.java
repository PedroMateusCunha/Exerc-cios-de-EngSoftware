package conversorDeTemperatura;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conversor implements ActionListener {
	private JButton botao;
	private JLabel label;
	private JTextField campo;
	
	public Conversor() {
		JFrame frame = new JFrame("Conversor de Celsius para Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 150));

		frame.getContentPane().setLayout(new GridLayout(3, 1));

		// Adiciona uma label "Hello World" ubíqua.
		label = new JLabel("Temperatura em Celsius:");
		frame.getContentPane().add(label);

		campo = new JTextField();
		frame.getContentPane().add(campo);

		botao = new JButton("Converter!");
		botao.addActionListener(this);
		frame.getContentPane().add(botao);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Conversor();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double temperaturaEmCelsius = Double.valueOf(campo.getText());
		Double temperaturaEmFahrenheit = (temperaturaEmCelsius*9/5)+32;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: "+temperaturaEmFahrenheit);
	}

}
