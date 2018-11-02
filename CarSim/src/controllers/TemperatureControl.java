package controllers;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TemperatureControl {
	private JPanel temp_panel;
	private JButton temp_up;
	private JButton temp_down;
	private JLabel temp_label;
	
	public TemperatureControl(JPanel control_panel) {
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
	}
}
