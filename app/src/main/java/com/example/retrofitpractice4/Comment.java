package com.example.retrofitpractice4;

import com.google.gson.annotations.SerializedName;

public class Comment {
 /**
 * {
 *     "postId": 2,
 *     "id": 6,
 *     "name": "et fugit eligendi deleniti quidem qui sint nihil autem",
 *     "email": "Presley.Mueller@myrl.com",
 *     "body": "doloribus at sed quis culpa deserunt consectetur qui praesentium\naccusamus fugiat dicta\nvoluptatem rerum ut voluptate autem\nvoluptatem repellendus aspernatur dolorem in"
 *   },
 */

 private int postId;
 private int id;
 private String name;
 private String email;
 @SerializedName("body")
 private String text;

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
