package com.itheima.day11.buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jason on 2020/10/20 09:20
 */
public class BufferReaderSortDemo {

    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/resource/OutTeacherWatch.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day11/resource/poems.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.codePointAt(0) - o2.codePointAt(0);
                }
            });

            System.out.println(list);

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
            bufferedReader.close();
        }

    }
}
