package NetTester;
import  org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Net {

    public static void main(String[] args) throws IOException {
        Json1();
       //Json2();


    }

    private static void Json2() throws IOException {
        URL url= new URL("http://www.kh.edu.tw/json/schools");
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        InputStream is=conn.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String  line=br.readLine();
        StringBuilder json=new StringBuilder();
        while (line!=null){

            //System.out.println(line);
            json.append(line);
            line=br.readLine();

        }
        System.out.println(json.toString());
        JSONObject j=new JSONObject(json.toString());
        Object jsob=j.getJSONObject("schools").get("SchoolName");
        System.out.println(jsob );
    }

    private static void Json1() {
        ArrayList al=new ArrayList();
        //String str="{\"Data\":{\"Name\":\"MichaelChan\",\"Email\":\"XXXX@XXX.com\",\"Phone\":[1234567,0911123456]}}";
        String str1="{\"schools\":{\"schoolId\":\"124X9J\",\"degree\":1,\"dist\":107,\"schoolName\":\"鳥松幼兒園\"},{\"schoolId\":\"124X9I\",\"degree\":1,\"dist\":105,\"schoolName\":\"仁武幼兒園\"}}";
                //"]}}";
        JSONObject j;
        j=new JSONObject(str1);
        Object jsob=j.getJSONObject("schools").get("schoolId");
        Object jsob1=j.getJSONObject("schools").get("dist");
        Object jsob2=j.getJSONObject("schools").get("schoolName");
        System.out.println(jsob2);
//        al.add(jsob);
//        al.add(jsob1);
//        al.add(jsob2);

//        for (int i = 0; i <al.size() ; i++) {
//            System.out.println(al.get(i));
//
//        }
    }
}
