package DomainClasses;

import java.util.ArrayList;
import java.util.Date;

public class Publication {
    private String user;
    private Date uploadDate;
    private int likes;
    private String publicationName; //sort by name
    ArrayList<String> hashtags; //add setters
    ArrayList<String> comments; //add setters

    //Constructors
    public Publication() {
    }

    public Publication(String user, Date uploadDate, int likes, String publicationName, ArrayList<String> hashtags, ArrayList<String> comments) {
        this.user = user;
        this.uploadDate = uploadDate;
        this.likes = likes;
        this.publicationName = publicationName;
        this.hashtags = hashtags;
        this.comments = comments;
    }

    //Getters
    public String getUser() {
        return user;
    }
    public Date getUploadDate() {
        return uploadDate;
    }
    public int getLikes() {
        return likes;
    }
    public String getPublicationName(){ return publicationName; }
    private String getHashtags(){
        if(hashtags != null)
            return hashtags.toString();
        else
            return "[]";
    }
    private String getComments(){
        if(comments != null)
            return comments.toString();
        else
            return "[]";
    }

    //toString
    public String toString(){
        //getHashtags(hashtags);
        return "User: "+user+
                " Upload Date: "+uploadDate+
                " Likes: "+likes+
                " Publication Name: "+ publicationName +
                " Hashtags: "+getHashtags()+
                " Comments: "+getComments();
    }
}

