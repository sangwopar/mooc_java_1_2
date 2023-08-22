
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (elements.isEmpty()){
            return null;
        }
        String str = elements.get(0);
        int length = elements.get(0).length();
        
        for (String element : elements) {
            if (length < element.length()) {
                length = element.length();
                str = element;
            }
        }
        return str;

        // 더 간결하게 하는법
        // String returnElement = this.elements.get(0);
        
        // for(String element : elements){
        //     if(returnElement.length() < element.length()){
        //         returnElement = element;
        //     }
        // }
        
        // return returnElement;
    }

}
