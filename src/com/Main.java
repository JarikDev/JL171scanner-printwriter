package com;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader=new BufferedReader(new FileReader("file.txt"));
//        BufferedWriter writer=new BufferedWriter(new FileWriter("file.txt"));
//        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("file.txt"));
//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("file.txt"));

//       try( Scanner scanner=new Scanner(new FileReader("file.txt"))){
//           while(scanner.hasNext()){
//               System.out.println(scanner.next());
//           }
//       }

        try( PrintWriter writer=new PrintWriter(new FileWriter("file.txt"))){writer.write("str1");writer.write("\n");writer.write("str2");}
//        Scanner scanner1=new Scanner(new FileInputStream("file.txt"));
//        PrintWriter bos=new PrintWriter(new FileOutputStream("file.txt"));







    }
}
