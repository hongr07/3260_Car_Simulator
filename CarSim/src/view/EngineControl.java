package view;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.ControlPanelController;

public class EngineControl {
	private JButton start_button;
	private ControlPanelController panelController;

	public EngineControl(JPanel control_panel,ControlPanelController panelController) {
		this.panelController = panelController;
		start_button = new JButton("START/STOP");
		GridBagConstraints gbc_start_button = new GridBagConstraints();
		gbc_start_button.fill = GridBagConstraints.BOTH;
		gbc_start_button.gridx = 4;
		gbc_start_button.gridy = 0;
		control_panel.add(start_button, gbc_start_button);
		
		//Listeners
		start_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeEngineStatus();
			}
		});
	}
}
