package id.my.hendisantika.springbootmongodb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

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

    @Test
    void testInsertDeleteGet() {

        bookRepo.insert(new Book(1, "Lord Of the Rings", "J.R.R. Tolkien"));

        Book result = bookRepo.findById(1).get();

        Assertions.assertEquals("Lord Of the Rings", result.name());

        bookRepo.deleteById(1);

        Optional<Book> result2 = bookRepo.findById(1);

        Assertions.assertNull(result2.orElse(null));

    }
}
