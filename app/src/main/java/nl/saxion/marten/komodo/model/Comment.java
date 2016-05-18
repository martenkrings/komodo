package nl.saxion.marten.komodo.model;

import java.util.Date;

/**
 * Created by Gebruiker on 5/18/2016.
 */

public class Comment {
    private int comment_id;
    private String text;
    private String createdOn;
    private User author; // Door wie
    private Thread inThread; // In welke thread
    private int totalKudos;

    public Comment() {
        comment_id = comment_id + 1; // comment id verhoogt met 1 iedere keer dat een comment object aangemaakt wordt
        createdOn = new Date().toString();
    }
}
