package tugasinterface;
    public class Singa extends Binatang implements Ikarnivora {
        private String suara;
        private String warnaBulu;
        Singa(String nama, int jmlKaki,String suara, String warnaBulu ) {
            super(nama, jmlKaki);
            this.suara = suara;
            this.warnaBulu = warnaBulu;
        }
    
        @Override
        public void displayMakan(){
            System.out.println("Makanan: Daging");
        }
        public void displayBinatang(){
            System.out.println("Jenis: Karnivora");
        }
        public void displayData(){
            System.out.println("Nama: " + nama);
            System.out.println("Jumlah Kaki: "+jmlKaki);
            System.out.println("Suara: "+suara);
            System.out.println("Warna Bulu: "+warnaBulu);
        }
}
