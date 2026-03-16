package com.example.v9t1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Note {
    private static int counter = 1;

    private int Id;
    private String title;
    private String content;
    private String timeAndDate;

    public Note(String title, String content) {
        this.Id = counter++;
        this.title = title;
        this.content = content;

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm d.M.yyyy", Locale.getDefault());
        this.timeAndDate = sdf.format(new Date());
    }
    public int getId() {
        return Id;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getTimeAndDate() {
        return timeAndDate;
    }
}