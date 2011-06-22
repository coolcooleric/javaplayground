public class ObjectsInBox {
	static int sumNum(int num) {
		if (num < 2) {
			return num & 1;
		}
		return (num & 1) + sumNum(num >> 1);
	}

	public static void main(String[] args) {
	  //put ten objects in ten different boxes
		int counter = 0,
		  	j = 0x7fe00;
		while(j >= 0x3ff){
			if(sumNum(j) == 10){
				counter++;
			}
			j--;
		}
		System.out.println("conter=" + counter);
	}
}
