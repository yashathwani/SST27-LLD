package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        return new Order.Builder(id, email, lines)
                .discountPercent(discount)
                .expedited(expedited)
                .notes(notes)
                .build();
    }
}
