package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.model.CartItem;
import com.ecommerce.ecommerce_backend.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addToCart(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getCartItems(){
        return cartItemRepository.findAll();
    }

    public void removeFromCart(Long id){
        cartItemRepository.deleteById(id);
    }
}