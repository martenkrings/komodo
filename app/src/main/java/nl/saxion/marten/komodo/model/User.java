package nl.saxion.marten.komodo.model;

import java.util.Date;

/**
 * Created by fatahfattah on 18-05-16. 
 */

public class User {
    private static int user_id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int profilePicture; // profielfoto in integer zodat alleen de resource id wordt opgeslagen in het object 
    private String email;

    private String createdOn;
    private String lastOnline;

    private int totalKudos;
    private int totalComments;
    private int totalSubscriptions; // aantal threads die deze user volgt 
    private int createdThreads;

    public User() {
        user_id = user_id + 1; // user id verhoogt met 1 iedere keer dat een user object aangemaakt wordt 
        createdOn = new Date().toString();
    }
} 