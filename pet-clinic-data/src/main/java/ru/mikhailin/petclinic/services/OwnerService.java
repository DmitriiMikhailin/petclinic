package ru.mikhailin.petclinic.services;

import ru.mikhailin.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
