package com.serviciosFacturacion.servicios.services;


import com.serviciosFacturacion.servicios.models.CategoryModel;
import com.serviciosFacturacion.servicios.repositories.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;


@Service
public class CategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    public ArrayList<CategoryModel> getCategories(){
        return (ArrayList<CategoryModel>) categoryRepository.findAll();
    }

    public CategoryModel saveCategory(CategoryModel category){

        return categoryRepository.save(category);
    }

    public Optional<CategoryModel> getById(Long id_categ ){
        return  categoryRepository.findById(	id_categ  );

    }


    @Transactional
    public CategoryModel updateById(CategoryModel request, Long id_categ) {

        CategoryModel category = categoryRepository.findById(id_categ).orElse(null);
        if (category != null) {
            category.setNom_categ(request.getNom_categ());
            category.setDescrip_categ(request.getDescrip_categ());
            category.setParent_id(request.getParent_id());
        }
        return category;
    }




    public Boolean deleteCategory(Long id_categ){
        try {
            categoryRepository.deleteById(id_categ);
            return  true;
        }catch (Exception e){
            return  false;
        }
    }

}
