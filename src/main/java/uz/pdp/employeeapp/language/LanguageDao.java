package uz.pdp.employeeapp.language;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class LanguageDao {

    public final JdbcTemplate jdbcTemplate;

    public List<Language> getAllLanguage() {
        String sql = "select * from program_lang";

        return jdbcTemplate.query(sql, (resultSet, row) ->
                Language.builder()
                        .id(resultSet.getInt(1))
                        .name(resultSet.getString(2))
                        .description(resultSet.getString(3))
                        .build()
        );
    }

    public void addNewLanguage(Language language) {
        String sql = "insert into program_lang(name,description)" +
                "values('" + language.getName() + "','" + language.getDescription() + "')";

        jdbcTemplate.update(sql);
    }

    public void editLanguage(Language language) {
        String sql = "update program_lang set name = '" + language.getName() + "', description= " + language.getDescription();
        jdbcTemplate.update(sql);
    }

    public void deleteLanguageById  (Integer id) {
        String sql = "delete from program_lang where id = " + id;
        jdbcTemplate.update(sql);
    }

    public Language getLanguageById(Integer id) {
        String sql = "select * from program_lang where id =" +id;

        Language level = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Language.class));

        return level;
    }


}
