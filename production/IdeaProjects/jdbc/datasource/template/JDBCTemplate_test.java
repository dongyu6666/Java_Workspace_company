package jdbc.datasource.template;

import domain.Account;
import domain.TestLei;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils_new;

import java.util.List;

public class JDBCTemplate_test {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        //String sql6 = "select * from `test`.`account`;";
        //String sql6 = "INSERT INTO `test`.`account` (`id`, `name`, `balance`) VALUES ('6', 'Somebody', '100');";

        //int update = jdbcTemplate.update(sql6);
        String sql7 = "SELECT u.id,u.user_name,r.role_name,p.permission_menu\n" +
                "FROM USER u \n" +
                "INNER JOIN user_role ur ON u.id = ur.uid\n" +
                "INNER JOIN ROLE r ON r.id = ur.role_id\n" +
                "INNER JOIN role_permission rp ON r.id = rp.role_id\n" +
                "INNER JOIN permission p ON p.id = rp.role_id";
        /*String sql7 = "SELECT d.id,d.de_name,b.bu_name,k.ke_name,z.zu_name,n.id,n.name,n.card_id\n" +
                "FROM `name` AS n \n" +
                "INNER JOIN `zu` AS z ON z.id = n.zu_id\n" +
                "INNER JOIN `ke` AS k ON k.id = z.ke_id\n" +
                "INNER JOIN `bu` AS b ON b.id = k.bu_id\n" +
                "INNER JOIN `department` AS d ON d.id = b.de_id\n" +
                "\n" +
                "WHERE n.id =  '10'";*/

        List<TestLei> list = jdbcTemplate.query(sql7, new BeanPropertyRowMapper<TestLei>(TestLei.class));
        for (TestLei TestLei : list) {
            System.out.println(TestLei);
        }
    }
}
