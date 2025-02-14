// https://wizardrealm.com/wizards/types.html
// https://www.popoptiq.com/types-of-mages/
public class Characters {
    Entities player;
    Entities enemy;
    Entities assassin;
    Entities ninja;
    Entities monk;
    Entities blood_hunter;
    Entities true_nord;
    Entities paladin;
    Entities barbarian;
    Entities crusader;
    Entities pyromancer;
    Entities hydromancer;
    Entities necromancer;
    Entities druid;
    Entities black_mage;
    Entities warlock;
    Entities conjurer;
    Entities elementalist;
    Entities sorcerer;
    Entities rogue;

    private void setRogue() {
        rogue = new Entities(25 + (rogue.level * 10), 4 + rogue.level,
                15 + (rogue.level * 2), 3 + rogue.level,
                45  + rogue.level, 50 + rogue.level, 1,
                0, 0,
                "Rogue");
    }

    private void setAssassin() {
        assassin = new Entities(25 + (assassin.level * 10), 4 + ninja.level,
                15 + (assassin.level * 2), 3 + assassin.level,
                45  + assassin.level, 50 + assassin.level, 1,
                0, 0,
                "Assassin");
    }

    private void setNinja() {
        ninja = new Entities(25 + (ninja.level * 10), 4 + ninja.level,
                15 + (ninja.level * 2), 3 + ninja.level,
                45  + ninja.level, 50 + ninja.level, 1,
                0, 0,
                "Ninja");
    }

    private void setMonk() {
        monk = new Entities(40 + (monk.level * 10), 3 + monk.level,
                25 + (monk.level * 2), 5 + monk.level,
                25 + monk.level, 25 + monk.level, 1,
                0, 0,
                "Monk");
    }
    private void setBlooHunter() {
        blood_hunter = new Entities(40 + (blood_hunter.level * 10), 3 + blood_hunter.level,
                25 + (blood_hunter.level * 2), 5 + blood_hunter.level,
                25 + blood_hunter.level, 25 + blood_hunter.level, 1,
                0, 0,
                "Blood Hunter");

    }

    private void setTrueNord() {
        true_nord = new Entities(40 + (true_nord.level * 10), 3 + true_nord.level,
                25 + (true_nord.level * 2), 5 + true_nord.level,
                25 + true_nord.level, 25 + true_nord.level, 1,
                0, 0,
                "True Nord");
    }

    private void setPaladin() {
        paladin = new Entities(65 + (paladin.level * 10), 2 + paladin.level,
                35 + (paladin.level * 2), 15 + paladin.level,
                5 + paladin.level, 0 + paladin.level, 1,
                0, 0,
                "Paladin");
    }

    private void setBarbarian() {
        barbarian = new Entities(65 + (barbarian.level * 10), 2 + barbarian.level,
                35 + (barbarian.level * 2), 15 + barbarian.level,
                5 + barbarian.level, 0 + barbarian.level, 1,
                0, 0,
                "Barbarian");
    }

    private void setCrusader() {
        crusader = new Entities(65 + (crusader.level * 10), 2 + crusader.level,
                35 + (crusader.level * 2), 15 + crusader.level,
                5 + crusader.level, 0 + crusader.level, 1,
                0, 0,
                "Crusader");
    }

    private void setPyromancer() {

    }

    private void setNecromancer() {

    }

    private void setHydromancer() {

    }

    private void setDruid() {

    }

    private void setBlackmage() {

    }

    private void setWarlock() {

    }

    private void setConjurer() {

    }

    private void setElementalist() {

    }

    private void setSorcerer() {

    }
}

