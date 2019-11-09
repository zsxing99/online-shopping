package onlineShop.dao;

import java.io.IOException;
import onlineShop.model.Cart;

public interface CartDao {
    Cart getCartById(int cartId);
    
    Cart validate(int carId) throws IOException;
}
