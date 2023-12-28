package com.serviciosFacturacion.servicios.services;

import com.serviciosFacturacion.servicios.models.PromotionModel;
import com.serviciosFacturacion.servicios.repositories.IPromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PromotionService {
    @Autowired
    IPromotionRepository promotionRepository;

    public ArrayList<PromotionModel> getPromotions(){
        return (ArrayList<PromotionModel>) promotionRepository.findAll();
    }

    public PromotionModel savePromotion(PromotionModel promotion){

        return promotionRepository.save(promotion);
    }

    public Optional<PromotionModel> getById(Long id_prom ){
        return  promotionRepository.findById(id_prom);

    }
    /**
     @Transactional
     public PromotionModel updateById(PromotionModel request, Long id_prom ){
     PromotionModel  promotion  = promotionRepository.findById(id_prom).get();
     promotion.setNom_prom(request.getNom_prom());
     promotion.setDescrip_prom(request.getDescrip_prom());
     promotion.setTip_prom(request.getTip_prom());
     promotion.setPorcentaje_desc(request.getPorcentaje_desc());
     return  promotion;

     }*/

    @Transactional
    public PromotionModel updateById(PromotionModel request, Long id_prom) {

        PromotionModel promotion = promotionRepository.findById(id_prom).orElse(null);
        if (promotion != null) {

            promotion.setNom_prom(request.getNom_prom());
            promotion.setDescrip_prom(request.getDescrip_prom());
            promotion.setTip_prom(request.getTip_prom());
            promotion.setPorcentaje_desc(request.getPorcentaje_desc());
        }
        return promotion;
    }




    public Boolean deletePromotion(Long id){
        try {
            promotionRepository.deleteById(id);
            return  true;
        }catch (Exception e){
            return  false;
        }
    }


}
