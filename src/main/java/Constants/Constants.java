package Constants;

import com.google.gson.Gson;

import java.util.List;

public class Constants {

    public static String kToJson(Object list) {
       return new Gson().toJson(list);
    }
}
