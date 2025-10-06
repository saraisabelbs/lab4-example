package pt.ulusofona.cd.store.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "pt.ulusofona.cd.store.client")
public class SupplierServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupplierServiceApplication.class, args);
    }
}