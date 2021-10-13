public class Student {

    private String firstName;
    private String lastName;
    private int questionsCount;

    public Student(String _firstName, String _lastName, int _questionsCount)
    {
        firstName = _firstName;
        lastName = _lastName;
        questionsCount = _questionsCount;
    }

    public String getFullName() { return firstName + " " + lastName; }
    public int getQuestionsCount() { return questionsCount; }
    public void setFirstName(String _firstName) { firstName = _firstName; }
    public void setLastName(String _lastName) { lastName = _lastName; }
    public void setQuestionsCount(int count) { questionsCount = count; }

}
