/**
 *
 */
package hisako;

/**
 * @author hisako
 *
 */

/**
*
*/

/**
* @author internous
*
*/


	import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultEditorKit.CopyAction;
import javax.swing.text.DefaultEditorKit.CutAction;
import javax.swing.text.DefaultEditorKit.PasteAction;


      public class KisoKadai3 extends JFrame implements ActionListener {

	    private JTextArea textArea = new JTextArea();


	    private Action cutAction = new CutAction();
	    private Action copyAction = new CopyAction();
	    private Action pasteAction = new PasteAction();

	    private JButton create = new JButton("新規");
	    private JButton open = new JButton("開く");
	    private JButton save = new JButton("保存");
	    private JButton exit = new JButton("終了");
	    private JButton cut = new JButton(cutAction);
	    private JButton copy = new JButton(copyAction);
	    private JButton paste = new JButton(pasteAction);

	    private JFileChooser chooser = new JFileChooser();


	    public KisoKadai3() {
	        super("書き込み");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(600, 600);

	        JPanel panel1 = new JPanel();
	        JPanel panel2 = new JPanel();
	        getContentPane().add(panel1, BorderLayout.NORTH);
	        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
	        getContentPane().add(panel2, BorderLayout.SOUTH);

	        panel1.add(create);
	        panel1.add(open);
	        panel1.add(save);
	        panel1.add(exit);
	        //
	        panel2.add(cut);
	        panel2.add(copy);
	        panel2.add(paste);
            //
	        open.addActionListener(this);
	        save.addActionListener(this);
	        create.addActionListener(this);
	        exit.addActionListener(this);

	    }

	    public static void main(String[] args) {
	        new KisoKadai3().setVisible(true);
	    }

	    //ボタン処理
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource().equals(open)) {
	            openFile();
	        } else if (e.getSource().equals(save)) {
	            saveFile();
	        } else if (e.getSource().equals(create)) {
	    	   	textArea.setText("");
	        } else if (e.getSource().equals(exit)) {
	            System.exit(0);

	        }
	    }

	    //ファイルを開く
	    private void openFile() {
	        int returnVal = chooser.showOpenDialog(this);
	        try {
	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = chooser.getSelectedFile();
	                FileReader reader = new FileReader(file);
	                textArea.read(reader, null);
	                setTitle(file.getAbsolutePath());
	                reader.close();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    //ファイル保存する
	    private void saveFile() {
	        int returnVal = chooser.showSaveDialog(this);
	        try {
	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                FileWriter writer = new FileWriter(chooser.getSelectedFile());
	                writer.write(textArea.getText());
	                writer.close();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	     }
	    }
	    }
