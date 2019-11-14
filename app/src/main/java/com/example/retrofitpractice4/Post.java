package com.example.retrofitpractice4;

import com.google.gson.annotations.SerializedName;

public class Post {
    /**
     * {
     *     "userId": 1,
     *     "id": 1,
     *     "title": "sunt aut facere repellat ~~~",
     *     "body": "quia et suscipit\nsuscipit ~~~"
     * },
     */

    int userId;
    int id;
    String title;
    @SerializedName("body")
    String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
