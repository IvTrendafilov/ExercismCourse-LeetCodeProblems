import java.util.List;
import java.util.ArrayList;
class Robot{
    private String name;
    static List<String> list = new ArrayList<>();
    public Robot(){
        generateName();
    }

    void generateName(){
        this.name = "";
        this.name += (char) Math.floor(Math.random() * (26) + 65);
        this.name += (char) Math.floor(Math.random() * (26) + 65);
        this.name += (int) (Math.random() * 10);
        this.name += (int) (Math.random() * 10);
        this.name += (int) (Math.random() * 10);
        if(this.list.contains(this.name)){
            generateName();
        }else{
            this.list.add(this.name);
        }
    }
    String getName(){
        return this.name;
    }
    void reset(){
        this.list.remove(this.name);
        generateName();
    }
}
