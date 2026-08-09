package com.jarvisdev.report;

public class ReportGenerator {

    private final TxtReportWriter txtWriter =
            new TxtReportWriter();

    private final JsonReportWriter jsonWriter =
            new JsonReportWriter();

    private final CsvReportWriter csvWriter =
            new CsvReportWriter();

    public void generate(ReportData reportData) {

        txtWriter.generateReport(reportData);

        jsonWriter.generateReport(reportData);

        csvWriter.generateReport(reportData);

        System.out.println();
        System.out.println("All Reports Generated Successfully");
    }
}
