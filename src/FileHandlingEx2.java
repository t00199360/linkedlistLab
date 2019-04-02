import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class FileHandlingEx2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        int i = 1;
        Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Integer> pair = (Map.Entry<String,Integer>) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }


        String fileName = "C:\\Users\\t00199360\\Desktop\\hamlet.txt";

        Set<String> tree = new TreeSet<String>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9_]+");
                while (lineParser.hasNext()) {
                    String identifier = lineParser.next();
                    tree.add(identifier);
                   // System.out.println( identifier);
                }

            }
            Iterator<String> treeIter = tree.iterator();


           /* for()*/

            while (treeIter.hasNext())
            {
                map.put(treeIter.next(),i);
                i++;
            }
            System.out.println(map);

            //System.out.println("TreeSet: " + tree);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
