import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class B_JsonArrayPractice {

    public static void main(String[] args) throws ParseException {
        B_JsonArrayPractice practice = new B_JsonArrayPractice();
    }

    public B_JsonArrayPractice() throws ParseException {

        //information for api coming from string
        String s = "{\"name\":\"Darth Vader\",\"height\":\"202\",\"mass\":\"136\",\"hair_color\":\"none\",\"skin_color\":\"white\",\"eye_color\":\"yellow\",\"birth_year\":\"41.9BBY\",\"gender\":\"male\",\"homeworld\":\"https://swapi.dev/api/planets/1/\",\"films\":[\"https://swapi.dev/api/films/1/\",\"https://swapi.dev/api/films/2/\",\"https://swapi.dev/api/films/3/\",\"https://swapi.dev/api/films/6/\"],\"species\":[],\"vehicles\":[],\"starships\":[\"https://swapi.dev/api/starships/13/\"],\"created\":\"2014-12-10T15:18:20.704000Z\",\"edited\":\"2014-12-20T21:17:50.313000Z\",\"url\":\"https://swapi.dev/api/people/4/\"}\n";

        //initializing a JSON parser called parser
        JSONParser parser = new JSONParser();

        //making a json object to parse the previous line
        JSONObject json = (JSONObject) (parser.parse(s));

        System.out.println("String format: " + s);
        System.out.println("JSON format: " + json);

        // get a single value out of the json
        String height = (String) json.get("height");
        System.out.println("HEIGHT: " + height);

        // get a json array out of the json
        //filmsArray is a  json array, value for films is saved as a JSONArray
        JSONArray filmsArray = (JSONArray) json.get("films");
        int n = filmsArray.size();
        System.out.println("FILMS: ");
        for (int i = 0; i < n; i++) {
            String film = (String) filmsArray.get(i);
            System.out.println(film);
        }

        //check to see if there is a key called starships

        if (json.containsKey("starships")){
            System.out.println("Yes there are starships in this JSON object");
        }
        //now use our array skills to print the starships

        JSONArray starshipsArray = (JSONArray) json.get("starships");
        int m = starshipsArray.size();
        System.out.println("StarShips: ");
        for (int i = 0; i < m; i++) {
            String ship = (String) filmsArray.get(i);
            System.out.println(ship);
        }
    } // end of constructor
}
