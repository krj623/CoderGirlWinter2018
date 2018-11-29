package MicroBlog;


public class Post {
    public static int nextPostNumber = 0;
    public int postNumber;
    public String post;
    public String postUrl;
    public String userName;


    public Post(String post, String postUrl, String userName) {
        this.postNumber = nextPostNumber;
        nextPostNumber++;
        this.post = post;
        this.postUrl = postUrl;
        this.userName = userName;

    }

}