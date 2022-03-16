import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Interfaccia {

	public static Interfaccia window;
	
	private JFrame frame;
	
	private static String inte = " ";
	
	private int numeroMargherita = 0;
	private int numeroDiavola = 0;
	private int numeroAmericana = 0;
	private int numeroBufala = 0;
	private int numeroQuattroStagioni = 0;
	private int numeroCapricciosa = 0;
	private int numeroCalamari = 0;
	private int numeroCampagnola = 0;
	private int numeroQuattroFormaggi = 0;
	private int numeroFruttiDiMare = 0;
	private int numeroCoca = 0;
	private int numeroFanta = 0;
	private int numeroSprite = 0;
	private int numeroThe = 0;
	private int numeroBirra = 0;
	
	Margherita margherita = new Margherita();
	Diavola diavola = new Diavola();
	Calamari calamari = new Calamari();
	Americana americana = new Americana();
	QuattroStagioni quattroStagioni = new QuattroStagioni();
	Bufala bufala = new Bufala();
	Campagnola campagnola = new Campagnola();
	Capricciosa capricciosa = new Capricciosa();
	QuattroFormaggi quattroFormaggi = new QuattroFormaggi();
	FruttiDiMare fruttiDiMare = new FruttiDiMare();
	
	CocaCola cocaCola = new CocaCola();
	The the = new The();
	Sprite sprite = new Sprite();
	Fanta fanta = new Fanta();
	Birra birra = new Birra();

	public double totalePizze = 0.00;
	
	public double totaleBevande = 0.00;
	public double costoTrasporto = 2.00;
	public double subTotale = 0.00;
	public double iva = 0.00;
	public double totale = 0.00;	
	
	JLabel label_1 = null;
	JLabel label_2 = null;
	JLabel label_3 = null;
	JLabel label_4 = null;
	JLabel label_5 = null;
	JLabel label_6 = null;
	JLabel label_7 = null;
	JLabel label_8 = null;
	JLabel label_9 = null;
	JLabel label_10 = null;
	JLabel label_11 = null;
	JLabel label_12 = null;
	JLabel label_13 = null;
	JLabel label_14 = null;
	JLabel label_15 = null;

	JTextArea textAreaNomePizza = new JTextArea();
	JTextArea textAreaQuantita = new JTextArea();
	JTextArea textAreaPrezzo = new JTextArea();
	JTextArea textAreaIngredienti = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Interfaccia();
					window.frame.setVisible(true);
						
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaccia() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1381, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*
		 * 
		 * CREAZIONE DEL PANNELLO DELLE PIZZE
		 * 
		 */
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 98, 615, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		/******************************************************/
		
		/*
		 * 
		 * TITOLO GRANDE DELLA FINESTRA
		 * 
		 */
		
		JLabel lblTitle = new JLabel("MANAGEMENT SYSTEM");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblTitle.setBounds(392, 28, 602, 47);
		frame.getContentPane().add(lblTitle);
		
		/******************************************************/
		
		/*
		 * 
		 * NOMI COLONNE NEL PANNELLO DELLE PIZZE
		 * 
		 */
		JLabel lblNomePizza = new JLabel("Nome pizza");
		lblNomePizza.setBounds(26, 15, 149, 33);
		panel.add(lblNomePizza);
		
		JLabel lblQuantitaPizza = new JLabel("Quantità");
		lblQuantitaPizza.setBounds(180, 15, 115, 33);
		panel.add(lblQuantitaPizza);
		
		JLabel lblNomePizza1 = new JLabel("Nome pizza");
		lblNomePizza1.setBounds(331, 15, 149, 33);
		panel.add(lblNomePizza1);
		
		JLabel lblQuantitaPizza1 = new JLabel("Quantità");
		lblQuantitaPizza1.setBounds(488, 15, 115, 33);
		panel.add(lblQuantitaPizza1);
		
		/************************************/
		
		/*
		 * 
		 * NOMI DELLE PIZZE 
		 * 
		 */
		
		JLabel lblMargherita = new JLabel("Margherita");
		lblMargherita.setBounds(26, 59, 134, 33);
		panel.add(lblMargherita);
		
		JLabel lblDiavola = new JLabel("Diavola");
		lblDiavola.setBounds(26, 103, 134, 33);
		panel.add(lblDiavola);
		
		JLabel lblBufala = new JLabel("Bufala");
		lblBufala.setBounds(26, 189, 134, 33);
		panel.add(lblBufala);
		
		JLabel lblAmericana = new JLabel("Americana");
		lblAmericana.setBounds(26, 145, 134, 33);
		panel.add(lblAmericana);
		
		JLabel lblQuattroStagioni = new JLabel("Quattro stagioni");
		lblQuattroStagioni.setBounds(26, 235, 134, 33);
		panel.add(lblQuattroStagioni);
		
		JLabel lblCapricciosa = new JLabel("Capricciosa");
		lblCapricciosa.setBounds(325, 59, 134, 33);
		panel.add(lblCapricciosa);
		
		JLabel lblCalamari = new JLabel("Calamari");
		lblCalamari.setBounds(325, 103, 134, 33);
		panel.add(lblCalamari);
		
		JLabel lblCampagnola = new JLabel("Campagnola");
		lblCampagnola.setBounds(325, 145, 134, 33);
		panel.add(lblCampagnola);
		
		JLabel lblQuattroFormaggi = new JLabel("Quattro formaggi");
		lblQuattroFormaggi.setBounds(325, 189, 134, 33);
		panel.add(lblQuattroFormaggi);
		
		JLabel lblFruttiDiMare = new JLabel("Frutti di mare");
		lblFruttiDiMare.setBounds(325, 235, 134, 33);
		panel.add(lblFruttiDiMare);
		
		/*******************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA MARGHERITA
		 * 
		 */
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.setBounds(159, 59, 45, 33);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroMargherita > 0)
					numeroMargherita--;
				 label_1.setText(inte + numeroMargherita);
				}
		});
		
		JButton button = new JButton("+");
		button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button.setBounds(274, 59, 45, 33);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroMargherita < 10)
					numeroMargherita++;
				 label_1.setText(inte + numeroMargherita);
				}
		});
		
		label_1 = new JLabel(inte + "0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(209, 59, 60, 33);
		panel.add(label_1);
		
		/***************************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA DIAVOLA
		 * 
		 */
		JButton button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBounds(159, 99, 45, 33);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroDiavola > 0)
					numeroDiavola--;
				 label_2.setText(inte + numeroDiavola);
				}
		});
		
		JButton button_10 = new JButton("+");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_10.setBounds(274, 99, 45, 33);
		panel.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroDiavola < 10)
					numeroDiavola++;
				 label_2.setText(inte + numeroDiavola);
				}
		});
		
		
		label_2 = new JLabel(inte + " 0");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(209, 103, 60, 33);
		panel.add(label_2);
		
		/***************************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA AMERICANA
		 * 
		 */
		
		JButton button_2 = new JButton("-");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_2.setBounds(159, 141, 45, 33);
		panel.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroAmericana > 0)
					numeroAmericana--;
				 label_3.setText(inte + numeroAmericana);
				}
		});
		
		JButton button_11 = new JButton("+");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_11.setBounds(274, 141, 45, 33);
		panel.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroAmericana < 10)
					numeroAmericana++;
				 label_3.setText(inte + numeroAmericana);
				}
		});
		
		label_3 = new JLabel(inte + " 0");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(209, 145, 60, 33);
		panel.add(label_3);
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA BUFALA
		 * 
		 */
		
	
		JButton button_4 = new JButton("-");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_4.setBounds(159, 189, 45, 33);
		panel.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroBufala > 0)
					numeroBufala--;
				 label_4.setText(inte + numeroBufala);
				}
		});
		
		JButton button_12 = new JButton("+");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_12.setBounds(274, 189, 45, 33);
		panel.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroBufala < 10)
					numeroBufala++;
				 label_4.setText(inte + numeroBufala);
				}
		});
		
		label_4 = new JLabel(inte + " 0");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(209, 189, 60, 33);
		panel.add(label_4);
		
		
		/************************************/
	
		
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA QUATTRO STAGIONI
		 * 
		 */
		
		
		JButton button_3 = new JButton("-");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_3.setBounds(159, 231, 45, 33);
		panel.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroQuattroStagioni > 0)
					numeroQuattroStagioni--;
				 label_5.setText(inte + numeroQuattroStagioni);
				}
		});

		JButton button_13 = new JButton("+");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_13.setBounds(274, 231, 45, 33);
		panel.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroQuattroStagioni < 10)
					numeroQuattroStagioni++;
				 label_5.setText(inte + numeroQuattroStagioni);
				}
		});
		
		
		label_5 = new JLabel(" 0");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(209, 235, 60, 33);
		panel.add(label_5);
		
		/************************************/
		
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA CAPRICCIOSA
		 * 
		 */
		
		JButton button_5 = new JButton("-");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_5.setBounds(461, 59, 45, 33);
		panel.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCapricciosa > 0)
					numeroCapricciosa--;
				 label_6.setText(inte + numeroCapricciosa);
				}
		});
		
		JButton button_18 = new JButton("+");
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_18.setBounds(558, 59, 45, 33);
		panel.add(button_18);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCapricciosa < 10)
					numeroCapricciosa++;
				 label_6.setText(inte + numeroCapricciosa);
				}
		});
		
		label_6 = new JLabel(" 0");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(509, 59, 45, 33);
		panel.add(label_6);
		
		
		/************************************/
		
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA CALAMARI
		 * 
		 */
		
		JButton button_6 = new JButton("-");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_6.setBounds(461, 99, 45, 33);
		panel.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCalamari > 0)
					numeroCalamari--;
				 label_7.setText(inte + numeroCalamari);
				}
		});
		
		JButton button_17 = new JButton("+");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_17.setBounds(558, 99, 45, 33);
		panel.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCalamari < 10)
					numeroCalamari++;
				 label_7.setText(inte + numeroCalamari);
				}
		});
		
		label_7 = new JLabel(" 0");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(509, 103, 45, 33);
		panel.add(label_7);
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA CAMPAGNOLA
		 * 
		 */
		
		JButton button_7 = new JButton("-");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_7.setBounds(461, 141, 45, 33);
		panel.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCampagnola > 0)
					numeroCampagnola--;
				 label_8.setText(inte + numeroCampagnola);
				}
		});
		
		JButton button_16 = new JButton("+");
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_16.setBounds(558, 141, 45, 33);
		panel.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCampagnola < 10)
					numeroCampagnola++;
				 label_8.setText(inte + numeroCampagnola);
				}
		});
		
		label_8 = new JLabel(" 0");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(509, 145, 45, 33);
		panel.add(label_8);
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA QUATTRO FORMAGGI
		 * 
		 */
		
		JButton button_8 = new JButton("-");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setBounds(461, 189, 45, 33);
		panel.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroQuattroFormaggi > 0)
					numeroQuattroFormaggi--;
				 label_9.setText(inte + numeroQuattroFormaggi);
				}
		});
		
		JButton button_15 = new JButton("+");
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_15.setBounds(558, 189, 45, 33);
		panel.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroQuattroFormaggi < 10)
					numeroQuattroFormaggi++;
				 label_9.setText(inte + numeroQuattroFormaggi);
				}
		});
		
		label_9 = new JLabel(" 0");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(509, 189, 45, 33);
		panel.add(label_9);
		
		
		/************************************/
		
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA PIZZA FRUTTI DI MARE
		 * 
		 */
		
		JButton button_9 = new JButton("-");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_9.setBounds(461, 231, 45, 33);
		panel.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroFruttiDiMare > 0)
					numeroFruttiDiMare--;
				 label_10.setText(inte + numeroFruttiDiMare);
				}
		});
		

		JButton button_14 = new JButton("+");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_14.setBounds(558, 231, 45, 33);
		panel.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroFruttiDiMare < 10)
					numeroFruttiDiMare++;
				 label_10.setText(inte + numeroFruttiDiMare);
				}
		});
		
		label_10 = new JLabel(" 0");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(509, 235, 45, 33);
		panel.add(label_10);
		
	
		/************************************/

		
		/*
		 * 
		 * CREAZIONE DEL PANNELLO DELLE PIZZE
		 * 
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(635, 98, 339, 285);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		/************************************/
		
		
		/*
		 * 
		 * NOMI COLONNE NEL PANNELLO DELLE BEVANDE
		 * 
		 */
		
		JLabel lblNomeBevanda = new JLabel("Bevanda");
		lblNomeBevanda.setBounds(26, 14, 107, 33);
		panel_1.add(lblNomeBevanda);
		
		JLabel lblQuantitaBevanda = new JLabel("Quantità");
		lblQuantitaBevanda.setBounds(178, 14, 115, 33);
		panel_1.add(lblQuantitaBevanda);
		
		/************************************/
		
		
		/*
		 * 
		 * NOMI DELLE BEVANDE
		 * 
		 */
		
		
		JLabel lblCocaCola = new JLabel("Coca Cola");
		lblCocaCola.setBounds(18, 55, 132, 33);
		panel_1.add(lblCocaCola);
		
		JLabel lblFanta = new JLabel("Fanta");
		lblFanta.setBounds(18, 102, 132, 33);
		panel_1.add(lblFanta);
		
		JLabel lblThe = new JLabel("Thè");
		lblThe.setBounds(18, 195, 132, 33);
		panel_1.add(lblThe);
		
		JLabel lblSprite = new JLabel("Sprite");
		lblSprite.setBounds(18, 148, 132, 33);
		panel_1.add(lblSprite);
		
		JLabel lblBirra = new JLabel("Birra 66cl");
		lblBirra.setBounds(18, 238, 132, 33);
		panel_1.add(lblBirra);
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA BEVANDA COCA COLA
		 * 
		 */
		
		
		JButton button_19 = new JButton("-");
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_19.setBounds(153, 55, 45, 33);
		panel_1.add(button_19);
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCoca > 0)
					numeroCoca--;
				 label_11.setText(inte + numeroCoca);
				}
		});
		
		JButton button_20 = new JButton("+");
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_20.setBounds(268, 55, 45, 33);
		panel_1.add(button_20);
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroCoca < 10)
					numeroCoca++;
				 label_11.setText(inte + numeroCoca);
				}
		});
		
		label_11 = new JLabel(" 0");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(203, 55, 60, 33);
		panel_1.add(label_11);
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA BEVANDA FANTA
		 * 
		 */
		
		JButton button_22 = new JButton("-");
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_22.setBounds(153, 95, 45, 33);
		panel_1.add(button_22);
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroFanta > 0)
					numeroFanta--;
				 label_12.setText(inte + numeroFanta);
				}
		});
		
		JButton button_21 = new JButton("+");
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_21.setBounds(268, 95, 45, 33);
		panel_1.add(button_21);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroFanta < 10)
					numeroFanta++;
				 label_12.setText(inte + numeroFanta);
				}
		});
		
		label_12 = new JLabel(" 0");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(203, 99, 60, 33);
		panel_1.add(label_12);
		
		
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA BEVANDA SPRITE
		 * 
		 */
		
		JButton button_23 = new JButton("-");
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_23.setBounds(153, 137, 45, 33);
		panel_1.add(button_23);
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroSprite > 0)
					numeroSprite--;
				 label_13.setText(inte + numeroSprite);
				}
		});
		
		
		JButton button_24 = new JButton("+");
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_24.setBounds(268, 137, 45, 33);
		panel_1.add(button_24);
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroSprite < 10)
					numeroSprite++;
				 label_13.setText(inte + numeroSprite);
				}
		});
		
		label_13 = new JLabel(" 0");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(203, 141, 60, 33);
		panel_1.add(label_13);
		
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA BEVANDA SPRITE
		 * 
		 */
		
		JButton button_26 = new JButton("-");
		button_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_26.setBounds(153, 185, 45, 33);
		panel_1.add(button_26);
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroThe > 0)
					numeroThe--;
				 label_14.setText(inte + numeroThe);
				}
		});
		
		JButton button_25 = new JButton("+");
		button_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_25.setBounds(268, 185, 45, 33);
		panel_1.add(button_25);
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroThe < 10)
					numeroThe++;
				 label_14.setText(inte + numeroThe);
				}
		});
		
		label_14 = new JLabel(" 0");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(203, 185, 60, 33);
		panel_1.add(label_14);
		
		
		/************************************/
		
		
		/*
		 * 
		 * PULSANTI E LABEL PER LA BEVANDA BIRRA
		 * 
		 */
		
		JButton button_27 = new JButton("-");
		button_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_27.setBounds(153, 227, 45, 33);
		panel_1.add(button_27);
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroBirra > 0)
					numeroBirra--;
				 label_15.setText(inte + numeroBirra);
				}
		});
		
		JButton button_28 = new JButton("+");
		button_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_28.setBounds(268, 227, 45, 33);
		panel_1.add(button_28);
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numeroBirra < 10)
					numeroBirra++;
				 label_15.setText(inte + numeroBirra);
				}
		});
		
		label_15 = new JLabel(" 0");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(203, 231, 60, 33);
		panel_1.add(label_15);
		
		
		/************************************/
		
		/*
		 * 
		 * PANNELLO DEI TOTALI + IVA
		 * 
		 */
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(635, 394, 339, 171);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSubtotale = new JLabel("Subtotale");
		lblSubtotale.setBounds(14, 28, 117, 33);
		panel_2.add(lblSubtotale);
		
		JLabel lblIva = new JLabel("+ IVA");
		lblIva.setBounds(14, 72, 85, 33);
		panel_2.add(lblIva);
		
		JLabel lblTotale = new JLabel("Totale");
		lblTotale.setBounds(14, 114, 85, 33);
		panel_2.add(lblTotale);
		
		JLabel label_21 = new JLabel("");
		label_21.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		label_21.setBounds(157, 28, 168, 33);
		panel_2.add(label_21);
		label_21.setText(inte + 0.00);
		
		JLabel label_16 = new JLabel("");
		label_16.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		label_16.setBounds(157, 72, 168, 33);
		panel_2.add(label_16);
		label_16.setText(inte + iva);
		
		JLabel label_17 = new JLabel("");
		label_17.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		label_17.setBounds(157, 114, 168, 33);
		panel_2.add(label_17);
		label_17.setText(inte + totale);
	
		/************************************/
		
		/*
		 * 
		 * PANNELLO DEI TOTALI DELLE PIZZE, DELLE BEVANDE E DEL TRASPORTO
		 * 
		 */
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(10, 394, 615, 171);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostoDellePizze = new JLabel("Costo delle pizze");
		lblCostoDellePizze.setBounds(26, 28, 204, 33);
		panel_3.add(lblCostoDellePizze);
		
		JLabel lblCostoDelleBevande = new JLabel("Costo delle bevande");
		lblCostoDelleBevande.setBounds(26, 72, 245, 33);
		panel_3.add(lblCostoDelleBevande);
		
		JLabel lblCostoDelTrasporto = new JLabel("Costo del trasporto");
		lblCostoDelTrasporto.setBounds(26, 114, 227, 33);
		panel_3.add(lblCostoDelTrasporto);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(320, 28, 223, 33);
		label_18.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.add(label_18);
		label_18.setText(inte + totalePizze);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(320, 72, 223, 33);
		label_19.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.add(label_19);
		label_19.setText(inte + totaleBevande);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(320, 114, 223, 33);
		label_20.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.add(label_20);
		label_20.setText(inte + 0.0);
		
		/************************************/
		
		/*
		 * 
		 * PANNELLO DELLO SCONTRINO FISCALE
		 * 
		 */
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(984, 98, 358, 467);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 28, 335, 428);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Scontrino Fiscale", null, panel_6, null);
		panel_6.setLayout(null);
		
		
		textAreaNomePizza.setBounds(0, 0, 109, 381);
		panel_6.add(textAreaNomePizza);
		
		
		textAreaQuantita.setBounds(108, 0, 128, 381);
		panel_6.add(textAreaQuantita);
		
		
		textAreaPrezzo.setBounds(236, 0, 94, 381);
		panel_6.add(textAreaPrezzo);
		
		
		
		/************************************/
		
		/*
		 * 
		 * PANNELLO DEI PULSANTI
		 * 
		 */
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 568, 1332, 83);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		
		JButton btnTotale = new JButton("Totale");
		btnTotale.setBounds(395, 28, 171, 41);
		panel_5.add(btnTotale);
		btnTotale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TotalePizze();
				TotaleBevande();
				Subtotale();
				CalcolaIva();
				CalcolaTotale();
				Scontrino();
				
				String totPizze = String.format("%.2f", totalePizze);
				label_18.setText(totPizze);
				String totBevande = String.format("%.2f", totaleBevande);
				label_19.setText(totBevande);
				label_20.setText(inte + costoTrasporto);
				String subtot = String.format("%.2f", subTotale);
				label_21.setText(subtot);
				String tax = String.format("%.2f", iva);
				label_16.setText(tax);
				String tot = String.format("%.2f", totale);
				label_17.setText(tot);
				
				textAreaNomePizza.append("Totale\n");
				textAreaQuantita.append("\n");
				textAreaPrezzo.append("" + totale + "€\n");
				
				btnTotale.setEnabled(false);
				
			}
		});
		
		JButton btnCancella = new JButton("Cancella");
		btnCancella.setBounds(688, 28, 171, 41);
		panel_5.add(btnCancella);
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeroMargherita = 0;
				numeroDiavola = 0;
				numeroAmericana = 0;
				numeroBufala = 0;
				numeroQuattroStagioni = 0;
				numeroCapricciosa = 0;
				numeroCalamari = 0;
				numeroCampagnola = 0;
				numeroQuattroFormaggi = 0;
				numeroFruttiDiMare = 0;
				numeroCoca = 0;
				numeroFanta = 0;
				numeroSprite = 0;
				numeroThe = 0;
				numeroBirra = 0;
				
				label_1.setText(inte + numeroMargherita);
				label_2.setText(inte + numeroDiavola);
				label_3.setText(inte + numeroAmericana);
				label_4.setText(inte + numeroBufala);
				label_5.setText(inte + numeroQuattroStagioni);
				label_6.setText(inte + numeroCapricciosa);
				label_7.setText(inte + numeroCalamari);
				label_8.setText(inte + numeroCampagnola);
				label_9.setText(inte + numeroQuattroFormaggi);
				label_10.setText(inte + numeroFruttiDiMare);
				label_11.setText(inte + numeroCoca);
				label_12.setText(inte + numeroFanta);
				label_13.setText(inte + numeroSprite);
				label_14.setText(inte + numeroThe);
				label_15.setText(inte + numeroBirra);
				
				totalePizze = 0.00;
				label_18.setText(inte + totalePizze);
				totaleBevande = 0.00;
				label_19.setText(inte + totaleBevande);
				label_20.setText(inte + 0.00);
				subTotale = 0.00;
				label_21.setText(inte +	subTotale);
				iva = 0.00;
				label_16.setText(inte + iva);
				totale = 0.00;
				
				label_17.setText(inte + iva);
				
				textAreaNomePizza.setText(null);
				textAreaQuantita.setText(null);
				textAreaPrezzo.setText(null);
				
				btnTotale.setEnabled(true);
				
			}
		});
		
		
		JButton btnUscita = new JButton("Uscita");
		btnUscita.setBounds(913, 28, 171, 41);
		panel_5.add(btnUscita);
		btnUscita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		
		/************************************/
		
	}
	
	public double TotalePizze()
	{
		totalePizze = ((margherita.costPizza() * numeroMargherita) + (diavola.costPizza() * numeroDiavola) + 
						(bufala.costPizza() * numeroBufala) + (americana.costPizza() * numeroAmericana) + (quattroStagioni.costPizza() * numeroQuattroStagioni) 
						+ (quattroFormaggi.costPizza() * numeroQuattroFormaggi) + (calamari.costPizza() * numeroCalamari) + 
						(fruttiDiMare.costPizza() * numeroFruttiDiMare) + (campagnola.costPizza() * numeroCampagnola) + 
						(capricciosa.costPizza() * numeroCapricciosa));
		
		return totalePizze;
		
	}
	
	public double TotaleBevande()
	{
		totaleBevande = ((cocaCola.costBevanda() * numeroCoca) + (fanta.costBevanda() * numeroFanta) + 
						(the.costBevanda() * numeroThe) + (sprite.costBevanda() * numeroSprite) + (birra.costBevanda() * numeroBirra));
		
		return totaleBevande;
		
	}
	
	public double Subtotale()
	{
		subTotale = totalePizze + totaleBevande +  costoTrasporto;
		
		return subTotale;
	}
	
	public double CalcolaIva()
	{
		iva = ((subTotale - costoTrasporto) * 10)/100;
		
		return iva;
	}
	
	public double CalcolaTotale()
	{
		totale = subTotale + iva;
		
		return totale;
	}
	
	
	public void Scontrino()
	{
		if(numeroMargherita != 0)
		{
			textAreaNomePizza.append(margherita.getNamePizza() + "\n");
			textAreaQuantita.append("" + numeroMargherita + "\n");
			textAreaPrezzo.append(margherita.costPizza()*numeroMargherita + "€\n");
		}
		
		if(numeroDiavola != 0)
		{
			textAreaNomePizza.append(diavola.getNamePizza() + "\n");
			textAreaQuantita.append("" + numeroDiavola + "\n");
			textAreaPrezzo.append(diavola.costPizza()*numeroDiavola + "€\n");
		}
		
		if(numeroAmericana != 0)
		{
			textAreaNomePizza.append(americana.getNamePizza() + "\n");
			textAreaQuantita.append("" + numeroAmericana + "\n");
			textAreaPrezzo.append(americana.costPizza()*numeroAmericana + "€\n");
		}
		
		if(numeroBufala != 0)
		{
			textAreaNomePizza.append("Bufala\n");
			textAreaQuantita.append("" + numeroBufala + "\n");
			textAreaPrezzo.append(bufala.costPizza()*numeroBufala + "€\n");
		}
		
		if(numeroQuattroStagioni != 0)
		{
			textAreaNomePizza.append(quattroStagioni.getNamePizza() + "\n");
			textAreaQuantita.append("" + numeroQuattroStagioni + "\n");
			textAreaPrezzo.append(quattroStagioni.costPizza()*numeroQuattroStagioni + "€\n");
		}
		
		if(numeroCapricciosa != 0)
		{
			textAreaNomePizza.append("Capricciosa\n");
			textAreaQuantita.append("" + numeroCapricciosa + "\n");
			textAreaPrezzo.append(capricciosa.costPizza()*numeroCapricciosa + "€\n");
		}
		
		if(numeroCalamari != 0)
		{
			textAreaNomePizza.append("Calamari\n");
			textAreaQuantita.append("" + numeroCalamari + "\n");
			textAreaPrezzo.append(calamari.costPizza()*numeroCalamari + "€\n");
		}
		
		if(numeroCampagnola != 0)
		{
			textAreaNomePizza.append("Campagnola\n");
			textAreaQuantita.append("" + numeroCampagnola + "\n");
			textAreaPrezzo.append(campagnola.costPizza()*numeroCampagnola + "€\n");
		}
		
		if(numeroQuattroFormaggi != 0)
		{
			textAreaNomePizza.append("Quattro formaggi\n");
			textAreaQuantita.append("" + numeroQuattroFormaggi + "\n");
			textAreaPrezzo.append(quattroFormaggi.costPizza()*numeroQuattroFormaggi + "€\n");
		}
		
		if(numeroFruttiDiMare != 0)
		{
			textAreaNomePizza.append("Frutti di mare\n");
			textAreaQuantita.append("" + numeroFruttiDiMare + "\n");
			textAreaPrezzo.append(fruttiDiMare.costPizza()*numeroFruttiDiMare + "€\n");
		}
		
		textAreaNomePizza.append("\n\n\n");
		textAreaQuantita.append("\n\n\n");
		textAreaPrezzo.append("\n\n\n");
		
		if(numeroCoca != 0)
		{
			textAreaNomePizza.append("Coca cola\n");
			textAreaQuantita.append("" + numeroCoca + "\n");
			textAreaPrezzo.append(cocaCola.costBevanda()*numeroCoca + "€\n");
		}
		
		if(numeroFanta != 0)
		{
			textAreaNomePizza.append("Fanta\n");
			textAreaQuantita.append("" + numeroFanta + "\n");
			textAreaPrezzo.append(fanta.costBevanda()*numeroFanta + "€\n");
		}
		
		if(numeroSprite != 0)
		{
			textAreaNomePizza.append("Sprite\n");
			textAreaQuantita.append("" + numeroSprite + "\n");
			textAreaPrezzo.append(sprite.costBevanda()*numeroSprite + "€\n");
		}
		
		if(numeroThe != 0)
		{
			textAreaNomePizza.append("Thè\n");
			textAreaQuantita.append("" + numeroThe + "\n");
			textAreaPrezzo.append(the.costBevanda()*numeroThe + "€\n");
		}
		
		if(numeroBirra != 0)
		{
			textAreaNomePizza.append("Birra\n");
			textAreaQuantita.append("" + numeroBirra + "\n");
			textAreaPrezzo.append(birra.costBevanda()*numeroBirra + "€\n");
		}
		
		textAreaNomePizza.append("\n\n\n");
		textAreaQuantita.append("\n\n\n");
		textAreaPrezzo.append("\n\n\n");
		
	}
	
	public void AggiungiIngredienti()
	{
		for(int i = 0; i < numeroMargherita; i++)
		{
			textAreaIngredienti.append("Margherita\n");
		}
		
		/*if(numeroDiavola != 0)
		{
			textAreaNomePizza.append("Diavola\n");
			textAreaQuantita.append("" + numeroDiavola + "\n");
			textAreaPrezzo.append(prezzoDiavola*numeroDiavola + "€\n");
		}
		
		if(numeroAmericana != 0)
		{
			textAreaNomePizza.append("Americana\n");
			textAreaQuantita.append("" + numeroAmericana + "\n");
			textAreaPrezzo.append(prezzoAmericana*numeroAmericana + "€\n");
		}
		
		if(numeroBufala != 0)
		{
			textAreaNomePizza.append("Bufala\n");
			textAreaQuantita.append("" + numeroBufala + "\n");
			textAreaPrezzo.append(prezzoBufala*numeroBufala + "€\n");
		}
		
		if(numeroQuattroStagioni != 0)
		{
			textAreaNomePizza.append("Quattro stagioni\n");
			textAreaQuantita.append("" + numeroQuattroStagioni + "\n");
			textAreaPrezzo.append(prezzoQuattroStagioni*numeroQuattroStagioni + "€\n");
		}
		
		if(numeroCapricciosa != 0)
		{
			textAreaNomePizza.append("Capricciosa\n");
			textAreaQuantita.append("" + numeroCapricciosa + "\n");
			textAreaPrezzo.append(prezzoCapricciosa*numeroCapricciosa + "€\n");
		}
		
		if(numeroCalamari != 0)
		{
			textAreaNomePizza.append("Calamari\n");
			textAreaQuantita.append("" + numeroCalamari + "\n");
			textAreaPrezzo.append(prezzoCalamari*numeroCalamari + "€\n");
		}
		
		if(numeroCampagnola != 0)
		{
			textAreaNomePizza.append("Campagnola\n");
			textAreaQuantita.append("" + numeroCampagnola + "\n");
			textAreaPrezzo.append(prezzoCampagnola*numeroCampagnola + "€\n");
		}
		
		if(numeroQuattroFormaggi != 0)
		{
			textAreaNomePizza.append("Quattro formaggi\n");
			textAreaQuantita.append("" + numeroQuattroFormaggi + "\n");
			textAreaPrezzo.append(prezzoQuattroFormaggi*numeroQuattroFormaggi + "€\n");
		}
		
		if(numeroFruttiDiMare != 0)
		{
			textAreaNomePizza.append("Frutti di mare\n");
			textAreaQuantita.append("" + numeroFruttiDiMare + "\n");
			textAreaPrezzo.append(prezzoFruttiDiMare*numeroFruttiDiMare + "€\n");
		}
		
		textAreaNomePizza.append("\n\n\n");
		textAreaQuantita.append("\n\n\n");
		textAreaPrezzo.append("\n\n\n");
		
		if(numeroCoca != 0)
		{
			textAreaNomePizza.append("Coca cola\n");
			textAreaQuantita.append("" + numeroCoca + "\n");
			textAreaPrezzo.append(prezzoCoca*numeroCoca + "€\n");
		}
		
		if(numeroFanta != 0)
		{
			textAreaNomePizza.append("Fanta\n");
			textAreaQuantita.append("" + numeroFanta + "\n");
			textAreaPrezzo.append(prezzoFanta*numeroFanta + "€\n");
		}
		
		if(numeroSprite != 0)
		{
			textAreaNomePizza.append("Sprite\n");
			textAreaQuantita.append("" + numeroSprite + "\n");
			textAreaPrezzo.append(prezzoSprite*numeroSprite + "€\n");
		}
		
		if(numeroThe != 0)
		{
			textAreaNomePizza.append("Thè\n");
			textAreaQuantita.append("" + numeroThe + "\n");
			textAreaPrezzo.append(prezzoThe*numeroThe + "€\n");
		}
		
		if(numeroBirra != 0)
		{
			textAreaNomePizza.append("Birra\n");
			textAreaQuantita.append("" + numeroBirra + "\n");
			textAreaPrezzo.append(prezzoBirra*numeroBirra + "€\n");
		}
		
		textAreaNomePizza.append("\n\n\n");
		textAreaQuantita.append("\n\n\n");
		textAreaPrezzo.append("\n\n\n");*/
		
	}
	
	
}
