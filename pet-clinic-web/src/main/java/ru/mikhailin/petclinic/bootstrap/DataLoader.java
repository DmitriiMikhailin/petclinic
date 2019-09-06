package ru.mikhailin.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mikhailin.petclinic.model.Owner;
import ru.mikhailin.petclinic.model.Vet;
import ru.mikhailin.petclinic.services.OwnerService;
import ru.mikhailin.petclinic.services.VetService;
import ru.mikhailin.petclinic.services.map.OwnerMapService;
import ru.mikhailin.petclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Linda");
        owner1.setLastName("May");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mary");
        owner2.setLastName("Kay");
        ownerService.save(owner2);

        System.out.println("Owners loaded");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("James");
        vet1.setLastName("Deen");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Michael");
        vet2.setLastName("Langsly");
        vetService.save(vet2);

        System.out.println("Vets loaded");
    }
}
