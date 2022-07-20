package io.audit.model;

import java.util.Objects;

public abstract class Report {

    protected String message;

    public Report getReport(String message, Report report) {

        this.message = message;

        return  report;
    }

    public Boolean isViolation() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;
        Report report = (Report) o;
        return message.equals(report.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "Report{" +
                "message='" + message + '\'' +
                '}';
    }
}
