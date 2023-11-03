import javax.swing.*;

class ScannerGUIJ {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("ScannerGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default hide the frame not actually close it
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
    }
}