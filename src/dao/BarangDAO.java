package dao;

import model.Barang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Koneksi;

public class BarangDAO {
    private Connection conn;

    public BarangDAO() {
        this.conn = Koneksi.getKoneksi();
    }

    // Tampil Data (Read)
    public List<Barang> getAllBarang() {
        List<Barang> listBarang = new ArrayList<>();
        String sql = "SELECT * FROM barang";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Barang b = new Barang(
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("kategori"),
                    rs.getInt("stok")
                );
                listBarang.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listBarang;
    }

    // Simpan Data (Create)
    public boolean simpan(Barang b) {
        String sql = "INSERT INTO barang (kode_barang, nama_barang, kategori, stok) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getKodeBarang());
            ps.setString(2, b.getNamaBarang());
            ps.setString(3, b.getKategori());
            ps.setInt(4, b.getStok());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Ubah Data (Update)
    public boolean ubah(Barang b) {
        String sql = "UPDATE barang SET nama_barang = ?, kategori = ?, stok = ? WHERE kode_barang = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getNamaBarang());
            ps.setString(2, b.getKategori());
            ps.setInt(3, b.getStok());
            ps.setString(4, b.getKodeBarang());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Hapus Data (Delete)
    public boolean hapus(String kodeBarang) {
        String sql = "DELETE FROM barang WHERE kode_barang = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kodeBarang);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}