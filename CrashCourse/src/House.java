
public class House {
    private final String firstVerse = "This is the house that Jack built.";
    private final String finalVerse = "that lay in the house that Jack built.";
    private final String[] actions = {"","ate", "killed", "worried", "tossed", "milked", "kissed", "married", "woke", "kept", "belonged"};
    private final String[] things = {"","malt", "rat", "cat", "dog", "cow with the crumpled horn", "maiden all forlorn", "man all tattered and torn",
            "priest all shaven and shorn", "rooster that crowed in the morn", "farmer sowing his corn", "horse and the hound and the horn"};


   public String verse(int row){
       StringBuilder res = new StringBuilder();
       for (int i = row; i > 0; i--){
           if (row == 1){
               res.append(firstVerse);
           }else{
               if (i == 1){
                   res.append(finalVerse);
                   break;
               }else if(i==row){
                   res.append("This is the " + things[i-1] + "\n");

               }else{
                   res.append("that " + actions[i-1] + " the " + things[i-1] + "\n");
               }
           }
       }

       return res.toString();
   }

   public String verse(int startVerse, int endVerse){
       StringBuilder res = new StringBuilder();
       for (int i = startVerse; i <= endVerse; i++){
           res.append(verse(i) + "\n");
       }

       return res.toString();
   }

   public String wholeRhyme(){
       return verse(12);

   }


    public static void main(String[] args) {

        House house = new House();
        //System.out.println(house.verse(12));
        //System.out.println(house.wholeRhyme());
        System.out.println(house.verse(4,8));

    }

}
