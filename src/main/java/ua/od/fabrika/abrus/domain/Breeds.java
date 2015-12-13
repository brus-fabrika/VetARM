package ua.od.fabrika.abrus.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Айси on 13.12.15.
 */
public class Breeds {
    private Map<String, Set<String>> breedList = new HashMap<>();

    public Set<String> getSpecies() {
        return breedList.keySet();
    }
}
