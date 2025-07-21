
public class human 

{

    void speak
class Male implements human 
{
    public void speak() {
        System.out.println("I am a male human.");
    }
}

class Female implements human {
    public void speak() {
        System.out.println("I am a female human.");
    }
}

class Other implements human
 {
    public void speak() {
        System.out.println("I identify as other.");
    }
}


class humanfactory {
    public static Human getHuman(String type) {
        switch (type.toLowerCase()) {
            case "male": return new male();
            case "female ": return new female();
            case "other ": return new other();
            default: throw new IllegalArgumentException("Unknown human type: " + type);
        }
    }
}

public class human factory example {
    public static void main(String[] args) 
   
    {
        Human human1 = HumanFactory.getHuman("male");
        human1.speak();  

        human human2=humanfactory.gethuman("female");
        human2.speak();

    
    
}
}
}