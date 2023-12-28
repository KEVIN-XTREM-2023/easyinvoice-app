package com.serviciosFacturacion.servicios.controllers;

import com.serviciosFacturacion.servicios.models.PromotionModel;
import com.serviciosFacturacion.servicios.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;


    @GetMapping
    public ArrayList<PromotionModel> getPromotions() {
        return this.promotionService.getPromotions();
    }

    @PostMapping
    public PromotionModel savePromotion(@RequestBody PromotionModel promotion) {
        return this.promotionService.savePromotion(promotion);
    }


    @GetMapping(path = "/{id}")
    public Optional<PromotionModel> getPromotionById(@PathVariable("id") Long id_prom) {
        return this.promotionService.getById(id_prom);
    }

    @PutMapping(path = "/{id}")
    public PromotionModel updatePromotionById(@RequestBody PromotionModel request, @PathVariable("id") Long id_prom) {
        return this.promotionService.updateById(request, id_prom);

    }


    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id_prom) {
        boolean ok = this.promotionService.deletePromotion(id_prom);
        if (ok) {
            return "Promotion with id" + id_prom + "delete";
        } else {
            return "Error, we have a problem";

        }
    }
}

