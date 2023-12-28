package com.serviciosFacturacion.servicios.controllers;

import com.serviciosFacturacion.servicios.models.IvaModel;
import com.serviciosFacturacion.servicios.services.IvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/iva")
public class IvaController {
    @Autowired
    private IvaService ivaService;
    @GetMapping
    public ArrayList<IvaModel> getIvas(){
        return this.ivaService.getIvas();
    }

    @PostMapping
    public  IvaModel saveIva(@RequestBody IvaModel  iva){
        return this.ivaService.saveIva(iva);
    }




    @GetMapping(path = "/{id}")
    public Optional<IvaModel> getIvaById(@PathVariable("id") Long id_categ_iva ){
        return  this.ivaService.getById(id_categ_iva);
    }

    @PutMapping(path = "/{id}")
    public IvaModel updateIvaById(@RequestBody IvaModel request,@PathVariable("id") Long id_categ_iva){
        return this.ivaService.updateById(request, id_categ_iva);

    }



    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id_categ_iva){
        boolean ok = this.ivaService.deleteIva(id_categ_iva);
        if (ok){
            return  "Iva with id" + id_categ_iva + "delete";
        }else{
            return "Error, we have a problem";

        }
    }

}

