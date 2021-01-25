import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String args[]){
//        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
//        System.out.println(jo.toString());
        File file = new File("/Users/kamyardabiri/Desktop/num1.xml");
        try {
            Reader readfile = new FileReader(file);

            JSONPointer jsonPointer = new JSONPointer("/catalog/book");
//            JSONObject res = XML.toJSONObject(readfile, jsonPointer);

            JSONObject myjson = new JSONObject();
            myjson.put("SWE262P", "UCI");
            JSONObject res = XML.toJSONObject(readfile, jsonPointer, myjson);

            FileWriter newJsonFile = new FileWriter("res.json");
            newJsonFile.write(res.toString(4));
            newJsonFile.close();
        }
        catch (Exception e){
            System.out.println("Key path does not exist " + e.toString());
        }
    }
}
