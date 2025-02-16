package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Spell {
    private static final List<String> allowedElements = new ArrayList<>();
    static {
        allowedElements.add("fire");
        allowedElements.add("water");
        allowedElements.add("air");
        allowedElements.add("earth");
        allowedElements.add("dark");
        allowedElements.add("light");
        allowedElements.add("conjure");
        allowedElements.add("illusion");
        allowedElements.add("draconic");
        allowedElements.add("nature");
    }
    private String name;
    private String element;
    private int damage;
    private int cost;

    public Spell(String name, String element, int damage, int cost) {
        this.name = name;
        this.element = element;
        this.damage = damage;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        if (!allowedElements.contains(element.toLowerCase())){
            System.out.print("element error");
            return "";
        } else {
            return element;
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    public abstract void castSpell(Entity caster, Entity target);
}
