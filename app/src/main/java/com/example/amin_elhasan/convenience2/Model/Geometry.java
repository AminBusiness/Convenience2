package com.example.amin_elhasan.convenience2.Model;


/**
 * Created by Amin_Elhasan on 5/1/2018.
 */

public class Geometry
{
    private Viewport viewport;

    private Location location;

    public Viewport getViewport ()
    {
        return viewport;
    }

    public void setViewport (Viewport viewport)
    {
        this.viewport = viewport;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [viewport = "+viewport+", location = "+location+"]";
    }
}
