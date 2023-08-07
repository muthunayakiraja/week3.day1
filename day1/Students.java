package week3.day1;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("id:"+id);
}
public  void getStudentInfo(int id ,String name) {
System.out.println(id +" " +name);	
}
public void getStudentInfo(String email, int phnum) {
System.out.println(email+ " " +phnum);
}
	public static void main(String[] args) {
		Students stu = new Students();
	stu.getStudentInfo(25);
	stu.getStudentInfo(67, "ravi");	
stu.getStudentInfo("muthu@", 12345);
	}

}
