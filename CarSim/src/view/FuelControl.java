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

public class FuelControl {
	private JPanel fuel_panel;
	private JButton fuel_up;
	private JButton fuel_down;
	private JLabel fuel_label;
	private ControlPanelController panelController;
	
	public FuelControl(JPanel control_panel,ControlPanelController panelController) {
		this.panelController = panelController;
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
		
		fuel_label = new JLabel("FUEL");
		GridBagConstraints gbc_lblFuel = new GridBagConstraints();
		gbc_lblFuel.insets = new Insets(0, 0, 5, 0);
		gbc_lblFuel.gridx = 0;
		gbc_lblFuel.gridy = 0;
		fuel_panel.add(fuel_label, gbc_lblFuel);
		
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
		
		//Listeners
		fuel_up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeFuel(ChangeType.UP);
			}
		});
		fuel_down.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeFuel(ChangeType.DOWN);
			}
		});
	}
}
