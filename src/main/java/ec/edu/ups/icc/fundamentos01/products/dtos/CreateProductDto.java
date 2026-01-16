package ec.edu.ups.icc.fundamentos01.products.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Set;

public class CreateProductDto {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 100)
    public String name;

    @Size(max = 255)
    public String description;

    @DecimalMin(value = "0.0", inclusive = false)
    public double price;

    public Long userId;

    public Set<Long> categoryIds; // El tuyo (N:N)
    public Long categoryId;       // El que pide el script (1:N)
}