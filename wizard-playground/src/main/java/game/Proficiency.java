package game;

import java.util.HashMap;
import java.util.Map;

public enum Proficiency {
    NEGATIVE_PROFICIENCY, // really bad
    NO_PROFICIENCY, // bad
    LIMITED_PROFICIENCY, // neutral
    HALF_PROFICIENCY, // good
    FULL_PROFICIENCY; // really good

    public static final Map<Proficiency, Double> proficiencyMultMap = new HashMap<>();
    static {
        proficiencyMultMap.put(NEGATIVE_PROFICIENCY, 0.5);
        proficiencyMultMap.put(NO_PROFICIENCY, 0.75);
        proficiencyMultMap.put(LIMITED_PROFICIENCY, 1.0);
        proficiencyMultMap.put(HALF_PROFICIENCY, 1.25);
        proficiencyMultMap.put(FULL_PROFICIENCY, 1.5);
    }
}

