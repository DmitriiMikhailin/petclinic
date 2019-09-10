package ru.mikhailin.petclinic.services.map;

import org.springframework.stereotype.Service;
import ru.mikhailin.petclinic.model.Owner;
import ru.mikhailin.petclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        Set<Owner> set = super.findAll();
        for (Owner owner : set) {
            if (owner.getLastName().equals(lastName)) {
                return owner;
            }
        }

        return null;
    }
}
