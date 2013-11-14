package org.craftlib;

import java.util.Map;

/**
 * TODO: Maybe more of a specification than a design?  Well, both work.
 */
public interface Design {

    /**
     * @return the type of thing that this design specifies.
     */
    ThingType getThingType();

    /**
     * @return a new Project based on this Design.
     */
    Project createProject();

    /**
     * @return a copy of this design, for further modification.
     */
    Design copy();

    /**
     * @return a new thing specified by this design.
     */
    Thing create();

    /**
     * @return parameters provided by this type of design, which may be altered in some bounds.
     * TODO: Custom parameter class with bounds, could be a utility?
     */
    Map<String, Float> getParameters();

}
