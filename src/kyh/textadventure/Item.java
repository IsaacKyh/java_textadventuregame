package kyh.textadventure;

// Basic itemclass for textadventure game.
// All items will be of this type, or derived from type.
public class Item {
    protected String type;              // what object is it (e.g. name/title/something else.)
    protected String description;       // description of object


    // Constructor that create the item and sets type and description of item.
    public Item(String inType, String inDescription){
        type = inType;
        description = inDescription;
    }


    public String getType(){
        return type;
    }

    public String getDescription(){
        return  description;
    }


    // return a string representation of the item.
    @Override
    public String toString(){
        String itemDescription = type;
        itemDescription = itemDescription + "\n";
        itemDescription = itemDescription + description;
        return itemDescription;
    }
}
