package nandini;

public class student {
	String StdName;
	int RegNum;
	String branch;
	public static void main(String[]args) {
		student S1=new student();
		S1.StdName="keerthi";
		S1.RegNum=101;
		S1.branch="CSM";
		System.out.println("Student Name : "+S1.StdName);
		System.out.println("Register Num : "+S1.RegNum);
		System.out.println("branch : "+S1.branch);
		student S2=new student();
		S2.StdName="nandini";
		S2.RegNum=102;
		S2.branch="CSM";
		System.out.println("Student Name : "+S2.StdName);
		System.out.println("Register Num : "+S2.RegNum);
		System.out.println("branch : "+S2.branch);
		student S3=new student();
		S3.StdName="bharthi";
		S3.RegNum=105;
		S3.branch="EEE";
		System.out.println("Student Name : "+S3.StdName);
		System.out.println("Register Num : "+S3.RegNum);
		System.out.println("branch : "+S3.branch);
		
	}

}
