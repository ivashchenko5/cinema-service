package project.spring.service;

import java.util.List;
import project.spring.model.Order;
import project.spring.model.ShoppingCart;
import project.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
