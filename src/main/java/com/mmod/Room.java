package com.mmod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dimi on 27.11.2016.
 */
public class Room {
    // Room DB
    User creator;
    User room[];

    //Creates Array on creation
    public Room(int chair, User creator) {
        User room[] = new User[chair];
        this.creator = creator;
    }

    // Method for ANY user to take a seat at the specific seat
    public void takeSeat(int specificchair, User user){
        if(room[specificchair] != null){
            room[specificchair] = user;
        }
    }





}
