package decorator-exercises-starter.exercise2-game.src.com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int boostAmount;

    public DamageBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + boostAmount;
    }

}
