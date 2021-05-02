package com.example.demo.service.category;

import com.example.demo.model.Category;
import com.example.demo.repository.CateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImp implements ICategoryService {
    @Autowired
    private CateRepository cateRepository;

    @Override
    public List<Category> getAllCate() {
        return cateRepository.findAll();
    }
}
