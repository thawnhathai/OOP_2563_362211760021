package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner phone = new Scanner(System.in);
        Scanner email = new Scanner(System.in);

        System.out.print("ชื่อ-สกุล");
        String l_name = name.nextLine();


        System.out.print("รหัสนักศึกษา");
        String l_id = id.nextLine();


        System.out.print("อายุ");
        int l_age = age.nextInt();


        System.out.print("เบอร์โทร");
        String l_phone = phone.nextLine();


        System.out.print("อีเมลล์");
        String l_email = email.nextLine();
    }
}