package com.example.SpringBoot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service 
public class SoftwareEngineerService {
    private SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository){
        this.softwareEngineerRepository=softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers(){
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer (SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    }   

    public SoftwareEngineer getSoftwareEngineerById(Integer id){
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException("Id not found : " + id));   
    }   
    
    public void modifySoftwareEngineer(Integer id, SoftwareEngineer newSoftwareEngineer){
        SoftwareEngineer softwareEngineerById = softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException("Id not found : " + id));
        if(newSoftwareEngineer.getName() != null){
            softwareEngineerById.setName(newSoftwareEngineer.getName());
        }
        if(newSoftwareEngineer.getTechStack() != null){
            softwareEngineerById.setTechStack(newSoftwareEngineer.getTechStack());
        }
        softwareEngineerRepository.save(softwareEngineerById);
    }

    public void deleteSoftwareEngineer(Integer id){
        SoftwareEngineer softwareEngineerById = softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException("Id not found : " + id));
        softwareEngineerRepository.delete(softwareEngineerById);
    }

}
