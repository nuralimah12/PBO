package tugasinterface;

    public class Gorilla extends Binatang implements Ikarnivora, IHerbivora {
        private String suara;
        private String warnaBulu;
        Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
            super(nama, jmlKaki);
            this.suara = suara;
            this.warnaBulu = warnaBulu;
        }
        @Override
        public void displayMakan(){
            System.out.println("Makanan: Daging + Tumbuhan");
        }
        public void displayBinatang(){
            System.out.println("Jenis: Karnivora + Herbivora");
        }
        public void displayData(){
            System.out.println("Nama: " + nama);
            System.out.println("Jumlah Kaki: "+jmlKaki);
            System.out.println("Suara: "+suara);
            System.out.println("Warna Bulu: "+warnaBulu);
        }   
}
