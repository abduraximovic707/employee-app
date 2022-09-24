package uz.pdp.employeeapp.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeDao {

    public final JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployee() {
        String sql = "select * from employee";

        return jdbcTemplate.query(sql, (reultSet, row) ->
                Employee.builder()
                        .id(reultSet.getInt(1))
                        .fullName(reultSet.getString(2))
                        .levelId(reultSet.getInt(3))
                        .langId(reultSet.getInt(4))
                        .build()
        );
    }

    public void addNewEmployee(Employee employee) {
        String sql = "insert into employee(full_name,program_lang_id,level_id)" +
                "values('" + employee.getFullName() + "','" + employee.getLangId() + "','"
                + employee.getLangId() + "','" + employee.getLevelId() + "')";

        jdbcTemplate.update(sql);
    }

    public void editEmployee(Employee employee) {
        String sql = "update employee set full_name = '" + employee.getFullName() + "', program_lang_id ='" + employee.getLangId()
                + "', program_lang_id =" + employee.getLevelId();
        jdbcTemplate.update(sql);
    }

    public void deleteEmployeeById  (Integer id) {
        String sql = "delete from employee where id = " + id;
        jdbcTemplate.update(sql);
    }

    public Employee getEmployeeById(Integer id) {
        String sql = "select * from employee where id =" +id;

        Employee level = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Employee.class));

        return level;
    }


}
