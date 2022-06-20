package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SoftverKontroler {
    private static SoftverKontroler instance = null;
    
    private List<Softver> softveri;
    
    private SoftverKontroler() {
        softveri = new ArrayList<>();
    }
    
    public static SoftverKontroler getInstance() {
        if (instance == null) {
            instance = new SoftverKontroler();
        }
        
        return instance;
    }
    
    public List<Softver> getAllsoftveri() {
        return softveri;
    }
    
    public Softver getSoftver(String name) throws Exception {
    	Softver Softver = softveri.stream().filter(el -> name.equals(el.getNaziv())).findAny().orElse(null);
        
        if (Softver == null) {
            throw new Exception("Not found");
        }
        
        return Softver;
    }
    
    public Softver addSoftver(Softver Softver) throws Exception {
        boolean isExists = softveri.stream().anyMatch(el -> Softver.getNaziv().equals(el.getNaziv()));
        
        if (isExists) {
            throw new Exception("Already exists");
        }
        
        softveri.add(Softver);
        
        return Softver;
    }
    
    public Softver updateSoftver(Softver Softver) throws Exception {
    	Softver SoftverCurrent = softveri.stream().filter(el -> Softver.getNaziv().equals(el.getNaziv())).findAny().orElse(null);
        int index = IntStream.range(0, softveri.size()).filter(idx -> softveri.get(idx).getNaziv().equals(Softver.getNaziv())).findFirst().orElse(-1);
        
        if (index < 0) {
            throw new Exception("Not found");
        }
        
        softveri.set(index, Softver);
        
        return Softver;
    }
    
     public void removeSoftver(String name) throws Exception {
        softveri.removeIf(el -> name.equals(el.getNaziv()));
    }
}
