package TierraMedia;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class cuadroTierraMedia extends JFrame {

	private JPanel panel1;
	private JTextField txtSecretariaDeTurismo;
	private JTextField txtHolaUsuarioDinos;

	/**
	 * Lanzar la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cuadroTierraMedia frame = new cuadroTierraMedia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crear el cuadro
	 */
	public cuadroTierraMedia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		txtSecretariaDeTurismo = new JTextField();
		txtSecretariaDeTurismo.setBackground(Color.LIGHT_GRAY);
		txtSecretariaDeTurismo.setForeground(Color.ORANGE);
		txtSecretariaDeTurismo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		txtSecretariaDeTurismo.setText(" Secretaria de Turismo de la Tierra Media");
		txtSecretariaDeTurismo.setBounds(10, 23, 764, 79);
		getContentPane().add(txtSecretariaDeTurismo);
		txtSecretariaDeTurismo.setColumns(100);
		
		txtHolaUsuarioDinos = new JTextField();
		txtHolaUsuarioDinos.setForeground(Color.DARK_GRAY);
		txtHolaUsuarioDinos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtHolaUsuarioDinos.setText("Hola Usuario, dinos tu nombre y algunas cosas mas, con tu perfil, podremos indicarte   ¡ tu mejor aventura ! ");
		txtHolaUsuarioDinos.setBounds(20, 113, 714, 20);
		getContentPane().add(txtHolaUsuarioDinos);
		txtHolaUsuarioDinos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellido:");
		lblNewLabel.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 13));
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(24, 160, 234, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPreferencia = new JLabel("Preferencia:");
		lblPreferencia.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 13));
		lblPreferencia.setBackground(Color.ORANGE);
		lblPreferencia.setBounds(24, 201, 234, 14);
		getContentPane().add(lblPreferencia);
		
		JLabel lblTiempoDePermanenciaaproximado = new JLabel("Tiempo de permanencia(aproximado):");
		lblTiempoDePermanenciaaproximado.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 13));
		lblTiempoDePermanenciaaproximado.setBackground(Color.CYAN);
		lblTiempoDePermanenciaaproximado.setBounds(24, 247, 234, 14);
		getContentPane().add(lblTiempoDePermanenciaaproximado);
		
		JLabel lblCuantoGastarasAproximadamente = new JLabel("Cuanto gastaras aproximadamente:");
		lblCuantoGastarasAproximadamente.setFont(new Font("Plantagenet Cherokee", Font.BOLD, 13));
		lblCuantoGastarasAproximadamente.setBackground(Color.RED);
		lblCuantoGastarasAproximadamente.setBounds(24, 291, 234, 14);
		getContentPane().add(lblCuantoGastarasAproximadamente);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(516, 315, 101, 22);
		getContentPane().add(menuBar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBackground(Color.GREEN);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2 horas", "4 horas", "6 horas", "8 horas", "10 horas"}));
		comboBox.setBounds(268, 243, 121, 22);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.RED);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"5 monedas", "10 monedas", "20 monedas", "50 monedas", "100 monedas", "+ de 100"}));
		comboBox_1.setBounds(268, 287, 121, 22);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.YELLOW);
		comboBox_2.setForeground(Color.GRAY);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"AVENTURA", "* Moria", "* Minas Tirith", "* La Comarca", "* Mordor", "* Abismo de Helm", "* Lothlórien   ", "* Erebor\t", "* Bosque Negro\t"}));
		comboBox_2.setBounds(268, 197, 151, 22);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.YELLOW);
		comboBox_3.setForeground(Color.GRAY);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"DEGUSTACION", "* La misma esta disponible segun el itinerario que elija."}));
		comboBox_3.setBounds(429, 197, 151, 22);
		getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.YELLOW);
		comboBox_4.setForeground(Color.GRAY);
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"PAISAJE"}));
		comboBox_4.setBounds(590, 197, 151, 22);
		getContentPane().add(comboBox_4);
		
		JFormattedTextField frmtdtxtfldEscribaAquiSu = new JFormattedTextField();
		frmtdtxtfldEscribaAquiSu.setToolTipText("Escriba aqui su Nombre y Apellido");
		frmtdtxtfldEscribaAquiSu.setBounds(268, 157, 466, 20);
		getContentPane().add(frmtdtxtfldEscribaAquiSu);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel1.setLayout(new BorderLayout(0, 0));
	}
}
