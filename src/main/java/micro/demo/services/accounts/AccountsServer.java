package micro.demo.services.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration //defines this as a Spring Boot application.
@EnableDiscoveryClient //this enables service registration and discovery. In this case, this process registers itself
// with the discovery-server service using its application name (see below).
//@Import(AccountsWebApplication.class)
public class AccountsServer {

   /* @Autowired
    AccountRepository accountRepository;*/

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "account-server");

        SpringApplication.run(AccountsServer.class, args);
    }



}
