package Q001;

public class Q009 {
	/*
	 자바 메인메서드에서 static 키워드의 역할에 대해서 설명해보시오(***)
	 작성한 자바코드를 시행시 static을 안쓰면 에러가 나는데 그 이유가 무엇인지도 같이 설명해보시오
	 (static의 개념과 역할에 대해서 알고 있는지를 뭇는 문제이다)
	 
	 파일명 : Java100_variable_HelloWorld4.java
	 public class Java100_variable_HelloWorld4{
	 	public static void main(String[] args){
	 		System.out.println("Hello World~");
	 	}
	 }
	 
	 =>
	 
	 - static으로 선언된 함수(메서드)나 변수는 자바버추얼머신에서 인스턴스 객체의 생성 없이 호출을 할 수 있다
	 - 쉽게말해서, 객체 생성없이 해당 함수(메서드)를 호출해서 사용할 수 있다. 
	 -* 자바프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다.
	 -* static으로 지정된 메서드가 여러개인 경우에는 객체를 생성하는 것과 상관없이 모두 메모리에 할당시킨다.
	 -* 그런 후에, "main" 으로 이름이 만들어진 메서드가 있는지를 찾아서 그 메서드를 가장 먼저 시작점의 메서드로서 호출을 하게 되는 것이다.
	 
	 */
}
