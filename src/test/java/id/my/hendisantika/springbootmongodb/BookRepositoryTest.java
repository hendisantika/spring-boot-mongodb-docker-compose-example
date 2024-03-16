package id.my.hendisantika.springbootmongodb;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/17/24
 * Time: 05:45
 * To change this template use File | Settings | File Templates.
 */
@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepo;

    @BeforeEach
    public void clean() {
        bookRepo.deleteAll();
    }
}
