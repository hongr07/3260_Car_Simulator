package controllers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class ControlPanelView {
	private JFrame frame;
	private JPanel control_panel;
	
	private DirectionalPad directional_pad;
	private SpeedControl speed_control;
	private TemperatureControl temp_control;
	private FuelControl fuel_control;
	private EngineControl engine_control;

	/**
	 * Create the application.
	 */
	public ControlPanelView() {
		render();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void render() {
		frame = new JFrame("Car Simulation");
		frame.setBounds(100, 100, 900, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		directional_pad = new DirectionalPad(control_panel);
		speed_control = new SpeedControl(control_panel);
		temp_control = new TemperatureControl(control_panel);
		fuel_control = new FuelControl(control_panel);
		engine_control = new EngineControl(control_panel);
	}

}

