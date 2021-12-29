package bai19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class demo {
    public static String getAccount(){
    Scanner sc = new Scanner(System.in);
    String account = "";
    while(true) {
        System.out.println(" input account: ");
        account= sc.nextLine();
        Pattern p = Pattern.compile("^[0-9]{10}$");
        if (p.matcher(account).find()){
            break;
        } else {
            System.out.println(" invalid account, please check again");
        }
    }
    return account;
}

    public static void main(String[] args) {
        String acc = getAccount();
        System.out.println("Account:" + acc);
    }
}

