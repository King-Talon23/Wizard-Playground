package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Entity {
    private List<Spell> knownSpells = new ArrayList<>();


    public static final Map<Integer, Integer> levelMap = new HashMap<>();
    static {
        levelMap.put(1, 0);
        levelMap.put(2, 300);
        levelMap.put(3, 900);
        levelMap.put(4, 2700);
        levelMap.put(5, 6500);
        levelMap.put(6, 14000);
        levelMap.put(7, 23000);
        levelMap.put(8, 34000);
        levelMap.put(9, 48000);
        levelMap.put(10, 64000);
        levelMap.put(11, 85000);
        levelMap.put(12, 100000);
        levelMap.put(13, 120000);
        levelMap.put(14, 140000);
        levelMap.put(15, 165000);
        levelMap.put(16, 195000);
        levelMap.put(17, 225000);
        levelMap.put(18, 265000);
        levelMap.put(19, 305000);
        levelMap.put(20, 355000);
    }
    public Integer healPots;
    public Integer hp;
    public Integer critChance;
    public Integer level;
    public Integer kills;
    public Integer xp;
    public final String character;
    public Integer stamina;
    public Proficiency pyromancyProficiency;
    public Proficiency hydromancyProficiency;
    public Proficiency aeromancyProficiency;
    public Proficiency geomancyProficiency;
    public Proficiency blackMagicProficiency;
    public Proficiency whiteMagicProficiency;
    public Proficiency conjurationProficiency;
    public Proficiency illusionaryProficiency;
    public Proficiency draconicProficiency;
    public Proficiency natureProficiency;

    // public Integer chronomancy;
    // time manipulation, use it for gamey reasons for game resets

    public Entity(int hp, int healPots, int critChance, int stamina, int level,
                  int kills, int xp, String characterType) {
        this.hp = hp;
        this.healPots = healPots;
        this.critChance = critChance;
        this.stamina = stamina;
        this.level = level;
        this.kills = kills;
        this.xp = xp;
        this.character = characterType;
        this.pyromancyProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.hydromancyProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.aeromancyProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.geomancyProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.blackMagicProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.whiteMagicProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.conjurationProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.illusionaryProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.draconicProficiency = Proficiency.LIMITED_PROFICIENCY;
        this.natureProficiency = Proficiency.LIMITED_PROFICIENCY;
    }

    public void addXp(int xpToAdd) {
        this.xp += xpToAdd;
        while (true) {
            Integer nextLevelXp = levelMap.get(this.level + 1);
            if (nextLevelXp != null && this.xp >= nextLevelXp) {
                this.level++;
                System.out.printf("Congratulations! You've reached level %d.\n", this.level);
                updateGeneralAttributes();
            } else {
                break;
            }
        }
    }

    public void updateGeneralAttributes() {
        this.hp = 25 + (this.level * 10);
        // + 1 health pot every 4 levels
        this.healPots = 4 + (int) Math.floor(this.level / 4.0f);
        this.critChance = 5 + this.level;
        this.stamina = 50 + (this.level * 10);
    }

    public void updateDamageAttributes() {
    }

    public void learnSpell(Spell spell) {
        knownSpells.add(spell);
        System.out.printf("%s learns %s!%n", this.character, spell.getName());
    }

    public void castSpell(Spell spell, Entity target) {
        if (knownSpells.contains(spell)) {
            spell.castSpell(this, target);
        } else {
            System.out.printf("%s does not know the spell %s.%n", this.character, spell.getName());
        }
    }
}
