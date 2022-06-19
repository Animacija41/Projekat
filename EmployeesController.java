package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EmployeesController {
    private static EmployeesController instance = null;
    
    private List<Zaposleni> employees;
    
    public EmployeesController() {
        employees = new ArrayList<>();
    }
    
    public static EmployeesController getInstance() {
        if (instance == null) {
            instance = new EmployeesController();
        }
        
        return instance;
    }
    
    public List<Zaposleni> getAllEmployees() {
        return employees;
    }
    
    public Zaposleni getEmployee(String jmbg) throws Exception {
    	Zaposleni employee = employees.stream().filter(el -> jmbg.equals(el.getJMBG())).findAny().orElse(null);
        
        if (employee == null) {
            throw new Exception("Not found");
        }
        
        return employee;
    }
    
    public Zaposleni addEmployee(Zaposleni employee) throws Exception {
        boolean isExists = employees.stream().anyMatch(el -> employee.getJMBG() == el.getJMBG());
        
        if (isExists) {
            throw new Exception("Already exists");
        }
        
        employees.add(employee);
        
        return employee;
    }
    
    public Zaposleni updateEmployee(Zaposleni employee) throws Exception {
    	Zaposleni employeeCurrent = employees.stream().filter(el -> (employee.getJMBG() == el.getJMBG())).findAny().orElse(null);
        int index = IntStream.range(0, employees.size()).filter(idx -> employees.get(idx).getJMBG() == (employee.getJMBG())).findFirst().orElse(-1);
        
        if (index < 0) {
            throw new Exception("Not found");
        }
        
        employees.set(index, employee);
        
        return employee;
    }
    
     public void removeEmployee(String jmbg) throws Exception {
        employees.removeIf(el -> jmbg.equals(el.getJMBG()));
    }

}
