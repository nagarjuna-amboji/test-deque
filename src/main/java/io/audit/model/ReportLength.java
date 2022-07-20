package io.audit.model;

public class ReportLength extends Report {

    public static final Long MAX_LENGTH = 21L;

    public ReportLength(String message) {
        super.message = message;
    }

    @Override
    public Boolean isViolation() {
        return isTooLong();
    }

    private Boolean isTooLong() {
        return this.message.length() == ReportLength.MAX_LENGTH;
    }



}
