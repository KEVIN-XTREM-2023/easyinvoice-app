package com.serviciosFacturacion.servicios.controllers;

import com.serviciosFacturacion.servicios.models.CategoryModel;
import com.serviciosFacturacion.servicios.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ArrayList<CategoryModel> getCategories(){
        return this.categoryService.getCategories();
    }

    @PostMapping("/save-category")
    public  CategoryModel saveCategory(@RequestBody CategoryModel  category){
        return this.categoryService.saveCategory(category);
    }

    @GetMapping(path = "/{id}")
    public Optional<CategoryModel> getIvaById(@PathVariable("id") Long id_categ ){
        return  this.categoryService.getById(id_categ);
    }

    @PutMapping(path = "/{id}")
    public CategoryModel updateCategoryById(@RequestBody CategoryModel request,@PathVariable("id") Long id_categ){
        return this.categoryService.updateById(request, id_categ);

    }



    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id_categ){
        boolean ok = this.categoryService.deleteCategory(id_categ);
        if (ok){
            return  "Iva with id" + id_categ + "delete";
        }else{
            return "Error, we have a problem";

        }
    }
}
