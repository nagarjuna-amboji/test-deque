package io.audit.model;

import java.util.HashSet;
import java.util.Set;

public class Audit {

    private Set<Report> violations = new HashSet<>();
    private Set<Report> passes = new HashSet<>();


    public void addReport(Report report) {

        if( report.isViolation()) {
            violations.add(report);
        } else if (!violations.contains(report)){
            passes.add(report);
        }
    }

    public void auditComplete() {

        System.out.println("Audit Completed..");
        System.out.println("Violations");
        violations.forEach(System.out::println);
        System.out.println("Passes");
        passes.forEach(System.out::println);
    }

}
