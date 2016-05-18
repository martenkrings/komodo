package nl.saxion.marten.komodo.model;

import java.util.List;

/**
 * Created by fatahfattah on 18-05-16.
 */

public class Section {
    private int section_id;
    private String name;

    private int totalThreads;
    private int unseenThreads; // counter om bij te houden hoeveel threads er nog niet bekeken zijn

    private List<Thread> threads;
}
