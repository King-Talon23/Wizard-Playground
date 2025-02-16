package game;

import static java.lang.StrictMath.round;


public class characters {
    public static class Pyromancer extends entity {
        public Pyromancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "pyromancer");
            updateGeneralAttributes(); // initialize base stats
            this.pyromancyProficiency = Proficiency.fullProficiency;
            this.draconicProficiency = Proficiency.halfProficiency;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }
    public entity setPyromancer() {
        return new Pyromancer(1);
    }

    private void setHydromancer() {

    }
    private void setAeromancer() {

    }
    private void setGeomancer() {

    }

    private void setDarkMage() {

    }
    private void setWhiteMage() {

    }

    private void setConjurer() {
    // familiars and whatnot
    }

    private void setIllusionist() {
    }

    private void setDraconicMage() {

    }

    private void setDruid() {

    }

}

