package ohtu;

public class Submission {
    public int lkm;
    private String student_number;
    private String hours;
    private String week;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, 
            a11, a12, a13, a14, a15;

    @Override
    public String toString() {
        lkm = 0;
        String tehdyt = "";
        if (a1 != null && a1.equals("true")) {
            lkm++;
            tehdyt += "1 ";
        }
        if (a2 != null && a2.equals("true")) {
            lkm++;
            tehdyt += "2 ";
        }
        if (a3 != null && a3.equals("true")) {
            lkm++;
            tehdyt += "3 ";
        }
        if (a4 != null && a4.equals("true")) {
            lkm++;
            tehdyt += "4 ";
        }
        if (a5 != null && a5.equals("true")) {
            lkm++;
            tehdyt += "5 ";
        }
        if (a6 != null && a6.equals("true")) {
            lkm++;
            tehdyt += "6 ";
        }
        if (a7 != null && a7.equals("true")) {
            lkm++;
            tehdyt += "7 ";
        }
        if (a8 != null && a8.equals("true")) {
            lkm++;
            tehdyt += "8 ";
        }
        if (a9 != null && a9.equals("true")) {
            lkm++;
            tehdyt += "9 ";
        }
        if (a10 != null && a10.equals("true")) {
            lkm++;
            tehdyt += "10 ";
        }
        if (a11 != null && a11.equals("true")) {
            lkm++;
            tehdyt += "11 ";
        }
        if (a12 != null && a12.equals("true")) {
            lkm++;
            tehdyt += "12 ";
        }
        if (a13 != null && a13.equals("true")) {
            lkm++;
            tehdyt += "13 ";
        }
        if (a14 != null && a14.equals("true")) {
            lkm++;
            tehdyt += "14 ";
        }
        if (a15 != null && a15.equals("true")) {
            lkm++;
            tehdyt += "15 ";
        }
        
        return "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + lkm 
                + ", aikaa kului " + hours + " tuntia, tehdyt tehtävät: "
                + tehdyt;
    }
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @return the week
     */
    public String getWeek() {
        return week;
    }

    /**
     * @param week the week to set
     */
    public void setWeek(String week) {
        this.week = week;
    }

    /**
     * @return the a1
     */
    public String getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(String a1) {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public String getA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(String a2) {
        this.a2 = a2;
    }

    /**
     * @return the a3
     */
    public String getA3() {
        return a3;
    }

    /**
     * @param a3 the a3 to set
     */
    public void setA3(String a3) {
        this.a3 = a3;
    }

    /**
     * @return the a4
     */
    public String getA4() {
        return a4;
    }

    /**
     * @param a4 the a4 to set
     */
    public void setA4(String a4) {
        this.a4 = a4;
    }

    /**
     * @return the a5
     */
    public String getA5() {
        return a5;
    }

    /**
     * @param a5 the a5 to set
     */
    public void setA5(String a5) {
        this.a5 = a5;
    }

    /**
     * @return the a6
     */
    public String getA6() {
        return a6;
    }

    /**
     * @param a6 the a6 to set
     */
    public void setA6(String a6) {
        this.a6 = a6;
    }

    /**
     * @return the a7
     */
    public String getA7() {
        return a7;
    }

    /**
     * @param a7 the a7 to set
     */
    public void setA7(String a7) {
        this.a7 = a7;
    }

    /**
     * @return the a8
     */
    public String getA8() {
        return a8;
    }

    /**
     * @param a8 the a8 to set
     */
    public void setA8(String a8) {
        this.a8 = a8;
    }

    /**
     * @return the a9
     */
    public String getA9() {
        return a9;
    }

    /**
     * @param a9 the a9 to set
     */
    public void setA9(String a9) {
        this.a9 = a9;
    }

    /**
     * @return the a10
     */
    public String getA10() {
        return a10;
    }

    /**
     * @param a10 the a10 to set
     */
    public void setA10(String a10) {
        this.a10 = a10;
    }

    /**
     * @return the a11
     */
    public String getA11() {
        return a11;
    }

    /**
     * @param a11 the a11 to set
     */
    public void setA11(String a11) {
        this.a11 = a11;
    }

    /**
     * @return the a12
     */
    public String getA12() {
        return a12;
    }

    /**
     * @param a12 the a12 to set
     */
    public void setA12(String a12) {
        this.a12 = a12;
    }

    /**
     * @return the a13
     */
    public String getA13() {
        return a13;
    }

    /**
     * @param a13 the a13 to set
     */
    public void setA13(String a13) {
        this.a13 = a13;
    }

    /**
     * @return the a14
     */
    public String getA14() {
        return a14;
    }

    /**
     * @param a14 the a14 to set
     */
    public void setA14(String a14) {
        this.a14 = a14;
    }

    /**
     * @return the a15
     */
    public String getA15() {
        return a15;
    }

    /**
     * @param a15 the a15 to set
     */
    public void setA15(String a15) {
        this.a15 = a15;
    }
    
}