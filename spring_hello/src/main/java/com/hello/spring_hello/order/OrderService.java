package com.hello.spring_hello.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
