package level1;

public class NumLength {
    public static int intLength(long decimal){
        int length = 0;

        if(decimal < 0){
            length++;
        }

        for (int i = 0; i < Math.log10(Math.abs(decimal)); i++){
            if (Math.abs(decimal)/Math.pow(10,i) > 0){
                length++;
            }
        }

        return length+1; //제출 후 수정 +1
    }

    public static void main(String[] args){
        System.out.println(intLength(-10));
    }
}
