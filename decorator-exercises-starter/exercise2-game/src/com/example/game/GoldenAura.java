package decorator-exercises-starter.exercise2-game.src.com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "Golden " + super.getSprite();
    }
}
