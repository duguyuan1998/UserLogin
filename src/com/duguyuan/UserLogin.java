package com.duguyuan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogin {

    public static final String SUCCESS = "登录成功";
    public static final String FAILURE = "您输入的账号或密码不正确";

    public static Map<String, String> getUsersInfo() {
        Map<String, String> users = new HashMap<String, String>();
        users.put("admin", "admin@123");
        users.put("guess", "123456");
        users.put("my", "my_666");
        return users;
    }

    public static String login(String username, String password) {
        Map<String, String> users = getUsersInfo();
        for (Map.Entry<String, String> user: users.entrySet()) {
            if (user.getKey().equals(username) && user.getValue().equals(password)) {
                return SUCCESS;
            }
        }
        return FAILURE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入账号：");
        String username = in.nextLine();
        System.out.print("请输入密码：");
        String password = in.nextLine();
        System.out.println(login(username, password));
        in.close();
    }
}
