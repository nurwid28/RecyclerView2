package id.sch.smktelkom_mlg.learn.recyclerview2.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Widya on 04-Nov-16.
 */

public class Hotel {

    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

}
