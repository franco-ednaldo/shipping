package com.example.shipping;

import com.example.shipping.domain.Order;
import com.example.shipping.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingApplication implements CommandLineRunner {
    private final OrderService orderService;

    public ShippingApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ShippingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final var order1 = new Order(1034, 150.0, 20.0);
        System.out.println("Pedido código: " + order1.code());
        System.out.println("Valor total: " + this.orderService.total(order1));
        System.out.println("--------------- -----------------");

        final var order2 = new Order(2282, 800.00, 10.0);
        System.out.println("Pedido código: " + order2.code());
        System.out.println("Valor total: " + this.orderService.total(order2));

        System.out.println("--------------- -----------------");
        final var order3 = new Order(1309, 95.90, 0.0);
        System.out.println("Pedido código: " + order3.code());
        System.out.println("Valor total: " + this.orderService.total(order3));
    }
}
