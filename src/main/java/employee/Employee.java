package employee;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    private double salary;

}
