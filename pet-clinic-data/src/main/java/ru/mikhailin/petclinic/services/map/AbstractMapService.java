package ru.mikhailin.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    private Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    T save(ID id, T t) {
        return map.put(id, t);
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
}
