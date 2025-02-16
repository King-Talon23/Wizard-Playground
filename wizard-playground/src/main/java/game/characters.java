package game;

import static java.lang.StrictMath.round;


public class characters {
    public static class Pyromancer extends Entity {
        public Pyromancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Pyromancer");
            updateGeneralAttributes(); // initialize base stats
            this.pyromancyProficiency = Proficiency.FULL_PROFICIENCY;
            this.draconicProficiency = Proficiency.HALF_PROFICIENCY;
            this.geomancyProficiency = Proficiency.NO_PROFICIENCY;
            this.hydromancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setPyromancer() {
        return new Pyromancer(1);
    }

    public static class Hydromancer extends Entity {
        public Hydromancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Hydromancer");
            updateGeneralAttributes(); // initialize base stats
            this.hydromancyProficiency = Proficiency.FULL_PROFICIENCY;
            this.natureProficiency = Proficiency.HALF_PROFICIENCY;
            this.draconicProficiency = Proficiency.NO_PROFICIENCY;
            this.pyromancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setHydromancer() {
        return new Hydromancer(1);
    }

    public static class Aeromancer extends Entity {
        public Aeromancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Aeromancer");
            updateGeneralAttributes(); // initialize base stats
            this.aeromancyProficiency = Proficiency.FULL_PROFICIENCY;
            this.pyromancyProficiency = Proficiency.HALF_PROFICIENCY;
            this.hydromancyProficiency = Proficiency.NO_PROFICIENCY;
            this.geomancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setAeromancer() {
        return new Aeromancer(1);
    }

    public static class Geomancer extends Entity {
        public Geomancer(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Geomancer");
            updateGeneralAttributes(); // initialize base stats
            this.geomancyProficiency = Proficiency.FULL_PROFICIENCY;
            this.natureProficiency = Proficiency.HALF_PROFICIENCY;
            this.hydromancyProficiency = Proficiency.NO_PROFICIENCY;
            this.aeromancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setGeomancer() {
        return new Geomancer(1);
    }

    public static class DarkMage extends Entity {
        public DarkMage(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Dark Mage");
            updateGeneralAttributes(); // initialize base stats
            this.blackMagicProficiency = Proficiency.FULL_PROFICIENCY;
            this.illusionaryProficiency = Proficiency.HALF_PROFICIENCY;
            this.conjurationProficiency = Proficiency.NO_PROFICIENCY;
            this.whiteMagicProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setDarkMage() {
        return new DarkMage(1);
    }

    public static class WhiteMage extends Entity {
        public WhiteMage(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "White Mage");
            updateGeneralAttributes(); // initialize base stats
            this.whiteMagicProficiency = Proficiency.FULL_PROFICIENCY;
            this.conjurationProficiency = Proficiency.HALF_PROFICIENCY;
            this.illusionaryProficiency = Proficiency.NO_PROFICIENCY;
            this.blackMagicProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }

    public Entity setWhiteMage() {
        return new WhiteMage(1);
    }

    private void setConjurer() {
    }

    private void setIllusionist() {
    }

    public static class Draconic extends Entity {
        public Draconic(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Draconic Mage");
            updateGeneralAttributes(); // initialize base stats
            this.draconicProficiency = Proficiency.FULL_PROFICIENCY;
            this.pyromancyProficiency = Proficiency.HALF_PROFICIENCY;
            this.natureProficiency = Proficiency.NO_PROFICIENCY;
            this.hydromancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }
    public Entity setDraconic() {
        return new Draconic(1);
    }

    public static class Druid extends Entity {
        public Druid(int level) {
            super(0, 0, 0, 0, 0, 0,
                levelMap.get(level), "Druid");
            updateGeneralAttributes(); // initialize base stats
            this.natureProficiency = Proficiency.FULL_PROFICIENCY;
            this.geomancyProficiency = Proficiency.HALF_PROFICIENCY;
            this.draconicProficiency = Proficiency.NO_PROFICIENCY;
            this.pyromancyProficiency = Proficiency.NEGATIVE_PROFICIENCY;
        }

        @Override
        public void updateDamageAttributes() {
            this.hp += 1;
        }
    }
    public Entity setDruid() {
        return new Druid(1);
    }

}

