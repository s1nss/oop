package Lab_1.Faculty;

public class Faculty {
    private String name;
    private String abbreviation;
    private StudyField.S_Fields studyField;
    public String getName() {
        return name;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public StudyField.S_Fields getStudyField() {
        return studyField;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAbbreviation(String newAbbreviation) {
        this.abbreviation = newAbbreviation;
    }
    public void setStudyField(StudyField.S_Fields newStudyField) {
        this.studyField = newStudyField;
    }
}
