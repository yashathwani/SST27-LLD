package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // === YOUR TASKS ===
        // 1) Create CharacterDecorator that implements Character and wraps another Character.
        // 2) Create concrete decorators, for example:
        //      - SpeedBoost (adds +N to speed, overrides getSpeed() and move() print)
        //      - DamageBoost (adds +N to damage, overrides getDamage() and attack() print)
        //      - GoldenAura (changes sprite, small buffs, logs aura on actions)
        // 3) Show composition:
        //      a) Base + SpeedBoost + DamageBoost
        //      b) Add GoldenAura (sprite change + buffs)
        //      c) Remove GoldenAura by recomposing (rebuild chain without it)
        //
        
        Character speedyStrong = new SpeedBoost(new DamageBoost(base, 5), 3);
        System.out.println("\n--- Speedy and Strong ---");
        speedyStrong.move();
        speedyStrong.attack();
        System.out.println("Speed: " + speedyStrong.getSpeed());

        Character goldenSpeedyStrong = new GoldenAura(speedyStrong);
        System.out.println("\n--- Golden, Speedy and Strong ---");
        goldenSpeedyStrong.move();
        goldenSpeedyStrong.attack();
        System.out.println("Sprite: " + goldenSpeedyStrong.getSprite());

        Character recomposed = new SpeedBoost(new DamageBoost(base, 5), 3);
        System.out.println("\n--- Re-composed (without Golden Aura) ---");
        recomposed.move();
        recomposed.attack();
        System.out.println("Sprite: " + recomposed.getSprite());

        
    }
}
