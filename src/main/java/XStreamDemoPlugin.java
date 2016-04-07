import java.awt.event.*;
import com.evnt.client.modules.MenuGroupNameConst;
import com.fbi.gui.panel.*;
import com.fbi.plugins.FishbowlPlugin;

import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;


/**
 * @author User #1
 */
public class XStreamDemoPlugin extends FishbowlPlugin {

    public static final String MODULE_NAME = "XStream Demo";

    private JFileChooser fileChooser;
    private File file;

    public XStreamDemoPlugin() {
        setModuleName(MODULE_NAME);
        setMenuGroup(MenuGroupNameConst.GENERAL);
        setIconClassPath("");
        setDefaultHelpPath("https://www.fishbowlinventory.com/wiki");

        fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file");
        fileChooser.setFileFilter(new FileFilter() {
            public boolean accept(File f) {
                String name = f.getName().toLowerCase(Locale.US);
                return name.endsWith(".xml") || f.isDirectory();
            }
            public String getDescription() {
                return "XML files";
            }
        });
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    @Override
    protected void initModule() {
        super.initModule();

        initComponents();
    }

    @Override
    public boolean activateModule() {
        return super.activateModule();
    }

    @Override
    public int getObjectId() {
        return 1;
    }

    @Override
    public void loadData(int objectId) {
        super.loadData(objectId);
    }

    private void browseButtonActionPerformed() {
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            fileEdit.setText(file.getPath());
        }
    }

    private void btnGoActionPerformed() {
        if (file.exists()) {
            List<Objects.Order> orderList = XStreamUtil.convertXmlFile(file);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        titlePanel1 = new TitlePanel();
        browseButton = new JButton();
        fileEdit = new JTextField();
        lblFile = new JLabel();
        lblXml = new JLabel();
        lblObject = new JLabel();
        scrXml = new JScrollPane();
        txtXml = new JTextArea();
        scrObject = new JScrollPane();
        txtObject = new JTextArea();
        btnGo = new JButton();

        //======== this ========
        setName("this");
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {37, 85, 0, 0, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0, 1.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 1.0E-4};

        //---- titlePanel1 ----
        titlePanel1.setModuleTitle("XStream Demo");
        titlePanel1.setModuleIcon(new ImageIcon(getClass().getResource("/images/xStreamLogo.png")));
        titlePanel1.setName("titlePanel1");
        add(titlePanel1, new GridBagConstraints(0, 0, 4, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- browseButton ----
        browseButton.setText("Browse...");
        browseButton.setMaximumSize(new Dimension(100, 21));
        browseButton.setMinimumSize(new Dimension(100, 21));
        browseButton.setName("PartExportFileBrowsebtn");
        browseButton.setPreferredSize(new Dimension(100, 21));
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browseButtonActionPerformed();
            }
        });
        add(browseButton, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
            new Insets(6, 6, 5, 0), 0, 0));

        //---- fileEdit ----
        fileEdit.setMinimumSize(new Dimension(251, 21));
        fileEdit.setName("PartExportFiletxt");
        fileEdit.setPreferredSize(new Dimension(251, 21));
        add(fileEdit, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
            new Insets(6, 12, 5, 5), 0, 0));

        //---- lblFile ----
        lblFile.setText("File:");
        lblFile.setName("lblFile");
        add(lblFile, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.NONE,
            new Insets(6, 12, 5, 5), 0, 0));

        //---- lblXml ----
        lblXml.setText("Xml");
        lblXml.setName("lblXml");
        add(lblXml, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 5, 5, 5), 0, 0));

        //---- lblObject ----
        lblObject.setText("Object");
        lblObject.setName("lblObject");
        add(lblObject, new GridBagConstraints(2, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 5, 5, 0), 0, 0));

        //======== scrXml ========
        {
            scrXml.setName("scrXml");

            //---- txtXml ----
            txtXml.setName("txtXml");
            scrXml.setViewportView(txtXml);
        }
        add(scrXml, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== scrObject ========
        {
            scrObject.setName("scrObject");

            //---- txtObject ----
            txtObject.setName("txtObject");
            scrObject.setViewportView(txtObject);
        }
        add(scrObject, new GridBagConstraints(2, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //---- btnGo ----
        btnGo.setText("GO");
        btnGo.setName("PartExportFileBrowsebtn");
        btnGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnGoActionPerformed();
            }
        });
        add(btnGo, new GridBagConstraints(0, 4, 4, 1, 0.0, 0.0,
            GridBagConstraints.NORTH, GridBagConstraints.NONE,
            new Insets(6, 6, 0, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private TitlePanel titlePanel1;
    private JButton browseButton;
    private JTextField fileEdit;
    private JLabel lblFile;
    private JLabel lblXml;
    private JLabel lblObject;
    private JScrollPane scrXml;
    private JTextArea txtXml;
    private JScrollPane scrObject;
    private JTextArea txtObject;
    private JButton btnGo;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
