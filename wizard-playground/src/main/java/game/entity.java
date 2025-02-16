package game;

import java.util.HashMap;
import java.util.Map;

public abstract class entity {
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






    public entity(int hp, int healPots, int critChance, int stamina, int level,
                  int kills, int xp, String characterType) {
        this.hp = hp;
        this.healPots = healPots;
        this.critChance = critChance;
        this.stamina = stamina;
        this.level = level;
        this.kills = kills;
        this.xp = xp;
        this.character = characterType;
        this.pyromancyProficiency = Proficiency.noProficiency;
        this.hydromancyProficiency = Proficiency.noProficiency;
        this.aeromancyProficiency = Proficiency.noProficiency;
        this.geomancyProficiency = Proficiency.noProficiency;
        this.blackMagicProficiency = Proficiency.noProficiency;
        this.whiteMagicProficiency = Proficiency.noProficiency;
        this.conjurationProficiency = Proficiency.noProficiency;
        this.illusionaryProficiency = Proficiency.noProficiency;
        this.draconicProficiency = Proficiency.noProficiency;
        this.natureProficiency = Proficiency.noProficiency;
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
}
