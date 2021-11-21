package project.spring.service;

import project.spring.model.MovieSession;
import project.spring.model.ShoppingCart;
import project.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
