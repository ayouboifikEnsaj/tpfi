package com.example.pf;

import com.example.pf.entities.Pharmacie;
import com.example.pf.repo.PharmacieRepository;
import com.example.pf.repo.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PfApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfApplication.class, args);
    }
//  @Autowired
//    PharmacieRepository pharmacieRepository;
//
//    @Autowired
//    ZoneRepository zoneRepository;
//    @Bean
//    CommandLineRunner init() {
//        return args -> {
//            List<Pharmacie> pharmacie=pharmacieRepository.findPharmacieByZone(zoneRepository.findById(13));
//            System.out.println(pharmacie);
//        };
//    }
}
