package uz.pdp.employeeapp.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
    private Integer id;
    private String fullName;
    private Integer levelId;
    private Integer langId;
    private String LanguageName;
    private String langName;
}
