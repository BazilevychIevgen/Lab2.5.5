package edu.brainacad;

/**
 * Created by Admin on 06.03.2016.
 */
public class InitTest {

    private int id;
    private static int nextId;

    static {
        nextId = (int)(100*Math.random());
    }

    {
        nextId ++;
        id = nextId;
    }

    public int getId() {
        return id;

    }
}