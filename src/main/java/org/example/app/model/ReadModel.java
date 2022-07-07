package org.example.app.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.item.Clothes;
import org.example.app.utils.Constants;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ReadModel {

    static List<Clothes> items = new ArrayList<>();


    public List<Clothes> ReadData() {

        try {

            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(Constants.BASE_PATH));

            items = gson.fromJson(reader,
                    new TypeToken<List<Clothes>>() {
                    }.getType());

            reader.close();
        } catch (Exception ex) {
            System.err.println("Oops-ss.....\nError");
            System.out.println(ex.getMessage());
        }
        return items;
    }


}
