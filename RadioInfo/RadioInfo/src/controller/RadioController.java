/*
 * FILE:
 *      ProgramLoader.java
 *
 * DESCRIPTION:
 *      Controller between startMenu and programController.
 *
 * AUTHOR:
 *      Elias Niko, c18eno
 *
 * CHANGES:
 *      20200129: Initial version.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.StartMenu;

/**
 * The class connects startMenu and ProgramController to work.
 * @author Elias Niko
 * @version 1.0
 */
public class RadioController {
    private static ProgramController pc;
    private static StartMenu menu;
    private static final int ONE_HOUR = 3600000;
    private static final int DELAY = 0;

    /**
     * Main method that runs the program.
     * @param args as String array
     */
    public static void main(final String[] args) {
        pc = new ProgramController();
        menu = new StartMenu();
        final AutoUpdate auto = new AutoUpdate();
        startActionListener();
        helpActionListener();
        aboutActionListener();

        final Timer timer = new Timer();
        timer.schedule(auto, DELAY, ONE_HOUR);
    }

    /**
     * Button actionListener for "START" button in start menu.
     */
    private static void startActionListener() {
        menu.addStartActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent e) {
                pc.showGraphics();
                menu.close();
            }
        });
    }

    /**
     * Button actionListener for "HELP" button in start menu.
     */
    private static void helpActionListener() {
        menu.addHelpActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                final JFrame frame = new JFrame();
                final String instructions = "The Instruction below will help you to know how the program work:\n\n" +
                        "* By pressing run button the program tries to load all date for different channels\n" +
                        "* By pressing update button the program will get update data to the latest.";
                JOptionPane.showMessageDialog(frame, instructions);
            }
        });
    }

    /**
     * Button actionListener for "ABOUT" button in start menu.
     */
    private static void aboutActionListener() {
        menu.addAboutActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                final JFrame frame = new JFrame();
                final String about = "Made by:\nElias Niko c18eno@cs.umu.se";
                JOptionPane.showMessageDialog(frame, about);
            }
        });
    }

    /**
     * The class connects extends of TimerTask and call a method
     * from ProgramController to update. This class will be created
     * every hour to update the table.
     * @author Elias Niko
     * @version 1.0
     */
    static class AutoUpdate extends TimerTask {

        @Override
        public void run() {
            pc.start();
        }

    }
}