package ru.mikhailin.petclinic.services.map;

import org.springframework.stereotype.Service;
import ru.mikhailin.petclinic.model.Pet;
import ru.mikhailin.petclinic.services.CrudService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
