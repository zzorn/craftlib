package org.craftlib;

import java.util.List;

/**
 *
 */
public interface Project {

    /**
     * @return the parts needed for this project.
     *
     */
    List<ThingRequirement> getMaterialRequirements();

    /**
     * @return the tasks that this project consists of.
     */
    List<Task> getTasks();

    /**
     * @return the resulting things created by this project
     */
    List<Thing> getResults();

}
