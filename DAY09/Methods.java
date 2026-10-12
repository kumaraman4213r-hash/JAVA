class Computer{
    public void playMusic(){
        System.out.println("Music playing");
    }
    public String getMeAPen(int cost){
        if(cost >= 10)
            return "pen";
        else
            return "Nothing";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();   
         String str =  obj.getMeAPen(5);
         System.out.println(str);
    }
    
}
