package mainPackage;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxRenderer extends JLabel implements ListCellRenderer
{
	private static final long serialVersionUID = 1L;

	public ComboBoxRenderer()
	{
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
	{
		//Get the selected index. (The index parameter isn't always valid, so just use the value.)
		//int selectedIndex = ((Integer)value).intValue();
		
		if (isSelected) 
		{
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } 
		else 
        {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

		
		return this;
	}


}
