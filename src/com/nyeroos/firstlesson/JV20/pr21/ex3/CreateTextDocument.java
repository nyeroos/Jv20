package com.nyeroos.firstlesson.JV20.pr21.ex3;

import java.io.FileWriter;
import java.io.IOException;

public class CreateTextDocument {
    public CreateTextDocument() {
        try (FileWriter fileWriter = new FileWriter("newfile.txt", false)) {
            String str = "Информация, добавленная в текстовый документ";
            fileWriter.write(str);

        } catch (IOException e) {
            e.getMessage();
        }

    }
}
