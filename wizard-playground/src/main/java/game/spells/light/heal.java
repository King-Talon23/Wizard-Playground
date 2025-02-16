package game.spells.light;

import game.Entity;
import game.Spell;

public class heal {
    public class NoviceHeal extends Spell {
        public NoviceHeal() {
            super("Heal", "Light", 0, 2);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 5; // Healing spell
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
    public class ApprenticeHeal extends Spell {
        public ApprenticeHeal() {
            super("Heal", "Light", 0, 4);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 10; // Healing spell
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
    public class AdeptHeal extends Spell {
        public AdeptHeal() {
            super("Heal", "Light", 0, 6);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 15; // Healing spell
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
    public class ExpertHeal extends Spell {
        public ExpertHeal() {
            super("Heal", "Light", 0, 8);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 20; // Healing spell
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
    public class MasterHeal extends Spell {
        public MasterHeal() {
            super("Heal", "Light", 0, 10);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 30; // Healing spell
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
}
