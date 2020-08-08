

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TresenRaya {

	private JFrame frmTresEnRaya;
	private JTextField jugador1cont;
	private JTextField jugador2cont;

	/**
	 * Launch the application.
	 */
	int turno=2;
	String b,b0,b1,b2,b3,b4,b5,b6,b7,b8;
	int contadorjugador1=0;
	int contadorjugador2=0;
	JButton[] botones = new JButton[9];
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresenRaya window = new TresenRaya();
					window.frmTresEnRaya.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//metodo para la clase que cambia de un jugador a otro cuando se hace clic en una posicion
	public void cambioturno (int turno,JButton boton) {
		if ((turno==2)||(turno==1)) {
			for (int i = 0; i < 9; i++) {
			boton.setIcon(new ImageIcon("C:\\Users\\christian2\\Downloads\\iconos\\x.png"));
			}
			this.turno=0;
		}
		else{
			boton.setIcon(new ImageIcon("C:\\Users\\christian2\\Downloads\\iconos\\cityscape.png"));
			this.turno=1;
		}
	
	//metodo que indica si un boton es clicado por un jugador o otro , para comprobar ganador
	}
	public void asignarjugador(int turno) {
		if (turno==0) {
			this.b="jugador1";
		}
		else {
			this.b="jugador2";
		}
	}
	//metodo para comprobar si hay ganador o no
		public void ganador() {
			//jugador 1
		if ((b0=="jugador1") && (b1=="jugador1") && (b2=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b3=="jugador1") && (b4=="jugador1") && (b5=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b6=="jugador1") && (b7=="jugador1") && (b8=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b0=="jugador1") && (b3=="jugador1") && (b6=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b1=="jugador1") && (b4=="jugador1") && (b7=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b2=="jugador1") && (b5=="jugador1") && (b8=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b0=="jugador1") && (b4=="jugador1") && (b8=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		if ((b2=="jugador1") && (b4=="jugador1") && (b6=="jugador1")){
			this.contadorjugador1=contadorjugador1+1;
		}
		
		//jugador2
		
		if ((b0=="jugador2") && (b1=="jugador2") && (b2=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b3=="jugador2") && (b4=="jugador2") && (b5=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b6=="jugador2") && (b7=="jugador2") && (b8=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b0=="jugador2") && (b3=="jugador2") && (b6=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b1=="jugador2") && (b4=="jugador2") && (b7=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b2=="jugador2") && (b5=="jugador2") && (b8=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b0=="jugador2") && (b4=="jugador2") && (b8=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
		if ((b2=="jugador2") && (b4=="jugador2") && (b6=="jugador2")){
			this.contadorjugador2=contadorjugador2+1;
		}
	
	}
		//metodo para limpiar el tablero y los jugadores en los b,b1...
	public void limpiartablero() {
		for (int i = 0; i < 9; i++) {
		    botones[i].setIcon(new ImageIcon("null"));
		    
		}
		this.turno=2;
		this.b="";this.b0="";this.b1="";this.b2="";this.b3="";
		this.b4="";this.b5="";this.b6="";this.b7="";this.b8="";
	}
	
		//
	public void contadorjugadoresacero() {
		this.contadorjugador1=0;
		this.contadorjugador2=0;
		jugador1cont.setText(Integer.toString(contadorjugador1));
		jugador2cont.setText(Integer.toString(contadorjugador2));
	}
	/**
	 * Create the application.
	 */
	public TresenRaya() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTresEnRaya = new JFrame();
		frmTresEnRaya.setTitle(" TRES EN RAYA - by Christian");
		frmTresEnRaya.setBounds(100, 100, 450, 300);
		frmTresEnRaya.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTresEnRaya.getContentPane().setLayout(null);
		for (int i = 0; i < 9; i++) {
		    botones[i] = new JButton("");;
		}
		
		JButton btnReiniciarContador = new JButton("Reiniciar contador");
		btnReiniciarContador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiartablero();
				contadorjugadoresacero();
			}
		});
		btnReiniciarContador.setBounds(251, 36, 173, 23);
		frmTresEnRaya.getContentPane().add(btnReiniciarContador);
		
		jugador1cont = new JTextField();
		jugador1cont.setText(Integer.toString(contadorjugador1));
		jugador1cont.setBounds(286, 87, 96, 20);
		frmTresEnRaya.getContentPane().add(jugador1cont);
		jugador1cont.setColumns(10);
		
		JLabel lblJugador = new JLabel("Jugador 1 ");
		lblJugador.setBounds(297, 70, 74, 14);
		frmTresEnRaya.getContentPane().add(lblJugador);
		
		jugador2cont = new JTextField();
		jugador2cont.setText(Integer.toString(contadorjugador2));
		jugador2cont.setBounds(286, 134, 96, 20);
		frmTresEnRaya.getContentPane().add(jugador2cont);
		jugador2cont.setColumns(10);
		
		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setBounds(296, 118, 48, 14);
		frmTresEnRaya.getContentPane().add(lblJugador_1);
		
	
		botones[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[0]);
				asignarjugador(turno);
				b0=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[0].setBounds(10, 11, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[0]);
		
		botones[1] = new JButton("");
		botones[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[1]);
				asignarjugador(turno);
				b1=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[1].setBounds(80, 11, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[1]);
		
		botones[2] = new JButton("");
		botones[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[2]);
				asignarjugador(turno);
				b2=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[2].setBounds(151, 11, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[2]);
		
		botones[3] = new JButton("");
		botones[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[3]);
				asignarjugador(turno);
				b3=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[3].setBounds(10, 86, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[3]);
		
		botones[4] = new JButton("");
		botones[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[4]);
				asignarjugador(turno);
				b4=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[4].setBounds(80, 86, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[4]);
		
		botones[5] = new JButton("");
		botones[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[5]);
				asignarjugador(turno);
				b5=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[5].setBounds(151, 86, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[5]);
		
		botones[6] = new JButton("");
		botones[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[6]);
				asignarjugador(turno);
				b6=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[6].setBounds(10, 155, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[6]);
		
		botones[7] = new JButton("");
		botones[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[7]);
				asignarjugador(turno);
				b7=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[7].setBounds(80, 157, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[7]);
		
		botones[8] = new JButton("");
		botones[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioturno(turno,botones[8]);
				asignarjugador(turno);
				b8=b;
				ganador();
				jugador1cont.setText(Integer.toString(contadorjugador1));
				jugador2cont.setText(Integer.toString(contadorjugador2));
			}
		});
		botones[8].setBounds(151, 157, 60, 60);
		frmTresEnRaya.getContentPane().add(botones[8]);
		
		JButton btnLimpiarTablero = new JButton("Limpiar tablero");
		btnLimpiarTablero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiartablero();
			}
		});
		btnLimpiarTablero.setBounds(262, 194, 134, 45);
		frmTresEnRaya.getContentPane().add(btnLimpiarTablero);
	}

}
