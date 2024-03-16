package id.my.hendisantika.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document
public record Book(@Id Integer id, String name, String author) {
}
