package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.ControlPanelController;
import view.ControlPanelView.ChangeType;

public class SpeedControl {
	private JButton speed_up;
	private JPanel speed_panel;
	private JButton speed_down;
	private JLabel speed_label;
	private ControlPanelController panelController;

	public SpeedControl(JPanel control_panel, ControlPanelController panelController) {
		this.panelController = panelController;
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
		GridBagConstraints gbc_speed_down = new GridBagConstraints();
		gbc_speed_down.gridx = 0;
		gbc_speed_down.gridy = 3;
		speed_panel.add(speed_down, gbc_speed_down);
		
		//Listeners
		speed_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeSpeed(ChangeType.UP);
			}
		});
		speed_down.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeSpeed(ChangeType.DOWN);
			}
		});
	}
}
