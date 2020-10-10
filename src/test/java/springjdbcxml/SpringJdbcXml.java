package springjdbcxml;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import springjdbcxml.entity.JdbcEntityXml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SpringJdbcXml extends JdbcDaoSupport {
    /*@Autowired
    public JdbcTemplate jdbcTemplate;
*/

    /**
     * 添加的方法
     */
    public int add(JdbcEntityXml entity) {
        String sql = "INSERT INTO t_testJdbc (NAME, PASSWORD, age,hobby) VALUES (?,?,?,?)";
//        用springjdbc模版调方法
        return getJdbcTemplate().update(sql, entity.getName(), entity.getPassword(), entity.getAge(), entity.getHobby());
    }

    /**
     * 修改的方法
     */
    public int modify(JdbcEntityXml entity) {
        String sql = "UPDATE t_testJdbc SET `password` =? WHERE `name` =?";
//        用springjdbc模版调方法
        return getJdbcTemplate().update(sql, entity.getPassword(), entity.getName());
    }

    /**
     * 删除的方法
     */
    public int delete(JdbcEntityXml entity) {
        String sql = "DELETE FROM t_testJdbc WHERE `name` = ?";
//        用springjdbc模版调方法
        return getJdbcTemplate().update(sql, entity.getName());
    }

    /**
     * 获得总数的方法
     */
    public int getTotal() {
        String sql = "SELECT count(id) FROM t_testJdbc";
        return getJdbcTemplate().queryForObject(sql, Integer.class);
    }

    /**
     * 获得单个对象的方法
     */
    public JdbcEntityXml getSingleObject(String name) {
        String sql = "SELECT * FROM t_testJdbc WHERE `name` =?";
        return getJdbcTemplate().queryForObject(sql, new Object[]{name}, (resultSet, i) -> {
//                声明学生对象,来存查询当前行每个列的值
//                手动设置了对象的属性,所以不需要担心列名与属性的名不一致
            JdbcEntityXml entity = new JdbcEntityXml();
            entity.setId(resultSet.getInt("id"));
            entity.setName(resultSet.getString("name"));
            entity.setPassword(resultSet.getString("password"));
            entity.setAge(resultSet.getInt(4));
            entity.setHobby(resultSet.getString("hobby"));
            return entity;
        });
    }

    /**
     * 获得多个对象的方法
     */
    public List<JdbcEntityXml> getAllObject() {
//        准备sql语句
        String sql = "SELECT * FROM t_testJdbc";
//        用springJdbc的模版调用方法来执行操作
        return this.getJdbcTemplate().query(sql, new RowMapper<JdbcEntityXml>() {
            @Override
            public JdbcEntityXml mapRow(ResultSet resultSet, int i) throws SQLException {
                JdbcEntityXml entity = new JdbcEntityXml();
                entity.setId(resultSet.getInt("id"));
                entity.setName(resultSet.getString("name"));
                entity.setPassword(resultSet.getString("password"));
                entity.setAge(resultSet.getInt("age"));
                entity.setHobby(resultSet.getString("hobby"));
                return entity;
            }
        });
    }
}

