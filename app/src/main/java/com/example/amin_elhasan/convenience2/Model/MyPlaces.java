package com.example.amin_elhasan.convenience2.Model;

/**
 * Created by Amin_Elhasan on 5/1/2018.
 */

public class MyPlaces
{
    private Results[] results;

    private String[] html_attributions;

    private String status;

    public Results[] getResults ()
    {
        return results;
    }

    public void setResults (Results[] results)
    {
        this.results = results;
    }

    public String[] getHtml_attributions ()
    {
        return html_attributions;
    }

    public void setHtml_attributions (String[] html_attributions)
    {
        this.html_attributions = html_attributions;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [results = "+results+", html_attributions = "+html_attributions+", status = "+status+"]";
    }
}
