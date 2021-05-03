public class Students{

private String firstName;
private String lastName;
private int stuID;
private int[] stuGrades;
private int avgGrade;
private String letterGrade;



public void setFirstName (String firstName){
  this.firstName = firstName;
}
public String getFirstName()
{return this.firstName;}

public void setLastName(String lastName){
  this.lastName = lastName;
}
public String getLastname()
{return this.lastName;}

public void setStuID(int stuID){
  this.stuID = stuID;
}
public int getStuID()
{return this.stuID;}

public void setStuGrades(int[] grades){
this.stuGrades = stuGrades;
calculateAvgGrade();
getLetterGrade();
}

public int[] getStuGrades(){
return this.stuGrades;  
}

public void setAvgGrade(int avgGrade){
  this.avgGrade = avgGrade;
}

public int getAvgGrade(){return this.avgGrade;}

public void setLetterGrade(String letterGrade){
  this.letterGrade = letterGrade;
}

public String getLetterGrade(){return this.letterGrade;}

private void calculateAvgGrade()
{
int totalGrade = 0;
for (int grade : this.stuGrades){
totalGrade += grade;
}
this.avgGrade = totalGrade / stuGrades.length;

}

private void  findLetterGrade()
{
if (avgGrade >= 90)
{
  letterGrade = "A";
}
else if (avgGrade >= 80)
{
  letterGrade = "B";
}

else if (avgGrade >= 70)
{
  letterGrade = "C";
}

else if (avgGrade >= 60)
{
  letterGrade ="D";
}

else if (avgGrade >= 0)
{
  letterGrade = "F";
}
}

}