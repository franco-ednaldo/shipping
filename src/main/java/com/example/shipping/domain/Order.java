package com.example.shipping.domain;

public record Order(Integer code, Double basic, Double discount) {
    public double netValue() {
        return basic * (1 - discount / 100);
    }

}

