package ec.edu.ups.icc.Springboot01.users.controllers;

import ec.edu.ups.icc.Springboot01.users.entities.UserEntity;
import ec.edu.ups.icc.Springboot01.users.services.UserService;
import ec.edu.ups.icc.Springboot01.products.dtos.ProductResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") 
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    
    @GetMapping("/{id}/products")
    public ResponseEntity<List<ProductResponseDto>> getProductsByUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getProductsByUserId(id));
    }

    
    @GetMapping("/{id}/products-v2")
    public ResponseEntity<List<ProductResponseDto>> getProductsByUserV2(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) Long categoryId) {
        
        return ResponseEntity.ok(userService.getProductsByUserIdWithFilters(
                id, name, minPrice, maxPrice, categoryId
        ));
    }
}