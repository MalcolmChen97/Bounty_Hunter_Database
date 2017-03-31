package Hunter;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;


public class TeamExists extends JFrame {
    private JPanel mainWindow;
    private JPanel teamInfoPanel;
    private JLabel teamNameLabel;
    private JLabel teamLevelLabel;
    private JLabel teamName;
    private JLabel teamLevel;
    private JLabel teamRank;
    private JLabel teamRankLabel;
    private JLabel currentMissionLabel;
    private JPanel currentMissionsPanel;
    private JScrollPane currentMissionPane;
    private JList currentMissionList;
    private JScrollPane teamMemberPane;
    private JLabel teamMemberLabel;
    private JPanel teamMemberPanel;
    private JList teamMemberList;
    private JPanel memberInfoPanel;
    private JLabel memberNameLabel;
    private JLabel memberLevelLabel;
    private JLabel memberRankLabel;
    private JLabel memberExpLabel;
    private JLabel memberName;
    private JLabel memberLevel;
    private JLabel memberRank;
    private JLabel memberExp;


    public TeamExists() {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
        this.add(mainWindow);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(464, 500);
        this.setResizable(false);
        Connection c = Connect.getConnection();
        /*TODO
        With the passed in Result set (should be just singleton) find out Name,Level,Rank and the missions they are on. Oh fuck
         */
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
        mainWindow.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        teamInfoPanel = new JPanel();
        teamInfoPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainWindow.add(teamInfoPanel, gbc);
        teamNameLabel = new JLabel();
        teamNameLabel.setText("Team Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamNameLabel, gbc);
        teamLevelLabel = new JLabel();
        teamLevelLabel.setText("Team Level:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamLevelLabel, gbc);
        teamRankLabel = new JLabel();
        teamRankLabel.setText("Team Rank:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamRankLabel, gbc);
        teamName = new JLabel();
        teamName.setText("<team name>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamName, gbc);
        teamLevel = new JLabel();
        teamLevel.setText("<team level>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamLevel, gbc);
        teamRank = new JLabel();
        teamRank.setText("<team rank>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamInfoPanel.add(teamRank, gbc);
        currentMissionsPanel = new JPanel();
        currentMissionsPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainWindow.add(currentMissionsPanel, gbc);
        currentMissionLabel = new JLabel();
        currentMissionLabel.setText("Current Missions ");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        currentMissionsPanel.add(currentMissionLabel, gbc);
        currentMissionPane = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        currentMissionsPanel.add(currentMissionPane, gbc);
        currentMissionList = new JList();
        currentMissionPane.setViewportView(currentMissionList);
        teamMemberPanel = new JPanel();
        teamMemberPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainWindow.add(teamMemberPanel, gbc);
        teamMemberPane = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        teamMemberPanel.add(teamMemberPane, gbc);
        teamMemberList = new JList();
        teamMemberPane.setViewportView(teamMemberList);
        teamMemberLabel = new JLabel();
        teamMemberLabel.setText("Team Members:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        teamMemberPanel.add(teamMemberLabel, gbc);
        memberInfoPanel = new JPanel();
        memberInfoPanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainWindow.add(memberInfoPanel, gbc);
        memberNameLabel = new JLabel();
        memberNameLabel.setText("Member Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberNameLabel, gbc);
        memberLevelLabel = new JLabel();
        memberLevelLabel.setText("Member Level:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberLevelLabel, gbc);
        memberRankLabel = new JLabel();
        memberRankLabel.setText("Member Rank:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberRankLabel, gbc);
        memberExpLabel = new JLabel();
        memberExpLabel.setText("Member Exp:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberExpLabel, gbc);
        memberName = new JLabel();
        memberName.setText("<member name>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberName, gbc);
        memberLevel = new JLabel();
        memberLevel.setText("<member level>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberLevel, gbc);
        memberRank = new JLabel();
        memberRank.setText("<member rank>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberRank, gbc);
        memberExp = new JLabel();
        memberExp.setText("<member exp>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        memberInfoPanel.add(memberExp, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainWindow;
    }
}