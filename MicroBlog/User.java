package MicroBlog;


import java.util.ArrayList;
import java.util.Iterator;

//Defines what a user looks like
public class User {
    public String userName;
    public String picURL;
    public String fullName;
    public String email;
    ArrayList <Post> posts;

//    ArrayList<Post> posts = new ArrayList();

//    public add(Post p)  {
//        posts.add(p);

//Gives the appropriate format for a new user (must have this stuff)
    public User(String userName, String picURL, String fullName, String email) {
        this.userName = userName;
        this.picURL = picURL;
        this.fullName = fullName;
        this.email = email;
         posts = new ArrayList();

    }



    public String getUserProfile() {
        return  this.userName + "\n " + this.picURL + "\n" + this.fullName + "\n" + this.email;
    }

    public static void main(String[] args) {
        User krj623 = new User ("krj623", "www.krj623/pic", "Kat Johnson", "krj623@gmail.com");
        User logro = new User ("logro", "www.logro/pic", "Lauren Grotegeers", "logro@gmail.com");
        User bstubbs92 = new User("bstubbs", "www.bstubbs/pic", "Ben Stubbs", "bstubbs@gmail.com");

        ArrayList <String> posts = new ArrayList<String>();
        posts.add("This is my first status update.");
        posts.add("Hello world!");
        posts.add("Uuuuuugh this assignment is hard!");
        posts.add("Halp!");
        posts.add("At least the mountains were pretty.");

        Iterator iter = posts.iterator();
        while (iter.hasNext()) {
            String post = (String) iter.next();
            Post.nextPostNumber++;

            System.out.println("#" + Post.nextPostNumber + ": " + post);
        }

    }
}



//    public String getProfile()  {
//        return this.userName + "\n" + this.picURL + "\n" + this.fullName + "\n" + this.email;
//    }



