import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean res = false;
        if (languages.size() == 0){
            res = true;
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the isEmpty() method");
    }

    public void addLanguage(String language) {
        if (!languages.contains(language)){
            this.languages.add(language);
        }
        //throw new UnsupportedOperationException("Please implement the addLanguage() method");
    }

    public void removeLanguage(String language) {

        if (languages.contains(language)){
            languages.remove(language);
        }

        //throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {

        return languages.get(0);
        //throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {

        return languages.size();
        //throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        boolean res = false;
        if (languages.contains(language)){
            res = true;
        }
        return res;
        //throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        boolean res = false;
        Iterator<String> lang = languages.iterator();
        while(lang.hasNext()){
            if(lang.next() == "Java" || lang.next() == "Kotlin"){
                return true;
            }

        }
        return false;
        //throw new UnsupportedOperationException("Please implement the isExciting() method");
    }

    public static void main(String[] args){
        LanguageList languageList = new LanguageList();
        System.out.println(languageList.isEmpty());
    }
}
