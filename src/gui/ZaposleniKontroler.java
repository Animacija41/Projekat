package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ZaposleniKontroler {
    private static ZaposleniKontroler instance = null;
    
    private List<Zaposleni> Zaposleni;
    
    public ZaposleniKontroler() {
        Zaposleni = new ArrayList<>();
    }
    
    public static ZaposleniKontroler getInstance() {
        if (instance == null) {
            instance = new ZaposleniKontroler();
        }
        
        return instance;
    }
    
    public List<Zaposleni> getAllZaposleni() {
        return Zaposleni;
    }
    
    public Zaposleni getradnik(String jmbg) throws Exception {
    	Zaposleni radnik = Zaposleni.stream().filter(el -> jmbg.equals(el.getJMBG())).findAny().orElse(null);
        
        if (radnik == null) {
            throw new Exception("Not found");
        }
        
        return radnik;
    }
    
    public Zaposleni addradnik(Zaposleni radnik) throws Exception {
        boolean isExists = Zaposleni.stream().anyMatch(el -> radnik.getJMBG().equals(el.getJMBG()));
        
        if (isExists) {
            throw new Exception("Already exists");
        }
        
        Zaposleni.add(radnik);
        
        return radnik;
    }
    
    public Zaposleni updateradnik(Zaposleni radnik, String jmbg) throws Exception {
    	Zaposleni radnikCurrent = Zaposleni.stream().filter(el -> (jmbg.equals(el.getJMBG()))).findAny().orElse(null);		//uzimamo entitet radnika iz liste 
    	 int index = Zaposleni.indexOf(radnikCurrent);																		//uzima tacnu poziciju radnika u listi 
        
        if (index < 0) {
            throw new Exception("Not found");
        }
        
        Zaposleni.set(index, radnik);
        
        return radnik;
    }
    
     public void removeradnik(String jmbg) throws Exception {
        Zaposleni.removeIf(el -> jmbg.equals(el.getJMBG()));
    }
     
     public int getRadnikByJMBG(String jmbg) throws Exception
     {
    	 Zaposleni radnikCurrent = Zaposleni.stream().filter(el -> (jmbg.equals(el.getJMBG()))).findAny().orElse(null);
		 System.out.println(radnikCurrent);

         int index = Zaposleni.indexOf(radnikCurrent);

         if (index < 0) {
             throw new Exception("Not found");
         }
         return index;
     }

}
