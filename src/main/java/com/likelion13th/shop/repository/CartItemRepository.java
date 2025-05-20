package com.likelion13th.shop.repository;

import com.likelion13th.shop.entity.CartItem;
import com.likelion13th.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByCartIdAndItemId(Long cart_id, Long item_id);
}
