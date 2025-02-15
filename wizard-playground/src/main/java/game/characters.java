package game;

import java.util.HashMap;
import java.util.Map;
import game.entity.*;

// https://wizardrealm.com/wizards/types.html
// https://www.popoptiq.com/types-of-mages/
public class characters {
    public static class Pyromancer extends entity {
        public Pyromancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), 0, 0, "pyromancer");
            updateAttributes();
        }

        @Override
        public void updateAttributes() {
            this.hp = 25 + (this.level * 10);
            this.healPots = 4 + this.level;
            this.maxDamage = 15 + (this.level * 2);
            this.minDamage = 3 + this.level;
            this.critChance = 45 + this.level;
            this.stamina = 50 + this.level;
        }
    }
    public entity setPyromancer() {
        return new Pyromancer(1);
    }

    private void setHydromancer() {

    }
    private void setAreomancer() {

    }
    private void setGeomancer() {

    }

    private void setNecromancer() {

    }

    private void setFerromancer() {
        //metals and shi
    }

    private void setBiomancer() {
        //life or sum
    }

    private void setGifted() {
    // gifted powers from a god?
    }

    private void setConjurer() {
    // familiars and whatnot
    }

}

