import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonExport {

    //Vytvoření instance Gson pro serializaci objektů do JSON
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //Metoda pro export seznamu objektů do souboru JSON
    public static void exportToJson(String filePath, List<Priklady> priklady) throws IOException {
        //Vytvoření instance FileWriter pro zápis do souboru

        try (FileWriter writer = new FileWriter(filePath)) {
            //Použití Gson k převedení seznamu objektů do JSON a zápis do souboru
            //tato metoda dokaze prevest pole bez for cyklu
            //Gson si sám poradí s tím, jak serializovat každý objekt v seznamu do formátu JSON a uložit je do daného
            gson.toJson(priklady, writer);
        }
    }
}