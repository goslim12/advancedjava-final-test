package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	public Person(){
		this(12,"");
	}
	
	public Person( String name ){
		this(12,name);
	}
	
	public Person(int age, String name){
		numberOfPerson++;
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void selfIntroduce(){
		// "내 이름은 ...이며, 나이는 ...살입니다." 출력함
		// 예) 내이름은 김철수이며, 나이는 19살 입니다.
		System.out.println("내 이름은 " +getName()+"이며, 나이는 "+getAge()+"살입니다.");
	}

	static int getPopulation(){
		return numberOfPerson;
		// 전체 인구수를 return 함
	}
}

