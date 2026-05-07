import javax.swing.*;
public class HelloWorld {

    // Your program begins with a call to main()
    public static void main(String[] args)
    {
        Runnable guiCreator = new Runnable(){
            public void run() {
                JFrame fenster = new JFrame("Nachhilfe SMÜ");
                fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel("Login");
                fenster.add(label);
                fenster.setSize(300,200);
                fenster.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(guiCreator);
    }
}