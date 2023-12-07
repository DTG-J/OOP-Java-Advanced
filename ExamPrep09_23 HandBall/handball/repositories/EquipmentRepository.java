package handball.repositories;

import handball.entities.equipment.Equipment;

import java.util.Collection;

public class EquipmentRepository implements Repository{
    private Collection<Equipment> equipments;

    public EquipmentRepository(Collection<Equipment> equipments) {
        this.equipments = equipments;
    }

    @Override
    public void add(Equipment equipment) {

    }

    @Override
    public boolean remove(Equipment equipment) {
        return false;
    }

    @Override
    public Equipment findByType(String type) {
        return null;
    }
}
