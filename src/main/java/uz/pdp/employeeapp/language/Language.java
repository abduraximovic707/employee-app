package uz.pdp.employeeapp.language;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Language {
    private Integer id;
    private String name;
    private String description;
}
