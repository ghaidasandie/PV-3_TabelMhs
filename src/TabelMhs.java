import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TabelMhs {
    private JTable table;
    private DefaultTableModel model;

    public TabelMhs() {
        initializeTable();
    }

    private void initializeTable() {
        // Kolom tabel
        String[] columnNames = {"NIM", "Nama", "Jurusan", "IPK"};

        // Data mahasiswa
        Object[][] data = {
                {"22051011", "John Doe", "Teknik Informatika", 3.75},
                {"22051022", "Jane Smith", "Manajemen", 3.90},
                {"22051033", "Alice Johnson", "Akuntansi", 3.60},
                {"22051044", "Bob Williams", "Teknik Elektro", 3.80},
                {"22051055", "Emily Brown", "Ilmu Komunikasi", 3.70}
        };

        // Membuat model tabel dengan data dan kolom
        model = new DefaultTableModel(data, columnNames);

        // Membuat tabel dengan model yang sudah dibuat
        table = new JTable(model);
    }

    public JTable getTable() {
        return table;
    }
}
