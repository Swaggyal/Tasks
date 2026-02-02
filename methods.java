public class methods {
    public void printName(){
        System.out.println("Bobo loves Haribo!<3");
    }

    public int add(int a, int b){
        return a + b;
    }

public static void main(String[] args){
    // Create an instance of the Method class
    methods obj = new methods();
    obj.printName();
    int x = 15;
    int y = 20;
    System.out.print("The sum is: "+ obj.add(x,y));
}
}