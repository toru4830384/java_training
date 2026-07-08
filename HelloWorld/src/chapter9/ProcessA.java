package chapter9;

public class ProcessA implements Process {
	
	@Override
	public boolean check(String name, int age) {
		return name.length() < 10 && age >= 0 && age <= 140;
	}
	
	@Override
	public void run(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}