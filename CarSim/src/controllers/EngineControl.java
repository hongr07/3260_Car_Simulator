package controllers;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JPanel;

public class EngineControl {
	private JButton start_button;

	public EngineControl(JPanel control_panel) {
		start_button = new JButton("START/STOP");
		GridBagConstraints gbc_start_button = new GridBagConstraints();
		gbc_start_button.fill = GridBagConstraints.BOTH;
		gbc_start_button.gridx = 4;
		gbc_start_button.gridy = 0;
		control_panel.add(start_button, gbc_start_button);
	}
}
