import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageViewer extends JFrame {
    private JLabel imageLabel;

    public ImageViewer() {
        // Set up the main frame
        setTitle("Image Viewer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display the image
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a file chooser for selecting an image
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File file) {
                return file.getName().toLowerCase().endsWith(".png")
                        || file.getName().toLowerCase().endsWith(".jpg")
                        || file.getName().toLowerCase().endsWith(".jpeg")
                        || file.isDirectory();
            }

            public String getDescription() {
                return "Image files (*.png, *.jpg, *.jpeg)";
            }
        });

        // Create a button to trigger image selection
        JButton selectImageButton = new JButton("Select Image");
        selectImageButton.addActionListener(e -> loadImage(fileChooser));

        // Add components to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(selectImageButton, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(imageLabel), BorderLayout.CENTER);
    }

    private void loadImage(JFileChooser fileChooser) {
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage image = ImageIO.read(selectedFile);
                displayImage(image);
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading image", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void displayImage(BufferedImage image) {
        imageLabel.setIcon(new ImageIcon(image));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageViewer viewer = new ImageViewer();
            viewer.setVisible(true);
        });
    }
}
