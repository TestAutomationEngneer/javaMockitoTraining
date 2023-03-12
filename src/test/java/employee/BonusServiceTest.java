package employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BonusServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    private BonusService bonusService;

    @Test
    public void shouldCalculateBonusForEmployees_RC() {
        List<Employee> actualList = new ArrayList<>();
        employeeRepository = new EmployeeRepository();
        employeeRepository.save();
        bonusService = new BonusService(employeeRepository);

        System.out.println("Original List before calculating");
        employeeRepository.findAll().forEach(System.out::println);
        actualList =   bonusService.calculateBonus(1.5);

        System.out.println("Original List AFTER calculating");
        employeeRepository.findAll().forEach(System.out::println);

        assertThat(actualList.get(0).getSalary()).isEqualTo(15000.0);

    }

    @Test
    public void shouldCalculateBonusForEmployees_MOCK() {
        //given
        List<Employee> actualList = new ArrayList<>();
        List<Employee> expectedList = new ArrayList<>();

        expectedList.add(new Employee(1, "darek", "hryciuk", 1000.00));

        System.out.println("Original mocked List before calculating");
        expectedList.forEach(System.out::println);

        //when
        when(employeeRepository.findAll()).thenReturn((expectedList));
        bonusService = new BonusService(employeeRepository);
        actualList =   bonusService.calculateBonus(1.5);


        //then
        assertThat(expectedList.get(0).getSalary()).isEqualTo(actualList.get(0).getSalary());

        System.out.println("Original mocked List after calculating");
        expectedList.forEach(System.out::println);
    }

}