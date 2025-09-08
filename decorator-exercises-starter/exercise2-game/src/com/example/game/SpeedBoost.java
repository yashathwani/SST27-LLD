package decorator-exercises-starter.exercise2-game.src.com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private int boostAmount;

    public SpeedBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + boostAmount;
    }

}
