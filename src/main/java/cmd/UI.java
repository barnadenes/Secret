package cmd;

import api.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    private List<User> users;
    private Scanner reader;

    public UI() {
        this.users = new ArrayList<User>();
        this.reader = new Scanner(System.in);
    }

public void header() {
    System.out.println("==================");
    System.out.println(" Fridge Simulator ");
    System.out.println("==================");
    System.out.println();

}


public void information() {

}


}
