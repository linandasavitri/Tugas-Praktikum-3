class dataRestaurant {
    String namaRestaurant;
    String alamatRestaurant;
    int nomorTelepon;
    int jumlahPesanan;
    int nomorPesanan;
    int jumlahPelayan;
    boolean isOpen;
    
    public dataRestaurant(String nama, String alamat, int nomor){
        namaRestaurant = nama;
        alamatRestaurant = alamat;
        nomorTelepon = nomor;
    }
    public void setJumlahPesanan(int jumlah){
        this.jumlahPesanan = jumlah;
    }
    public int getJumlahPesanan(){
        return this.jumlahPesanan;
    }
}
class menuRestaurant{
    String namaMakanan;
    String namaMinuman;
    String jenisMakanan;
    String jenisMinuman;
    int hargaMakanan;
    int hargaMinuman; 
    
    public menuRestaurant(String makanan, String minuman, int harga){
        namaMakanan = makanan;
        namaMinuman = minuman;
        hargaMakanan = harga;
    }
    public void setHargaMinuman(int hargaMinuman){
        this.hargaMinuman = hargaMinuman;
    }
    public int getHargaMinuman(){
        return this.hargaMinuman;
    }
}

public class Restaurant{
    public static void main(String[] args)  {
        // inisialisasi object dataRestaurant
        dataRestaurant restaurant1 = new dataRestaurant(
                "KFC",
                "Jl. Gajah Mada No. 74",
                2114022);
        dataRestaurant restaurant2 = new dataRestaurant(
                "MCD",
                "Jl. Hayam Wuruk No. 40",
                06372);
        dataRestaurant restaurant3 = new dataRestaurant(
                "Richeese Factory",
                "Jl. Hayam Wuruk No. 71",
                0276);
        

        restaurant1.setJumlahPesanan(12);
        System.out.println("---- RESTAURANT ----");
        System.out.println("Nama Restaurant:" + restaurant1.namaRestaurant);
        System.out.println("Alamat Restaurant:" + restaurant1.alamatRestaurant);
        System.out.println("Nomer Telpon Restaurant:" + restaurant1.nomorTelepon);
        System.out.println("Jumlah Pesanan:" + restaurant1.getJumlahPesanan());
        
        
        menuRestaurant colonel = new menuRestaurant(
            "Ayam Krispi",
            "Pepsi",
            30000);
        
        
        colonel.setHargaMinuman(7000);
        
        System.out.println("---- MENU ----");
        System.out.println("Nama Makanan:" + colonel.namaMakanan);
        System.out.println("Nama Minuman:" + colonel.namaMinuman);
        System.out.println("Harga Makanan:" + colonel.hargaMakanan);
        System.out.println("Harga Minuman:" + colonel.getHargaMinuman());
    }
    
}
