package org.craftlib;

import java.util.List;
import java.util.Map;

/**
 * Data about an object in the simulation.
 */
public interface Thing {

    /**
     * @return the design that this thing is based on.
     */
    Design getDesign();

    /**
     * @return properties of this object, where they differ from the ones specified in the design.
     */
    Map<String, Float> getProperties();

    /**
     * @return functions provided by this thing.
     */
    List<Function> getFunctions();

    /**
     * @return modifications done to this thing, in the order they were applied.
     */
    List<Modification> getModifications();



}
