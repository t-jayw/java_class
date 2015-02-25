// importing packages
import java.awt.*;  // advanced windowing toolkit
import java.awt.event.*; // different package
import javax.swing.*; // swing is more advanced than awt

class SwingDemoHelloComponent extends JComponent
    implements MouseMotionListener, ActionListener, Runnable
{
  String theMessage;
  int messageX = 125, messageY = 95; // Coordinates of the message

  JButton theButton;  // declare here and call the constructor later

  int colorIndex; // Current index into someColors.
  static Color[] someColors = {
   Color.black, Color.red, Color.green, Color.blue, Color.magenta };

  boolean blinkState;

  public SwingDemoHelloComponent( String message ) {
    theMessage = message;
    // instantiating a button and setting a label
    theButton = new JButton("Change Color");
    // set a layout manager
    setLayout( new FlowLayout() );
    add( theButton );
    // enable us to know if the user clicks the button. This is user event-driven programming
    theButton.addActionListener( this );
    addMouseMotionListener( this );
    Thread t = new Thread( this );
    t.start();  // start a listener thread
  }

  public void paintComponent( Graphics g ) {
    g.setColor(blinkState ? getBackground() : currentColor(  ));
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent e) {
    messageX = e.getX();
    messageY = e.getY();
    repaint();
  }
  // implementing a method of an interface
  // with an empty code block
  public void mouseMoved(MouseEvent e) { }

  // if the user clicked the button,
  // change the color of the button
  public void actionPerformed( ActionEvent e ) {
    if ( e.getSource() == theButton )
      changeColor();
  }

  synchronized private void changeColor() {
    if (++colorIndex == someColors.length)
      colorIndex = 0;
    setForeground( currentColor() );
    repaint();
  }

  synchronized private Color currentColor(  ) {
    // array of colors
    return someColors[colorIndex];
  }

  public void run(  ) {
    try {
      while(true) {
        blinkState = !blinkState; // Toggle blinkState.
        repaint(); // Show the change.
        // wait 1/3 of a second
        Thread.sleep(300);
      }
    } catch (InterruptedException ie) { }
  }
}

public class HelloJava4SwingDemo
{
  public static void main( String[] args ) {
    // instantiate a JFrame
    JFrame frame = new JFrame( "HelloJava4" );
    // using the dot operator to concatenate actions
    frame.getContentPane().add( new SwingDemoHelloComponent("Hello Java!") );
    // set close operation
   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    // sets size and make visible
    frame.setSize( 300, 300 );
    frame.setVisible( true );
  }
}