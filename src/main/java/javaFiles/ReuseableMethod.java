package javaFiles;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ReuseableMethod
{
    public static XmlPath rawToXml(Response r)
    {
        String res_x = r.asString();
        XmlPath xmlp = new XmlPath(res_x);
        return xmlp;
    }

    public static JsonPath rawToJson(Response r)
    {
        String res_j = r.asString();
        JsonPath jp = new JsonPath(res_j);
        return  jp;
    }
}
