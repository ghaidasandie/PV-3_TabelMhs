import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 1. Buat JFrame
//        JFrame jFrame = new JFrame("Hello World Frame");
            JFrame jFrame = new JFrame("Data Mahasiswa");


            // Buat instance dari TableMhs
            TabelMhs tabelMhs = new TabelMhs();

            // 2. set content pane
            // jFrame.setContentPane(new HelloForm().panel1);

            // 3. set jika tombol x di klik
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.add(new JScrollPane(tabelMhs.getTable()));
            jFrame.setSize(800, 800);
            jFrame.setLocationRelativeTo(null); // Memposisikan frame di tengah layar
            jFrame.pack();
            jFrame.setVisible(true);

        });
    }
}