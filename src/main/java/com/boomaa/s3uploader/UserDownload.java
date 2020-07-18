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

        boolean remove = false;
        if (!args[2].contains("true") && !args[2].contains("false")) {
            if (args[2].equalsIgnoreCase("remove")) {
                remove = true;
            } else {
                throw new IllegalArgumentException("Must contain an registration parameter");
            }
        }
        if (args.length == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a filename (with extension) to upload");
            System.out.print(">> ");
            System.out.println(Arrays.toString(!remove ? NEOAWS.AWS_EXECUTOR.uploadFile(sc.nextLine(), Boolean.parseBoolean(args[2])) : NEOAWS.AWS_EXECUTOR.remove(sc.nextLine())));
            sc.close();
        } else {
            for (int i = 3; i < args.length; i++) {
                System.out.println(Arrays.toString(!remove ? NEOAWS.AWS_EXECUTOR.uploadFile(args[i], Boolean.parseBoolean(args[2])) : NEOAWS.AWS_EXECUTOR.remove(args[i])));
            }
        }
    }
}
