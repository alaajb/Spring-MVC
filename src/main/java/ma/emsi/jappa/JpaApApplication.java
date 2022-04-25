package ma.emsi.jpaap;

import ma.emsi.jpaap.entities.Patient;
import ma.emsi.jpaap.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JpaApApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {

            patientRepository.save(new Patient(null,"Hassan",new Date(),false,22));
            patientRepository.save(new Patient(null,"Mouad",new Date(),false,22));
            patientRepository.save(new Patient(null,"Nassim",new Date(),false,22));
            patientRepository.save(new Patient(null,"Nada",new Date(),false,22));
            patientRepository.save(new Patient(null,"Yassine",new Date(),false,22));
            patientRepository.save(new Patient(null,"Hmed",new Date(),false,22));
            patientRepository.save(new Patient(null,"Zaid",new Date(),false,22));
            patientRepository.save(new Patient(null,"Zineb",new Date(),false,22));
            patientRepository.save(new Patient(null,"Omar",new Date(),false,22));
            patientRepository.save(new Patient(null,"Youssef",new Date(),false,22));
            patientRepository.save(new Patient(null,"YYY",new Date(),false,22));
            patientRepository.save(new Patient(null,"DDDD",new Date(),false,22));
            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());
            });

        };
    }
}
