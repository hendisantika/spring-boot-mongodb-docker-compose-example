package id.my.hendisantika.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-mongodb-docker-compose-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/17/24
 * Time: 05:44
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends MongoRepository<Book, Integer> {
}
