
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola a todos");
		int sum1 = 8, sum2 = 0, res = 0;
		res = sum1 + sum2;
		System.out.println(res);
		double a = 3, b  = 90, c = 1;
		
		//chicharronera
		double x1 = (-b)+(Math.sqrt(((Math.pow(b, 2)-(4*a*c)))/(2*a))); 
		double x2 = (-b)-(Math.sqrt(((Math.pow(b, 2)-(4*a*c)))/(2*a))); 
		System.out.println(x1);
		System.out.println(x2);
		String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio = 3;
		
		String palabra = "parangaricutirimicuaro";
		for(int i = 0; i < palabra.length(); i++){
			//System.out.println(palabra.charAt(i));
			palabra = palabra.replace(palabra.charAt(i), abecedario.charAt(i + espacio));
		}
		System.out.println(palabra.length());
		System.out.println(palabra.substring(2, 4));
		
		///////// ARRAYAS
		
		String[] meses = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		String[] semana = {"mon", "tue", "wend", "thu", "fri", "sat", "sun"};
		
		System.out.println(meses[0]+" "+meses[10]+" "+meses[6]+" "+meses[11]+" "+meses[2]);
		System.out.println(semana[0]+" "+semana[4]+" "+semana[1]);
		
		boolean bool1 = true;
		boolean bool2 = false;
		if(bool1 == bool2){
			System.out.println("YEs");
		}
		else if(bool1 != !bool2){
			System.out.println("nain");
		}
		else if(!bool1 == bool2){
			System.out.println("Ni modo");
		}
	}

}
