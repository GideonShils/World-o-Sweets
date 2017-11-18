package WorldOfSweets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoadSaveHandler{

	private JMenuItem save;
	private JMenuItem load;

	public LoadSaveHandler(){
	}
	

	public JMenuItem createSaveMenuItem(){
		// have to grab save icon and rescale it
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/save.png"));
        Image saveIm = saveIcon.getImage();
        Image newSave = saveIm.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        saveIcon = new ImageIcon(newSave);

        // create save menu item with save icon
        save = new JMenuItem("Save", saveIcon);
        save.getAccessibleContext().setAccessibleDescription("Saves the current game.");

        ActionListener saveListener = new SaveListener();
        save.addActionListener(saveListener);

        return save;
	}

	public JMenuItem createLoadMenuItem(){
		// have to grab load icon and rescale it
        ImageIcon loadIcon = new ImageIcon(getClass().getResource("/load.png"));
        Image loadIm = loadIcon.getImage();
        Image newLoad = loadIm.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        loadIcon = new ImageIcon(newLoad);

        // create Load menu item with load icon
        load = new JMenuItem("Load", loadIcon);
        load.getAccessibleContext().setAccessibleDescription("Loads a previous game.");

        ActionListener loadListener = new LoadListener();
        load.addActionListener(loadListener);

        return load;
	}

	private boolean saveObject(File file){
		LoadSaveObject o = new LoadSaveObject();
		o.dm = WorldOfSweets.dm;
		o.gameState = WorldOfSweets.gameState;
		o.num_players = WorldOfSweets.num_players;
		o.tokens = WorldOfSweets.tokens;
		o.current_token = WorldOfSweets.current_token;
		o.positions = WorldOfSweets.positions;

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
		}
		catch(FileNotFoundException e){
			//System.out.println("File not found exception!");
			e.printStackTrace();
			return false;
		}
		catch(IOException e){
			//System.out.println("IOException!");
			e.printStackTrace();
			return false;
		}

		return true;

	}

	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			JFileChooser fileChooser = new JFileChooser();
			if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            	File file = fileChooser.getSelectedFile();
          		saveObject(file);
          		// save to file
        	}
		}
	}

	private class LoadListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
        	JFileChooser fileChooser = new JFileChooser();
        	if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
          
          		// save to file
        	}
      	}
  	}

}