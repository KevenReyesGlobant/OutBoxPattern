package com.food.ordering.system.dataaccess.restaurant.common_dataaccess.repository;

import com.food.ordering.system.dataaccess.restaurant.common_dataaccess.entity.RestaurantEntity;
import com.food.ordering.system.dataaccess.restaurant.common_dataaccess.entity.RestaurantEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<RestaurantEntity, RestaurantEntityId> {

    Optional<List<RestaurantEntity>> findByIdRestaurantIdAndProductsIdIn(UUID restaurantId, List<UUID> productIds);

}