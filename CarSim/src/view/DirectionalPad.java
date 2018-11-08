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

import controllers.ControlPanelController;
import model.CarObject.Direction;
import view.ControlPanelView.ChangeType;

public class DirectionalPad {
	private JPanel direction_panel;
	private JButton direction_north;
	private JButton direction_east;
	private JButton direction_west;
	private JButton direciton_south;
	private JLabel direction_label;
	private ControlPanelController panelController;

	public DirectionalPad (JPanel control_panel,ControlPanelController panelController) {
		this.panelController = panelController;
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
		
		//Listeners
		direction_north.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeDirection(Direction.North);
			}
		});
		direciton_south.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeDirection(Direction.South);
			}
		});
		direction_east.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeDirection(Direction.East);
			}
		});
		direction_west.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelController.changeDirection(Direction.West);
			}
		});
	}
}
