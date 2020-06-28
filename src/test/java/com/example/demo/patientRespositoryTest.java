package com.example.demo;

import Dao.patient;
import Dao.patientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class patientRespositoryTest extends DemoApplicationTests {
    @Autowired
    private patientRepository patientRepository;
    @Test
    public void testFindByUsername(){
        patientRepository.findByUsername("123");
    }
    @Test
    public void testSavePatient(){
        patient patient = new patient();
        patient.setUsername("13933768236");
        patient.setNname("李济深");
        patient.setPassword("123");
        patientRepository.save(patient);
    }
    @Test
    public  void  testDeleteByUsername(){
        patientRepository.deleteByUsername("123456");
    }

}
