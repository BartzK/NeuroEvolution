package com.github.neuroevolution.gui;

import javax.swing.JFrame;

public class MainMenu extends JFrame {
    public MainMenu() {
        super ("NeuroEvolution");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void init() {
        this.prepare();
        this.run();
    }

    public boolean prepare() {

        return true;
    }

    public boolean run() {
        // start gui
        return true;
    }

}
