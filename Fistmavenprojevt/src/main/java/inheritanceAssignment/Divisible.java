package inheritanceAssignment;

public class Divisible extends Add {
	public int add() {
        int result = super.add();
      
        if (result % 10 == 0) {
            System.out.println("The addition result is divisible by 10");
        } else {
            System.out.println("The addition result is not divisible by 10");
        }
        return result;
    }



    public static void main(String[] args) {
        Divisible obj = new Divisible();
        int result = obj.add();
        System.out.println("The result of addition is " + result);
    }
}