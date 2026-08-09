package com.jarvisdev.report;

public class ReportGenerator {

    private final TxtReportWriter txtWriter =
            new TxtReportWriter();

    public void generate(ReportData reportData) {

        txtWriter.generateReport(reportData);

        System.out.println();
        System.out.println("Reports Generated Successfully");
    }
}
