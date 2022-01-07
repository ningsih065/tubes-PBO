package com.cheeselevel.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class CheeseLauncher {
    public static void main(String[] args) {
        RabbitGo myProgram = new RabbitGo();
        LwjglApplication launcher = new LwjglApplication(myProgram);
    }
}
