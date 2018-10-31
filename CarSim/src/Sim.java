import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class Sim {

	private JFrame frame;
	private JPanel control_panel;
	private JButton start_button;
	private JButton speed_up;
	private JPanel speed_panel;
	private JPanel direction_panel;
	private JButton direction_north;
	private JButton direction_east;
	private JButton direction_west;
	private JButton direciton_south;
	private JButton speed_down;
	private JPanel temp_panel;
	private JButton temp_up;
	private JButton temp_down;
	private JPanel fuel_panel;
	private JButton fuel_up;
	private JButton fuel_down;
	private JLabel direction_label;
	private JLabel speed_label;
	private JLabel temp_label;
	private JLabel lblFuel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            // Set cross-platform Java L&F (also called "Metal")
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        }
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sim window = new Sim();
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
	public Sim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Car Simulation");
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initButtons(frame);
	}
	
	private void initButtons(JFrame frame) {
		control_panel = new JPanel();
		control_panel.setBorder(new MatteBorder(3, 0, 0, 0, (Color) new Color(0, 0, 0)));
		control_panel.setBackground(Color.LIGHT_GRAY);
		
		frame.getContentPane().add(control_panel, BorderLayout.SOUTH);
		GridBagLayout gbl_control_panel = new GridBagLayout();
		gbl_control_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_control_panel.rowHeights = new int[]{79, 0};
		gbl_control_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_control_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		control_panel.setLayout(gbl_control_panel);
		
		direction_panel = new JPanel();
		direction_panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_direction_panel = new GridBagConstraints();
		gbc_direction_panel.fill = GridBagConstraints.VERTICAL;
		gbc_direction_panel.insets = new Insets(0, 0, 0, 5);
		gbc_direction_panel.gridx = 0;
		gbc_direction_panel.gridy = 0;
		control_panel.add(direction_panel, gbc_direction_panel);
		GridBagLayout gbl_direction_panel = new GridBagLayout();
		gbl_direction_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_direction_panel.rowHeights = new int[]{28, 0, 0, 0, 0};
		gbl_direction_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_direction_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		direction_panel.setLayout(gbl_direction_panel);
		
		direction_label = new JLabel("DIRECTION");
		GridBagConstraints gbc_direction_label = new GridBagConstraints();
		gbc_direction_label.fill = GridBagConstraints.VERTICAL;
		gbc_direction_label.insets = new Insets(0, 0, 5, 5);
		gbc_direction_label.gridx = 1;
		gbc_direction_label.gridy = 0;
		direction_panel.add(direction_label, gbc_direction_label);
		
		direction_north = new JButton("NORTH");
		GridBagConstraints gbc_direction_north = new GridBagConstraints();
		gbc_direction_north.insets = new Insets(0, 0, 5, 5);
		gbc_direction_north.fill = GridBagConstraints.VERTICAL;
		gbc_direction_north.gridx = 1;
		gbc_direction_north.gridy = 1;
		direction_panel.add(direction_north, gbc_direction_north);
		
		direction_west = new JButton("WEST");
		GridBagConstraints gbc_direction_west = new GridBagConstraints();
		gbc_direction_west.insets = new Insets(0, 0, 5, 5);
		gbc_direction_west.gridx = 0;
		gbc_direction_west.gridy = 2;
		direction_panel.add(direction_west, gbc_direction_west);
		
		direction_east = new JButton("EAST");
		GridBagConstraints gbc_direction_east = new GridBagConstraints();
		gbc_direction_east.insets = new Insets(0, 0, 5, 0);
		gbc_direction_east.gridx = 2;
		gbc_direction_east.gridy = 2;
		direction_panel.add(direction_east, gbc_direction_east);
		
		direciton_south = new JButton("SOUTH");
		GridBagConstraints gbc_direciton_south = new GridBagConstraints();
		gbc_direciton_south.insets = new Insets(0, 0, 0, 5);
		gbc_direciton_south.gridx = 1;
		gbc_direciton_south.gridy = 3;
		direction_panel.add(direciton_south, gbc_direciton_south);
		
		speed_panel = new JPanel();
		speed_panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_speed_panel = new GridBagConstraints();
		gbc_speed_panel.fill = GridBagConstraints.VERTICAL;
		gbc_speed_panel.insets = new Insets(0, 0, 0, 5);
		gbc_speed_panel.gridx = 1;
		gbc_speed_panel.gridy = 0;
		control_panel.add(speed_panel, gbc_speed_panel);
		GridBagLayout gbl_speed_panel = new GridBagLayout();
		gbl_speed_panel.columnWidths = new int[]{63, 0};
		gbl_speed_panel.rowHeights = new int[]{28, 0, 0, 0, 0};
		gbl_speed_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_speed_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		speed_panel.setLayout(gbl_speed_panel);
		
		speed_label = new JLabel("SPEED");
		GridBagConstraints gbc_speed_label = new GridBagConstraints();
		gbc_speed_label.insets = new Insets(0, 0, 5, 0);
		gbc_speed_label.gridx = 0;
		gbc_speed_label.gridy = 0;
		speed_panel.add(speed_label, gbc_speed_label);
		
		speed_up = new JButton("UP");
		speed_up.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_speed_up = new GridBagConstraints();
		gbc_speed_up.fill = GridBagConstraints.HORIZONTAL;
		gbc_speed_up.insets = new Insets(0, 0, 5, 0);
		gbc_speed_up.gridx = 0;
		gbc_speed_up.gridy = 1;
		speed_panel.add(speed_up, gbc_speed_up);
		
		speed_down = new JButton("DOWN");
		speed_down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_speed_down = new GridBagConstraints();
		gbc_speed_down.gridx = 0;
		gbc_speed_down.gridy = 3;
		speed_panel.add(speed_down, gbc_speed_down);
		
		temp_panel = new JPanel();
		temp_panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_temp_panel = new GridBagConstraints();
		gbc_temp_panel.insets = new Insets(0, 0, 0, 5);
		gbc_temp_panel.fill = GridBagConstraints.VERTICAL;
		gbc_temp_panel.gridx = 2;
		gbc_temp_panel.gridy = 0;
		control_panel.add(temp_panel, gbc_temp_panel);
		GridBagLayout gbl_temp_panel = new GridBagLayout();
		gbl_temp_panel.columnWidths = new int[]{63, 0};
		gbl_temp_panel.rowHeights = new int[]{28, 0, 0, 0, 0};
		gbl_temp_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_temp_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		temp_panel.setLayout(gbl_temp_panel);
		
		temp_label = new JLabel("TEMP");
		GridBagConstraints gbc_temp_label = new GridBagConstraints();
		gbc_temp_label.insets = new Insets(0, 0, 5, 0);
		gbc_temp_label.gridx = 0;
		gbc_temp_label.gridy = 0;
		temp_panel.add(temp_label, gbc_temp_label);
		
		temp_up = new JButton("UP");
		temp_up.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_temp_up = new GridBagConstraints();
		gbc_temp_up.fill = GridBagConstraints.HORIZONTAL;
		gbc_temp_up.insets = new Insets(0, 0, 5, 0);
		gbc_temp_up.gridx = 0;
		gbc_temp_up.gridy = 1;
		temp_panel.add(temp_up, gbc_temp_up);
		
		temp_down = new JButton("DOWN");
		GridBagConstraints gbc_temp_down = new GridBagConstraints();
		gbc_temp_down.gridx = 0;
		gbc_temp_down.gridy = 3;
		temp_panel.add(temp_down, gbc_temp_down);
		
		fuel_panel = new JPanel();
		fuel_panel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_fuel_panel = new GridBagConstraints();
		gbc_fuel_panel.insets = new Insets(0, 0, 0, 5);
		gbc_fuel_panel.fill = GridBagConstraints.VERTICAL;
		gbc_fuel_panel.gridx = 3;
		gbc_fuel_panel.gridy = 0;
		control_panel.add(fuel_panel, gbc_fuel_panel);
		GridBagLayout gbl_fuel_panel = new GridBagLayout();
		gbl_fuel_panel.columnWidths = new int[]{63, 0};
		gbl_fuel_panel.rowHeights = new int[]{28, 0, 0, 0, 0};
		gbl_fuel_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_fuel_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fuel_panel.setLayout(gbl_fuel_panel);
		
		lblFuel = new JLabel("FUEL");
		GridBagConstraints gbc_lblFuel = new GridBagConstraints();
		gbc_lblFuel.insets = new Insets(0, 0, 5, 0);
		gbc_lblFuel.gridx = 0;
		gbc_lblFuel.gridy = 0;
		fuel_panel.add(lblFuel, gbc_lblFuel);
		
		fuel_up = new JButton("UP");
		fuel_up.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_fuel_up = new GridBagConstraints();
		gbc_fuel_up.fill = GridBagConstraints.HORIZONTAL;
		gbc_fuel_up.insets = new Insets(0, 0, 5, 0);
		gbc_fuel_up.gridx = 0;
		gbc_fuel_up.gridy = 1;
		fuel_panel.add(fuel_up, gbc_fuel_up);
		
		fuel_down = new JButton("DOWN");
		GridBagConstraints gbc_fuel_down = new GridBagConstraints();
		gbc_fuel_down.gridx = 0;
		gbc_fuel_down.gridy = 3;
		fuel_panel.add(fuel_down, gbc_fuel_down);
		
		start_button = new JButton("START/STOP");
		GridBagConstraints gbc_start_button = new GridBagConstraints();
		gbc_start_button.fill = GridBagConstraints.BOTH;
		gbc_start_button.gridx = 4;
		gbc_start_button.gridy = 0;
		control_panel.add(start_button, gbc_start_button);
	}

}
