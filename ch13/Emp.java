package ch13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// employee 클래스
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    
    private int employeeId;
    private String firstName;
    private int salary;
    
}
//각 객체에 값을 일괄적으로 넣기위해 넣음 !