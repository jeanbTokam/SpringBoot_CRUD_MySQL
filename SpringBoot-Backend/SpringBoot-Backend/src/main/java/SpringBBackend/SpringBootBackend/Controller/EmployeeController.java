package SpringBBackend.SpringBootBackend.Controller;

import SpringBBackend.SpringBootBackend.Entity.Employee;
import SpringBBackend.SpringBootBackend.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
       return employeeRepository.findAll();
    }

    // create employee
    @PostMapping("/employees")
    public Employee CreateEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
