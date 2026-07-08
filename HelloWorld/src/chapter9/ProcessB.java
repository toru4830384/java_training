package chapter9;

public class ProcessB implements Process {
	
	@Override
	public boolean check(String name, int age) {
		return name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60;
	}
	
	@Override
	public void run(String name, int age) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}