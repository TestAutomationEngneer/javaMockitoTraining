package employee;

import java.util.List;
import java.util.stream.Collectors;

public class BonusService {

    private EmployeeRepository employeeRepository;

    public BonusService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    //do przetestowania
    public List<Employee> calculateBonus(double percentage) {

        //przeiterować wszystkich pracowników, dostać sie do ich pensji
        //i każdemu pensję powiększyć o tyle procent ile jest w parametrze
        //percentage i zwrócić liste tych samych prcowników z powiększoną pensją.
       return employeeRepository.findAll().stream().map(
                e -> {
                    e.setSalary(e.getSalary() * percentage);
                    return e;
                }).collect(Collectors.toList());

    }
}
