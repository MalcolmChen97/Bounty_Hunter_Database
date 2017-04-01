package Hunter;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static Main.Connector.getConnection;

public class NoTeam extends JFrame {
    private JPanel mainWindow;
    private JList teamList;
    private JButton joinTeamButton;
    private JPanel infoArea;
    private JLabel teamNameLabel;
    private JLabel teamRankLabel;
    private JLabel teamCaptainLabel;
    private JLabel teamRank;
    private JLabel teamCaptain;
    private JLabel teamName;

    public NoTeam(int id) {
        $$$setupUI$$$();
        this.add($$$getRootComponent$$$());
        this.setSize(400, 550);
        this.setResizable(false);
        DefaultListModel teamListModel = new DefaultListModel();
        teamList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        teamList.setModel(teamListModel);
        teamList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Connection connection = getConnection();

                Statement statement;
                ResultSet rs;
                ResultSet rs2;

                try {
                    statement = connection.createStatement();
                    rs = statement.executeQuery("SELECT * FROM TEAM WHERE TEAMNAME = '" + teamList.getSelectedValue() + "'");
                    while (rs.next()) {
                        teamName.setText(rs.getString(1));
                        teamRank.setText(rs.getString(2));
                        int id = rs.getInt(3);
                        rs2 = statement.executeQuery("SELECT name FROM HUNTER WHERE HUNTERID = " + id);
                        rs2.next();
                        teamCaptain.setText(rs2.getString(1));
                    }
                } catch (Exception excp) {
                    excp.printStackTrace();
                }

            }
        });
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection connection = getConnection();
                Statement statement;
                ResultSet rs;
                try {
                    statement = connection.createStatement();
                    rs = statement.executeQuery("UPDATE HUNTER SET TEAMNAME = '" + teamList.getSelectedValue() + "' WHERE HUNTERID = " + id);
                } catch (SQLException excp) {
                    excp.printStackTrace();
                }
            }
        };
        joinTeamButton.addActionListener(buttonListener);
        Connection connection = getConnection();
        Statement statement;
        ResultSet rs;

        try {
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT TEAMNAME FROM TEAM");
            while (rs.next()) {
                teamListModel.addElement(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.setVisible(true);

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainWindow = new JPanel();
        mainWindow.setLayout(new GridBagLayout());
        mainWindow.setPreferredSize(new Dimension(400, 550));
        teamList = new JList();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainWindow.add(teamList, gbc);
        joinTeamButton = new JButton();
        joinTeamButton.setText("Join Team!");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainWindow.add(joinTeamButton, gbc);
        infoArea = new JPanel();
        infoArea.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        mainWindow.add(infoArea, gbc);
        teamNameLabel = new JLabel();
        teamNameLabel.setText("Team Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamNameLabel, gbc);
        teamRankLabel = new JLabel();
        teamRankLabel.setText("Team Rank:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamRankLabel, gbc);
        teamCaptainLabel = new JLabel();
        teamCaptainLabel.setText("Team Captain:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamCaptainLabel, gbc);
        teamRank = new JLabel();
        teamRank.setText("<Team Rank>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamRank, gbc);
        teamName = new JLabel();
        teamName.setText("<Team Name>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamName, gbc);
        teamCaptain = new JLabel();
        teamCaptain.setText("<Team captain>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        infoArea.add(teamCaptain, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainWindow;
    }
}
