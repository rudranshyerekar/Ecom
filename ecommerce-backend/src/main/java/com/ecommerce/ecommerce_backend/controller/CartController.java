package com.ecommerce.ecommerce_backend.controller;

import com.ecommerce.ecommerce_backend.model.CartItem;
import com.ecommerce.ecommerce_backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public CartItem addToCart(@RequestBody CartItem cartItem){
        return cartService.addToCart(cartItem);
    }

    @GetMapping
    public List<CartItem> getCart(){
        return cartService.getCartItems();
    }

    @DeleteMapping("/{id}")
    public void removeFromCart(@PathVariable Long id){
        cartService.removeFromCart(id);
    }
}