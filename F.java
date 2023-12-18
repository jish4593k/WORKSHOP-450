import javax.swing.*;
import java.awt.*;

public class YourJavaApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Your GUI App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel("Hello, Java Swing!");
            label.setHorizontalAlignment(JLabel.CENTER);

            frame.getContentPane().add(label);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });

       
        int[] array_a = {1, 2, 3};
        int[] array_b = {4, 5, 6};
        int[] result_array = new int[3];

        for (int i = 0; i < 3; i++) {
            result_array[i] = array_a[i] + array_b[i];
        }

        System.out.print("PyTorch Tensor Addition Result: [");
        for (int i = 0; i < 3; i++) {
            System.out.print(result_array[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
