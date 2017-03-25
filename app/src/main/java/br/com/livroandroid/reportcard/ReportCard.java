package br.com.livroandroid.reportcard;


public class ReportCard {
    private String subjectName;
    private int subjectIcon;
    private String grade;

    public ReportCard(){
        super();
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public String getGrade(){
        return this.grade;
    }
    public int getSubjectIcon(){
        return this.subjectIcon;
    }

    public ReportCard(int icon, String subjectName, String grade) {
        super();
        this.subjectIcon = icon;
        this.subjectName = subjectName  ;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "A criança tem \n" + grade + "Classificação" + subjectName ;
    }
}
