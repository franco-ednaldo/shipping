package com.example.shipping.services;

import com.example.shipping.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(final Order order) {
        final var value = order.netValue();
        if (value < 100) {
            return value + 20.0;
        } else if (value >= 100 && value <= 200) {
            return value + 12.0;
        } else {
            return value + 0.0;
        }
    }
}
