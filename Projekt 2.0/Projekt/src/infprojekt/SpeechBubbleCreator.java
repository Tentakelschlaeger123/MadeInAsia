package infprojekt;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.util.ArrayList;

//class TextSchnipsel {
//    String text;
//
//
//}

public class SpeechBubbleCreator {
    String lines[];
    Screen screen;

    JTextPane currentBubble;
    int current_i = -1;

    SpeechBubbleCreator(Screen screen) {
        this.lines = Utils.loadFileAsString("/level/speechlines.txt").split("\\r?\\n");
        this.screen = screen;
    }

    int getCurrentBubbleI() {
        return current_i;
    }

    void createBubble(int i) {
        System.out.println(current_i);
        if (currentBubble != null) {
            closeBubble();
        }
        currentBubble = new JTextPane();
        this.current_i = i;
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setFontSize(attributeSet, 15);
        currentBubble.setCharacterAttributes(attributeSet, true);
        currentBubble.setText(lines[i]);
        currentBubble.setSize(200, 20);

        currentBubble.setLocation(340, 260);
        this.screen.getFrame().getLayeredPane().add(currentBubble, JLayeredPane.PALETTE_LAYER);

    }

    void closeBubble() {
        this.screen.getFrame().getLayeredPane().remove(this.currentBubble);
        this.currentBubble = null;
        this.current_i = -1;
    }

}
