package org.example;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.util.Map;

public class Main {
    public static void main(String [] args) throws JsonProcessingException {

        //Serializacion:
        ObjectMapper objectMapper = new ObjectMapper();
        Producto prod = new Producto("Destornillador", 10,1.4f);
        Producto prodx = new Producto("Canada", 1, 5.0f);
        String jsonText = objectMapper.writeValueAsString(prod);

        //System.out.println(jsonText);


        //Parseo:
        String json = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";
        Producto prod2 = objectMapper.readValue(json,Producto.class);
        System.out.println(prod2);
        //Producto [nombre=Destornillador, stock=10, precio=1.4]

        //{"nombre":"Destornillador","stock":10,"precio":1.4}

        //Map
        String json2 = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";
        Map<String, Object> map = objectMapper.readValue(json2, new TypeReference<Map<String,Object>>(){});
        System.out.println(map);
        //{nombre=Destornillador, stock=10, precio=1.4}
    }

    public static void HacerAlgo()
    {
        System.out.println("Este es un sysosysysoysoyosoyosyosoyoy");
    }
}