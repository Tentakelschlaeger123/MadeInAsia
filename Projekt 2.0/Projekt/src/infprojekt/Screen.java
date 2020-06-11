package infprojekt;


import java.awt.*;
import javax.swing.*;

public class Screen {

  private JFrame frame;
  private Canvas canvas;

  private Panel main_panel;

  private String title;
  public int width, height;

  public Screen(String title, int width, int height) {
    this.title = title;
    this.width = width;
    this.height = height;

    frame = new JFrame(title);
    frame.setSize(width, height);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setResizable(false);
    frame.setLocationRelativeTo(null);

    canvas = new Canvas();
    canvas.setPreferredSize(new Dimension(width, height));
    canvas.setMaximumSize(new Dimension(width, height));
    canvas.setMinimumSize(new Dimension(width, height));
    canvas.setFocusable(false);
    canvas.setSize(width, height);

    main_panel = new Panel(new BorderLayout());
    main_panel.setSize(width, height);
    main_panel.add(canvas, BorderLayout.CENTER);

    frame.getLayeredPane().add(main_panel);
    frame.pack();
    frame.setVisible(true);
  }

  public Canvas getCanvas(){
    return canvas;
  }

  public JFrame getFrame(){
    return frame;
  }
}