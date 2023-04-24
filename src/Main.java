public class Main {
    public static void main(String[] args) {
String thisFishState = "Fish";
int thisFishSize = 1;
        System.out.println(thisFishSize + " is of size " + thisFishSize);
        while(!thisFishState.equals("FISH")){
            feed(thisFishState, thisFishSize);
        }
        System.out.println("It is now a big " + thisFishSize);
    }
    public static void feed(String state, int size) {
        size = size + 1;
        System.out.println("Fish fed");
        if (size == 5) {
            state = "FISH";
        }

    }

}class Animal{
private String state;
private int size;

    public Animal(String state, int size) {
        this.state = state;
        this.size = size;
    }
    public void feed(){
        size++;
        if(size == 5){
            state = "FISH";
        }
    }

    public String getState() {
        return state;
    }

    public int getSize() {
        return size;
    }
}
