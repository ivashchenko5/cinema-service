package project.spring.dao;

import java.util.List;
import project.spring.model.Order;
import project.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
