package uz.pdp.employeeapp.employee;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    public final EmployeeDao employeeDao;

    @GetMapping
    public String getAllEmployee(Model model) {
        model.addAttribute("xodimlar", employeeDao.getAllEmployee());

        return "employees/view-employees";
    }

    @GetMapping("/get-form")
    public String getLanguageForm() {
        return "/employees/add-employee-form";
    }

    @GetMapping
    public String addEmployee(Employee employee) {

        employeeDao.addNewEmployee(employee);
        return "redirect:/employees";

    }

    @GetMapping("/edit/{id}")
    public String getFormForEditEmployee(@PathVariable Integer id, Model model) {

        Employee employeeById = employeeDao.getEmployeeById(id);
        model.addAttribute("xodimlar", employeeById);

        return "employees/edit-employee";
    }

    @SneakyThrows
    @PostMapping("/edit")
    public String editAuthorById(Employee employee) {
        try {
            employeeDao.editEmployee(employee);
            return "redirect:/employees";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }

    }

    @SneakyThrows
    @GetMapping("/delete/{id}")
    public String deleteAuthorById(@PathVariable Integer id) {
        try {
            employeeDao.deleteEmployeeById(id);
            return "redirect:/employees";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }
    }

}
