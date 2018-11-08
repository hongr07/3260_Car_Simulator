package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import com.sun.java.swing.plaf.windows.resources.windows;

import model.CarObject;

import java.awt.Color;

public class DriveView {

	private JFrame frame;
	private JTextField dirField;
	private JTextField speedField;
	private JTextField dateField;
	/**
	 * @wbp.nonvisual location=-49,601
	 */
	private final JTextField textField_3 = new JTextField();
	private JTextField timeField;
	private JTextField fuelField;
	private JTextField tempField;
	private JTextField textField;
	private JTextField textField_1;
	
	private CarObject car;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DriveView window = new DriveView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public DriveView() {
		initialize();
	}
	
	public DriveView(CarObject car) {
		this.car = car;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_3.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 853, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBounds(656, 6, 197, 382);
		frame.getContentPane().add(displayPanel);
		GridBagLayout gbl_displayPanel = new GridBagLayout();
		gbl_displayPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 94, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_displayPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_displayPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_displayPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		displayPanel.setLayout(gbl_displayPanel);
		
		JLabel dirLabel = new JLabel("DIRECTION");
		GridBagConstraints gbc_dirLabel = new GridBagConstraints();
		gbc_dirLabel.anchor = GridBagConstraints.LINE_START;
		gbc_dirLabel.insets = new Insets(0, 0, 5, 5);
		gbc_dirLabel.gridx = 5;
		gbc_dirLabel.gridy = 3;
		displayPanel.add(dirLabel, gbc_dirLabel);
		
		dirField = new JTextField();
		dirField.setEditable(false);
		dirField.setText(car.getDirectionString());
		GridBagConstraints gbc_dirField = new GridBagConstraints();
		gbc_dirField.gridwidth = 4;
		gbc_dirField.insets = new Insets(0, 0, 5, 5);
		gbc_dirField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dirField.gridx = 8;
		gbc_dirField.gridy = 3;
		displayPanel.add(dirField, gbc_dirField);
		dirField.setColumns(10);
		
		JLabel fuelLabel = new JLabel("FUEL");
		GridBagConstraints gbc_fuelLabel = new GridBagConstraints();
		gbc_fuelLabel.anchor = GridBagConstraints.WEST;
		gbc_fuelLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fuelLabel.gridx = 5;
		gbc_fuelLabel.gridy = 4;
		displayPanel.add(fuelLabel, gbc_fuelLabel);
		
		fuelField = new JTextField();
		fuelField.setEditable(false);
		fuelField.setText(Float.toString(car.getFuel()));
		GridBagConstraints gbc_fuelField = new GridBagConstraints();
		gbc_fuelField.gridwidth = 5;
		gbc_fuelField.insets = new Insets(0, 0, 5, 5);
		gbc_fuelField.fill = GridBagConstraints.HORIZONTAL;
		gbc_fuelField.gridx = 7;
		gbc_fuelField.gridy = 4;
		displayPanel.add(fuelField, gbc_fuelField);
		fuelField.setColumns(10);
		
		JLabel speedLabel = new JLabel("SPEED km/h");
		GridBagConstraints gbc_speedLabel = new GridBagConstraints();
		gbc_speedLabel.anchor = GridBagConstraints.LINE_START;
		gbc_speedLabel.insets = new Insets(0, 0, 5, 5);
		gbc_speedLabel.gridx = 5;
		gbc_speedLabel.gridy = 5;
		displayPanel.add(speedLabel, gbc_speedLabel);
		
		speedField = new JTextField();
		speedField.setEditable(false);
		speedField.setText(Integer.toString(car.getSpeed()));
		GridBagConstraints gbc_speedField = new GridBagConstraints();
		gbc_speedField.fill = GridBagConstraints.HORIZONTAL;
		gbc_speedField.gridwidth = 3;
		gbc_speedField.insets = new Insets(0, 0, 5, 5);
		gbc_speedField.gridx = 9;
		gbc_speedField.gridy = 5;
		displayPanel.add(speedField, gbc_speedField);
		speedField.setColumns(10);
		
		JLabel dateLabel = new JLabel("DATE");
		GridBagConstraints gbc_dateLabel = new GridBagConstraints();
		gbc_dateLabel.anchor = GridBagConstraints.LINE_START;
		gbc_dateLabel.insets = new Insets(0, 0, 5, 5);
		gbc_dateLabel.gridx = 5;
		gbc_dateLabel.gridy = 6;
		displayPanel.add(dateLabel, gbc_dateLabel);
		
		dateField = new JTextField();
		dateField.setEditable(false);
		dateField.setColumns(10);
		GridBagConstraints gbc_dateField = new GridBagConstraints();
		gbc_dateField.gridwidth = 4;
		gbc_dateField.insets = new Insets(0, 0, 5, 5);
		gbc_dateField.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateField.gridx = 8;
		gbc_dateField.gridy = 6;
		displayPanel.add(dateField, gbc_dateField);
		
		JLabel timeLabel = new JLabel("TIME");
		GridBagConstraints gbc_timeLabel = new GridBagConstraints();
		gbc_timeLabel.anchor = GridBagConstraints.LINE_START;
		gbc_timeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_timeLabel.gridx = 5;
		gbc_timeLabel.gridy = 7;
		displayPanel.add(timeLabel, gbc_timeLabel);
		
		timeField = new JTextField();
		timeField.setEditable(false);
//		timeField.setText(Float.toString(this.car.get()));
		GridBagConstraints gbc_timeField = new GridBagConstraints();
		gbc_timeField.fill = GridBagConstraints.HORIZONTAL;
		gbc_timeField.anchor = GridBagConstraints.EAST;
		gbc_timeField.gridwidth = 5;
		gbc_timeField.insets = new Insets(0, 0, 5, 5);
		gbc_timeField.gridx = 7;
		gbc_timeField.gridy = 7;
		displayPanel.add(timeField, gbc_timeField);
		timeField.setColumns(10);
		
		JLabel tempLabel = new JLabel("TEMPERATURE");
		GridBagConstraints gbc_tempLabel = new GridBagConstraints();
		gbc_tempLabel.anchor = GridBagConstraints.WEST;
		gbc_tempLabel.insets = new Insets(0, 0, 5, 5);
		gbc_tempLabel.gridx = 5;
		gbc_tempLabel.gridy = 8;
		displayPanel.add(tempLabel, gbc_tempLabel);
		
		tempField = new JTextField();
		tempField.setEditable(false);
		tempField.setText(Float.toString(this.car.getTemperature()));
		tempField.setColumns(10);
		GridBagConstraints gbc_tempField = new GridBagConstraints();
		gbc_tempField.gridwidth = 5;
		gbc_tempField.insets = new Insets(0, 0, 5, 5);
		gbc_tempField.fill = GridBagConstraints.HORIZONTAL;
		gbc_tempField.gridx = 7;
		gbc_tempField.gridy = 8;
		displayPanel.add(tempField, gbc_tempField);
		
		JPanel simPanel = new JPanel();
		simPanel.setBackground(Color.WHITE);
		simPanel.setBounds(6, 6, 650, 382);
		frame.getContentPane().add(simPanel);
	}
	
	public void updateView(CarObject car) {
		this.car = car;
		tempField.setText(Float.toString(this.car.getTemperature()));
		speedField.setText(Integer.toString(car.getSpeed()));
		fuelField.setText(Float.toString(car.getFuel()));
		dirField.setText(car.getDirectionString());
	}
}
