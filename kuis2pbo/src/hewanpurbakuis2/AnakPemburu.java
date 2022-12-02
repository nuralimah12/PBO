package hewanpurbakuis2;

public class AnakPemburu extends Pemburu implements IMengambilTelur{

 
    
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        // TODO Auto-generated method stub
        System.out.println("Anak Pemburu mengambil telur");

        dino.makan();
        dino.berjalan();
        
    }


    @Override
    public void berburu(TyrannosaurusRex trex){
        System.out.println("Anak Pemburu melakukan pemburan dinosaurus trex");
        trex.berjalan();
        trex.makan();
       }

    
    
    
   
    
}
