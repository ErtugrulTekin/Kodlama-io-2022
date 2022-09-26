package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int aranacak = 8;
		boolean varMi = false;
		
		for(int number:numbers) {
			if(number==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut degildir");
		}

	}

}
