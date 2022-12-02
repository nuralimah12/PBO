package hewanpurbakuis2;
public class MainDino {
    public static void main(String[] args) {
        TyrannosaurusRex tr = new TyrannosaurusRex("TyranosaurusRex", "3,7-6,1 m");
        Triceratops tc = new Triceratops("Triceratops", " 2,9-3 m");
        Oviraptor op = new Oviraptor("Oviraptor","91-150 cm" );
        Pemburu pb = new Pemburu();
        AnakPemburu ap = new AnakPemburu();  
    //trex
    System.out.println("==============================================");
    tr.keteranganHewan();
    tr.makan();
    tr.berjalan();
    System.out.println("==============================================");
    System.out.println();
    //Triceratops
    System.out.println("==============================================");
    tc.keteranganHewan();
    tc.makan();
    tc.berjalan();
    System.out.println("==============================================");
    System.out.println();
    //Oviraptor
    System.out.println("==============================================");
    op.keteranganHewan();
    op.makan();
    op.berjalan();
    op.bertelur();
    System.out.println("==============================================");
    System.out.println();
    //pemburu
    System.out.println("==============================================");
    pb.berburu(tr);
    System.out.println("==============================================");
    System.out.println();
    //anakPemburu
    System.out.println("==============================================");
    ap.berburu(tr);
    ap.mengambilTelur(tr);
    System.out.println("==============================================");
    System.out.println();
    }
}
