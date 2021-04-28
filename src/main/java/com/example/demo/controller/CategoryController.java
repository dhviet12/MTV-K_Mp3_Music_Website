package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
@RequestMapping("/categorys")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<Category>> list(){
        List<Category> category = categoryService.findAll();
        return new ResponseEntity<>(category , HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Category> create(@RequestBody Category category){
        categoryService.save(category);
        return new ResponseEntity<>(category , HttpStatus.CREATED);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Category>edit(@RequestBody Category category,@PathVariable Long id){
        category.setId(id);
        categoryService.save(category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Category> delete(@PathVariable Long id){
        categoryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category>detail(@PathVariable Long id){
        Category category = categoryService.findById(id);
        return new  ResponseEntity<>(category, HttpStatus.OK);
    }
}
