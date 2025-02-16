package game.spells.dark;

import game.Entity;
import game.Spell;

public class vampirism {
    public class NoviceVampism extends Spell {
        public NoviceVampism() {
            super("Heal", "Dark", 5, 2);
        }

        @Override
        public void castSpell(Entity caster, Entity target) {
            caster.hp += 2; // Healing spell
            target.hp -= getDamage();
            caster.stamina -= getCost();
            System.out.printf("%s casts %s! %s heals for 30 hp.%n", caster.character, this.getName(), target.character);
        }
    }
}
