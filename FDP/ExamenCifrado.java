import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamenCifrado {

	public static void main(String[] args) throws IOException {
	
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("introduce una cantidad entera de 4 digitos para cifrarla: ");
		String entr = entrada.readLine();
		
		char a = 0;
		char b = 0;
		char c = 0;
		char d = 0;
		String OutPut = "";
		
		int dig0 = (int) entr.charAt(0)-48;
		int dig0p1 = (dig0+7)%10;
		//System.out.println(dig0p1);
		
		int dig1 = (int) entr.charAt(1)-48;
		int dig1p1 = (dig1+7)%10;
		//System.out.println(dig1p1);
		
		int dig2 = (int) entr.charAt(2)-48;
		int dig2p1 = (dig2+7)%10;
		//System.out.println(dig2p1);
		
		int dig3 = (int) entr.charAt(3)-48;
		int dig3p1 = (dig3+7)%10;
		//System.out.println(dig3p1);
		
		if(dig0p1 == 1) {
			a = 'A';
		}else if(dig0p1 == 2) {
			a = 'E';
		}else if(dig0p1 == 3) {
			a = 'I';
		}else if(dig0p1 == 4) {
			a = 'O';
		}else if(dig0p1 == 5) {
			a = 'U';
		}
		if(dig1p1 == 1) {
			b = 'A';
		}else if(dig1p1 == 2) {
			b = 'E';
		}else if(dig1p1 == 3) {
			b = 'I';
		}else if(dig1p1 == 4) {
			b = 'O';
		}else if(dig1p1 == 5) {
			b = 'U';
		}
		if(dig2p1 == 1) {
			c = 'A';
		}else if(dig2p1 == 2) {
			c = 'E';
		}else if(dig2p1 == 3) {
			c = 'I';
		}else if(dig2p1 == 4) {
			c = 'O';
		}else if(dig2p1 == 5) {
			c = 'U';
		}
		if(dig3p1 == 1) {
			d = 'A';
		}else if(dig3p1 == 2) {
			d = 'E';
		}else if(dig3p1 == 3) {
			d = 'I';
		}else if(dig3p1 == 4) {
			d = 'O';
		}else if(dig3p1 == 5) {
			d = 'U';
		}
		
		if(dig2p1>5 || dig2p1==0) {
			OutPut = OutPut + dig2p1;
			//System.out.print(dig2p1);
		}else {
			OutPut = OutPut + c;
			//System.out.println(c);
		}
		
		if(dig3p1>5 || dig3p1==0) {
			OutPut = OutPut + dig3p1;
			//System.out.print(dig3p1);
		}else {
			OutPut = OutPut + d;
			//System.out.println(d);
		}
	
		if(dig0p1>5 || dig0p1==0) {
			OutPut = OutPut + dig0p1;
			//System.out.print(dig0p1);
		}else {
			OutPut = OutPut + a;
			//System.out.println(a);
		}
		
		if(dig1p1>5 || dig1p1==0) {
			OutPut = OutPut + dig1p1;
			//System.out.print(dig1p1);
		}else {
			OutPut = OutPut + b;
			//System.out.println(b);
		}
	
		System.out.println("el código cifrado es: " + OutPut);
		
		char ch0 = OutPut.charAt(0);
		char ch1 = OutPut.charAt(1);
		char ch2 = OutPut.charAt(2);
		char ch3 = OutPut.charAt(3);
		
		int chp0 = 0;
		int chp1 = 0;
		int chp2 = 0;
		int chp3 = 0;
		
		String OutPut2 = "";
		
		if(ch0 == 'A') {
			chp0 = 1;
		}else if(ch0 == 'E') {
			chp0 = 2;
		}else if(ch0 == 'I') {
			chp0 = 3;
		}else if(ch0 == 'O') {
			chp0 = 4;
		}else if(ch0 == 'U') {
			chp0 = 5;
		}else {chp0 = (int)OutPut.charAt(0)-48;}
		
		if(ch1 == 'A') {
			chp1 = 1;
		}else if(ch1 == 'E') {
			chp1 = 2;
		}else if(ch1 == 'I') {
			chp1 = 3;
		}else if(ch1 == 'O') {
			chp1 = 4;
		}else if(ch1 == 'U') {
			chp1 = 5;
		}else {chp1 = (int)OutPut.charAt(1)-48;}
		
		if(ch2 == 'A') {
			chp2 = 1;
		}else if(ch2 == 'E') {
			chp2 = 2;
		}else if(ch2 == 'I') {
			chp2 = 3;
		}else if(ch2 == 'O') {
			chp2 = 4;
		}else if(ch2 == 'U') {
			chp2 = 5;
		}else {chp2 = (int)OutPut.charAt(2)-48;}
		
		if(ch3 == 'A') {
			chp3 = 1;
		}else if(ch3 == 'E') {
			chp3 = 2;
		}else if(ch3 == 'I') {
			chp3 = 3;
		}else if(ch3 == 'O') {
			chp3 = 4;
		}else if(ch3 == 'U') {
			chp3 = 5;
		}else {chp3 = (int)OutPut.charAt(3)-48;}
		
		chp0 = (chp0+3)%10;
		chp1 = (chp1+3)%10;
		chp2 = (chp2+3)%10;
		chp3 = (chp3+3)%10;
	
		System.out.println("desea descifrar el código(SI/NO)");
		String SN = entrada.readLine();
		String sn = SN.toLowerCase();
		
		if(sn.contains("si")) {
			OutPut2 = chp2 + "" + chp3 + "" + chp0 + "" + chp1;
			System.out.println("el código descifrado es: " + OutPut2);
		}
		
	}

}
