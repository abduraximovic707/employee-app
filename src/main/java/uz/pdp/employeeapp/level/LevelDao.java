package uz.pdp.employeeapp.level;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import uz.pdp.employeeapp.level.Level;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LevelDao {

    public final JdbcTemplate jdbcTemplate;

    public List<Level> getAllLevel() {
        String sql = "select * from level";

        return jdbcTemplate.query(sql, (reultSet, row) ->
                Level.builder()
                        .id(reultSet.getInt(1))
                        .name(reultSet.getString(2))
                        .build()
        );
    }

    public void addNewLevel(Level level) {
        String sql = "insert into level(name) values('" + level.getName() + "')";

        jdbcTemplate.update(sql);
    }

    public void editLevel(Level level) {
        String sql = "update level set name = " + level.getName();
        jdbcTemplate.update(sql);
    }

    public void deleteLevelById(Integer id) {
        String sql = "delete from level where id = " + id;
        jdbcTemplate.update(sql);
    }

    public Level getLevelById(Integer id) {
        String sql = "select * from level where id =" +id;

        Level level = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Level.class));

        return level;
    }


}
