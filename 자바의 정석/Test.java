import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01"); // sb객체 안에 01이 들어감
		StringBuffer sb2 = sb.append(23); // sb2객체가 만들어지고 기존 배열에 23이 추가
		sb.append('4').append(56); // '4'와 '56' 추가
		
		StringBuffer sb3 = sb.append(78); // '78'추가
		
		//sb, sb2, sb3 모두 같은 주소를 가짐
		
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		System.out.println("sb = " + sb.delete(3, 6));
		System.out.println("sb = " + sb.insert(3, "abc"));
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		
		System.out.println("capacity = " + sb.capacity());
		System.out.println("length = " + sb.length());
	}
}