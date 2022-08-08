public class Twofer {
    public String twofer(String name) {
        if(name.equals(null)){
            return "One for you, one for me.";
        }
        else{
            return "One for " + name + ", one for me.";
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
