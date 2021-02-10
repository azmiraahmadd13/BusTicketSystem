package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Passengers;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class SummaryBooking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SummaryBooking frame = new SummaryBooking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	String name, ic, phone, email;
	private JTextField textSummary;
	
	public SummaryBooking() {
		setTitle("Summary Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSummary = new JLabel("Ticket Details :");
		lblSummary.setBounds(152, 16, 115, 20);
		contentPane.add(lblSummary);
		
		JButton btnPayNow = new JButton("Pay Now");
		btnPayNow.setBounds(273, 405, 115, 29);
		contentPane.add(btnPayNow);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(86, 52, 269, 20);
		contentPane.add(lblName);
		
		JLabel lblIc = new JLabel("ic");
		lblIc.setBounds(86, 88, 269, 20);
		contentPane.add(lblIc);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(86, 124, 269, 20);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(86, 160, 269, 20);
		contentPane.add(lblPhone);
		
		JLabel lblSeat = new JLabel("seat");
		lblSeat.setBounds(86, 196, 269, 20);
		contentPane.add(lblSeat);
		
		JLabel lblOrigin = new JLabel("Origin ");
		lblOrigin.setBounds(86, 232, 269, 20);
		contentPane.add(lblOrigin);
		
		JLabel lblDestination = new JLabel("destination");
		lblDestination.setBounds(86, 268, 269, 20);
		contentPane.add(lblDestination);
		
		JLabel lblTotalPayment = new JLabel("Total Payment:");
		lblTotalPayment.setBounds(152, 317, 139, 20);
		contentPane.add(lblTotalPayment);
		
		
		
		btnPayNow.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	Payment payment = new Payment();
	        	payment.setVisible(true);
	        	 
	        	 
	            
	         }          
	      });
	}
	
	public SummaryBooking(String para,String para1, String para2, String para3) {
		setTitle("Summary Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSummary = new JLabel("Ticket Details :");
		lblSummary.setBounds(165, 16, 115, 20);
		contentPane.add(lblSummary);
		

		JLabel lblName = new JLabel("");
		lblName.setBounds(86, 64, 269, 20);
		contentPane.add(lblName);
		lblName.setText("Name: " + para);
		
		JLabel lblIc = new JLabel("");
		lblIc.setBounds(86, 110, 269, 20);
		contentPane.add(lblIc);
		lblIc.setText("IC Number: " +para1);
		
		JLabel lblEmail = new JLabel("");
		lblEmail.setBounds(86, 175, 269, 20);
		contentPane.add(lblEmail);
		lblEmail.setText("Email: " +para2);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(86, 229, 269, 20);
		contentPane.add(lblPhone);
		lblPhone.setText("Phone Number: " +para3);
		
		
		JButton btnPayNow = new JButton("Pay Now");
		btnPayNow.setBounds(165, 329, 115, 29);
		contentPane.add(btnPayNow);
		btnPayNow.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	Payment payment = new Payment();
	        	payment.setVisible(true);
	        	 
	        	 
	           
	         }          
	      });
		
	}
}
