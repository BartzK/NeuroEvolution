package com.github.neuroevolution;
import com.github.neuroevolution.gui.MainMenu;

public class NeuroEvolution {
    public static void main(String[] args) {
        MainMenu gui = new MainMenu();

        switch (args[0]) {
            case "cui":
                //call cui
                break;
            case "gui":
                gui.init();
                break;
            default:
                gui.init();
                break;
        }
    }
}
