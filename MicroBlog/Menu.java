package MicroBlog;



import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu {



    public static void printMenu() {

        System.out.println("\nMain Menu\n" +
                "1) Create a new user\n" +
                "2) Become an existing user\n" +
                "3) Create a post as the current user\n" +
                "4) Print all posts\n" +
                "5) Print all users\n" +
                "6) Exit");
    }

    public static void main(String[] args) {
//        list of users stored here
//        will be an ordered list of users
        ArrayList<User> userList = new ArrayList();
        User defaultUser = new User("krj623", "www.krj623/pic", "Kat Johnson", "krj623@gmail.com");


            System.out.println();

        int menuOption;
        User currentUser= null;
//        loops through the menu each time the user chooses an option 1-5
        do {
            printMenu();
            if (currentUser==null)
            {
                System.out.println("What would you like to do?\n");
            }
            else {
                System.out.println("You are currently logged in as user " + currentUser.userName + ". What would you like to do?\n");
                 }

                Scanner keyboard = new Scanner(System.in);
                menuOption = keyboard.nextInt();
                keyboard.skip("\n");


            if (menuOption == 1)
//"if the user asks to create a new user, ask for the fields that make up the user (typed in from the keyboard) and create a new user instance from that
            {
                System.out.println("Creating a new user? Please answer the questions below:");
                 System.out.println();
                System.out.print("Enter user name: ");
                String userName = keyboard.nextLine();
                System.out.print("Picture URL: ");
                String picURL = keyboard.nextLine();
                System.out.print("Full name: ");
                String fullName = keyboard.nextLine();
                System.out.print("E-mail address: ");
                String email = keyboard.nextLine();
//creates new user instance from keyboard inputs
                User newUser = new User(userName, picURL, fullName, email);
                currentUser = newUser;
                System.out.println(fullName + " has been successfully registered as a new user! What would you like to do next?");
//                    adds new userName to ArrayList
                userList.add(newUser);
                System.out.println();
            }

            if (menuOption == 2) {
                System.out.println("Select user from options below:");
                System.out.println();

                if(currentUser==null)   {
                    System.out.println("Oops! Nobody has registered yet. Select Option 1 from the main menu to setup a profile.");
                }

                else {
                    for (int i = 0; i < userList.size(); i++) {


                        System.out.println((i + 1) + ". Username: " + userList.get(i).userName);

                    }
                    currentUser = userList.get(keyboard.nextInt() - 1);
                }


            }

            if (menuOption == 3) {
//                need to print last post of currentUser
                if (currentUser == null)
                {   currentUser = defaultUser;
                    System.out.println("Oops! You must setup an account before you can create a blog post. Come back when you have an account.");
                }
                 if (currentUser.posts.size() > 0)
                {
//                    if the user has posts, print the last post
                    System.out.println("Your last post was: " + currentUser.posts.get(currentUser.posts.size()-1).post);
                    System.out.println("What's on your mind today?");
                    currentUser.posts.add(new Post (keyboard.nextLine(),"", currentUser.userName));
                    System.out.println("Success! Posted to News Feed. \n What would you like to do next? \n");

                }
                 if (currentUser !=defaultUser || currentUser.posts.size() < 0) {

                     System.out.println("What's on your mind today?");
                     currentUser.posts.add(new Post(keyboard.nextLine(), "", currentUser.userName));
                     System.out.println("Success! Posted to News Feed. \n What would you like to do next? \n");
                 }
//
            }

            if (menuOption == 4) {
                System.out.println("News Feed: ");



                for (int i = 0; i < userList.size(); i++) {
//                    iterate through lists of users, then for each user, iterate through the lists of posts made by that user
                    for (int p = 0; p < userList.get(i).posts.size(); p++) {
//                        prints username, gets specific user (i) from the array list with posts.
//                        Posts is the variable that is an array list of posts, p is the actual posts, .post is the string of the post
                        System.out.println(userList.get(i).userName + ": " + userList.get(i).posts.get(p).post);

                    }
                }
            }


//                Iterator iter = User.posts.iterator();
//                while (iter.hasNext()) {
//                    String post = (String) iter.next();
//                    Post.nextPostNumber++;
//
//                    System.out.println("#" + Post.nextPostNumber + ": " + post);
//                }


            if (menuOption == 5) {
                System.out.println("User Profiles:");
                for (int i = 0; i < userList.size(); i++) {



                    System.out.println("Username: "+ userList.get(i).userName);
                    System.out.println("Profile Pic: "+ userList.get(i).picURL);
                    System.out.println("Name: "+ userList.get(i).fullName);
                    System.out.println("E-mail: " + userList.get(i).email);
                    System.out.println();

                }
                System.out.println();

            }


        }  while (menuOption <=5) ;

        }


    }


