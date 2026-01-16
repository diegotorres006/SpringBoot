package ec.edu.ups.icc.fundamentos01.products.services;

import ec.edu.ups.icc.fundamentos01.products.dtos.*;
import java.util.List;

public interface ProductService {
    ProductResponseDto create(CreateProductDto product);
    ProductResponseDto update(int id, UpdateProductDto product);
    Object delete(int id); // Recuerda que lo dejamos como Object
    List<ProductResponseDto> findAll();
    ProductResponseDto findOne(int id);
    ProductResponseDto partialUpdate(int id, PartialUpdateProductDto product);
    boolean validateName(Integer id, String name);
    
    // --- ESTOS SON LOS NUEVOS PARA EL SCRIPT ---
    List<ProductResponseDto> findAllByUserId(int userId);
    List<ProductResponseDto> findAllByCategoryId(int categoryId);
}