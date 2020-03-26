package com.boomaa.s3uploader;

import java.util.Arrays;
import java.util.Scanner;

public class UserDownload {
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("Must have credentials");
        } else {
            NEOAWS.create(args[0], args[1]);
        }

        if (args.length == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a filename (with extension) to upload");
            System.out.print(">> ");
            System.out.println(Arrays.toString(NEOAWS.AWS_EXECUTOR.uploadFile(sc.nextLine())));
            sc.close();
        } else {
            for (int i = 2;i < args.length;i++) {
                System.out.println(Arrays.toString(NEOAWS.AWS_EXECUTOR.uploadFile(args[i])));
            }
        }
    }
}
