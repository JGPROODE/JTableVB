import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class JTableVBAppPaneel extends JPanel {




	//nu met vectoren....
	private String[][] data;
	private JTable tabel;
	
	private String kolomNamen[];
//	public JTextField uitvoerVak1, uitvoerVak2, uitvoerVak3, uitvoerVak4, uitvoerVak5, uitvoerVak6;
	private JScrollPane scrollVenster;
	public JTableVBAppPaneel() {
		setLayout(null);

		Random random = new Random();
		kolomNamen = new String[10];
		for (int index = 0; index < kolomNamen.length; index++) {
			kolomNamen[index] = "Kolom " + index;
		}
		data = new String[10000][10]; // 10.000 rijen, 10 kolommen
		for (int index = 0; index < data.length; index++) {
			for (int kolommen = 0; kolommen < 10; kolommen++) {
				data[index][kolommen] = String.valueOf(1 + random.nextInt(10000));
			}
		}
		
		
		

		tabel = new JTable(data, kolomNamen);
		
		
		TableColumn column = null;
		for (int i = 0; i < 10; i++) {
		    column = tabel.getColumnModel().getColumn(i);
		    if (i == 2) {
		        column.setPreferredWidth(200); //third column is bigger
		    } else {
		        column.setPreferredWidth(150);
		    }
		}
		
		
		

	    scrollVenster = new JScrollPane(tabel);
	    scrollVenster.setBounds(100, 50, 800, 600);
		scrollVenster.setHorizontalScrollBar(new JScrollBar());
		tabel.setFillsViewportHeight(true);
		
		

		add(scrollVenster);


	}









}




