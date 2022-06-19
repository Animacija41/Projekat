package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SoftwareController {
    private static SoftwareController instance = null;
    
    private List<Softver> softwares;
    
    private SoftwareController() {
        softwares = new ArrayList<>();
    }
    
    public static SoftwareController getInstance() {
        if (instance == null) {
            instance = new SoftwareController();
        }
        
        return instance;
    }
    
    public List<Softver> getAllSoftwares() {
        return softwares;
    }
    
    public Softver getSoftware(String name) throws Exception {
    	Softver software = softwares.stream().filter(el -> name.equals(el.getNaziv())).findAny().orElse(null);
        
        if (software == null) {
            throw new Exception("Not found");
        }
        
        return software;
    }
    
    public Softver addSoftware(Softver software) throws Exception {
        boolean isExists = softwares.stream().anyMatch(el -> software.getNaziv().equals(el.getNaziv()));
        
        if (isExists) {
            throw new Exception("Already exists");
        }
        
        softwares.add(software);
        
        return software;
    }
    
    public Softver updateSoftware(Softver software) throws Exception {
    	Softver softwareCurrent = softwares.stream().filter(el -> software.getNaziv().equals(el.getNaziv())).findAny().orElse(null);
        int index = IntStream.range(0, softwares.size()).filter(idx -> softwares.get(idx).getNaziv().equals(software.getNaziv())).findFirst().orElse(-1);
        
        if (index < 0) {
            throw new Exception("Not found");
        }
        
        softwares.set(index, software);
        
        return software;
    }
    
     public void removeSoftware(String name) throws Exception {
        softwares.removeIf(el -> name.equals(el.getNaziv()));
    }
}
