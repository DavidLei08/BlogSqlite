package club.dlblog.sqlite;

import club.dlblog.sqlite.entity.ProEntity;
import club.dlblog.sqlite.mapper.ProMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogSqliteApplicationTests {

	@Autowired
	ProMapper proMapper;

	@Test
	void contextLoads() {
		proMapper.list();
		ProEntity proEntity = new ProEntity();
		proEntity.setDatabaseKey("tb1");
		proEntity.setDatabaseUrl("jdbc:sqlite:E:/git_space/BlogSqlite/sqlite/pro.db");
		proMapper.add(proEntity);
		proMapper.list();
	}

}
