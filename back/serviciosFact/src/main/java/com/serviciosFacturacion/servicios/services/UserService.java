package com.serviciosFacturacion.servicios.services;

import com.serviciosFacturacion.servicios.models.UserModel;
import com.serviciosFacturacion.servicios.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){

        return userRepository.save(user);
    }

    public Optional<UserModel> getById(Long id_usuario  ){
        return  userRepository.findById(id_usuario );

    }


    @Transactional
    public UserModel updateById(UserModel request, Long id_usuario) {

        UserModel user = userRepository.findById(id_usuario).orElse(null);
        if (user != null) {

            user.setId_tip_dni(request.getId_tip_dni());
            user.setId_establ_per(request.getId_establ_per());
            user.setNum_ident(request.getNum_ident());
            user.setNomb_usuario(request.getNomb_usuario());
            user.setApell_usuario(request.getApell_usuario());
            user.setEmail_usuario(request.getEmail_usuario());
            user.setTelef_usuario(request.getTelef_usuario());
            user.setDirec_usuario(request.getDirec_usuario());
            user.setEstado_usuario(request.getEstado_usuario());
            user.setTip_usuario(request.getTip_usuario());
            user.setContrasenia(request.getContrasenia());
            user.setFoto(request.getFoto());

        }
        return user;
    }




    public Boolean deleteUser(Long id_usuario){
        try {
            userRepository.deleteById(id_usuario);
            return  true;
        }catch (Exception e){
            return  false;
        }
    }


}
