/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penjualan;

/**
 *
 * @author budi
 */
import barang.Mobil;
import java.util.ArrayList;
import java.util.List;

public class PenjualanMobil {
    double modal = 10000000000.0;
    double nilaiAsset = 0.0;
    
    private List<Mobil> daftarMobil;

    public PenjualanMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void beliMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        modal = modal - mobil.getHarga();
        nilaiAsset = nilaiAsset + mobil.getHarga();
    }

    public void jualMobil(Mobil mobil, double hargaJual) {
        daftarMobil.remove(mobil);
        modal = modal + mobil.getHarga() + hargaJual;
        nilaiAsset = nilaiAsset - mobil.getHarga() + hargaJual;
    }

    public List<Mobil> cariMobilBerdasarkanMerek(String merek) {
        List<Mobil> hasilPencarian = new ArrayList<>();
        for (Mobil mobil : daftarMobil) {
            if (mobil.getMerek().equalsIgnoreCase(merek)) {
                hasilPencarian.add(mobil);
            }
        }
        return hasilPencarian;
    }
}
    
    // Metode lain untuk mencari mobil berdasarkan kriteria lainnya
