package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author admin
 *
 */
public class StartMenu {
    private static final int FRAME_WIDTH = 1400;
    private static final int FRAME_HEIGHT = 900;
    private JFrame frame;
    private JButton startButton;
    private JButton helpButton;
    private JButton aboutButton;
    private JPanel mainPanel;
    private JPanel backgroundPanel;
    private JPanel titlePanel;

    /**
     *
     */
    public StartMenu() {

        initializeFrame();
        initializePanel();
        initializeButton();

        frame.setVisible(true);
    }

    /**
     *
     */
    private void initializeButton() {
        startButton = new JButton("START");
        startButton.setBackground(Color.white);
        startButton.setPreferredSize(new Dimension(200, 100));
        mainPanel.add(startButton);

        helpButton = new JButton("INSTRUCTIONS");
        helpButton.setBackground(Color.white);
        helpButton.setPreferredSize(new Dimension(200, 100));
        mainPanel.add(helpButton);

        aboutButton = new JButton("ABOUT");
        aboutButton.setBackground(Color.white);
        aboutButton.setPreferredSize(new Dimension(200,100));
        mainPanel.add(aboutButton);
    }

    /**
     *
     */
    private void initializePanel() {
        final ImageIcon titleIcon = new ImageIcon("src/resource/sr-logo.png");
        final JLabel title = new JLabel(titleIcon);
        titlePanel = new JPanel();
        titlePanel.add(title);
        titlePanel.setBackground(Color.pink);

        final ImageIcon buttomIcon = new ImageIcon("src/resource/sr-logo.png");
        backgroundPanel = new JPanel();
        final JLabel background = new JLabel(buttomIcon);
        backgroundPanel.add(background);
        backgroundPanel.setBackground(Color.pink);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(backgroundPanel, BorderLayout.SOUTH);
        frame.add(mainPanel, BorderLayout.CENTER);

    }

    /**
     *
     */
    private void initializeFrame() {
        frame = new JFrame();
        frame.setTitle("Radioinfo");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *
     */
    public void close() {

        frame.setVisible(false);
        frame.dispose();
    }

    /**
     * @param e
     */
    public void addStartActionListener(final ActionListener e){
        startButton.addActionListener(e);
    }

    /**
     *
     * @param e
     */
    public void addHelpActionListener(final ActionListener e){
        helpButton.addActionListener(e);
    }

    /**
     * @param e
     */
    public void addAboutActionListener(final ActionListener e){
        aboutButton.addActionListener(e);
    }
}
