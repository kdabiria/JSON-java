import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Test {
    public static void main(String args[]){
//        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
//        System.out.println(jo.toString());
        File file = new File("num2.xml");
        try {
            Reader readfile = new FileReader(file);

//            JSONPointer jsonPointer = new JSONPointer("/catalog/book/2");
//            JSONObject res = XML.toJSONObject(readfile, jsonPointer);

//            JSONObject myjson = new JSONObject();
//            myjson.put("SWE262P", "UCI");
//            JSONObject res2 = XML.toJSONObject(readfile, jsonPointer, myjson);

//            FileWriter newJsonFile = new FileWriter("res.json");
//            newJsonFile.write(res.toString(4));
//            newJsonFile.close();

            //milstone 3
//            Function<String, String> temp = a -> ("SWE262P_" + a);
//            JSONObject res2 = XML.toJSONObject(readfile, temp);
//
//            FileWriter newJsonFile2 = new FileWriter("res2.json");
//            newJsonFile2.write(res2.toString(4));
//            newJsonFile2.close();
        }
        catch (Exception e){
            System.out.println("Key path does not exist " + e.toString());
        }
    }
}
