package com.example.shipping.services;

import com.example.shipping.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(final Order order) {
        return this.shippingService.shipment(order);
    }
}
