package com.htc.javaweek1;
import java.util.Scanner;
public class Batch1 extends Trainee{
	private String batchCode;
	private String startdate;
	private String enddate;
	Trainee trainee[];
	
	public void readInputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the New HTC Batch Code ");
		batchCode=sc.nextLine();
		System.out.println("Enter the New HTC Batch Start Date ");
		startdate=sc.nextLine();
		System.out.println("Enter the New HTC Batch End Date ");
		enddate=sc.nextLine();
		sc.close();
	}
	public void display() {
		System.out.println("Output..");
		System.out.println("Batch Code--"+batchCode);
		System.out.println("Batch Start Date--"+startdate);
		System.out.println("Batch End Date----"+enddate);
	}
	
	@Override
	public void getTrainee(int traineeId) {
		System.out.println("TraineeId Detail from getTrainee Method@ Batch Class --"+traineeId);	
	}
	public Trainee[] getTrainees(String traineeGender) {
		System.out.println("TraineeGender Detail from getTrainees Method@ Batch Class --"+traineeGender);
		Trainee trainee = new Trainee();
		trainee.setTraineeId(111);
		trainee.setTraineeDOB("01/12/2017");
		trainee.setTraineeEmail("trainee@trainee.com");
		
		Trainee trainee1 = new Trainee();
		trainee1.setTraineeContactNo(02);
		trainee1.setTraineeDOB("03/12/2017");
		trainee1.setTraineeEmail("traine2e@trainee.com");
		
		//Trainee[][] Trainee;
		Trainee[]  traineeArray = new Trainee[3];
		traineeArray[0] = trainee;
		traineeArray[1] = trainee1;
		Trainee trainee3 =new Trainee(100,"Rajeswari",111,"test@test.com","Male","06/25/1945");
		traineeArray[2] = trainee3;
		
		System.out.println("Array Trainee Contact number: " + traineeArray[0].getTraineeContactNo());
		System.out.println("Array DOB " + traineeArray[0].getTraineeDOB());
		System.out.println("Array Trainee Contact number: " + traineeArray[1].getTraineeContactNo());
		System.out.println("Array DOB " + traineeArray[1].getTraineeDOB());
		
		System.out.println("Array Trainee Contact number: " + traineeArray[2].getTraineeContactNo());
		System.out.println("Array DOB " + traineeArray[2].getTraineeDOB());
		return traineeArray;
	}
	
	public static void main(String[] args) {
		Batch batch1=new Batch();
		batch1.readInputs();
		batch1.display();
		batch1.getTrainee(101);
		batch1.getTrainees("Female");
		System.out.println("Content from Trainee Class..");
		Trainee employee1=new Trainee(100,"Vaithilingam",123,"test@test.com","Male","06/25/1945");
		System.out.println(employee1.toString());
		employee1.getTrainee(102);
		employee1.getTrainees("Male");		
		
	}
}
