
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class HrabiaMonteChristo {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/crsto10.txt"));
        System.out.println(lines.size());
        System.out.println(lines.get(100));

        HrabiaMonteChristo hrabiaMonteChristo = new HrabiaMonteChristo();
        System.out.println(hrabiaMonteChristo.numberOfElementsList(lines));
        hrabiaMonteChristo.every100Lines(lines);
        hrabiaMonteChristo.theLongestLine(lines);

    }

    public int numberOfElementsList (List elementsNumber){
        return elementsNumber.size();
    }

    public void every100Lines (List line){

        for (int i = 0; i<line.size(); i=i+100){
            System.out.println(line.get(i));
            }

    }

    public int theLongestLine (List longLine){

        int current = 0;
        for (int i = 0; i<longLine.size(); i++){
            if (current<((String)longLine.get(i)).length()){
                current=i;
            }
        }
        System.out.println("Index najdłuższego wersu: " + current);
        System.out.println(longLine.get(current));
        return current;
    }
}


