package runner;

import java.util.Scanner;

import method.Method;

public class Runner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Method method=new Method();
		boolean flag=true;
		while(flag==true) {
			System.out.println("Enter the Command");
			String command=scan.nextLine();
			String[] commands=command.split(" ");
			
			
			String function=commands[0];
			switch(function) {
			case "Set":
				int calue=Integer.parseInt(commands[2]);
				String key=commands[1];
				method.add(key, calue);
				break;
			case "Get":
				String key1=commands[1];
				System.out.println(method.get(key1));
				break;
			case"End":
				flag=false;
				break;
			case "Begin":
				method.begin();
				break;
			case "RollBack":
				method.rollBack();
				break;
			case "Commit":
				method.commit();
				break;
			
			}
			
			
			
		}
		

	}

}
