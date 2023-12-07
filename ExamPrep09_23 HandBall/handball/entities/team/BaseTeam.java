package handball.entities.team;

public abstract class BaseTeam implements Team{
    private String name;
    private String country;
    private int advantage;

    public BaseTeam(String name, String country, int advantage) {
        this.name = name;
        this.country = country;
        this.advantage = advantage;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }

    @Override
    public String getName() {
        return null;
            }

    @Override
    public int getAdvantage() {
        return 0;
    }
}
