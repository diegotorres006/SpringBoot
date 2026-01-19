package ec.edu.ups.icc.Springboot01.users.services;

import ec.edu.ups.icc.Springboot01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.Springboot01.users.entities.UserEntity;
import java.util.List;

public interface UserService {
    UserEntity save(UserEntity user);
    
    List<UserEntity> findAll();
    
    
    List<ProductResponseDto> getProductsByUserId(Long userId);
    
    
    List<ProductResponseDto> getProductsByUserIdWithFilters(
            Long userId,
            String name,
            Double minPrice,
            Double maxPrice,
            Long categoryId
    );
}