package component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    JdbcConnectionComp jdbcConnectionComp;

    public JdbcConnectionComp getJdbcConnectionComp() {
        return jdbcConnectionComp;
    }

    public void setJdbcConnectionComp(JdbcConnectionComp jdbcConnectionComp) {
        this.jdbcConnectionComp = jdbcConnectionComp;
    }
}
