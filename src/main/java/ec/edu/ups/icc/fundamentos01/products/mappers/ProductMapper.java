package ec.edu.ups.icc.fundamentos01.products.mappers;

import ec.edu.ups.icc.fundamentos01.products.dtos.ProductResponseDto;
import ec.edu.ups.icc.fundamentos01.products.entities.ProductEntity;

public class ProductMapper {

    public static ProductResponseDto toResponse(ProductEntity entity) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.id = entity.getId();
        dto.name = entity.getName();
        dto.price = entity.getPrice();
        dto.description = entity.getDescription();
        
        dto.user = entity.getOwner();
        dto.categories = entity.getCategories();

        if (entity.getCategories() != null && !entity.getCategories().isEmpty()) {
            dto.category = entity.getCategories().iterator().next();
        }

        return dto;
    }
}