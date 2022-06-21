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
    
    public Zaposleni updateradnik(Zaposleni radnik) throws Exception {
    	Zaposleni radnikCurrent = Zaposleni.stream().filter(el -> (radnik.getJMBG().equals(el.getJMBG()))).findAny().orElse(null);
        int index = IntStream.range(0, Zaposleni.size()).filter(idx -> Zaposleni.get(idx).getJMBG().equals(radnik.getJMBG())).findFirst().orElse(-1);
        
        if (index < 0) {
            throw new Exception("Not found");
        }
        
        Zaposleni.set(index, radnik);
        
        return radnik;
    }
    
     public void removeradnik(String jmbg) throws Exception {
        Zaposleni.removeIf(el -> jmbg.equals(el.getJMBG()));
    }

}
