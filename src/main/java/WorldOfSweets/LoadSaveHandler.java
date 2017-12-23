package WorldOfSweets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoadSaveHandler {

	private JMenuItem save;
	private JMenuItem load;
	private WorldOfSweets wos;

	public LoadSaveHandler(WorldOfSweets ws) {
		wos = ws;
	}

	public JMenuItem createSaveMenuItem() {
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

	public JMenuItem createLoadMenuItem() {
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

	private boolean saveObject(File file) {
		LoadSaveObject o = new LoadSaveObject();
		o.cardPanel = WorldOfSweets.cardPanel;
		o.dm = WorldOfSweets.dm;
		o.numPlayers = WorldOfSweets.numPlayers;
		o.tokens = WorldOfSweets.tokens;
		o.currentToken = WorldOfSweets.currentToken;
		o.gm = WorldOfSweets.gm;
		o.gs = WorldOfSweets.gameState;
		o.timeElapsed = WorldOfSweets.timer.timeElapsed;
		o.oldTimeElapsed = WorldOfSweets.timer.timeElapsed;

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();

		} catch (FileNotFoundException e) {
			//System.out.println("File not found exception!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			//System.out.println("IOException!");
			e.printStackTrace();
			return false;
		}

		try {
			String checksum = MD5Checksum.getMD5Checksum(file.getPath());
			PrintWriter out = new PrintWriter(file.getPath() + "_checksum.txt");

			out.print(checksum);

			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	private boolean loadObject(File file) {

		if (!MD5Checksum.compareChecksum(file)) {
			errorBox("Cannot load the game due to the file being corrupted!", "Corrupted File");
			return false;
		}

		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			LoadSaveObject o = (LoadSaveObject) ois.readObject();

			ois.close();

			wos.loadGameBoard(o);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return true;
	}

	private void errorBox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "Error: " + titleBar, JOptionPane.ERROR_MESSAGE);
	}

	private class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
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

				loadObject(file);
				// save to file
			}
		}
	}

}