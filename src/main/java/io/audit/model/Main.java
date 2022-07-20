package io.audit.model;

import java.util.List;

public class Main {

    private List<Report> reports;

    public static void main(String[] args) {

        Main main = new Main();
        Audit audit = new Audit();

        main.reports = getListOfReports();
        main.reports.forEach(e -> audit.addReport(e));

        audit.auditComplete();
    }

    private static List<Report> getListOfReports() {

        return List.of(
                new ReportPalindrome("Henrietta"),
                new ReportLength("Henrietta"),
                new ReportPalindrome("Blargedy blarg blarg"),
                new ReportLength("Blargedy blarg blarg"),
                new ReportPalindrome("Yep"),
                new ReportLength("Yep"),
                new ReportPalindrome("Madam"),
                new ReportLength("Madam"),
                new ReportPalindrome("Madam Im Adam"),
                new ReportLength("Madam Im Adam"),
                new ReportPalindrome("A man a plan a canal Panama"),
                new ReportLength("A man a plan a canal Panama")
        );
    }


}
