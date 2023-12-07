package handball.entities.gameplay;

import handball.entities.equipment.Equipment;
import handball.entities.team.Team;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseGameplay implements Gameplay{
    private  String name;
    private int capacity;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;

    public BaseGameplay(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.equipments = new ArrayList<>();
        this.teams = new ArrayList<>();
    }

    @Override
    public int allProtection() {
        return 0;
    }

    @Override
    public void addTeam(Team team) {

    }

    @Override
    public void removeTeam(Team team) {

    }

    @Override
    public void addEquipment(Equipment equipment) {

    }

    @Override
    public void teamsInGameplay() {

    }

    @Override
    public Collection<Team> getTeam() {
        return null;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
    return "";}
}
