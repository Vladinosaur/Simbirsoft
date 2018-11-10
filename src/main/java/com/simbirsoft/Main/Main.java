package com.simbirsoft.Main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        try {
            BufferedReader br = new BufferedReader(new FileReader("File.properties"));
            String[] data = new String[11];
            for (int i = 0; i < 11; i++) {
                data[i] = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"));

            for (int i = 0; i < 11; i++) {
               data[i] = data[i].substring(data[i].indexOf('=') + 1);
            }

                bw.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "\t<title>Резюме</title>\n" +
                        "\t<style type=\"text/css\">\n" +
                        "\t\t.col1{\n" +
                        "\t\t\tdisplay: inline-block;\n" +
                        "\t\t\tmargin-left: 5%;\n" +
                        "\t\t}\n" +
                        "\t\t.col{\n" +
                        "\t\t\tdisplay: inline-block;\n" +
                        "\t\t\tmargin-left: 30%;\n" +
                        "\t\t}\n" +
                        "\t\t.col3{\n" +
                        "\t\t\tmargin-top: 10px;\n" +
                        "\t\t}\n" +
                        "\t</style>\n" +
                        "</head>\n" +
                        "\t<body>\n" +
                        "\t\t<h1 align=\"center\">Резюме</h1><br>\n" +
                        "\t\t<p align=\"center\">На должность Java-стажёр</p><br>\n" +
                        "\t\t<div class=\"col1\">\n" +
                        "\t\t\t<p align=\"left\">\n" +
                        "\t\t\t\t" + data[0] + "<br>\n" +
                        "\t\t\t\t" + data[1] + "<br>\n" +
                        "\t\t\t\t" + data[2] + "<br>\n" +
                        "\t\t\t\t" + data[3] + "<br>\n" +
                        "\t\t\t\t\n" +
                        "\t\t\t</p>\n" +
                        "\t\t</div>\n" +
                        "\t\t<div class=\"col\">\n" +
                        "\t\t\t<img src=" + data[4] + " align=\"right\" height=\"200\" width=\"300\">\n" +
                        "\t\t</div>\n" +
                        "\n" +
                        "<div>\n" +
                        "\t\t\t<b>Цель:</b><br>\n" +
                        "\t\t\t<p>" + data[5] + "</p>\n" +
                        "\t\t\t<b>Опыт:</b><br>\n" +
                        "\t\t\t<p>" + data[6] + "</p>\n" +
                        "\t\t\t<b>Образование:</b><br>\n" +
                        "\t\t\t<p>" + data[7] + "</p>\n" +
                        "\t\t\t<b>Доп. образование. курсы:</b><br>\n" +
                        "\t\t\t<p>" + data[8] + "</p>\n" +
                        "\t\t\t<b>Навыки:</b><br>\n" +
                        "\t\t\t<p>" + data[9] + "</p>\n" +
                        "\t\t\t<b>Пример кода:</b><br>\n" +
                        "\t\t\t<p>" + data[10] + "</p>\n" +
                        "\t\t</div>\n" +
                        "\t</body>\n" +
                        "</html>");
                bw.flush();

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
