import java.awt.*;
import java.io.FileNotFoundException;
import java.awt.event.*;
import javax.swing.*;

class DrawingFrame extends JFrame implements WindowListener ,ActionListener {	

		
	public DrawingFrame() throws FileNotFoundException {
	    
		Drawing_panel panel = new Drawing_panel();		
		this.add(panel);
		
		 	  
		this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
				//writes the state of shapes after window is closed
				try {
					FileWrite fW = new FileWrite(panel.getStack().getData());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                System.exit(0);
            }
        });			    		    
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
	}

}