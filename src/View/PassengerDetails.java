package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import Model.BusTicket;
import Model.Passengers;

public class PassengerDetails extends JFrame {
	

	private JPanel contentPane;
	private JTextField inputName;
	private JTextField inputIc;
	private JTextField inputEmail;
	private JTextField inputPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerDetails frame = new PassengerDetails();
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
	public PassengerDetails() {
		setTitle("Passenger Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseFillUp = new JLabel("Please fill up the form below:");
		lblPleaseFillUp.setBounds(100, 16, 315, 20);
		contentPane.add(lblPleaseFillUp);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(111, 80, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblIC = new JLabel("IC Number:");
		lblIC.setBounds(70, 116, 84, 20);
		contentPane.add(lblIC);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(111, 164, 69, 20);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone Number:");
		lblPhone.setBounds(43, 214, 118, 20);
		contentPane.add(lblPhone);
		
		inputName = new JTextField();
		inputName.setBounds(173, 77, 198, 26);
		contentPane.add(inputName);
		inputName.setColumns(10);
		
		inputIc = new JTextField();
		inputIc.setBounds(173, 116, 198, 26);
		contentPane.add(inputIc);
		inputIc.setColumns(10);
		
		inputEmail = new JTextField();
		inputEmail.setBounds(173, 161, 198, 26);
		contentPane.add(inputEmail);
		inputEmail.setColumns(10);
		
		inputPhone = new JTextField();
		inputPhone.setBounds(173, 211, 198, 26);
		contentPane.add(inputPhone);
		inputPhone.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(225, 269, 115, 29);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	SummaryBooking sb = new SummaryBooking();
	        	sb.setVisible(true);
	        	
	        	
	        	
	        	String name =inputName.getText();
	        	String ic =inputIc.getText();
	        	String email =inputEmail.getText();
	        	String phone = inputPhone.getText();
	    	   
	            
	    		new SummaryBooking(name,ic,email,phone).setVisible(true);
	    		
	            
	         }          
	      });
	}
}
