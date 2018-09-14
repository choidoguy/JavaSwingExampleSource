import java.awt.Component;
import java.util.Vector;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ExTableAddBtn extends JDialog {

	public static void main(String[] args) {
		new ExTableAddBtn();
	}

	private JFrame jf;
	private DefaultTableModel dtm;
	private JTable jtable;
	private JScrollPane jsp;

	public ExTableAddBtn() {
		jf = new JFrame("���̺� ��ư �߰� �̺�Ʈ");
		jf.setLocationRelativeTo(null);
		jf.setSize(500, 300);

		dtm = new DefaultTableModel(
				new Object[][] { { "������1", "������2", "������3" }, { "������4", "������5", "������6" }, { "������7", "������8", "������9" } },
				new Object[] { "�ʵ�1", "�ʵ�2", "�ʵ�3" });
		jtable = new JTable(dtm);
		jsp = new JScrollPane(jtable);

		jtable.getColumnModel().getColumn(0).setCellRenderer(new TableCell());
		jtable.getColumnModel().getColumn(0).setCellEditor(new TableCell());

		jf.add(jsp);

		jf.setVisible(true);
	}

	public void JTableRemoveRow() {
		int row = jtable.getSelectedRow();
		if (row == -1)
			return;

		// ((DefaultTableModel) jtable.getModel()).removeRow(row);
		DefaultTableModel model = (DefaultTableModel) jtable.getModel();
		model.removeRow(row);

		Vector vectori = model.getDataVector();

		int sizei = vectori.size();
		Vector vectorj = (Vector) vectori.get(0);
		int sizej = vectorj.size();

		Object[][] objData = new Object[sizei][sizej];
		for (int i = 0; i < sizei; i++) {
			Vector vec = (Vector) vectori.get(i);
			for (int j = 0; j < sizej; j++) {
				objData[i][j] = vec.get(j);
			}
		}

		DefaultTableModel clonModel = new DefaultTableModel(objData, new Object[] { "�ʵ�1", "�ʵ�2", "�ʵ�3" });

		JTable clonTable = new JTable(clonModel);
		
		jf.getContentPane().removeAll();
		
		jtable = clonTable;
		jsp = new JScrollPane(jtable);
		jtable.getColumnModel().getColumn(0).setCellRenderer(new TableCell());
		jtable.getColumnModel().getColumn(0).setCellEditor(new TableCell());
		jf.add(jsp);
		
		jf.revalidate();
		jf.repaint();
	}

	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
		JButton jb;

		public TableCell() {
			// TODO Auto-generated constructor stub
			jb = new JButton("��ư");
			jb.addActionListener(e -> {
				JTableRemoveRow();

				// CASE 1
//				int row = jtable.getSelectedRow();
//				if (row == -1)
//					return;
//            	((DefaultTableModel) jtable.getModel()).removeRow(row);

				// CASE 2
//				DefaultTableModel model = (DefaultTableModel) jtable.getModel();
//				int row = jtable.getSelectedRow();
//
//				while (row != -1) {
//					int modelRow = jtable.convertRowIndexToModel(row);
//					model.removeRow(modelRow);
//					row = jtable.getSelectedRow();
//				}

				// CASE 3
//				DefaultTableModel tModel1 = (DefaultTableModel) jtable.getModel();
//				int selectedRow = jtable.getSelectedRow(); 
//				tModel1.removeRow(selectedRow); 
//				int numRowsLeft = tModel1.getRowCount(); 
//				if (numRowsLeft > 0) { // only reset selection if table is not empty 
//				    if (selectedRow > numRowsLeft - 1) { // last row deleted, new selection will be new last row 
//				    	jtable.setRowSelectionInterval(numRowsLeft-1, numRowsLeft-1); 
//				    } else { // deleted from the start or middle, selectedRow now points to the next row after the deleted row 
//				    	jtable.setRowSelectionInterval(selectedRow, selectedRow); 
//				    } 
//				    String name = (String) tModel1.getValueAt(jtable.getSelectedRow(), jtable.getSelectedColumn()); 
//				    //labelStatus.setText(name); 
//				} 

			});
		}

		@Override
		public Object getCellEditorValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			// TODO Auto-generated method stub
			return jb;
		}

		@Override
		public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
				int column) {
			// TODO Auto-generated method stub
			return jb;
		}
	}
}