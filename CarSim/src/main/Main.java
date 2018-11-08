package main;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controllers.ControlPanelController;
import view.ControlPanelView;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main started");
		
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
					ControlPanelController controller = new ControlPanelController();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
