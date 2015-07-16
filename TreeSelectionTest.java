import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class TreeSelectionTest extends JFrame implements ActionListener
    , TreeSelectionListener
{
    TreeSelectionModel selection;
    JComboBox combo;

    public TreeSelectionTest()
    {
        super("TreeSelectionTest");

        JTree tree=new JTree();
        getContentPane().add(new JScrollPane(tree));

        selection=tree.getSelectionModel();
        selection.addTreeSelectionListener(this);

        combo=new JComboBox(new String[] {"DISCONTIGUOUS_TREE_SELECTION"
            , "CONTIGUOUS_TREE_SELECTION", "SINGLE_TREE_SELECTION"});
        combo.addActionListener(this);
        getContentPane().add(combo, BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent ae)
    {
        switch(combo.getSelectedIndex())
        {
            case 0:
                selection.setSelectionMode(selection.DISCONTIGUOUS_TREE_SELECTION);
                break;

            case 1:
                selection.setSelectionMode(selection.CONTIGUOUS_TREE_SELECTION);
                break;

            case 2:

                selection.setSelectionMode(selection.SINGLE_TREE_SELECTION);
                break;
        }
    }

    public void valueChanged(TreeSelectionEvent tse)
    {
        TreePath[] paths=tse.getPaths();
        for (int i=0; i<paths.length; i++)
        {
            System.out.println(paths[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        JFrame f=new TreeSelectionTest();
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
