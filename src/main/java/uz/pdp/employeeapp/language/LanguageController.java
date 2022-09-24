package uz.pdp.employeeapp.language;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/languages")
@RequiredArgsConstructor
public class LanguageController {
    public final LanguageDao languageDao;

    @GetMapping
    public String getAllLanguage(Model model) {
        model.addAttribute("tillar", languageDao.getAllLanguage());

        return "languages/view-languages";
    }

    @GetMapping("/get-form")
    public String getLanguageForm() {
        return "/languages/add-language-form";
    }

    @GetMapping
    public String addLanguage(Language language) {

        languageDao.addNewLanguage(language);
        return "redirect:/languages";

    }

    @GetMapping("/edit/{id}")
    public String getFormForEditLanguage(@PathVariable Integer id, Model model) {

        Language languageById = languageDao.getLanguageById(id);
        model.addAttribute("tillar", languageById);

        return "languages/edit-language";
    }

    @SneakyThrows
    @PostMapping("/edit")
    public String editAuthorById(Language language) {
        try {
            languageDao.editLanguage(language);
            return "redirect:/languages";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }

    }

    @SneakyThrows
    @GetMapping("/delete/{id}")
    public String deleteAuthorById(@PathVariable Integer id) {
        try {
            languageDao.deleteLanguageById(id);
            return "redirect:/languages";
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalAccessException("Somethings went wrong..");
        }
    }

}
