package handball.entities.team;

public class Bulgaria extends BaseTeam {
    public Bulgaria(String name, String country, int advantage) {
        super(name, country, advantage);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAdvantage() {
        return super.getAdvantage();
    }
}
