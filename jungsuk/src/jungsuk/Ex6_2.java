package jungsuk;

public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        toBinary(10);
    }
    
    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            
            toBinary(decimal);
            System.out.print(bin);
        }
        
        return 0;
    }
	}


