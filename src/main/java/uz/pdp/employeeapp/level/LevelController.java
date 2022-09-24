package uz.pdp.employeeapp.level;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.employeeapp.level.Level;
import uz.pdp.employeeapp.level.LevelDao;


@Controller
@RequestMapping("/levels")
@RequiredArgsConstructor
public class LevelController {
    public final LevelDao levelDao;

    @GetMapping
    public String getAllLevel(Model model) {
        model.addAttribute("darajalar", levelDao.getAllLevel());

        return "levels/view-level";
    }

    @GetMapping("/get-form")
    public String getAuthorForm() {
        return "/levels/add-level-form";
    }

    @GetMapping
    public String addLevel(Level level) {

        levelDao.addNewLevel(level);
        return "redirect:/levels";

    }

    @GetMapping("/edit/{id}")
    public String getFormForEditLevel(@PathVariable Integer id, Model model) {

        Level levelById = levelDao.getLevelById(id);
        model.addAttribute("darajalar", levelById);

        return "levels/edit-level";
    }

    @SneakyThrows
    @PostMapping("/edit")
    public String editAuthorById(Level level) {
        try {
            levelDao.editLevel(level);
            return "redirect:/levels";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }

    }

    @SneakyThrows
    @GetMapping("/delete/{id}")
    public String deleteAuthorById(@PathVariable Integer id) {
        try {
            levelDao.deleteLevelById(id);
            return "redirect:/levels";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }
    }

}
