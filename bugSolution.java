public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Alternative way to access array safely
        try{
            int index = 5; //Example of unsafe access attempt
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}