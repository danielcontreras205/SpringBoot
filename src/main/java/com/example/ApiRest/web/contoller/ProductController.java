package com.example.ApiRest.web.contoller;

import com.example.ApiRest.dto.Customer;
import com.example.ApiRest.dto.Product;
import com.example.ApiRest.domain.service.ClienteService;
import com.example.ApiRest.domain.service.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductoService service;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(service.save(product), HttpStatus.CREATED);
    }
    
    @GetMapping("/getProductId/{id}")
    public ResponseEntity<Optional<Product>> getProductId (@PathVariable("id") int productId){
        return new ResponseEntity<>(service.getProduct(productId),HttpStatus.OK);
    }
    
    @DeleteMapping("/DeleteProductId/{id}")
    public ResponseEntity<Boolean>DeleteProductId(@PathVariable("id") int productId){
        ResponseEntity<Boolean> ObjetoRespuesta = new ResponseEntity<>(service.delete(productId),HttpStatus.CREATED);
        return ObjetoRespuesta;
    }
    
    @PutMapping("/UpdateProduct/{id}")
    public ResponseEntity<Product> UpdateProduct (@PathVariable("id") int productId,@RequestBody Product product){
        product.setProductId(productId);
        return new ResponseEntity<>(service.update(product),HttpStatus.CREATED);
    }
}
