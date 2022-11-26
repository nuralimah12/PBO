package tugasinterface;

public class maintugasinterface {
    
        public static void main(String[] args) {
            Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
            Keledai keledai = new Keledai("Keledai", 4, "Hehehehehe", "Abu-Abu");
            Gorilla gorila = new Gorilla("Gulali", 4, "Haaum Haauuum", "Hitam Manis");
    
            keledai.displayBinatang();
            keledai.displayMakan();
            keledai.displayData();
            System.out.println();
            gorila.displayBinatang();
            gorila.displayMakan();
            gorila.displayData();
            System.out.println();
            singa.displayBinatang();
            singa.displayMakan();
            singa.displayData();
    }
}
